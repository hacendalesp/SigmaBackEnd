package co.gov.umv.sigma.backend.intervencion.dto.impl;

import co.gov.umv.sigma.backend.comun.cbo.ObjetoEntrada;
import co.gov.umv.sigma.backend.comun.cbo.ObjetoSalida;
import co.gov.umv.sigma.backend.intervencion.cbo.ProgramacionDiariaOE;
import co.gov.umv.sigma.backend.intervencion.dao.impl.GestionProgramacionDiariaDAO;
import co.gov.umv.sigma.backend.intervencion.dao.impl.ProgDiariaMaquinariaDAO;
import co.gov.umv.sigma.backend.intervencion.dao.impl.ProgDiariaMaterialDAO;
import co.gov.umv.sigma.backend.intervencion.dao.impl.ProgDiariaPersonalDAO;
import co.gov.umv.sigma.backend.intervencion.dao.impl.ProgramacionDiariaDAO;

public class GestionProgramacionDiariaDTO 
{

	GestionProgramacionDiariaDAO modelo = new GestionProgramacionDiariaDAO();
	
	public ObjetoSalida insertarProgDiaria(ObjetoEntrada OE)
	{
		((ProgramacionDiariaOE)OE).getProgDiaria().setIdProgramacionDiaria(0L);
		return modelo.gestionarProgDiaria(OE);
	}

	public ObjetoSalida actualizarProgDiaria(ObjetoEntrada OE)
	{
		return modelo.gestionarProgDiaria(OE);
	}
	
	public ObjetoSalida eliminarProgDiaria(ObjetoEntrada OE)
	{
		return modelo.eliminarProgDiaria(OE);
	}
	
	public ObjetoSalida consultarXFiltroProgDiaria(ObjetoEntrada OE)
	{
		ProgramacionDiariaDAO dao = new ProgramacionDiariaDAO();
		return dao.consultarXFiltro(OE);
	}

	public ObjetoSalida listarProgramacionDiarias(ProgramacionDiariaOE OE) 
	{
		return modelo.listarProgramacionesDiarias(OE);
	}

	public ObjetoSalida copiarProgDiaria(ObjetoEntrada OE) 
	{
		return modelo.copiarProgDiaria(OE);
	}
	
	
	public ObjetoSalida insertarPersonal(ObjetoEntrada OE)
	{
		((ProgramacionDiariaOE)OE).getPersonal().setIdProgdiariaPersonal(0L);
		return modelo.gestionarPersonal(OE);
	}

	public ObjetoSalida actualizarPersonal(ObjetoEntrada OE)
	{
		return modelo.gestionarPersonal(OE);
	}
	
	public ObjetoSalida eliminarPersonal(ObjetoEntrada OE)
	{
		return modelo.eliminarPersonal(OE);
	}
	
	public ObjetoSalida consultarXFiltroPersonal(ObjetoEntrada OE)
	{
		ProgDiariaPersonalDAO dao = new ProgDiariaPersonalDAO();
		return dao.consultarXFiltro(OE);
	}
	
	
	public ObjetoSalida insertarMaterial(ObjetoEntrada OE)
	{
		((ProgramacionDiariaOE)OE).getMaterial().setIdProgdiariaMaterial(0L);
		return modelo.gestionarMaterial(OE);
	}

	public ObjetoSalida actualizarMaterial(ObjetoEntrada OE)
	{
		return modelo.gestionarMaterial(OE);
	}
	
	public ObjetoSalida eliminarMaterial(ObjetoEntrada OE)
	{
		return modelo.eliminarMaterial(OE);
	}
	
	public ObjetoSalida consultarXFiltroMaterial(ObjetoEntrada OE)
	{
		ProgDiariaMaterialDAO dao = new ProgDiariaMaterialDAO();
		return dao.consultarXFiltro(OE);
	}
	
	/**/
	public ObjetoSalida insertarMaquinaria(ObjetoEntrada OE)
	{
		((ProgramacionDiariaOE)OE).getMaquinaria().setIdProgdiariaMaquinaria(0L);
		return modelo.gestionarMaquinaria(OE);
	}

	public ObjetoSalida actualizarMaquinaria(ObjetoEntrada OE)
	{
		return modelo.gestionarMaquinaria(OE);
	}
	
	public ObjetoSalida eliminarMaquinaria(ObjetoEntrada OE)
	{
		return modelo.eliminarMaquinaria(OE);
	}
	
	public ObjetoSalida consultarXFiltroMaquinaria(ObjetoEntrada OE)
	{
		ProgDiariaMaquinariaDAO dao = new ProgDiariaMaquinariaDAO();
		return dao.consultarXFiltro(OE);
	}

	public ObjetoSalida listarConsolidado(ProgramacionDiariaOE OE) {
		return modelo.listarConsolidado(OE);
	}

	public ObjetoSalida asignarMaquinaria(ProgramacionDiariaOE OE) {
		return modelo.asignarMaquinaria(OE);
	}
	
	public ObjetoSalida actualizarCampoDetalle(ProgramacionDiariaOE OE) {
		return modelo.actualizarCampoDetalle(OE);
	}
}
