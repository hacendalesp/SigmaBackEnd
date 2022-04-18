package co.gov.umv.sigma.backend.produccion.dto.impl;

import co.gov.umv.sigma.backend.comun.cbo.ObjetoSalida;
import co.gov.umv.sigma.backend.produccion.cbo.ProduccionOE;
import co.gov.umv.sigma.backend.produccion.dao.impl.GestionOrdenProduccionDAO;

public class GestionOrdenProduccionDTO {

	GestionOrdenProduccionDAO dao = new GestionOrdenProduccionDAO();
	
	public ObjetoSalida listarPkSolicitudMezcla(ProduccionOE OE) {
		return dao.listarPkSolicitudMezcla(OE);
	}

	public ObjetoSalida gestionarOrden(ProduccionOE OE) {
		return dao.gestionarOrden(OE);
	}

	public ObjetoSalida gestionarDetalle(ProduccionOE OE) {
		return dao.gestionarDetalle(OE);
	}

	public ObjetoSalida eliminarDetalle(ProduccionOE OE) {
		return dao.eliminarDetalle(OE);
	}

	public ObjetoSalida listarTiposMaterialSolicitud(ProduccionOE OE) {
		return dao.listarTiposMaterialSolicitud(OE);
	}

}
