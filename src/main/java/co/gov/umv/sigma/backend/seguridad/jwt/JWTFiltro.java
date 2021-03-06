package co.gov.umv.sigma.backend.seguridad.jwt;

import co.gov.umv.sigma.backend.seguridad.jwt.JWTLlave;
import co.gov.umv.sigma.backend.seguridad.jwt.JWT;
import co.gov.umv.sigma.backend.administracion.dto.impl.UsuarioDTO;
import co.gov.umv.sigma.backend.administracion.cbo.UsuarioOE;
//import gov.mads.gestor.adm.vista.RegistrarUsuarioOE;
//import gov.mads.gestor.comun.entidades.Usuario;
//import gov.mads.gestor.adm.vista.UsuarioOE;
//import gov.mads.gestor.comun.entidad.IvetT002Usuario;
import co.gov.umv.sigma.backend.comun.cbo.ObjetoSalida;
import co.gov.umv.sigma.backend.comun.config.AppConfig;
import co.gov.umv.sigma.backend.externo.cbo.ObjetoNegocioOE;
import co.gov.umv.sigma.backend.externo.dto.ExternoDTO;

import org.apache.log4j.Logger;
import org.jose4j.jwk.RsaJsonWebKey;
import org.jose4j.jws.AlgorithmIdentifiers;
import org.jose4j.jws.JsonWebSignature;
import org.jose4j.jwt.JwtClaims;
import org.jose4j.jwt.consumer.JwtConsumer;
import org.jose4j.jwt.consumer.JwtConsumerBuilder;

import javax.annotation.Priority;
import javax.ws.rs.Priorities;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import java.io.IOException;
import java.security.Principal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

@Priority(Priorities.AUTHENTICATION)
@JWT
public class JWTFiltro implements ContainerRequestFilter, ContainerResponseFilter {

    public static final String JWT_HEADER_TOKEN = "token";
    public static final String APP_NAME = "SIGMA";
    private final static Logger log = Logger.getLogger(JWTFiltro.class);
    @Override
    public void filter(ContainerRequestContext requestContext) {

        try {
            String encabezado = requestContext.getHeaderString("Authorization");
            if (encabezado.startsWith("Bearer")) {
                final JWTUsuario usuario = validarToken(encabezado.split(" ")[1]);
                final SecurityContext contexto = requestContext.getSecurityContext();

                if (usuario != null) {
                    requestContext.setSecurityContext(new SecurityContext() {

                        @Override
                        public Principal getUserPrincipal() {

                            return new Principal() {

                                @Override
                                public String getName() {

                                    return usuario.getUserName();
                                }
                            };
                        }

                        @Override
                        public boolean isUserInRole(String role) {

                            return contexto.isUserInRole(role);
                        }

                        @Override
                        public boolean isSecure() {

                            return contexto.isSecure();
                        }

                        @Override
                        public String getAuthenticationScheme() {

                            return contexto.getAuthenticationScheme();
                        }
                    });
                }
            }
            else {
            	log.error("No encontre el Bearer");
                requestContext.setProperty("auth-failed", true);
                requestContext.abortWith(Response.status(Response.Status.UNAUTHORIZED).build());
            }
        } catch (Exception e) {
        	log.fatal("No encontre el Bearer " + e.getMessage());
        	e.printStackTrace();
            requestContext.setProperty("auth-failed", true);
            requestContext.abortWith(Response.status(Response.Status.UNAUTHORIZED).build());
        }
    }

    private JWTUsuario validarToken(String jwt) throws Exception {

        RsaJsonWebKey rsaJsonWebKey = JWTLlave.obtenerInstancia();
        JwtConsumer jwtConsumer = new JwtConsumerBuilder().setRequireSubject().setVerificationKey(rsaJsonWebKey.getKey()).build();
        JwtClaims jwtClaims = jwtConsumer.processToClaims(jwt);
        String usuario = (String) jwtClaims.getClaimValue("sub");
        return obtenerUsuario(usuario);
    }

