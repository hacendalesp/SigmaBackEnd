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

public class OrdenProduccionDAO extends CrudDAO  implements ICrudDAO {


	private final static String PACKAGE = "PKG_ORDEN_PRODUCCION";
		
	@Override
	public ObjetoSalida insertar(ObjetoEntrada OE) 
	{
		List<SentenciaParametroDAO> parametros = new ArrayList<SentenciaParametroDAO>();
		
		parametros.add(new SentenciaParametroDAO("p_numero_orden", ((ProduccionOE)OE).getOrden().getNumeroOrden(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_fecha_orden", obtenerFecha( ((ProduccionOE)OE).getOrden().getFechaOrden()), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.DATE));
		parametros.add(new SentenciaParametroDAO("p_centro_operaciones", ((ProduccionOE)OE).getOrden().getCentroOperaciones(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_maquina1", ((ProduccionOE)OE).getOrden().getIdTipoMaquina1(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_maquina2", ((ProduccionOE)OE).getOrden().getIdTipoMaquina2(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_turno", ((ProduccionOE)OE).getOrden().getIdTipoTurno(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_material", ((ProduccionOE)OE).getOrden().getIdTipoMaterial(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_clase_material", ((ProduccionOE)OE).getOrden().getIdTipoClaseMaterial(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_cantidad_programada", ((ProduccionOE)OE).getOrden().getCantidadProgramada(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_observaciones", ((ProduccionOE)OE).getOrden().getObservaciones(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_estado_orden", ((ProduccionOE)OE).getOrden().getIdTipoEstadoOrden(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		
		return ejecutar(OE, PACKAGE+".prc_insertar", parametros);	
	}
	

	@Override
	public ObjetoSalida actualizar(ObjetoEntrada OE) 
	{
		List<SentenciaParametroDAO> parametros = new ArrayList<SentenciaParametroDAO>();
	
		parametros.add(new SentenciaParametroDAO("p_id_orden_produccion", ((ProduccionOE)OE).getOrden().getIdOrdenProduccion(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_numero_orden", ((ProduccionOE)OE).getOrden().getNumeroOrden(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_fecha_orden", obtenerFecha( ((ProduccionOE)OE).getOrden().getFechaOrden()), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.DATE));
		parametros.add(new SentenciaParametroDAO("p_centro_operaciones", ((ProduccionOE)OE).getOrden().getCentroOperaciones(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_maquina1", ((ProduccionOE)OE).getOrden().getIdTipoMaquina1(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_maquina2", ((ProduccionOE)OE).getOrden().getIdTipoMaquina2(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_turno", ((ProduccionOE)OE).getOrden().getIdTipoTurno(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_material", ((ProduccionOE)OE).getOrden().getIdTipoMaterial(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_clase_material", ((ProduccionOE)OE).getOrden().getIdTipoClaseMaterial(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_cantidad_programada", ((ProduccionOE)OE).getOrden().getCantidadProgramada(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_observaciones", ((ProduccionOE)OE).getOrden().getObservaciones(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_estado_orden", ((ProduccionOE)OE).getOrden().getIdTipoEstadoOrden(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
			
		return ejecutar(OE, PACKAGE+".prc_actualizar", parametros);
	}

	@Override
	public ObjetoSalida eliminar(ObjetoEntrada OE) 
	{
		List<SentenciaParametroDAO> parametros = new ArrayList<SentenciaParametroDAO>();
	
		parametros.add(new SentenciaParametroDAO("p_id_orden_produccion", ((ProduccionOE)OE).getOrden().getIdOrdenProduccion(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
			
		return ejecutar(OE, PACKAGE+".prc_eliminar", parametros);
	}

	@Override
	public ObjetoSalida consultarXFiltro(ObjetoEntrada OE) 
	{ 
		return consultaXFiltro(OE, PACKAGE+".prc_consultarporfiltro");
	}
	
	
}