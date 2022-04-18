package co.gov.umv.sigma.backend.intervencion.dto.impl;

import co.gov.umv.sigma.backend.comun.cbo.ObjetoEntrada;
import co.gov.umv.sigma.backend.comun.cbo.ObjetoSalida;
import co.gov.umv.sigma.backend.intervencion.cbo.ProgramacionDiariaOE;
import co.gov.umv.sigma.backend.intervencion.dao.impl.InformacionDiariaCuadrillaDAO;

public class InformacionDiariaCuadrillaDTO 
{
	InformacionDiariaCuadrillaDAO modelo = new InformacionDiariaCuadrillaDAO();
	

	public ObjetoSalida insertarIdc(ObjetoEntrada OE) {
		// TODO Auto-generated method stub
		return modelo.insertarIdc(OE);
	}


	public ObjetoSalida actualizarIdc(ObjetoEntrada OE) {
		// TODO Auto-generated method stub
		return modelo.actualizarIdc(OE);
	}


	public ObjetoSalida eliminarIdc(ObjetoEntrada OE) {
		// TODO Auto-generated method stub
		return modelo.eliminarIdc(OE);
	}


	public ObjetoSalida consultarXFiltroIdc(ObjetoEntrada OE) {
		// TODO Auto-generated method stub
		return modelo.consultarXFiltroIdc(OE);
	}


	public ObjetoSalida gestionarPersonal(ProgramacionDiariaOE OE) {
		return modelo.gestionarPersonal(OE);
	}


	public ObjetoSalida eliminarPersonal(ProgramacionDiariaOE OE) {
		return modelo.eliminarPersonal(OE);
	}


	public ObjetoSalida gestionarMaquinaria(ProgramacionDiariaOE OE) {
		return modelo.gestionarMaquinaria(OE);
	}


	public ObjetoSalida eliminarMaquinaria(ProgramacionDiariaOE OE) {
		return modelo.eliminarMaquinaria(OE);
	}


	public ObjetoSalida gestionEntradaMaterial(ProgramacionDiariaOE OE) 
	{
		return modelo.gestionEntradaMaterial(OE);
	}


	public ObjetoSalida eliminarMaterial(ProgramacionDiariaOE OE) {
		return modelo.eliminarMaterial(OE);
	}


	public ObjetoSalida gestionarMezclaMaterial(ProgramacionDiariaOE OE) {
		return modelo.gestionMezclaMaterial(OE);
	}



}
