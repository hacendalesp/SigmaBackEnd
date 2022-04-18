package co.gov.umv.sigma.backend.intervencion.dao.impl;

import java.util.ArrayList;
import java.util.List;

import co.gov.umv.sigma.backend.comun.cbo.ObjetoEntrada;
import co.gov.umv.sigma.backend.comun.cbo.ObjetoSalida;
import co.gov.umv.sigma.backend.comun.dao.SentenciaParametroDAO;
import co.gov.umv.sigma.backend.comun.dao.SentenciaTipoParametroDAO;
import co.gov.umv.sigma.backend.intervencion.cbo.ProgramacionDiariaOE;
import co.gov.umv.sigma.backend.mejoramiento.dao.ICrudDAO;
import co.gov.umv.sigma.backend.mejoramiento.dao.impl.CrudDAO;
import oracle.jdbc.OracleTypes;

public class ProgDiariaCalidadDAO  extends CrudDAO  implements ICrudDAO
{

	private final static String PACKAGE = "PKG_PROGDIARIA_CALIDAD";

	@Override
	public ObjetoSalida insertar(ObjetoEntrada OE) 
	{ 
		List<SentenciaParametroDAO> parametros = new ArrayList<SentenciaParametroDAO>();
	
		parametros.add(new SentenciaParametroDAO("p_id_programacion_diaria", ((ProgramacionDiariaOE)OE).getCalidad().getIdProgramacionDiaria(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_numero_muestras_tomadas_idc", ((ProgramacionDiariaOE)OE).getCalidad().getNumeroMuestrasTomadas(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_material_idc", ((ProgramacionDiariaOE)OE).getCalidad().getIdTipoMaterial(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_ensayo_idc", ((ProgramacionDiariaOE)OE).getCalidad().getIdTipoEnsayo(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_resultado_idc", ((ProgramacionDiariaOE)OE).getCalidad().getResultado(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
				
		return ejecutar(OE, PACKAGE+".prc_insertar", parametros);	
	}
	
	@Override
	public ObjetoSalida actualizar(ObjetoEntrada OE) 
	{ 
		List<SentenciaParametroDAO> parametros = new ArrayList<SentenciaParametroDAO>();
	
		parametros.add(new SentenciaParametroDAO("p_id_progdiaria_calidad", ((ProgramacionDiariaOE)OE).getCalidad().getIdProgdiariaCalidad(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_programacion_diaria", ((ProgramacionDiariaOE)OE).getCalidad().getIdProgramacionDiaria(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_numero_muestras_tomadas_idc", ((ProgramacionDiariaOE)OE).getCalidad().getNumeroMuestrasTomadas(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_material_idc", ((ProgramacionDiariaOE)OE).getCalidad().getIdTipoMaterial(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_ensayo_idc", ((ProgramacionDiariaOE)OE).getCalidad().getIdTipoEnsayo(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_resultado_idc", ((ProgramacionDiariaOE)OE).getCalidad().getResultado(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
	
		
		return ejecutar(OE, PACKAGE+".prc_actualizar", parametros);
	}


	@Override
	public ObjetoSalida eliminar(ObjetoEntrada OE) 
	{ 
        List<SentenciaParametroDAO> parametros = new ArrayList<SentenciaParametroDAO>();
    	
        parametros.add(new SentenciaParametroDAO("p_id_progdiaria_calidad", ((ProgramacionDiariaOE)OE).getCalidad().getIdProgdiariaCalidad(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		
    			
        return ejecutar(OE, PACKAGE+".prc_eliminar", parametros);
	}

	
	@Override
	public ObjetoSalida consultarXFiltro(ObjetoEntrada OE) 
	{ 
		return consultaXFiltro(OE, PACKAGE+".prc_consultarporfiltro");
	}
	
}