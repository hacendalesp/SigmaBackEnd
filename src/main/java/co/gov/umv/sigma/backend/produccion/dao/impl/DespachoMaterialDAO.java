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

public class DespachoMaterialDAO  extends CrudDAO  implements ICrudDAO {


	private final static String PACKAGE = "PKG_DESPACHO_MATERIALES";
		
	@Override
	public ObjetoSalida insertar(ObjetoEntrada OE) 
	{
		List<SentenciaParametroDAO> parametros = new ArrayList<SentenciaParametroDAO>();
		
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
		
		return ejecutar(OE, PACKAGE+".prc_insertar", parametros);	
	}
	

	@Override
	public ObjetoSalida actualizar(ObjetoEntrada OE) 
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
			
		return ejecutar(OE, PACKAGE+".prc_actualizar", parametros);
	}

	@Override
	public ObjetoSalida eliminar(ObjetoEntrada OE) 
	{
		List<SentenciaParametroDAO> parametros = new ArrayList<SentenciaParametroDAO>();
	
		parametros.add(new SentenciaParametroDAO("p_id_despacho_materiales", ((ProduccionOE)OE).getDespachoMaterial().getIdDespachoMateriales(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));

		return ejecutar(OE, PACKAGE+".prc_eliminar", parametros);
	}

	@Override
	public ObjetoSalida consultarXFiltro(ObjetoEntrada OE) 
	{ 
		return consultaXFiltro(OE, PACKAGE+".prc_consultarporfiltro");
	}
	
	
}
