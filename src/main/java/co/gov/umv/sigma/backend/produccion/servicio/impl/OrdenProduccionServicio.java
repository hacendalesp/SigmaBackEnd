package co.gov.umv.sigma.backend.produccion.servicio.impl;

import javax.ws.rs.core.Response;

import co.gov.umv.sigma.backend.comun.cbo.ObjetoSalida;
import co.gov.umv.sigma.backend.produccion.cbo.ProduccionOE;
import co.gov.umv.sigma.backend.produccion.dto.impl.GestionOrdenProduccionDTO;
import co.gov.umv.sigma.backend.produccion.dto.impl.OrdenProduccioDetalleDTO;
import co.gov.umv.sigma.backend.produccion.dto.impl.OrdenProduccionDTO;
import co.gov.umv.sigma.backend.produccion.servicio.IOrdenProduccionServicio;

public class OrdenProduccionServicio  implements IOrdenProduccionServicio {

	
	OrdenProduccionDTO dtoOrden = new OrdenProduccionDTO();
	OrdenProduccioDetalleDTO dtoDetalle = new OrdenProduccioDetalleDTO();
	GestionOrdenProduccionDTO dtoGestion = new GestionOrdenProduccionDTO();
	
	@Override
	public Response listarPkSolicitudMezcla(ProduccionOE OE)
	{
		ObjetoSalida os = dtoGestion.listarPkSolicitudMezcla(OE);	
		return Response.status(Response.Status.OK).entity(os).build();
	}
	
	@Override
	public Response insertarOrden(ProduccionOE OE) 
	{
		OE.getOrden().setIdOrdenProduccion(0L);
		ObjetoSalida os = dtoGestion.gestionarOrden(OE);	
		return Response.status(Response.Status.OK).entity(os).build();
	}
	
	@Override
	public Response actualizarOrden(ProduccionOE OE) 
	{
		ObjetoSalida os = dtoGestion.gestionarOrden(OE);	
		return Response.status(Response.Status.OK).entity(os).build();
	}
	
	@Override
	public Response eliminarOrden(ProduccionOE OE) {
		ObjetoSalida os = dtoOrden.eliminar(OE);	
		return Response.status(Response.Status.OK).entity(os).build();
	}
	
	@Override
	public Response consultarXFiltroOrden(ProduccionOE OE) {
		ObjetoSalida os = dtoOrden.consultarXFiltro(OE);	
		return Response.status(Response.Status.OK).entity(os).build();
	}
	
	/*************************************/
	@Override
	public Response insertardetalle(ProduccionOE OE) 
	{
		OE.getDetalleOrden().setIdOrdenProduccionDetalle(0L);
		ObjetoSalida os = dtoGestion.gestionarDetalle(OE);	
		return Response.status(Response.Status.OK).entity(os).build();
	}
	
	@Override
	public Response actualizardetalle(ProduccionOE OE) {
		ObjetoSalida os = dtoGestion.gestionarDetalle(OE);	
		return Response.status(Response.Status.OK).entity(os).build();
	}
	
	@Override
	public Response eliminardetalle(ProduccionOE OE) {
		ObjetoSalida os = dtoGestion.eliminarDetalle(OE);	
		return Response.status(Response.Status.OK).entity(os).build();
	}
	
	@Override
	public Response consultarXFiltrodetalle(ProduccionOE OE) {
		ObjetoSalida os = dtoDetalle.consultarXFiltro(OE);	
		return Response.status(Response.Status.OK).entity(os).build();
	}

	@Override
	public Response listarTiposMaterialSolicitud(ProduccionOE OE) {
		ObjetoSalida os = dtoGestion.listarTiposMaterialSolicitud(OE);	
		return Response.status(Response.Status.OK).entity(os).build();
	}

	
	

}