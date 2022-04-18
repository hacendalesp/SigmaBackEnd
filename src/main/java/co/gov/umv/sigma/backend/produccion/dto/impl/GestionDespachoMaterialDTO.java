package co.gov.umv.sigma.backend.produccion.dto.impl;

import co.gov.umv.sigma.backend.comun.cbo.ObjetoSalida;
import co.gov.umv.sigma.backend.produccion.cbo.ProduccionOE;
import co.gov.umv.sigma.backend.produccion.dao.impl.GestionDespachoMaterialDAO;

public class GestionDespachoMaterialDTO {

	GestionDespachoMaterialDAO dao = new GestionDespachoMaterialDAO();
	
	public ObjetoSalida listarSolicitudMaterialConOrden(ProduccionOE OE) 
	{
		return dao.listarSolicitudMaterialConOrden(OE);
	}
	
	public ObjetoSalida gestionaraDespacho(ProduccionOE OE) 
	{
		return dao.gestionaraDespacho(OE);
	}

	public ObjetoSalida gestionarDetalle(ProduccionOE OE) 
	{
		return dao.gestionarDetalle(OE);
	}

	public ObjetoSalida eliminarDetalle(ProduccionOE OE) 
	{
		return dao.eliminarDetalle(OE);
	}

}
