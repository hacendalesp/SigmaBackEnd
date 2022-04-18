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

public class ProgDiariaMaterialDAO extends CrudDAO  implements ICrudDAO
{

	private final static String PACKAGE = "PKG_PROGDIARIA_MATERIAL";

	@Override
	public ObjetoSalida insertar(ObjetoEntrada OE) 
	{ 
		List<SentenciaParametroDAO> parametros = new ArrayList<SentenciaParametroDAO>();
		
		parametros.add(new SentenciaParametroDAO("p_id_programacion_diaria", ((ProgramacionDiariaOE)OE).getMaterial().getIdProgramacionDiaria(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_material", ((ProgramacionDiariaOE)OE).getMaterial().getIdTipoMaterial(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_clase_material", ((ProgramacionDiariaOE)OE).getMaterial().getIdTipoClaseMaterial(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_origen", ((ProgramacionDiariaOE)OE).getMaterial().getIdTipoOrigen(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_cantidad", ((ProgramacionDiariaOE)OE).getMaterial().getCantidad(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_unidad_medida", ((ProgramacionDiariaOE)OE).getMaterial().getIdTipoUnidadMedida(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_hora", ((ProgramacionDiariaOE)OE).getMaterial().getHora(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_unidadejecutora", ((ProgramacionDiariaOE)OE).getMaterial().getIdTipoUnidadEjecutora(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_cantidad_consolidada", ((ProgramacionDiariaOE)OE).getMaterial().getCantidadConsolidada(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));

		parametros.add(new SentenciaParametroDAO("p_movil_idc", ((ProgramacionDiariaOE)OE).getMaterial().getMovilIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_placa_idc", ((ProgramacionDiariaOE)OE).getMaterial().getPlacaIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_cantidad_idc", ((ProgramacionDiariaOE)OE).getMaterial().getCantidadIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_numero_recibo_idc", ((ProgramacionDiariaOE)OE).getMaterial().getNumeroReciboIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_id_archivo_recibo_idc", ((ProgramacionDiariaOE)OE).getMaterial().getIdArchivoReciboIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_hora_entrada_idc", ((ProgramacionDiariaOE)OE).getMaterial().getHoraEntradaIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_hora_instalacion_idc", ((ProgramacionDiariaOE)OE).getMaterial().getHoraInstalacionIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_hora_salida_idc", ((ProgramacionDiariaOE)OE).getMaterial().getHoraSalidaIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_abcsisa_inicio_idc", ((ProgramacionDiariaOE)OE).getMaterial().getAbcsisaInicioIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_abcsisa_final_idc", ((ProgramacionDiariaOE)OE).getMaterial().getAbcsisaFinalIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_abcsisa_carril_idc", ((ProgramacionDiariaOE)OE).getMaterial().getAbcsisaCarrilIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_temperatura_recibo_idc", ((ProgramacionDiariaOE)OE).getMaterial().getTemperaturaReciboIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_temperatura_llegada_idc", ((ProgramacionDiariaOE)OE).getMaterial().getTemperaturaLlegadaIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_temperatura_extendido_idc", ((ProgramacionDiariaOE)OE).getMaterial().getTemperaturaExtendidoIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_temperatura_compactacion_idc", ((ProgramacionDiariaOE)OE).getMaterial().getTemperaturaCompactacionIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_actividad_observacion_idc", ((ProgramacionDiariaOE)OE).getMaterial().getActividadObservacionIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_observaciones_idc", ((ProgramacionDiariaOE)OE).getMaterial().getObservacionesIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));		
		parametros.add(new SentenciaParametroDAO("p_REGISTRADO_EN_IDC", ((ProgramacionDiariaOE)OE).getMaterial().getRegistradoIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));	
		
		return ejecutar(OE, PACKAGE+".prc_insertar", parametros);	
	}
	
	@Override
	public ObjetoSalida actualizar(ObjetoEntrada OE) 
	{ 
		List<SentenciaParametroDAO> parametros = new ArrayList<SentenciaParametroDAO>();
	
		parametros.add(new SentenciaParametroDAO("p_id_progdiaria_material", ((ProgramacionDiariaOE)OE).getMaterial().getIdProgdiariaMaterial(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_programacion_diaria", ((ProgramacionDiariaOE)OE).getMaterial().getIdProgramacionDiaria(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_material", ((ProgramacionDiariaOE)OE).getMaterial().getIdTipoMaterial(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_clase_material", ((ProgramacionDiariaOE)OE).getMaterial().getIdTipoClaseMaterial(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_origen", ((ProgramacionDiariaOE)OE).getMaterial().getIdTipoOrigen(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_cantidad", ((ProgramacionDiariaOE)OE).getMaterial().getCantidad(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_unidad_medida", ((ProgramacionDiariaOE)OE).getMaterial().getIdTipoUnidadMedida(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_hora", ((ProgramacionDiariaOE)OE).getMaterial().getHora(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_unidadejecutora", ((ProgramacionDiariaOE)OE).getMaterial().getIdTipoUnidadEjecutora(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_cantidad_consolidada", ((ProgramacionDiariaOE)OE).getMaterial().getCantidadConsolidada(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));

		parametros.add(new SentenciaParametroDAO("p_movil_idc", ((ProgramacionDiariaOE)OE).getMaterial().getMovilIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_placa_idc", ((ProgramacionDiariaOE)OE).getMaterial().getPlacaIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_cantidad_idc", ((ProgramacionDiariaOE)OE).getMaterial().getCantidadIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_numero_recibo_idc", ((ProgramacionDiariaOE)OE).getMaterial().getNumeroReciboIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_id_archivo_recibo_idc", ((ProgramacionDiariaOE)OE).getMaterial().getIdArchivoReciboIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_hora_entrada_idc", ((ProgramacionDiariaOE)OE).getMaterial().getHoraEntradaIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_hora_instalacion_idc", ((ProgramacionDiariaOE)OE).getMaterial().getHoraInstalacionIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_hora_salida_idc", ((ProgramacionDiariaOE)OE).getMaterial().getHoraSalidaIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_abcsisa_inicio_idc", ((ProgramacionDiariaOE)OE).getMaterial().getAbcsisaInicioIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_abcsisa_final_idc", ((ProgramacionDiariaOE)OE).getMaterial().getAbcsisaFinalIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_abcsisa_carril_idc", ((ProgramacionDiariaOE)OE).getMaterial().getAbcsisaCarrilIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_temperatura_recibo_idc", ((ProgramacionDiariaOE)OE).getMaterial().getTemperaturaReciboIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_temperatura_llegada_idc", ((ProgramacionDiariaOE)OE).getMaterial().getTemperaturaLlegadaIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_temperatura_extendido_idc", ((ProgramacionDiariaOE)OE).getMaterial().getTemperaturaExtendidoIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_temperatura_compactacion_idc", ((ProgramacionDiariaOE)OE).getMaterial().getTemperaturaCompactacionIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_actividad_observacion_idc", ((ProgramacionDiariaOE)OE).getMaterial().getActividadObservacionIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_observaciones_idc", ((ProgramacionDiariaOE)OE).getMaterial().getObservacionesIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));		
		parametros.add(new SentenciaParametroDAO("p_REGISTRADO_EN_IDC", ((ProgramacionDiariaOE)OE).getMaterial().getRegistradoIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));	
		
		return ejecutar(OE, PACKAGE+".prc_actualizar", parametros);
	}


	@Override
	public ObjetoSalida eliminar(ObjetoEntrada OE) 
	{ 
        List<SentenciaParametroDAO> parametros = new ArrayList<SentenciaParametroDAO>();
    	
    	parametros.add(new SentenciaParametroDAO("p_id_progdiaria_material", ((ProgramacionDiariaOE)OE).getMaterial().getIdProgdiariaMaterial(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
	    				
        return ejecutar(OE, PACKAGE+".prc_eliminar", parametros);
	}

	
	@Override
	public ObjetoSalida consultarXFiltro(ObjetoEntrada OE) 
	{ 
		return consultaXFiltro(OE, PACKAGE+".prc_consultarporfiltro");
	}
	
}