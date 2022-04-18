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

public class ProgDiariaMaquinariaDAO  extends CrudDAO  implements ICrudDAO
{

	private final static String PACKAGE = "PKG_PROGDIARIA_MAQUINARIA";

	@Override
	public ObjetoSalida insertar(ObjetoEntrada OE) 
	{ 
		List<SentenciaParametroDAO> parametros = new ArrayList<SentenciaParametroDAO>();
		
		parametros.add(new SentenciaParametroDAO("p_id_programacion_diaria", ((ProgramacionDiariaOE)OE).getMaquinaria().getIdProgramacionDiaria(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_clase_equipo", ((ProgramacionDiariaOE)OE).getMaquinaria().getIdTipoClaseEquipo(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_equipo", ((ProgramacionDiariaOE)OE).getMaquinaria().getIdTipoEquipo(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_origen", ((ProgramacionDiariaOE)OE).getMaquinaria().getIdTipoOrigen(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_cantidad", ((ProgramacionDiariaOE)OE).getMaquinaria().getCantidad(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_hora", ((ProgramacionDiariaOE)OE).getMaquinaria().getHora(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_movil", ((ProgramacionDiariaOE)OE).getMaquinaria().getMovil(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_unidadejecutora", ((ProgramacionDiariaOE)OE).getMaquinaria().getIdTipoUnidadEjecutora(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
	
		parametros.add(new SentenciaParametroDAO("p_id_equipo_idc", ((ProgramacionDiariaOE)OE).getMaquinaria().getIdEquipoIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_descripcion_idc", ((ProgramacionDiariaOE)OE).getMaquinaria().getDescripcionIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_placa_idc", ((ProgramacionDiariaOE)OE).getMaquinaria().getPlacaIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_hora_inicial_idc", ((ProgramacionDiariaOE)OE).getMaquinaria().getHoraInicialIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_hora_final_idc", ((ProgramacionDiariaOE)OE).getMaquinaria().getHoraFinalIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_horas_trabajadas_idc", ((ProgramacionDiariaOE)OE).getMaquinaria().getHorasTrabajadasIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_stand_by_idc", ((ProgramacionDiariaOE)OE).getMaquinaria().getStandByIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_numero_recibo_idc", ((ProgramacionDiariaOE)OE).getMaquinaria().getNumeroReciboIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_id_archivo_recibo_idc", ((ProgramacionDiariaOE)OE).getMaquinaria().getIdArchivoReciboIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_viajes_idc", ((ProgramacionDiariaOE)OE).getMaquinaria().getViajesIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_actividad_observacion_idc", ((ProgramacionDiariaOE)OE).getMaquinaria().getActividadObservacionIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_REGISTRADO_EN_IDC", ((ProgramacionDiariaOE)OE).getMaquinaria().getRegistradoIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
					
		return ejecutar(OE, PACKAGE+".prc_insertar", parametros);	
	}
	
	@Override
	public ObjetoSalida actualizar(ObjetoEntrada OE) 
	{ 
		List<SentenciaParametroDAO> parametros = new ArrayList<SentenciaParametroDAO>();
	
		parametros.add(new SentenciaParametroDAO("p_id_progdiaria_maquinaria", ((ProgramacionDiariaOE)OE).getMaquinaria().getIdProgdiariaMaquinaria(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_programacion_diaria", ((ProgramacionDiariaOE)OE).getMaquinaria().getIdProgramacionDiaria(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_clase_equipo", ((ProgramacionDiariaOE)OE).getMaquinaria().getIdTipoClaseEquipo(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_equipo", ((ProgramacionDiariaOE)OE).getMaquinaria().getIdTipoEquipo(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_origen", ((ProgramacionDiariaOE)OE).getMaquinaria().getIdTipoOrigen(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_cantidad", ((ProgramacionDiariaOE)OE).getMaquinaria().getCantidad(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_hora", ((ProgramacionDiariaOE)OE).getMaquinaria().getHora(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_movil", ((ProgramacionDiariaOE)OE).getMaquinaria().getMovil(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_unidadejecutora", ((ProgramacionDiariaOE)OE).getMaquinaria().getIdTipoUnidadEjecutora(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
	
		parametros.add(new SentenciaParametroDAO("p_id_equipo_idc", ((ProgramacionDiariaOE)OE).getMaquinaria().getIdEquipoIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_descripcion_idc", ((ProgramacionDiariaOE)OE).getMaquinaria().getDescripcionIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_placa_idc", ((ProgramacionDiariaOE)OE).getMaquinaria().getPlacaIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_hora_inicial_idc", ((ProgramacionDiariaOE)OE).getMaquinaria().getHoraInicialIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_hora_final_idc", ((ProgramacionDiariaOE)OE).getMaquinaria().getHoraFinalIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_horas_trabajadas_idc", ((ProgramacionDiariaOE)OE).getMaquinaria().getHorasTrabajadasIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_stand_by_idc", ((ProgramacionDiariaOE)OE).getMaquinaria().getStandByIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_numero_recibo_idc", ((ProgramacionDiariaOE)OE).getMaquinaria().getNumeroReciboIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_id_archivo_recibo_idc", ((ProgramacionDiariaOE)OE).getMaquinaria().getIdArchivoReciboIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_viajes_idc", ((ProgramacionDiariaOE)OE).getMaquinaria().getViajesIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_actividad_observacion_idc", ((ProgramacionDiariaOE)OE).getMaquinaria().getActividadObservacionIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_REGISTRADO_EN_IDC", ((ProgramacionDiariaOE)OE).getMaquinaria().getRegistradoIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		
		return ejecutar(OE, PACKAGE+".prc_actualizar", parametros);
	}


	@Override
	public ObjetoSalida eliminar(ObjetoEntrada OE) 
	{ 
        List<SentenciaParametroDAO> parametros = new ArrayList<SentenciaParametroDAO>();
    	
    	parametros.add(new SentenciaParametroDAO("p_id_progdiaria_maquinaria", ((ProgramacionDiariaOE)OE).getMaquinaria().getIdProgdiariaMaquinaria(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
    			
        return ejecutar(OE, PACKAGE+".prc_eliminar", parametros);
	}

	
	@Override
	public ObjetoSalida consultarXFiltro(ObjetoEntrada OE) 
	{ 
		return consultaXFiltro(OE, PACKAGE+".prc_consultarporfiltro");
	}
	
}