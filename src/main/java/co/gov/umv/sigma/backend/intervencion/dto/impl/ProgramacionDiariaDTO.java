package co.gov.umv.sigma.backend.intervencion.dto.impl;

import co.gov.umv.sigma.backend.comun.cbo.ObjetoEntrada;
import co.gov.umv.sigma.backend.comun.cbo.ObjetoSalida;
import co.gov.umv.sigma.backend.intervencion.dao.impl.ProgramacionDiariaDAO;
import co.gov.umv.sigma.backend.mejoramiento.dao.ICrudDAO;

public class ProgramacionDiariaDTO 
{
	
	ICrudDAO dao = new ProgramacionDiariaDAO();
	
	public ObjetoSalida consultarXFiltro(ObjetoEntrada OE)
	{
		
		return dao.consultarXFiltro(OE);
	}


}