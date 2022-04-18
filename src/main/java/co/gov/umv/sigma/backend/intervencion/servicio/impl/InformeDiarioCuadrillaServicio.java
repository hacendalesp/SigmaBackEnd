package co.gov.umv.sigma.backend.intervencion.servicio.impl;

import javax.ws.rs.core.Response;

import co.gov.umv.sigma.backend.comun.cbo.CodError;
import co.gov.umv.sigma.backend.comun.cbo.ObjetoSalida;
import co.gov.umv.sigma.backend.intervencion.cbo.ProgramacionDiariaOE;
import co.gov.umv.sigma.backend.intervencion.dto.impl.InformacionDiariaCuadrillaDTO;
import co.gov.umv.sigma.backend.intervencion.dto.impl.ProgDiariaCalidadDTO;
import co.gov.umv.sigma.backend.intervencion.dto.impl.ProgDiariaCantidadObraDTO;
import co.gov.umv.sigma.backend.intervencion.dto.impl.ProgDiariaMaquinariaDTO;
import co.gov.umv.sigma.backend.intervencion.dto.impl.ProgDiariaMaterialDTO;
import co.gov.umv.sigma.backend.intervencion.dto.impl.ProgDiariaObservacionDTO;
import co.gov.umv.sigma.backend.intervencion.dto.impl.ProgDiariaPersonalDTO;
import co.gov.umv.sigma.backend.intervencion.dto.impl.ProgDiariaSalidaMaterialDTO;
import co.gov.umv.sigma.backend.intervencion.servicio.IInformeDiarioCuadrillaServicio;

public class InformeDiarioCuadrillaServicio implements IInformeDiarioCuadrillaServicio {
	
	InformacionDiariaCuadrillaDTO dtoIDC = new InformacionDiariaCuadrillaDTO();
	ProgDiariaCalidadDTO dtoCalidad = new ProgDiariaCalidadDTO();
	ProgDiariaObservacionDTO dtoObservacion = new ProgDiariaObservacionDTO();
	ProgDiariaCantidadObraDTO dtoCantidad = new ProgDiariaCantidadObraDTO();
	ProgDiariaSalidaMaterialDTO dtoSalMaterial = new ProgDiariaSalidaMaterialDTO();
	
	
	

	@Override
	public Response actualizar(ProgramacionDiariaOE OE) {
		ObjetoSalida os = dtoIDC.actualizarIdc(OE);
		if(os.esRespuestaOperacionCorrecta()) {
			return Response.status(Response.Status.OK).entity(os).build() ;
		}else {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(os).build() ;
		}
	}

	@Override
	public Response eliminar(ProgramacionDiariaOE OE) {
		ObjetoSalida os = dtoIDC.eliminarIdc(OE);
		if(os.esRespuestaOperacionCorrecta()) {
			return Response.status(Response.Status.OK).entity(os).build() ;
		}else {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(os).build() ;
		}
	}

	@Override
	public Response consultarXFiltro(ProgramacionDiariaOE OE) {
		ObjetoSalida os = dtoIDC.consultarXFiltroIdc(OE);
		return Response.status(Response.Status.OK).entity(os).build() ;
	}

	@Override
	public Response insertarPersonal(ProgramacionDiariaOE OE) 
	{
		OE.getPersonal().setIdProgdiariaPersonal(0L);
		ObjetoSalida os = dtoIDC.gestionarPersonal(OE);
		if(os.esRespuestaOperacionCorrecta()) {
			return Response.status(Response.Status.OK).entity(os).build() ;
		}else {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(os).build() ;
		}
	}

	@Override
	public Response actualizarPersonal(ProgramacionDiariaOE OE) {
		ObjetoSalida os = dtoIDC.gestionarPersonal(OE);
		if(os.esRespuestaOperacionCorrecta()) {
			return Response.status(Response.Status.OK).entity(os).build() ;
		}else {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(os).build() ;
		}
	}

