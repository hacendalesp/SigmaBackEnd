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

public class OrdenProduccionDetalleDAO extends CrudDAO  implements ICrudDAO {


	private final static String PACKAGE = "PKG_ORDEN_PRODUCCION_DETALLE";
		
	@Override
	public ObjetoSalida insertar(ObjetoEntrada OE) 
	{
		List<SentenciaParametroDAO> parametros = new ArrayList<SentenciaParametroDAO>();
		
		parametros.add(new SentenciaParametroDAO("p_id_orden_produccion", ((ProduccionOE)OE).getDetalleOrden().getIdOrdenProduccion(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_progdiaria_material", ((ProduccionOE)OE).getDetalleOrden().getIdProgdiariaMaterial(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_cantidad_programada", ((ProduccionOE)OE).getDetalleOrden().getCantidadProgramada(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_cantidad_producida", ((ProduccionOE)OE).getDetalleOrden().getCantidadProducida(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_observaciones", ((ProduccionOE)OE).getDetalleOrden().getObservaciones(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		
		return ejecutar(OE, PACKAGE+".prc_insertar", parametros);	
	}
	

	@Override
	public ObjetoSalida actualizar(ObjetoEntrada OE) 
	{
		List<SentenciaParametroDAO> parametros = new ArrayList<SentenciaParametroDAO>();
	
		parametros.add(new SentenciaParametroDAO("p_id_orden_produccion_detalle", ((ProduccionOE)OE).getDetalleOrden().getIdOrdenProduccionDetalle(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_orden_produccion", ((ProduccionOE)OE).getDetalleOrden().getIdOrdenProduccion(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_progdiaria_material", ((ProduccionOE)OE).getDetalleOrden().getIdProgdiariaMaterial(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_cantidad_programada", ((ProduccionOE)OE).getDetalleOrden().getCantidadProgramada(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_cantidad_producida", ((ProduccionOE)OE).getDetalleOrden().getCantidadProducida(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_observaciones", ((ProduccionOE)OE).getDetalleOrden().getObservaciones(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
				
		return ejecutar(OE, PACKAGE+".prc_actualizar", parametros);
	}

	@Override
	public ObjetoSalida eliminar(ObjetoEntrada OE) 
	{
		List<SentenciaParametroDAO> parametros = new ArrayList<SentenciaParametroDAO>();
	
		parametros.add(new SentenciaParametroDAO("p_id_orden_produccion_detalle", ((ProduccionOE)OE).getDetalleOrden().getIdOrdenProduccionDetalle(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
				
		return ejecutar(OE, PACKAGE+".prc_eliminar", parametros);
	}

	@Override
	public ObjetoSalida consultarXFiltro(ObjetoEntrada OE) 
	{ 
		return consultaXFiltro(OE, PACKAGE+".prc_consultarporfiltro");
	}
	
	
}