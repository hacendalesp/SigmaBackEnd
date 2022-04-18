package co.gov.umv.sigma.backend.intervencion.servicio;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import co.gov.umv.sigma.backend.intervencion.cbo.ProgramacionDiariaOE;
import co.gov.umv.sigma.backend.seguridad.jwt.JWT;

@Path("/informeDiarioCuadrilla")
public interface IInformeDiarioCuadrillaServicio {

	
	

	@POST
    @Path("/actualizar")
    @Consumes({ MediaType.APPLICATION_JSON})
    @Produces({ MediaType.APPLICATION_JSON})
	@JWT	
	public Response actualizar(ProgramacionDiariaOE OE);
	

	@POST
    @Path("/eliminar")
    @Consumes({ MediaType.APPLICATION_JSON})
    @Produces({ MediaType.APPLICATION_JSON})
	@JWT	
	public Response eliminar(ProgramacionDiariaOE OE);
	

	@POST
    @Path("/consultarXFiltro")
    @Consumes({ MediaType.APPLICATION_JSON})
    @Produces({ MediaType.APPLICATION_JSON})
	@JWT	
	public Response consultarXFiltro(ProgramacionDiariaOE OE);
	
	/*************************************************/
	
	@POST
    @Path("/personal/insertar")
    @Consumes({ MediaType.APPLICATION_JSON})
    @Produces({ MediaType.APPLICATION_JSON})
	@JWT	
	public Response insertarPersonal(ProgramacionDiariaOE OE);
	

	@POST
    @Path("/personal/actualizar")
    @Consumes({ MediaType.APPLICATION_JSON})
    @Produces({ MediaType.APPLICATION_JSON})
	@JWT	
	public Response actualizarPersonal(ProgramacionDiariaOE OE);
	

	@POST
    @Path("/personal/eliminar")
    @Consumes({ MediaType.APPLICATION_JSON})
    @Produces({ MediaType.APPLICATION_JSON})
	@JWT	
	public Response eliminarPersonal(ProgramacionDiariaOE OE);
	

	@POST
    @Path("/personal/consultarXFiltro")
    @Consumes({ MediaType.APPLICATION_JSON})
    @Produces({ MediaType.APPLICATION_JSON})
	@JWT	
	public Response consultarXFiltroPersonal(ProgramacionDiariaOE OE);
	
	/****************************************************************/
		
	
	@POST
    @Path("/maquinaria/insertar")
    @Consumes({ MediaType.APPLICATION_JSON})
    @Produces({ MediaType.APPLICATION_JSON})
	@JWT	
	public Response insertarMaquinaria(ProgramacionDiariaOE OE);
	

	@POST
    @Path("/maquinaria/actualizar")
    @Consumes({ MediaType.APPLICATION_JSON})
    @Produces({ MediaType.APPLICATION_JSON})
	@JWT	
	public Response actualizarMaquinaria(ProgramacionDiariaOE OE);
	

	@POST
    @Path("/maquinaria/eliminar")
    @Consumes({ MediaType.APPLICATION_JSON})
    @Produces({ MediaType.APPLICATION_JSON})
	@JWT	
	public Response eliminarMaquinaria(ProgramacionDiariaOE OE);
	

	@POST
    @Path("/maquinaria/consultarXFiltro")
    @Consumes({ MediaType.APPLICATION_JSON})
    @Produces({ MediaType.APPLICATION_JSON})
	@JWT	
	public Response consultarXFiltroMaquinaria(ProgramacionDiariaOE OE);

	/**************************************************/
	@POST
    @Path("/entradaMaterial/insertar")
    @Consumes({ MediaType.APPLICATION_JSON})
    @Produces({ MediaType.APPLICATION_JSON})
	@JWT	
	public Response insertarentradaMaterial(ProgramacionDiariaOE OE);
	

	@POST
    @Path("/entradaMaterial/actualizar")
    @Consumes({ MediaType.APPLICATION_JSON})
    @Produces({ MediaType.APPLICATION_JSON})
	@JWT	
	public Response actualizarentradaMaterial(ProgramacionDiariaOE OE);
	

	@POST
    @Path("/entradaMaterial/eliminar")
    @Consumes({ MediaType.APPLICATION_JSON})
    @Produces({ MediaType.APPLICATION_JSON})
	@JWT	
	public Response eliminarentradaMaterial(ProgramacionDiariaOE OE);
	

	@POST
    @Path("/entradaMaterial/consultarXFiltro")
    @Consumes({ MediaType.APPLICATION_JSON})
    @Produces({ MediaType.APPLICATION_JSON})
	@JWT	
	public Response consultarXFiltroentradaMaterial(ProgramacionDiariaOE OE);
	
	/******************************************************/
	@POST
    @Path("/salidaMaterial/insertar")
    @Consumes({ MediaType.APPLICATION_JSON})
    @Produces({ MediaType.APPLICATION_JSON})
	@JWT	
	public Response insertarsalidaMaterial(ProgramacionDiariaOE OE);
	

	@POST
    @Path("/salidaMaterial/actualizar")
    @Consumes({ MediaType.APPLICATION_JSON})
    @Produces({ MediaType.APPLICATION_JSON})
	@JWT	
	public Response actualizarsalidaMaterial(ProgramacionDiariaOE OE);
	

