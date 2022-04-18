package co.gov.umv.sigma.backend.intervencion.dto.impl;

import co.gov.umv.sigma.backend.comun.cbo.ObjetoEntrada;
import co.gov.umv.sigma.backend.comun.cbo.ObjetoSalida;
import co.gov.umv.sigma.backend.intervencion.cbo.ProgramacionDiariaOE;
import co.gov.umv.sigma.backend.intervencion.dao.impl.ProgDiariaMaterialDAO;
import co.gov.umv.sigma.backend.mejoramiento.dto.ICrudDTO;

public class ProgDiariaMaterialDTO implements ICrudDTO
{
	ProgDiariaMaterialDAO dao = new ProgDiariaMaterialDAO();
	
	@Override
	public ObjetoSalida insertar(ObjetoEntrada OE)
	{
		((ProgramacionDiariaOE)OE).getMaterial().setIdProgdiariaMaterial(0L);
		return dao.insertar(OE);
	}

	@Override
	public ObjetoSalida actualizar(ObjetoEntrada OE)
	{

		return dao.actualizar(OE);
	}
	
	@Override
	public ObjetoSalida eliminar(ObjetoEntrada OE)
	{
		return dao.eliminar(OE);
	}
	
	@Override
	public ObjetoSalida consultarXFiltro(ObjetoEntrada OE)
	{
		return dao.consultarXFiltro(OE);
	}


}