    private JWTUsuario obtenerUsuario(String name) {

        //Integer idUsuario = Integer.parseInt(name);
    	log.info("Name is: " + name);
        UsuarioOE usuarioOE = new UsuarioOE();
        //usuarioOE.setA041codigo(idUsuario);
        usuarioOE.setFiltro("login='"+ name + "'");
        //usuarioOE.setIdUsuario(idUsuario);
        usuarioOE.setUsuario(name);
        //ObjetoSalida objetoSalida = new UsuarioDTO().consultarXFiltro(usuarioOE);
        AppConfig config = new AppConfig();		
        ExternoDTO dto = new ExternoDTO();
        ObjetoNegocioOE OEE = new ObjetoNegocioOE();
        OEE.setUsuario(name);
		OEE.setUrl(config.getProp().getProperty("caliope.consultarusuario"));
		OEE.setJson("{\"usuario\":\""+name+"\",\"filtro\":\"login='"+name+"'\"}");
		ObjetoSalida objetoSalida = dto.generarObjetoSalida(OEE);
        return obtenerUsuario(objetoSalida.getRespuesta());
    }

    public static JWTUsuario obtenerUsuario(List<LinkedHashMap<String, Object>> respuesta) {
    	
        JWTUsuario jwtUsuario;
        try {
            jwtUsuario = new JWTUsuario();
            for (HashMap<String, Object> row : respuesta) {
                jwtUsuario.setCodigoUsuario(row.get("id_usuario").toString());
                jwtUsuario.setUserName(row.get("login").toString());
                jwtUsuario.setNombre(row.get("nombre").toString());
                jwtUsuario.setPerfil(row.get("id_tipo_estado").toString());
                
            }
        } catch (Exception e) {
        	e.printStackTrace();
            jwtUsuario = null;
        }

        return jwtUsuario;
    }

    @Override
    public void filter(ContainerRequestContext requestContext, ContainerResponseContext responseContext) throws IOException {
    	try {
        	if (requestContext.getProperty("auth-failed") != null) {
            	Boolean fallido = (Boolean) requestContext.getProperty("auth-failed");
                if (fallido) {
                    return;
                }
            }
            JWTUsuario jwtUsuario = obtenerUsuario(requestContext.getSecurityContext().getUserPrincipal().getName());
            List jwtToken = new ArrayList();
            jwtToken.add(contruirToken(jwtUsuario));
            responseContext.getHeaders().put(JWT_HEADER_TOKEN, jwtToken);

        } catch (Exception e) {
        	e.printStackTrace();
            requestContext.setProperty("auth-failed", true);
            //requestContext.abortWith(Response.status(Response.Status.UNAUTHORIZED).build());
        }//*/
    }

    public static String contruirToken(JWTUsuario jwtUsuario) throws Exception {

        RsaJsonWebKey rsaJsonWebKey = JWTLlave.obtenerInstancia();

        JwtClaims claims = new JwtClaims();
        claims.setIssuer(APP_NAME);    // who creates the token and signs it
        claims.setSubject(jwtUsuario.getUserName()); // the subject/principal is whom the token is about
        //claims.setClaim("idpersona", jwtUsuario.getCodigoPersona()); // the subject/principal is whom the token is about
        claims.setClaim("idUsuario",jwtUsuario.getCodigoUsuario());
        claims.setClaim("username", jwtUsuario.getUserName()); // the subject/principal is whom the token is about
        claims.setClaim("nombre", jwtUsuario.getNombre());
        claims.setClaim("perfil", jwtUsuario.getPerfil());
        //claims.setClaim("autoridadambiental", jwtUsuario.getCar());
        //claims.setClaim("primeravez", jwtUsuario.getPrimeraVez());
        claims.setExpirationTimeMinutesInTheFuture(jwtUsuario.getMinExpiracion()); // token will expire (10 minutes from now)
        claims.setClaim("tiemposesion", jwtUsuario.getTiempoSesion());
        claims.setGeneratedJwtId(); // a unique identifier for the token
        claims.setIssuedAtToNow();  // when the token was issued/created (now)

        JsonWebSignature jws = new JsonWebSignature();
        jws.setPayload(claims.toJson());
        jws.setKey(rsaJsonWebKey.getPrivateKey());
        jws.setAlgorithmHeaderValue(AlgorithmIdentifiers.RSA_USING_SHA256);

        String jwt = jws.getCompactSerialization();
        return jwt;
    }
}
