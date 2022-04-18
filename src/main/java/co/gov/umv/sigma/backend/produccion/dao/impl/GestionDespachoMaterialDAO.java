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

public class GestionDespachoMaterialDAO extends CrudDAO {

	private final static String PACKAGE = "PKG_GESTION_DESPACHO_MATERIALES";
	
	
	public ObjetoSalida listarSolicitudMaterialConOrden(ProduccionOE OE) 
	{
		List<SentenciaParametroDAO> parametros = new ArrayList<SentenciaParametroDAO>();
		
		parametros.add(new SentenciaParametroDAO("p_filtro", OE.getFiltro(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));

		return ejecutar(OE, PACKAGE+".prc_listarPkSolicitudMaterialConOrden", parametros);
		
	}
	
	public ObjetoSalida gestionaraDespacho(ObjetoEntrada OE) 
	{
		List<SentenciaParametroDAO> parametros = new ArrayList<SentenciaParametroDAO>();
	
		parametros.add(new SentenciaParametroDAO("p_id_despacho_materiales", ((ProduccionOE)OE).getDespachoMaterial().getIdDespachoMateriales(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_numero_vale", ((ProduccionOE)OE).getDespachoMaterial().getNumeroVale(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_fecha_vale", obtenerFecha( ((ProduccionOE)OE).getDespachoMaterial().getFechaVale()), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.DATE));
		parametros.add(new SentenciaParametroDAO("p_numero_interno", ((ProduccionOE)OE).getDespachoMaterial().getNumeroInterno(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_id_equipo", ((ProduccionOE)OE).getDespachoMaterial().getIdEquipo(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_placa", ((ProduccionOE)OE).getDespachoMaterial().getPlaca(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_movil", ((ProduccionOE)OE).getDespachoMaterial().getMovil(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_nombre_conductor", ((ProduccionOE)OE).getDespachoMaterial().getNombreConductor(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_identificacion_conductor", ((ProduccionOE)OE).getDespachoMaterial().getIdentificacionConductor(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_origen_equipo", ((ProduccionOE)OE).getDespachoMaterial().getIdTipoOrigenEquipo(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_origen_material", ((ProduccionOE)OE).getDespachoMaterial().getIdTipoOrigenMaterial(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_material", ((ProduccionOE)OE).getDespachoMaterial().getIdTipoMaterial(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_cliente", ((ProduccionOE)OE).getDespachoMaterial().getCliente(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_direccion", ((ProduccionOE)OE).getDespachoMaterial().getDireccion(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_planta", ((ProduccionOE)OE).getDespachoMaterial().getIdTipoPlanta(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_temperatura", ((ProduccionOE)OE).getDespachoMaterial().getTemperatura(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_asentamiento", ((ProduccionOE)OE).getDespachoMaterial().getAsentamiento(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_peso_bruto", ((ProduccionOE)OE).getDespachoMaterial().getPesoBruto(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_peso_tara", ((ProduccionOE)OE).getDespachoMaterial().getPesoTara(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_peso_neto", ((ProduccionOE)OE).getDespachoMaterial().getPesoNeto(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_masa_unitaria", ((ProduccionOE)OE).getDespachoMaterial().getMasaUnitaria(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_volumen", ((ProduccionOE)OE).getDespachoMaterial().getVolumen(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_fecha_entrada", obtenerFecha( ((ProduccionOE)OE).getDespachoMaterial().getFechaEntrada()), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.DATE));
		parametros.add(new SentenciaParametroDAO("p_fecha_salida",  obtenerFecha( ((ProduccionOE)OE).getDespachoMaterial().getFechaSalida()), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.DATE));
		parametros.add(new SentenciaParametroDAO("p_observaciones", ((ProduccionOE)OE).getDespachoMaterial().getObservaciones(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_estado_vale", ((ProduccionOE)OE).getDespachoMaterial().getIdTipoEstadoVale(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
			
		return ejecutar(OE, PACKAGE+".prc_gestionarDespacho", parametros);
	}
	
	public ObjetoSalida gestionarDetalle(ObjetoEntrada OE) 
	{
		List<SentenciaParametroDAO> parametros = new ArrayList<SentenciaParametroDAO>();
	
		parametros.add(new SentenciaParametroDAO("p_id_despacho_materiales_detalle", ((ProduccionOE)OE).getDetalleDespacho().getIdDespachoMaterialesDetalle(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_despacho_materiales", ((ProduccionOE)OE).getDetalleDespacho().getIdDespachoMateriales(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_progdiaria_material", ((ProduccionOE)OE).getDetalleDespacho().getIdProgdiariaMaterial(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_cantidad_despachada", ((ProduccionOE)OE).getDetalleDespacho().getCantidadDespachada(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_unidad_medida", ((ProduccionOE)OE).getDetalleDespacho().getIdTipoUnidadMedida(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_observaciones", ((ProduccionOE)OE).getDetalleDespacho().getObservaciones(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
			
		return ejecutar(OE, PACKAGE+".prc_gestionarDetalle", parametros);
	}

	
	public ObjetoSalida eliminarDetalle(ObjetoEntrada OE) 
	{
		List<SentenciaParametroDAO> parametros = new ArrayList<SentenciaParametroDAO>();
	
		parametros.add(new SentenciaParametroDAO("p_id_despacho_materiales_detalle", ((ProduccionOE)OE).getDetalleDespacho().getIdDespachoMaterialesDetalle(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		
		return ejecutar(OE, PACKAGE+".prc_eliminarDetalle", parametros);
	}

}