	@POST
    @Path("/salidaMaterial/eliminar")
    @Consumes({ MediaType.APPLICATION_JSON})
    @Produces({ MediaType.APPLICATION_JSON})
	@JWT	
	public Response eliminarsalidaMaterial(ProgramacionDiariaOE OE);
	

	@POST
    @Path("/salidaMaterial/consultarXFiltro")
    @Consumes({ MediaType.APPLICATION_JSON})
    @Produces({ MediaType.APPLICATION_JSON})
	@JWT	
	public Response consultarXFiltrosalidaMaterial(ProgramacionDiariaOE OE);

	/********************************************************************************/
	
	@POST
    @Path("/mezcla/insertar")
    @Consumes({ MediaType.APPLICATION_JSON})
    @Produces({ MediaType.APPLICATION_JSON})
	@JWT	
	public Response insertarmezcla(ProgramacionDiariaOE OE);
	

	@POST
    @Path("/mezcla/actualizar")
    @Consumes({ MediaType.APPLICATION_JSON})
    @Produces({ MediaType.APPLICATION_JSON})
	@JWT	
	public Response actualizarmezcla(ProgramacionDiariaOE OE);
	

	@POST
    @Path("/mezcla/eliminar")
    @Consumes({ MediaType.APPLICATION_JSON})
    @Produces({ MediaType.APPLICATION_JSON})
	@JWT	
	public Response eliminarmezcla(ProgramacionDiariaOE OE);
	

	@POST
    @Path("/mezcla/consultarXFiltro")
    @Consumes({ MediaType.APPLICATION_JSON})
    @Produces({ MediaType.APPLICATION_JSON})
	@JWT	
	public Response consultarXFiltromezcla(ProgramacionDiariaOE OE);

	/**************************************************************************/
	@POST
    @Path("/cantidadObra/insertar")
    @Consumes({ MediaType.APPLICATION_JSON})
    @Produces({ MediaType.APPLICATION_JSON})
	@JWT	
	public Response insertarcantidadObra(ProgramacionDiariaOE OE);
	

	@POST
    @Path("/cantidadObra/actualizar")
    @Consumes({ MediaType.APPLICATION_JSON})
    @Produces({ MediaType.APPLICATION_JSON})
	@JWT	
	public Response actualizarcantidadObra(ProgramacionDiariaOE OE);
	

	@POST
    @Path("/cantidadObra/eliminar")
    @Consumes({ MediaType.APPLICATION_JSON})
    @Produces({ MediaType.APPLICATION_JSON})
	@JWT	
	public Response eliminarcantidadObra(ProgramacionDiariaOE OE);
	

	@POST
    @Path("/cantidadObra/consultarXFiltro")
    @Consumes({ MediaType.APPLICATION_JSON})
    @Produces({ MediaType.APPLICATION_JSON})
	@JWT	
	public Response consultarXFiltrocantidadObra(ProgramacionDiariaOE OE);

	/*******************************************************************************/
	
	@POST
    @Path("/calidad/insertar")
    @Consumes({ MediaType.APPLICATION_JSON})
    @Produces({ MediaType.APPLICATION_JSON})
	@JWT	
	public Response insertarcalidad(ProgramacionDiariaOE OE);
	

	@POST
    @Path("/calidad/actualizar")
    @Consumes({ MediaType.APPLICATION_JSON})
    @Produces({ MediaType.APPLICATION_JSON})
	@JWT	
	public Response actualizarcalidad(ProgramacionDiariaOE OE);
	

	@POST
    @Path("/calidad/eliminar")
    @Consumes({ MediaType.APPLICATION_JSON})
    @Produces({ MediaType.APPLICATION_JSON})
	@JWT	
	public Response eliminarcalidad(ProgramacionDiariaOE OE);
	

	@POST
    @Path("/calidad/consultarXFiltro")
    @Consumes({ MediaType.APPLICATION_JSON})
    @Produces({ MediaType.APPLICATION_JSON})
	@JWT	
	public Response consultarXFiltrocalidad(ProgramacionDiariaOE OE);
	
	/***********************************************************/
	@POST
    @Path("/observacion/insertar")
    @Consumes({ MediaType.APPLICATION_JSON})
    @Produces({ MediaType.APPLICATION_JSON})
	@JWT	
	public Response insertarobservacion(ProgramacionDiariaOE OE);
	

	@POST
    @Path("/observacion/actualizar")
    @Consumes({ MediaType.APPLICATION_JSON})
    @Produces({ MediaType.APPLICATION_JSON})
	@JWT	
	public Response actualizarobservacion(ProgramacionDiariaOE OE);
	

	@POST
    @Path("/observacion/eliminar")
    @Consumes({ MediaType.APPLICATION_JSON})
    @Produces({ MediaType.APPLICATION_JSON})
	@JWT	
	public Response eliminarobservacion(ProgramacionDiariaOE OE);
	

	@POST
    @Path("/observacion/consultarXFiltro")
    @Consumes({ MediaType.APPLICATION_JSON})
    @Produces({ MediaType.APPLICATION_JSON})
	@JWT	
	public Response consultarXFiltroObservacion(ProgramacionDiariaOE OE);

}
