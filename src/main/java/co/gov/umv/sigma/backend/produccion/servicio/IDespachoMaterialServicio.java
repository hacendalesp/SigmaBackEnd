package co.gov.umv.sigma.backend.produccion.servicio;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import co.gov.umv.sigma.backend.produccion.cbo.ProduccionOE;
import co.gov.umv.sigma.backend.seguridad.jwt.JWT;

@Path("/despachoMaterial")
public interface IDespachoMaterialServicio {


	@POST
    @Path("/listarSolicitudMaterialConOrden")
    @Consumes({ MediaType.APPLICATION_JSON})
    @Produces({ MediaType.APPLICATION_JSON})
	@JWT		
	public Response listarSolicitudMaterialConOrden(ProduccionOE OE);

	
	@POST
    @Path("/insertar")
    @Consumes({ MediaType.APPLICATION_JSON})
    @Produces({ MediaType.APPLICATION_JSON})
	@JWT		
	public Response insertarDespacho(ProduccionOE OE);
	

	@POST
    @Path("/actualizar")
    @Consumes({ MediaType.APPLICATION_JSON})
    @Produces({ MediaType.APPLICATION_JSON})
	@JWT	
	public Response actualizarDespacho(ProduccionOE OE);
	

	@POST
    @Path("/eliminar")
    @Consumes({ MediaType.APPLICATION_JSON})
    @Produces({ MediaType.APPLICATION_JSON})
	@JWT	
	public Response eliminarDespacho(ProduccionOE OE);
	

	@POST
    @Path("/consultarXFiltro")
    @Consumes({ MediaType.APPLICATION_JSON})
    @Produces({ MediaType.APPLICATION_JSON})
	@JWT	
	public Response consultarXFiltroDespacho(ProduccionOE OE);
	
	/*************************/
	

	@POST
    @Path("/detalle/insertar")
    @Consumes({ MediaType.APPLICATION_JSON})
    @Produces({ MediaType.APPLICATION_JSON})
	@JWT		
	public Response insertardetalle(ProduccionOE OE);
	

	@POST
    @Path("/detalle/actualizar")
    @Consumes({ MediaType.APPLICATION_JSON})
    @Produces({ MediaType.APPLICATION_JSON})
	@JWT	
	public Response actualizardetalle(ProduccionOE OE);
	

	@POST
    @Path("/detalle/eliminar")
    @Consumes({ MediaType.APPLICATION_JSON})
    @Produces({ MediaType.APPLICATION_JSON})
	@JWT	
	public Response eliminardetalle(ProduccionOE OE);
	

	@POST
    @Path("/detalle/consultarXFiltro")
    @Consumes({ MediaType.APPLICATION_JSON})
    @Produces({ MediaType.APPLICATION_JSON})
	@JWT	
	public Response consultarXFiltrodetalle(ProduccionOE OE);
	
	
}
