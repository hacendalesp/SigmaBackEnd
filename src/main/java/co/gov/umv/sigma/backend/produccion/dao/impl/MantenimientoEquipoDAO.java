package co.gov.umv.sigma.backend.produccion.dao.impl;

import java.util.ArrayList;
import java.util.List;

import co.gov.umv.sigma.backend.comun.cbo.ObjetoEntrada;
import co.gov.umv.sigma.backend.comun.cbo.ObjetoSalida;
import co.gov.umv.sigma.backend.comun.dao.SentenciaParametroDAO;
import co.gov.umv.sigma.backend.comun.dao.SentenciaTipoParametroDAO;
import co.gov.umv.sigma.backend.mejoramiento.dao.ICrudDAO;
import co.gov.umv.sigma.backend.mejoramiento.dao.impl.CrudDAO;
import co.gov.umv.sigma.backend.produccion.cbo.ProduccionOE;
import oracle.jdbc.OracleTypes;

public class MantenimientoEquipoDAO  extends CrudDAO  implements ICrudDAO
{

	private final static String PACKAGE = "PKG_MANTENIMIENTO_EQUIPO";

	@Override
	public ObjetoSalida insertar(ObjetoEntrada OE) 
	{ 
	    List<SentenciaParametroDAO> parametros = new ArrayList<SentenciaParametroDAO>();
	
	    parametros.add(new SentenciaParametroDAO("p_consecutivo", ((ProduccionOE)OE).getMantenimiento().getConsecutivo(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_codigo", ((ProduccionOE)OE).getMantenimiento().getCodigo(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_id_equipo", ((ProduccionOE)OE).getMantenimiento().getIdEquipo(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_tipo", ((ProduccionOE)OE).getMantenimiento().getTipo(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_descripcion_fallo", ((ProduccionOE)OE).getMantenimiento().getDescripcionFallo(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_ingreso_como_fallo", ((ProduccionOE)OE).getMantenimiento().getIngresoComoFallo(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_var_control_fallo", ((ProduccionOE)OE).getMantenimiento().getIdVarControlFallo(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_valor_var_fallo", ((ProduccionOE)OE).getMantenimiento().getValorVarFallo(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_ubicacion", ((ProduccionOE)OE).getMantenimiento().getUbicacion(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
	
		parametros.add(new SentenciaParametroDAO("p_id_usuario_reporto_fallo", ((ProduccionOE)OE).getMantenimiento().getIdUsuarioReportoFallo(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		
		parametros.add(new SentenciaParametroDAO("p_descripcion_mtto", ((ProduccionOE)OE).getMantenimiento().getDescripcionMtto(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_fecha", obtenerFecha( ((ProduccionOE)OE).getMantenimiento().getFecha()), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.DATE));
		parametros.add(new SentenciaParametroDAO("p_id_var_control_mtto", ((ProduccionOE)OE).getMantenimiento().getIdVarControlMtto(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_valor_var_mtto", ((ProduccionOE)OE).getMantenimiento().getValorVarMtto(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		
		parametros.add(new SentenciaParametroDAO("p_id_usuario_programa_mtto", ((ProduccionOE)OE).getMantenimiento().getIdPersonaReporto(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		
		parametros.add(new SentenciaParametroDAO("p_cargo", ((ProduccionOE)OE).getMantenimiento().getCargo(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_contrato", ((ProduccionOE)OE).getMantenimiento().getContrato(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_vigencia_contrato", ((ProduccionOE)OE).getMantenimiento().getVigenciaContrato(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		
		parametros.add(new SentenciaParametroDAO("p_id_tipo_mantenimiento", ((ProduccionOE)OE).getMantenimiento().getIdTipoMantenimiento(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_motivo_cancelacion", ((ProduccionOE)OE).getMantenimiento().getMotivoCancelacion(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_estado", ((ProduccionOE)OE).getMantenimiento().getEstado(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));	  		
        
	     
	    return ejecutar(OE, PACKAGE+".prc_insertar", parametros);        
	}
	
	@Override
	public ObjetoSalida actualizar(ObjetoEntrada OE) 
	{ 
		List<SentenciaParametroDAO> parametros = new ArrayList<SentenciaParametroDAO>();

		parametros.add(new SentenciaParametroDAO("p_id_mantenimiento_equipo", ((ProduccionOE)OE).getMantenimiento().getIdMantenimientoEquipo(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_consecutivo", ((ProduccionOE)OE).getMantenimiento().getConsecutivo(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_codigo", ((ProduccionOE)OE).getMantenimiento().getCodigo(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_id_equipo", ((ProduccionOE)OE).getMantenimiento().getIdEquipo(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_tipo", ((ProduccionOE)OE).getMantenimiento().getTipo(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_descripcion_fallo", ((ProduccionOE)OE).getMantenimiento().getDescripcionFallo(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_ingreso_como_fallo", ((ProduccionOE)OE).getMantenimiento().getIngresoComoFallo(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_var_control_fallo", ((ProduccionOE)OE).getMantenimiento().getIdVarControlFallo(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_valor_var_fallo", ((ProduccionOE)OE).getMantenimiento().getValorVarFallo(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_ubicacion", ((ProduccionOE)OE).getMantenimiento().getUbicacion(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		
		parametros.add(new SentenciaParametroDAO("p_id_usuario_reporto_fallo", ((ProduccionOE)OE).getMantenimiento().getIdUsuarioReportoFallo(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		
		parametros.add(new SentenciaParametroDAO("p_descripcion_mtto", ((ProduccionOE)OE).getMantenimiento().getDescripcionMtto(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_fecha", obtenerFecha( ((ProduccionOE)OE).getMantenimiento().getFecha()), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.DATE));
		parametros.add(new SentenciaParametroDAO("p_id_var_control_mtto", ((ProduccionOE)OE).getMantenimiento().getIdVarControlMtto(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_valor_var_mtto", ((ProduccionOE)OE).getMantenimiento().getValorVarMtto(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		
		parametros.add(new SentenciaParametroDAO("p_id_usuario_programa_mtto", ((ProduccionOE)OE).getMantenimiento().getIdPersonaReporto(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		
		parametros.add(new SentenciaParametroDAO("p_cargo", ((ProduccionOE)OE).getMantenimiento().getCargo(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_contrato", ((ProduccionOE)OE).getMantenimiento().getContrato(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_vigencia_contrato", ((ProduccionOE)OE).getMantenimiento().getVigenciaContrato(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		
		parametros.add(new SentenciaParametroDAO("p_id_tipo_mantenimiento", ((ProduccionOE)OE).getMantenimiento().getIdTipoMantenimiento(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_motivo_cancelacion", ((ProduccionOE)OE).getMantenimiento().getMotivoCancelacion(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_estado", ((ProduccionOE)OE).getMantenimiento().getEstado(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));	  		
        
		return ejecutar(OE, PACKAGE+".prc_actualizar", parametros);        
	}


	
	@Override
	public ObjetoSalida eliminar(ObjetoEntrada OE) 
	{ 
        List<SentenciaParametroDAO> parametros = new ArrayList<SentenciaParametroDAO>();

	    parametros.add(new SentenciaParametroDAO("p_id_mantenimiento_equipo", ((ProduccionOE)OE).getMantenimiento().getIdMantenimientoEquipo(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));

        return ejecutar(OE, PACKAGE+".prc_eliminar", parametros);
	}

	
	@Override
	public ObjetoSalida consultarXFiltro(ObjetoEntrada OE) 
	{ 
		return consultaXFiltro(OE, PACKAGE+".prc_consultarporfiltro");
	}



	
	
}
