package co.gov.umv.sigma.backend.produccion.dao.impl;

import java.util.ArrayList;
import java.util.List;

import co.gov.umv.sigma.backend.comun.cbo.ObjetoEntrada;
import co.gov.umv.sigma.backend.comun.cbo.ObjetoSalida;
import co.gov.umv.sigma.backend.comun.dao.SentenciaParametroDAO;
import co.gov.umv.sigma.backend.comun.dao.SentenciaTipoParametroDAO;
import co.gov.umv.sigma.backend.mejoramiento.dao.impl.CrudDAO;
import co.gov.umv.sigma.backend.produccion.cbo.ProduccionOE;
import oracle.jdbc.OracleTypes;

public class GestionOrdenProduccionDAO extends CrudDAO {

	private final static String PACKAGE = "PKG_GESTION_ORDEN_PRODUCCION";
	
	
	public ObjetoSalida listarPkSolicitudMezcla(ObjetoEntrada OE) 
	{ 
        List<SentenciaParametroDAO> parametros = new ArrayList<SentenciaParametroDAO>();

	    parametros.add(new SentenciaParametroDAO("p_filtro", ((ProduccionOE)OE).getFiltro(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));

        return ejecutar(OE, PACKAGE+".prc_listarPkSolicitudMezcla", parametros);
	}


	public ObjetoSalida gestionarOrden(ProduccionOE OE) 
	{
		List<SentenciaParametroDAO> parametros = new ArrayList<SentenciaParametroDAO>();
	
		parametros.add(new SentenciaParametroDAO("p_id_orden_produccion", ((ProduccionOE)OE).getOrden().getIdOrdenProduccion(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
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
			
		return ejecutar(OE, PACKAGE+".prc_gestionarOrden", parametros);
	}


	public ObjetoSalida gestionarDetalle(ProduccionOE OE) 
	{
		List<SentenciaParametroDAO> parametros = new ArrayList<SentenciaParametroDAO>();
		
		parametros.add(new SentenciaParametroDAO("p_id_orden_produccion_detalle", ((ProduccionOE)OE).getDetalleOrden().getIdOrdenProduccionDetalle(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_orden_produccion", ((ProduccionOE)OE).getDetalleOrden().getIdOrdenProduccion(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_progdiaria_material", ((ProduccionOE)OE).getDetalleOrden().getIdProgdiariaMaterial(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_cantidad_programada", ((ProduccionOE)OE).getDetalleOrden().getCantidadProgramada(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_cantidad_producida", ((ProduccionOE)OE).getDetalleOrden().getCantidadProducida(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_observaciones", ((ProduccionOE)OE).getDetalleOrden().getObservaciones(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
				
		return ejecutar(OE, PACKAGE+".prc_gestionarDetalleOrden", parametros);
	}


	public ObjetoSalida eliminarDetalle(ProduccionOE OE) 
	{
		List<SentenciaParametroDAO> parametros = new ArrayList<SentenciaParametroDAO>();
		
		parametros.add(new SentenciaParametroDAO("p_id_orden_produccion_detalle", ((ProduccionOE)OE).getDetalleOrden().getIdOrdenProduccionDetalle(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
				
		return ejecutar(OE, PACKAGE+".prc_eliminarDetalle", parametros);
	}


	public ObjetoSalida listarTiposMaterialSolicitud(ProduccionOE OE) 
	{
		List<SentenciaParametroDAO> parametros = new ArrayList<SentenciaParametroDAO>();

	    parametros.add(new SentenciaParametroDAO("p_filtro", ((ProduccionOE)OE).getFiltro(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));

        return ejecutar(OE, PACKAGE+".prc_listarTiposMaterialSolicitud", parametros);
	}
}
