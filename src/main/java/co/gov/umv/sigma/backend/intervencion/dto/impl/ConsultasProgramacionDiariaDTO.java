package co.gov.umv.sigma.backend.intervencion.dto.impl;

import co.gov.umv.sigma.backend.comun.cbo.ObjetoSalida;
import co.gov.umv.sigma.backend.intervencion.cbo.ProgramacionDiariaOE;
import co.gov.umv.sigma.backend.intervencion.dao.impl.ConsultasProgramacionDiariaDAO;
import co.gov.umv.sigma.backend.mejoramiento.cbo.ConsultaOE;

public class ConsultasProgramacionDiariaDTO {

	ConsultasProgramacionDiariaDAO modelo = new ConsultasProgramacionDiariaDAO();
	
	public ObjetoSalida consultaProgramacionDiaria(ConsultaOE OE) {
		
		return modelo.consultaProgramacionDiaria(OE);
	}

	
	public ObjetoSalida consultaProgramacionDiariaPersonal(ConsultaOE OE) {
		return modelo.consultaProgramacionDiariaPersonal(OE);
	}

	
	public ObjetoSalida consultaProgramacionDiariaMaquinaria(ConsultaOE OE) {
		return modelo.consultaProgramacionDiariaMaquinaria(OE);
	}

	
	public ObjetoSalida consultaProgramacionDiariaMaterial(ConsultaOE OE) {
		return modelo.consultaProgramacionDiariaMaterial(OE);
	}


	public ObjetoSalida totalizarMaterialPorTipoYClase(ConsultaOE OE) {
		return modelo.totalizarMaterialPorTipoYClase(OE);
	}


	public ObjetoSalida totalizarMaterialPorTipo(ConsultaOE OE) {
		return modelo.totalizarMaterialPorTipo(OE);
	}
}