	@Override
	public Response eliminarPersonal(ProgramacionDiariaOE OE) {
		ObjetoSalida os = dtoIDC.eliminarPersonal(OE);
		if(os.esRespuestaOperacionCorrecta()) {
			return Response.status(Response.Status.OK).entity(os).build() ;
		}else {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(os).build() ;
		}
	}

	@Override
	public Response consultarXFiltroPersonal(ProgramacionDiariaOE OE) 
	{
		ProgDiariaPersonalDTO dtoPersonal = new ProgDiariaPersonalDTO();
		ObjetoSalida os = dtoPersonal.consultarXFiltro(OE);
		return Response.status(Response.Status.OK).entity(os).build() ;
	}

	@Override
	public Response insertarMaquinaria(ProgramacionDiariaOE OE) 
	{
		OE.getMaquinaria().setIdProgdiariaMaquinaria(0L);
		ObjetoSalida os = dtoIDC.gestionarMaquinaria(OE);
		if(os.esRespuestaOperacionCorrecta()) {
			return Response.status(Response.Status.OK).entity(os).build() ;
		}else {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(os).build() ;
		}
	}

	@Override
	public Response actualizarMaquinaria(ProgramacionDiariaOE OE) 
	{
		ObjetoSalida os = dtoIDC.gestionarMaquinaria(OE);
		if(os.esRespuestaOperacionCorrecta()) {
			return Response.status(Response.Status.OK).entity(os).build() ;
		}else {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(os).build() ;
		}
	}

	@Override
	public Response eliminarMaquinaria(ProgramacionDiariaOE OE) {
		ObjetoSalida os = dtoIDC.eliminarMaquinaria(OE);
		if(os.esRespuestaOperacionCorrecta()) {
			return Response.status(Response.Status.OK).entity(os).build() ;
		}else {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(os).build() ;
		}
	}

	@Override
	public Response consultarXFiltroMaquinaria(ProgramacionDiariaOE OE) 
	{
		ProgDiariaMaquinariaDTO dtoMaquinaria = new ProgDiariaMaquinariaDTO();
		ObjetoSalida os = dtoMaquinaria.consultarXFiltro(OE);
		return Response.status(Response.Status.OK).entity(os).build() ;
	}

	@Override
	public Response insertarentradaMaterial(ProgramacionDiariaOE OE) 
	{
		OE.getMaterial().setIdProgdiariaMaterial(0L);
		
		if(OE.getMaterial().getIdTipoMaterial() == 1621)
		{
			ObjetoSalida os1 = new ObjetoSalida();
			os1.setCodError(CodError.ERROR_INTERNO);
			os1.setMsgError("Debe ingresar en esta opcion materiales diferentes a mezclas");
			return Response.status(Response.Status.OK).entity(os1).build() ;
		}
		
		ObjetoSalida os = dtoIDC.gestionEntradaMaterial(OE);
		if(os.esRespuestaOperacionCorrecta()) {
			return Response.status(Response.Status.OK).entity(os).build() ;
		}else {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(os).build() ;
		}
	}

	@Override
	public Response actualizarentradaMaterial(ProgramacionDiariaOE OE) 
	{
		ObjetoSalida os = dtoIDC.gestionEntradaMaterial(OE);
		
		if(OE.getMaterial().getIdTipoMaterial() == 1621)
		{
			ObjetoSalida os1 = new ObjetoSalida();
			os1.setCodError(CodError.ERROR_INTERNO);
			os1.setMsgError("Debe ingresar en esta opcion materiales diferentes a mezclas");
			return Response.status(Response.Status.OK).entity(os1).build() ;
		}
		
		if(os.esRespuestaOperacionCorrecta()) {
			return Response.status(Response.Status.OK).entity(os).build() ;
		}else {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(os).build() ;
		}
	}

