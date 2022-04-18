package co.gov.umv.sigma.backend.intervencion.servicio.impl;

import javax.ws.rs.core.Response;

import co.gov.umv.sigma.backend.comun.cbo.ObjetoSalida;
import co.gov.umv.sigma.backend.intervencion.cbo.ProgramacionDiariaOE;
import co.gov.umv.sigma.backend.intervencion.dto.impl.ConsultasProgramacionDiariaDTO;
import co.gov.umv.sigma.backend.intervencion.dto.impl.GestionProgramacionDiariaDTO;
import co.gov.umv.sigma.backend.intervencion.servicio.IProgramacionDiariaServicio;
import co.gov.umv.sigma.backend.mejoramiento.cbo.ConsultaOE;
import co.gov.umv.sigma.backend.mejoramiento.dto.impl.ConsultaDTO;

public class ProgramacionDiariaServicio implements IProgramacionDiariaServicio {

	GestionProgramacionDiariaDTO dto = new GestionProgramacionDiariaDTO();
	
	@Override
	public Response insertar(ProgramacionDiariaOE OE)
	{
	
		ObjetoSalida os = dto.insertarProgDiaria(OE);	
		return Response.status(Response.Status.OK).entity(os).build();
	}
	
	@Override
	public Response actualizar(ProgramacionDiariaOE OE)
	{
	
		ObjetoSalida os = dto.actualizarProgDiaria(OE);	
		return Response.status(Response.Status.OK).entity(os).build();
	}
	
	@Override
	public Response eliminar(ProgramacionDiariaOE OE)
	{
		
		ObjetoSalida os = dto.eliminarProgDiaria(OE);	
		return Response.status(Response.Status.OK).entity(os).build();
	}
	
	@Override
	public Response consultarXFiltro(ProgramacionDiariaOE OE)
	{
		
		ObjetoSalida os = dto.consultarXFiltroProgDiaria(OE);	
		return Response.status(Response.Status.OK).entity(os).build();
	}
	/**********************************************/

	@Override
	public Response insertarPersonal(ProgramacionDiariaOE OE) {
	
		ObjetoSalida os = dto.insertarPersonal(OE);	
		return Response.status(Response.Status.OK).entity(os).build();
	}

	@Override
	public Response actualizarPersonal(ProgramacionDiariaOE OE) {
		
		ObjetoSalida os = dto.actualizarPersonal(OE);	
		return Response.status(Response.Status.OK).entity(os).build();
	}

	@Override
	public Response eliminarPersonal(ProgramacionDiariaOE OE) {
		
		ObjetoSalida os = dto.eliminarPersonal(OE);	
		return Response.status(Response.Status.OK).entity(os).build();
	}

	@Override
	public Response consultarXFiltroPersonal(ProgramacionDiariaOE OE) {
		
		ObjetoSalida os = dto.consultarXFiltroPersonal(OE);	
		return Response.status(Response.Status.OK).entity(os).build();
	}
	
	/*************************************************/
	

	@Override
	public Response insertarMaterial(ProgramacionDiariaOE OE) {
		
		ObjetoSalida os = dto.insertarMaterial(OE);	
		return Response.status(Response.Status.OK).entity(os).build();
	}

	@Override
	public Response actualizarMaterial(ProgramacionDiariaOE OE) {
	
		ObjetoSalida os = dto.actualizarMaterial(OE);	
		return Response.status(Response.Status.OK).entity(os).build();
	}

	@Override
	public Response eliminarMaterial(ProgramacionDiariaOE OE) {
	
		ObjetoSalida os = dto.eliminarMaterial(OE);	
		return Response.status(Response.Status.OK).entity(os).build();
	}

	@Override
	public Response consultarXFiltroMaterial(ProgramacionDiariaOE OE) {
	
		ObjetoSalida os = dto.consultarXFiltroMaterial(OE);	
		return Response.status(Response.Status.OK).entity(os).build();
	}

	/*************************************************/
	
	@Override
	public Response insertarMaquinaria(ProgramacionDiariaOE OE) {
	
		ObjetoSalida os = dto.insertarMaquinaria(OE);	
		return Response.status(Response.Status.OK).entity(os).build();
	}

	@Override
	public Response actualizarMaquinaria(ProgramacionDiariaOE OE) {
		
		ObjetoSalida os = dto.actualizarMaquinaria(OE);	
		return Response.status(Response.Status.OK).entity(os).build();
	}

	@Override
	public Response eliminarMaquinaria(ProgramacionDiariaOE OE) {
		
		ObjetoSalida os = dto.eliminarMaquinaria(OE);	
		return Response.status(Response.Status.OK).entity(os).build();
	}

	@Override
	public Response consultarXFiltroMaquinaria(ProgramacionDiariaOE OE) {
		
		ObjetoSalida os = dto.consultarXFiltroMaquinaria(OE);	
		return Response.status(Response.Status.OK).entity(os).build();
	}
	
	
	/***************************************************************************/
	@Override
	public Response listarProgramacionDiarias(ProgramacionDiariaOE OE)
	{
		
		ObjetoSalida os = dto.listarProgramacionDiarias(OE);	
		return Response.status(Response.Status.OK).entity(os).build();
	}

	@Override
	public Response copiarProgDiaria(ProgramacionDiariaOE OE) {
		
		ObjetoSalida os = dto.copiarProgDiaria(OE);	
		return Response.status(Response.Status.OK).entity(os).build();
	}

	@Override
	public Response consultarUE(ConsultaOE OE) {
		ConsultaDTO dto = new ConsultaDTO();
		ObjetoSalida os = dto.consultarUnidadesEjecutoras(OE);	
		return Response.status(Response.Status.OK).entity(os).build();
	}

	/********************************************************/


	@Override
	public Response listarConsolidado(ProgramacionDiariaOE OE) {
		ObjetoSalida os = dto.listarConsolidado(OE);	
		return Response.status(Response.Status.OK).entity(os).build();
	}

	@Override
	public Response asignarMaquinaria(ProgramacionDiariaOE OE) {
		ObjetoSalida os = dto.asignarMaquinaria(OE);	
		return Response.status(Response.Status.OK).entity(os).build();
	}

	
	
	@Override
	public Response totalizarMaterialPorTipoYClase(ConsultaOE OE) {
		ConsultasProgramacionDiariaDTO dto = new ConsultasProgramacionDiariaDTO();
		ObjetoSalida os = dto.totalizarMaterialPorTipoYClase(OE);	
		return Response.status(Response.Status.OK).entity(os).build();
	}

	@Override
	public Response totalizarMaterialPorTipo(ConsultaOE OE) {
		ConsultasProgramacionDiariaDTO dto = new ConsultasProgramacionDiariaDTO();
		ObjetoSalida os = dto.totalizarMaterialPorTipo(OE);	
		return Response.status(Response.Status.OK).entity(os).build();
	}	

	@Override
	public Response actualizarCampoDetalle(ProgramacionDiariaOE OE) {
		ObjetoSalida os = dto.actualizarCampoDetalle(OE);	
		return Response.status(Response.Status.OK).entity(os).build();
	}
	

}
