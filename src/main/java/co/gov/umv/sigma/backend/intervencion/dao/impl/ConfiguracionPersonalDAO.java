package co.gov.umv.sigma.backend.intervencion.dao.impl;

import co.gov.umv.sigma.backend.comun.cbo.ObjetoEntrada;
import co.gov.umv.sigma.backend.comun.cbo.ObjetoSalida;
import co.gov.umv.sigma.backend.mejoramiento.dao.impl.CrudDAO;

public class ConfiguracionPersonalDAO extends CrudDAO {

	private final static String PACKAGE = "PKG_CONF_PERSONAL_INTERVENCION";
	
	
	public ObjetoSalida listarApoyoXDirectorXZona(ObjetoEntrada OE) {
		return consultaXFiltro(OE, PACKAGE+".prc_ListarApoyoXDirectorXZona");
	}

	public ObjetoSalida listarResidenteXDirectorXZona(ObjetoEntrada OE) {
		return consultaXFiltro(OE, PACKAGE+".prc_ListarResidenteXDirectorXZona");
	}
	
	public ObjetoSalida listarResidentesXDirector(ObjetoEntrada OE) {
		return consultaXFiltro(OE, PACKAGE+".prc_ListarResidentesXDirector");
	}
	
	public ObjetoSalida listarApoyosXDirector(ObjetoEntrada OE) {
		return consultaXFiltro(OE, PACKAGE+".prc_ListaApoyosXDirector");
	}

}