	@Override
	public Response eliminarentradaMaterial(ProgramacionDiariaOE OE) {
		ObjetoSalida os = dtoIDC.eliminarMaterial(OE);
		if(os.esRespuestaOperacionCorrecta()) {
			return Response.status(Response.Status.OK).entity(os).build() ;
		}else {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(os).build() ;
		}
	}

	@Override
	public Response consultarXFiltroentradaMaterial(ProgramacionDiariaOE OE) 
	{
		ProgDiariaMaterialDTO dtoMaterial = new ProgDiariaMaterialDTO();
		ObjetoSalida os = dtoMaterial.consultarXFiltro(OE);
		return Response.status(Response.Status.OK).entity(os).build() ;
	}

	@Override
	public Response insertarsalidaMaterial(ProgramacionDiariaOE OE) {
		ObjetoSalida os = dtoSalMaterial.insertar(OE);
		if(os.esRespuestaOperacionCorrecta()) {
			return Response.status(Response.Status.OK).entity(os).build() ;
		}else {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(os).build() ;
		}
	}

	@Override
	public Response actualizarsalidaMaterial(ProgramacionDiariaOE OE) {
		ObjetoSalida os = dtoSalMaterial.actualizar(OE);
		if(os.esRespuestaOperacionCorrecta()) {
			return Response.status(Response.Status.OK).entity(os).build() ;
		}else {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(os).build() ;
		}
	}

	@Override
	public Response eliminarsalidaMaterial(ProgramacionDiariaOE OE) {
		ObjetoSalida os = dtoSalMaterial.eliminar(OE);
		if(os.esRespuestaOperacionCorrecta()) {
			return Response.status(Response.Status.OK).entity(os).build() ;
		}else {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(os).build() ;
		}
	}

	@Override
	public Response consultarXFiltrosalidaMaterial(ProgramacionDiariaOE OE) {
		ObjetoSalida os = dtoSalMaterial.consultarXFiltro(OE);
		return Response.status(Response.Status.OK).entity(os).build() ;
	}

	@Override
	public Response insertarmezcla(ProgramacionDiariaOE OE) 
	{
		OE.getMaterial().setIdProgdiariaMaterial(0L);

		if(OE.getMaterial().getIdTipoMaterial() != 1621)
		{
			ObjetoSalida os1 = new ObjetoSalida();
			os1.setCodError(CodError.ERROR_INTERNO);
			os1.setMsgError("Debe ingresar en esta opcion solo mezclas");
			return Response.status(Response.Status.OK).entity(os1).build() ;
		}
		
		ObjetoSalida os = dtoIDC.gestionarMezclaMaterial(OE);
		if(os.esRespuestaOperacionCorrecta()) {
			return Response.status(Response.Status.OK).entity(os).build() ;
		}else {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(os).build() ;
		}
	}

	@Override
	public Response actualizarmezcla(ProgramacionDiariaOE OE) 
	{

		if(OE.getMaterial().getIdTipoMaterial() != 1621)
		{
			ObjetoSalida os1 = new ObjetoSalida();
			os1.setCodError(CodError.ERROR_INTERNO);
			os1.setMsgError("Debe ingresar en esta opcion solo mezclas");
			return Response.status(Response.Status.OK).entity(os1).build() ;
		}
		
		ObjetoSalida os = dtoIDC.gestionarMezclaMaterial(OE);
		if(os.esRespuestaOperacionCorrecta()) {
			return Response.status(Response.Status.OK).entity(os).build() ;
		}else {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(os).build() ;
		}
	}

	@Override
	public Response eliminarmezcla(ProgramacionDiariaOE OE) {
		ObjetoSalida os = dtoIDC.eliminarMaterial(OE);
		if(os.esRespuestaOperacionCorrecta()) {
			return Response.status(Response.Status.OK).entity(os).build() ;
		}else {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(os).build() ;
		}
	}

	@Override
	public Response consultarXFiltromezcla(ProgramacionDiariaOE OE) {
		ProgDiariaMaterialDTO dtoMaterial = new ProgDiariaMaterialDTO();
		ObjetoSalida os = dtoMaterial.consultarXFiltro(OE);
		return Response.status(Response.Status.OK).entity(os).build() ;
	}

