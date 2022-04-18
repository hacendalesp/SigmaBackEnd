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

public class ProgDiariaSalidaMaterialDAO extends CrudDAO  implements ICrudDAO
{

	private final static String PACKAGE = "PKG_PROGDIARIA_SALIDA_MATERIAL";

	@Override
	public ObjetoSalida insertar(ObjetoEntrada OE) 
	{ 
		List<SentenciaParametroDAO> parametros = new ArrayList<SentenciaParametroDAO>();
		
		parametros.add(new SentenciaParametroDAO("p_id_programacion_diaria", ((ProgramacionDiariaOE)OE).getSalidaMaterial().getIdProgramacionDiaria(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_material_idc", ((ProgramacionDiariaOE)OE).getSalidaMaterial().getIdTipoMaterial(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_clase_material_idc", ((ProgramacionDiariaOE)OE).getSalidaMaterial().getIdTipoClaseMaterial(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_placa_idc", ((ProgramacionDiariaOE)OE).getSalidaMaterial().getPlaca(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_movil_idc", ((ProgramacionDiariaOE)OE).getSalidaMaterial().getMovil(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_volumen_idc", ((ProgramacionDiariaOE)OE).getSalidaMaterial().getVolumen(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_numero_recibo_idc", ((ProgramacionDiariaOE)OE).getSalidaMaterial().getNumeroRecibo(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_id_archivo_recibo_idc", ((ProgramacionDiariaOE)OE).getSalidaMaterial().getIdArchivoRecibo(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_hora_entrada_idc", ((ProgramacionDiariaOE)OE).getSalidaMaterial().getHoraEntrada(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_hora_salida_idc", ((ProgramacionDiariaOE)OE).getSalidaMaterial().getHoraSalida(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_destino_idc", ((ProgramacionDiariaOE)OE).getSalidaMaterial().getIdTipoDestino(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_numero_vale_idc", ((ProgramacionDiariaOE)OE).getSalidaMaterial().getNumeroVale(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_observaciones_idc", ((ProgramacionDiariaOE)OE).getSalidaMaterial().getObservaciones(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
					
		return ejecutar(OE, PACKAGE+".prc_insertar", parametros);	
	}
	
	@Override
	public ObjetoSalida actualizar(ObjetoEntrada OE) 
	{ 
		List<SentenciaParametroDAO> parametros = new ArrayList<SentenciaParametroDAO>();
	
		parametros.add(new SentenciaParametroDAO("p_id_progdiaria_salida_material", ((ProgramacionDiariaOE)OE).getSalidaMaterial().getIdProgdiariaSalidaMaterial(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_programacion_diaria", ((ProgramacionDiariaOE)OE).getSalidaMaterial().getIdProgramacionDiaria(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_material_idc", ((ProgramacionDiariaOE)OE).getSalidaMaterial().getIdTipoMaterial(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_clase_material_idc", ((ProgramacionDiariaOE)OE).getSalidaMaterial().getIdTipoClaseMaterial(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_placa_idc", ((ProgramacionDiariaOE)OE).getSalidaMaterial().getPlaca(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_movil_idc", ((ProgramacionDiariaOE)OE).getSalidaMaterial().getMovil(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_volumen_idc", ((ProgramacionDiariaOE)OE).getSalidaMaterial().getVolumen(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_numero_recibo_idc", ((ProgramacionDiariaOE)OE).getSalidaMaterial().getNumeroRecibo(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_id_archivo_recibo_idc", ((ProgramacionDiariaOE)OE).getSalidaMaterial().getIdArchivoRecibo(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_hora_entrada_idc", ((ProgramacionDiariaOE)OE).getSalidaMaterial().getHoraEntrada(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_hora_salida_idc", ((ProgramacionDiariaOE)OE).getSalidaMaterial().getHoraSalida(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_destino_idc", ((ProgramacionDiariaOE)OE).getSalidaMaterial().getIdTipoDestino(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_numero_vale_idc", ((ProgramacionDiariaOE)OE).getSalidaMaterial().getNumeroVale(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_observaciones_idc", ((ProgramacionDiariaOE)OE).getSalidaMaterial().getObservaciones(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		
		return ejecutar(OE, PACKAGE+".prc_actualizar", parametros);
	}


	@Override
	public ObjetoSalida eliminar(ObjetoEntrada OE) 
	{ 
        List<SentenciaParametroDAO> parametros = new ArrayList<SentenciaParametroDAO>();
    	
        parametros.add(new SentenciaParametroDAO("p_id_progdiaria_salida_material", ((ProgramacionDiariaOE)OE).getSalidaMaterial().getIdProgdiariaSalidaMaterial(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
				
        return ejecutar(OE, PACKAGE+".prc_eliminar", parametros);
	}

	
	@Override
	public ObjetoSalida consultarXFiltro(ObjetoEntrada OE) 
	{ 
		return consultaXFiltro(OE, PACKAGE+".prc_consultarporfiltro");
	}
	
}