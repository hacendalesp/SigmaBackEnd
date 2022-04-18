package co.gov.umv.sigma.backend.produccion.servicio.impl;

import javax.ws.rs.core.Response;

import co.gov.umv.sigma.backend.comun.cbo.ObjetoSalida;
import co.gov.umv.sigma.backend.produccion.cbo.ProduccionOE;
import co.gov.umv.sigma.backend.produccion.dto.impl.DespachoMaterialDTO;
import co.gov.umv.sigma.backend.produccion.dto.impl.DespachoMaterialDetalleDTO;
import co.gov.umv.sigma.backend.produccion.dto.impl.GestionDespachoMaterialDTO;
import co.gov.umv.sigma.backend.produccion.servicio.IDespachoMaterialServicio;

public class DespachoMaterialServicio implements IDespachoMaterialServicio {

	DespachoMaterialDTO dtoDespacho = new DespachoMaterialDTO();
	DespachoMaterialDetalleDTO dtoDetalle = new DespachoMaterialDetalleDTO();
	GestionDespachoMaterialDTO dtoGestion = new GestionDespachoMaterialDTO();
	
	@Override
	public Response listarSolicitudMaterialConOrden(ProduccionOE OE) 
	{
		ObjetoSalida os = dtoGestion.listarSolicitudMaterialConOrden(OE);	
		return Response.status(Response.Status.OK).entity(os).build();
	}
	
	
	@Override
	public Response insertarDespacho(ProduccionOE OE) 
	{
		OE.getDespachoMaterial().setIdDespachoMateriales(0L);
		ObjetoSalida os = dtoGestion.gestionaraDespacho(OE);	
		return Response.status(Response.Status.OK).entity(os).build();
	}

	@Override
	public Response actualizarDespacho(ProduccionOE OE) {
		ObjetoSalida os = dtoGestion.gestionaraDespacho(OE);	
		return Response.status(Response.Status.OK).entity(os).build();
	}

	@Override
	public Response eliminarDespacho(ProduccionOE OE) {
		ObjetoSalida os = dtoDespacho.eliminar(OE);	
		return Response.status(Response.Status.OK).entity(os).build();
	}

	@Override
	public Response consultarXFiltroDespacho(ProduccionOE OE) {
		ObjetoSalida os = dtoDespacho.consultarXFiltro(OE);	
		return Response.status(Response.Status.OK).entity(os).build();
	}

	/*********************************/
	@Override
	public Response insertardetalle(ProduccionOE OE) {
		((ProduccionOE)OE).getDetalleDespacho().setIdDespachoMaterialesDetalle(0L);
		ObjetoSalida os = dtoGestion.gestionarDetalle(OE);	
		return Response.status(Response.Status.OK).entity(os).build();
	}

	@Override
	public Response actualizardetalle(ProduccionOE OE) 
	{
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

	

}