	@Override
	public Response insertarcantidadObra(ProgramacionDiariaOE OE) {
		ObjetoSalida os = dtoCantidad.insertar(OE);
		if(os.esRespuestaOperacionCorrecta()) {
			return Response.status(Response.Status.OK).entity(os).build() ;
		}else {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(os).build() ;
		}
	}

	@Override
	public Response actualizarcantidadObra(ProgramacionDiariaOE OE) {
		ObjetoSalida os = dtoCantidad.actualizar(OE);
		if(os.esRespuestaOperacionCorrecta()) {
			return Response.status(Response.Status.OK).entity(os).build() ;
		}else {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(os).build() ;
		}
	}

	@Override
	public Response eliminarcantidadObra(ProgramacionDiariaOE OE) {
		ObjetoSalida os = dtoCantidad.eliminar(OE);
		if(os.esRespuestaOperacionCorrecta()) {
			return Response.status(Response.Status.OK).entity(os).build() ;
		}else {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(os).build() ;
		}
	}

	@Override
	public Response consultarXFiltrocantidadObra(ProgramacionDiariaOE OE) {
		ObjetoSalida os = dtoCantidad.consultarXFiltro(OE);
		return Response.status(Response.Status.OK).entity(os).build() ;
	}

	@Override
	public Response insertarcalidad(ProgramacionDiariaOE OE) {
		ObjetoSalida os = dtoCalidad.insertar(OE);
		if(os.esRespuestaOperacionCorrecta()) {
			return Response.status(Response.Status.OK).entity(os).build() ;
		}else {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(os).build() ;
		}
	}

	@Override
	public Response actualizarcalidad(ProgramacionDiariaOE OE) {
		ObjetoSalida os = dtoCalidad.actualizar(OE);
		if(os.esRespuestaOperacionCorrecta()) {
			return Response.status(Response.Status.OK).entity(os).build() ;
		}else {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(os).build() ;
		}
	}

	@Override
	public Response eliminarcalidad(ProgramacionDiariaOE OE) {
		ObjetoSalida os = dtoCalidad.eliminar(OE);
		if(os.esRespuestaOperacionCorrecta()) {
			return Response.status(Response.Status.OK).entity(os).build() ;
		}else {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(os).build() ;
		}
	}

	@Override
	public Response consultarXFiltrocalidad(ProgramacionDiariaOE OE) {
		ObjetoSalida os = dtoCalidad.consultarXFiltro(OE);
		return Response.status(Response.Status.OK).entity(os).build() ;
	}

	@Override
	public Response insertarobservacion(ProgramacionDiariaOE OE) {
		ObjetoSalida os = dtoObservacion.insertar(OE);
		if(os.esRespuestaOperacionCorrecta()) {
			return Response.status(Response.Status.OK).entity(os).build() ;
		}else {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(os).build() ;
		}
	}

	@Override
	public Response actualizarobservacion(ProgramacionDiariaOE OE) {
		ObjetoSalida os = dtoObservacion.actualizar(OE);
		if(os.esRespuestaOperacionCorrecta()) {
			return Response.status(Response.Status.OK).entity(os).build() ;
		}else {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(os).build() ;
		}
	}

	@Override
	public Response eliminarobservacion(ProgramacionDiariaOE OE) {
		ObjetoSalida os = dtoObservacion.eliminar(OE);
		if(os.esRespuestaOperacionCorrecta()) {
			return Response.status(Response.Status.OK).entity(os).build() ;
		}else {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(os).build() ;
		}
	}

	@Override
	public Response consultarXFiltroObservacion(ProgramacionDiariaOE OE) {
		ObjetoSalida os = dtoObservacion.consultarXFiltro(OE);
		return Response.status(Response.Status.OK).entity(os).build() ;
	}

}
