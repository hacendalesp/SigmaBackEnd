package co.gov.umv.sigma.backend.intervencion.dto.impl;

import co.gov.umv.sigma.backend.comun.cbo.ObjetoEntrada;
import co.gov.umv.sigma.backend.comun.cbo.ObjetoSalida;
import co.gov.umv.sigma.backend.intervencion.cbo.ProgramacionDiariaOE;
import co.gov.umv.sigma.backend.intervencion.dao.impl.ProgDiariaMaquinariaDAO;
import co.gov.umv.sigma.backend.mejoramiento.dao.ICrudDAO;
import co.gov.umv.sigma.backend.mejoramiento.dto.ICrudDTO;

public class ProgDiariaMaquinariaDTO implements ICrudDTO
{
	ICrudDAO dao = new ProgDiariaMaquinariaDAO();
	
	@Override
	public ObjetoSalida insertar(ObjetoEntrada OE)
	{
	
		((ProgramacionDiariaOE)OE).getMaquinaria().setIdProgdiariaMaquinaria(0L);
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
