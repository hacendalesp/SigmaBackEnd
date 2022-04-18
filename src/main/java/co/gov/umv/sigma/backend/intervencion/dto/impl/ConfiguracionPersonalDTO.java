package co.gov.umv.sigma.backend.intervencion.dto.impl;

import co.gov.umv.sigma.backend.comun.cbo.ObjetoEntrada;
import co.gov.umv.sigma.backend.comun.cbo.ObjetoSalida;
import co.gov.umv.sigma.backend.intervencion.dao.impl.ConfiguracionPersonalDAO;

public class ConfiguracionPersonalDTO {

	ConfiguracionPersonalDAO dao = new ConfiguracionPersonalDAO();
	
	public ObjetoSalida listarApoyoXDirectorXZona(ObjetoEntrada OE) {
		return dao.listarApoyoXDirectorXZona(OE);
	}

	public ObjetoSalida listarResidenteXDirectorXZona(ObjetoEntrada OE) {
		return dao.listarResidenteXDirectorXZona(OE);
	}
	
	public ObjetoSalida listarResidentesXDirector(ObjetoEntrada OE) {
		return dao.listarResidentesXDirector(OE);
	}
	
	public ObjetoSalida listarApoyosXDirector(ObjetoEntrada OE) {
		return dao.listarApoyosXDirector(OE);
	}

}
