package co.gov.umv.sigma.backend.intervencion.dto.impl;

import co.gov.umv.sigma.backend.comun.cbo.ObjetoEntrada;
import co.gov.umv.sigma.backend.comun.cbo.ObjetoSalida;
import co.gov.umv.sigma.backend.intervencion.dao.impl.TipoClaseMaterialDAO;

public class TipoClaseMaterialDTO  {

	TipoClaseMaterialDAO modelo = new TipoClaseMaterialDAO();
	
	public ObjetoSalida insertar(ObjetoEntrada OE)
	{
		return modelo.insertar(OE);
	}

	public ObjetoSalida actualizar(ObjetoEntrada OE)
	{
		return modelo.actualizar(OE);
	}
	
	public ObjetoSalida eliminar(ObjetoEntrada OE)
	{
		return modelo.eliminar(OE);
	}
	
	public ObjetoSalida consultarXFiltro(ObjetoEntrada OE)
	{
		return modelo.consultarXFiltro(OE);
	}

	public ObjetoSalida filtrarTipoClaseMaterial(ObjetoEntrada OE) 
	{
		return modelo.filtrarTipoClaseMaterial(OE);
	}
	
}

