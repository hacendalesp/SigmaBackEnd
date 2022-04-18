package co.gov.umv.sigma.backend.intervencion.dao.impl;

import java.util.ArrayList;
import java.util.List;

import co.gov.umv.sigma.backend.comun.cbo.ObjetoEntrada;
import co.gov.umv.sigma.backend.comun.cbo.ObjetoSalida;
import co.gov.umv.sigma.backend.comun.dao.SentenciaParametroDAO;
import co.gov.umv.sigma.backend.comun.dao.SentenciaTipoParametroDAO;
import co.gov.umv.sigma.backend.intervencion.cbo.ProgramacionDiariaOE;
import co.gov.umv.sigma.backend.mejoramiento.dao.impl.CrudDAO;
import oracle.jdbc.OracleTypes;

public class InformacionDiariaCuadrillaDAO extends CrudDAO  {

	private final static String PACKAGE = "PKG_GESTION_INFORME_CUADRILLA";


	public ObjetoSalida insertarIdc(ObjetoEntrada OE) 
	{ 
		List<SentenciaParametroDAO> parametros = new ArrayList<SentenciaParametroDAO>();
		/*        
		 * 
		 * 
		 * */
		//insertar un informe de acuadrilla es ingrsar el ejecutado de algo programado. 
		
		parametros.add(new SentenciaParametroDAO("p_id_programacion_diaria", ((ProgramacionDiariaOE)OE).getInformeDiarioCuadrilla().getIdProgramacionDiaria(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_mantenimiento_vial", ((ProgramacionDiariaOE)OE).getInformeDiarioCuadrilla().getIdMantenimientoVial(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_fecha", obtenerFecha( ((ProgramacionDiariaOE)OE).getInformeDiarioCuadrilla().getFecha()), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.DATE));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_jornada", ((ProgramacionDiariaOE)OE).getInformeDiarioCuadrilla().getIdTipoJornada(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
	
		parametros.add(new SentenciaParametroDAO("p_porcentaje_avance_diario_obra_idc", ((ProgramacionDiariaOE)OE).getInformeDiarioCuadrilla().getPorcentajeAvanceDiarioObra(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_porcentaje_avance_acum_obra_idc", ((ProgramacionDiariaOE)OE).getInformeDiarioCuadrilla().getPorcentajeAvanceAcumObra(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_area_total_intervenida_idc", ((ProgramacionDiariaOE)OE).getInformeDiarioCuadrilla().getAreaTotalIntervenida(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_longitud_total_intervenida_idc", ((ProgramacionDiariaOE)OE).getInformeDiarioCuadrilla().getLongitudTotalIntervenida(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_clima_manana_idc", ((ProgramacionDiariaOE)OE).getInformeDiarioCuadrilla().getIdTipoClimaManana(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_clima_tarde_idc", ((ProgramacionDiariaOE)OE).getInformeDiarioCuadrilla().getIdTipoClimaTarde(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_clima_noche_idc", ((ProgramacionDiariaOE)OE).getInformeDiarioCuadrilla().getIdTipoClimaNoche(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_hora_inicio_actividades_idc", ((ProgramacionDiariaOE)OE).getInformeDiarioCuadrilla().getHoraInicioActividades(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_horario_fin_actividades_idc", ((ProgramacionDiariaOE)OE).getInformeDiarioCuadrilla().getHorarioFinActividades(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_servicio_vigilancia_idc", ((ProgramacionDiariaOE)OE).getInformeDiarioCuadrilla().getServicioVigilancia(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_servicio_vigilancia_horas_idc", ((ProgramacionDiariaOE)OE).getInformeDiarioCuadrilla().getServicioVigilanciaHoras(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_servicio_banio_idc", ((ProgramacionDiariaOE)OE).getInformeDiarioCuadrilla().getServicioBanio(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_servicio_banio_horas_idc", ((ProgramacionDiariaOE)OE).getInformeDiarioCuadrilla().getServicioBanioHoras(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_cantidad_seniales_idc", ((ProgramacionDiariaOE)OE).getInformeDiarioCuadrilla().getCantidadSeniales(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_cantidad_delineadores_idc", ((ProgramacionDiariaOE)OE).getInformeDiarioCuadrilla().getCantidadDelineadores(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_archivo_esquema_idc", ((ProgramacionDiariaOE)OE).getInformeDiarioCuadrilla().getIdArchivoEsquema(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_estado_obra_idc", ((ProgramacionDiariaOE)OE).getInformeDiarioCuadrilla().getIdTipoEstadoObra(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_estado_informe_idc", ((ProgramacionDiariaOE)OE).getInformeDiarioCuadrilla().getIdTipoEstadoInforme(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_persona_elabora_idc", ((ProgramacionDiariaOE)OE).getInformeDiarioCuadrilla().getIdPersonaElaboraIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_persona_revisa_idc", ((ProgramacionDiariaOE)OE).getInformeDiarioCuadrilla().getIdPersonaRevisaIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_persona_aprueba_idc", ((ProgramacionDiariaOE)OE).getInformeDiarioCuadrilla().getIdPersonaApruebaIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_observaciones_idc", ((ProgramacionDiariaOE)OE).getInformeDiarioCuadrilla().getObservacionesIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_actividad_dia_siguiente_idc", ((ProgramacionDiariaOE)OE).getInformeDiarioCuadrilla().getActividadDiaSiguiente(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
      
        return ejecutar(OE, PACKAGE+".prc_insertarIdc", parametros);	
	}
	

	public ObjetoSalida actualizarIdc(ObjetoEntrada OE) 
	{ 
		List<SentenciaParametroDAO> parametros = new ArrayList<SentenciaParametroDAO>();
	
		parametros.add(new SentenciaParametroDAO("p_id_programacion_diaria", ((ProgramacionDiariaOE)OE).getInformeDiarioCuadrilla().getIdProgramacionDiaria(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_mantenimiento_vial", ((ProgramacionDiariaOE)OE).getInformeDiarioCuadrilla().getIdMantenimientoVial(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
	
		parametros.add(new SentenciaParametroDAO("p_porcentaje_avance_diario_obra_idc", ((ProgramacionDiariaOE)OE).getInformeDiarioCuadrilla().getPorcentajeAvanceDiarioObra(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_porcentaje_avance_acum_obra_idc", ((ProgramacionDiariaOE)OE).getInformeDiarioCuadrilla().getPorcentajeAvanceAcumObra(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_area_total_intervenida_idc", ((ProgramacionDiariaOE)OE).getInformeDiarioCuadrilla().getAreaTotalIntervenida(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_longitud_total_intervenida_idc", ((ProgramacionDiariaOE)OE).getInformeDiarioCuadrilla().getLongitudTotalIntervenida(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_clima_manana_idc", ((ProgramacionDiariaOE)OE).getInformeDiarioCuadrilla().getIdTipoClimaManana(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_clima_tarde_idc", ((ProgramacionDiariaOE)OE).getInformeDiarioCuadrilla().getIdTipoClimaTarde(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_clima_noche_idc", ((ProgramacionDiariaOE)OE).getInformeDiarioCuadrilla().getIdTipoClimaNoche(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_hora_inicio_actividades_idc", ((ProgramacionDiariaOE)OE).getInformeDiarioCuadrilla().getHoraInicioActividades(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_horario_fin_actividades_idc", ((ProgramacionDiariaOE)OE).getInformeDiarioCuadrilla().getHorarioFinActividades(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_servicio_vigilancia_idc", ((ProgramacionDiariaOE)OE).getInformeDiarioCuadrilla().getServicioVigilancia(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_servicio_vigilancia_horas_idc", ((ProgramacionDiariaOE)OE).getInformeDiarioCuadrilla().getServicioVigilanciaHoras(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_servicio_banio_idc", ((ProgramacionDiariaOE)OE).getInformeDiarioCuadrilla().getServicioBanio(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_servicio_banio_horas_idc", ((ProgramacionDiariaOE)OE).getInformeDiarioCuadrilla().getServicioBanioHoras(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_cantidad_seniales_idc", ((ProgramacionDiariaOE)OE).getInformeDiarioCuadrilla().getCantidadSeniales(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_cantidad_delineadores_idc", ((ProgramacionDiariaOE)OE).getInformeDiarioCuadrilla().getCantidadDelineadores(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_archivo_esquema_idc", ((ProgramacionDiariaOE)OE).getInformeDiarioCuadrilla().getIdArchivoEsquema(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_estado_obra_idc", ((ProgramacionDiariaOE)OE).getInformeDiarioCuadrilla().getIdTipoEstadoObra(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_estado_informe_idc", ((ProgramacionDiariaOE)OE).getInformeDiarioCuadrilla().getIdTipoEstadoInforme(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_persona_elabora_idc", ((ProgramacionDiariaOE)OE).getInformeDiarioCuadrilla().getIdPersonaElaboraIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_persona_revisa_idc", ((ProgramacionDiariaOE)OE).getInformeDiarioCuadrilla().getIdPersonaRevisaIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_persona_aprueba_idc", ((ProgramacionDiariaOE)OE).getInformeDiarioCuadrilla().getIdPersonaApruebaIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_observaciones_idc", ((ProgramacionDiariaOE)OE).getInformeDiarioCuadrilla().getObservacionesIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_actividad_dia_siguiente_idc", ((ProgramacionDiariaOE)OE).getInformeDiarioCuadrilla().getActividadDiaSiguiente(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
    
		return ejecutar(OE, PACKAGE+".prc_actualizarIdc", parametros);
	}



	public ObjetoSalida eliminarIdc(ObjetoEntrada OE) 
	{ 
        List<SentenciaParametroDAO> parametros = new ArrayList<SentenciaParametroDAO>();
    	
    	parametros.add(new SentenciaParametroDAO("p_id_programacion_diaria", ((ProgramacionDiariaOE)OE).getInformeDiarioCuadrilla().getIdProgramacionDiaria(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
    		
        return ejecutar(OE, PACKAGE+".prc_eliminarIdc", parametros);
	}

	

	public ObjetoSalida consultarXFiltroIdc(ObjetoEntrada OE) 
	{ 
		return consultaXFiltro(OE, PACKAGE+".prc_consultarporfiltroIdc");
	}


	public ObjetoSalida gestionarPersonal(ProgramacionDiariaOE OE) 
	{
		List<SentenciaParametroDAO> parametros = new ArrayList<SentenciaParametroDAO>();
		
		parametros.add(new SentenciaParametroDAO("p_id_progdiaria_personal", ((ProgramacionDiariaOE)OE).getPersonal().getIdProgdiariaPersonal(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_programacion_diaria", ((ProgramacionDiariaOE)OE).getPersonal().getIdProgramacionDiaria(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_rol", ((ProgramacionDiariaOE)OE).getPersonal().getIdTipoRol(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_origen", ((ProgramacionDiariaOE)OE).getPersonal().getIdTipoOrigen(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_persona", ((ProgramacionDiariaOE)OE).getPersonal().getIdPersona(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
	
		parametros.add(new SentenciaParametroDAO("p_id_tipo_horario_idc", ((ProgramacionDiariaOE)OE).getPersonal().getIdTipoHorarioIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_cargo_idc", ((ProgramacionDiariaOE)OE).getPersonal().getIdTipoCargoIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_horario_llegada_idc", obtenerFecha( ((ProgramacionDiariaOE)OE).getPersonal().getHorarioLlegadaIdc()), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.DATE));
		parametros.add(new SentenciaParametroDAO("p_horario_salida_idc",  obtenerFecha( ((ProgramacionDiariaOE)OE).getPersonal().getHorarioSalidaIdc()), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.DATE));
		parametros.add(new SentenciaParametroDAO("p_observaciones_idc", ((ProgramacionDiariaOE)OE).getPersonal().getObservacionesIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
			
		return ejecutar(OE, PACKAGE+".prc_gestionPersonal", parametros);
	}


	public ObjetoSalida eliminarPersonal(ProgramacionDiariaOE OE) 
	{
        List<SentenciaParametroDAO> parametros = new ArrayList<SentenciaParametroDAO>();
    	
    	parametros.add(new SentenciaParametroDAO("p_id_progdiaria_personal", ((ProgramacionDiariaOE)OE).getPersonal().getIdProgdiariaPersonal(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
    		
        return ejecutar(OE, PACKAGE+".prc_eliminarPersonal", parametros);

	}


	public ObjetoSalida gestionarMaquinaria(ProgramacionDiariaOE OE) 
	{
		List<SentenciaParametroDAO> parametros = new ArrayList<SentenciaParametroDAO>();
		
		parametros.add(new SentenciaParametroDAO("p_id_progdiaria_maquinaria", ((ProgramacionDiariaOE)OE).getMaquinaria().getIdProgdiariaMaquinaria(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_programacion_diaria", ((ProgramacionDiariaOE)OE).getMaquinaria().getIdProgramacionDiaria(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
	
		parametros.add(new SentenciaParametroDAO("p_movil", ((ProgramacionDiariaOE)OE).getMaquinaria().getMovil(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
	
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
		
		return ejecutar(OE, PACKAGE+".prc_gestionMaquinaria", parametros);
	}


	public ObjetoSalida eliminarMaquinaria(ProgramacionDiariaOE OE) 
	{
        List<SentenciaParametroDAO> parametros = new ArrayList<SentenciaParametroDAO>();
    	
    	parametros.add(new SentenciaParametroDAO("p_id_progdiaria_maquinaria", ((ProgramacionDiariaOE)OE).getMaquinaria().getIdProgdiariaMaquinaria(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
    		
        return ejecutar(OE, PACKAGE+".prc_eliminarMaquinaria", parametros);

	}


	public ObjetoSalida gestionEntradaMaterial(ProgramacionDiariaOE OE) 
	{
		List<SentenciaParametroDAO> parametros = new ArrayList<SentenciaParametroDAO>();
		
		parametros.add(new SentenciaParametroDAO("p_id_progdiaria_material", ((ProgramacionDiariaOE)OE).getMaterial().getIdProgdiariaMaterial(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_programacion_diaria", ((ProgramacionDiariaOE)OE).getMaterial().getIdProgramacionDiaria(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_material", ((ProgramacionDiariaOE)OE).getMaterial().getIdTipoMaterial(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_clase_material", ((ProgramacionDiariaOE)OE).getMaterial().getIdTipoClaseMaterial(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));

		parametros.add(new SentenciaParametroDAO("p_movil_idc", ((ProgramacionDiariaOE)OE).getMaterial().getMovilIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_placa_idc", ((ProgramacionDiariaOE)OE).getMaterial().getPlacaIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_cantidad_idc", ((ProgramacionDiariaOE)OE).getMaterial().getCantidadIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_numero_recibo_idc", ((ProgramacionDiariaOE)OE).getMaterial().getNumeroReciboIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_id_archivo_recibo_idc", ((ProgramacionDiariaOE)OE).getMaterial().getIdArchivoReciboIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_hora_entrada_idc", ((ProgramacionDiariaOE)OE).getMaterial().getHoraEntradaIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_hora_salida_idc", ((ProgramacionDiariaOE)OE).getMaterial().getHoraSalidaIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_actividad_observacion_idc", ((ProgramacionDiariaOE)OE).getMaterial().getActividadObservacionIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_observaciones_idc", ((ProgramacionDiariaOE)OE).getMaterial().getObservacionesIdc(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));		
		
		return ejecutar(OE, PACKAGE+".prc_gestionEntradaMaterial", parametros);
	}

	
	public ObjetoSalida gestionMezclaMaterial(ProgramacionDiariaOE OE) 
	{
		List<SentenciaParametroDAO> parametros = new ArrayList<SentenciaParametroDAO>();
		
		parametros.add(new SentenciaParametroDAO("p_id_progdiaria_material", ((ProgramacionDiariaOE)OE).getMaterial().getIdProgdiariaMaterial(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_programacion_diaria", ((ProgramacionDiariaOE)OE).getMaterial().getIdProgramacionDiaria(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_material", ((ProgramacionDiariaOE)OE).getMaterial().getIdTipoMaterial(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_clase_material", ((ProgramacionDiariaOE)OE).getMaterial().getIdTipoClaseMaterial(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));

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
		
		return ejecutar(OE, PACKAGE+".prc_gestionMezclaMaterial", parametros);
	}
	
	public ObjetoSalida eliminarMaterial(ProgramacionDiariaOE OE)
	{
		 List<SentenciaParametroDAO> parametros = new ArrayList<SentenciaParametroDAO>();
	    	
	    	parametros.add(new SentenciaParametroDAO("p_id_progdiaria_material", ((ProgramacionDiariaOE)OE).getMaterial().getIdProgdiariaMaterial(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
	    		
	        return ejecutar(OE, PACKAGE+".prc_eliminarMaterial", parametros);
	}
}
