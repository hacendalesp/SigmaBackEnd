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

public class GestionMezclaFormulaDAO extends CrudDAO  
{

	private final static String PACKAGE = "PKG_GESTION_FORMULAS_MEZCLA";
	
	public ObjetoSalida insertarMezclaFormula(ObjetoEntrada OE) 
	{
		List<SentenciaParametroDAO> parametros = new ArrayList<SentenciaParametroDAO>();
		
		parametros.add(new SentenciaParametroDAO("p_id_tipo_mezcla", ((ProduccionOE)OE).getMezclaFormula().getIdTipoMezcla(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_especificacion", ((ProduccionOE)OE).getMezclaFormula().getEspecificacion(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_fecha_inicial", obtenerFecha( ((ProduccionOE)OE).getMezclaFormula().getFechaInicial()), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.DATE));
		parametros.add(new SentenciaParametroDAO("p_fecha_final",   obtenerFecha( ((ProduccionOE)OE).getMezclaFormula().getFechaFinal()), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.DATE));
		parametros.add(new SentenciaParametroDAO("p_masa_unitaria", ((ProduccionOE)OE).getMezclaFormula().getMasaUnitaria(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_volumen", ((ProduccionOE)OE).getMezclaFormula().getVolumen(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_costo_unitario", ((ProduccionOE)OE).getMezclaFormula().getCostoUnitario(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_soporte", ((ProduccionOE)OE).getMezclaFormula().getSoporte(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		
		return ejecutar(OE, PACKAGE+".prc_insertarFormula", parametros);	
	}

	
	public ObjetoSalida actualizarMezclaFormula(ObjetoEntrada OE) 
	{
		List<SentenciaParametroDAO> parametros = new ArrayList<SentenciaParametroDAO>();
	
		parametros.add(new SentenciaParametroDAO("p_id_mezcla_formula", ((ProduccionOE)OE).getMezclaFormula().getIdMezclaFormula(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_mezcla", ((ProduccionOE)OE).getMezclaFormula().getIdTipoMezcla(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_especificacion", ((ProduccionOE)OE).getMezclaFormula().getEspecificacion(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_fecha_inicial", obtenerFecha( ((ProduccionOE)OE).getMezclaFormula().getFechaInicial()), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.DATE));
		parametros.add(new SentenciaParametroDAO("p_fecha_final",   obtenerFecha( ((ProduccionOE)OE).getMezclaFormula().getFechaFinal()), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.DATE));
		parametros.add(new SentenciaParametroDAO("p_masa_unitaria", ((ProduccionOE)OE).getMezclaFormula().getMasaUnitaria(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_volumen", ((ProduccionOE)OE).getMezclaFormula().getVolumen(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_costo_unitario", ((ProduccionOE)OE).getMezclaFormula().getCostoUnitario(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_soporte", ((ProduccionOE)OE).getMezclaFormula().getSoporte(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
	
		return ejecutar(OE, PACKAGE+".prc_actualizarFormula", parametros);
	}
	
	
	public ObjetoSalida insertarMateriaPrima(ObjetoEntrada OE) 
	{
		List<SentenciaParametroDAO> parametros = new ArrayList<SentenciaParametroDAO>();
		
		parametros.add(new SentenciaParametroDAO("p_id_mezcla_formula", ((ProduccionOE)OE).getMezclaFormulaMateria().getIdMezclaFormula(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_materia", ((ProduccionOE)OE).getMezclaFormulaMateria().getIdTipoMateria(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_masa_unitaria", ((ProduccionOE)OE).getMezclaFormulaMateria().getMasaUnitaria(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_volumen", ((ProduccionOE)OE).getMezclaFormulaMateria().getVolumen(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_costo_unitario", ((ProduccionOE)OE).getMezclaFormulaMateria().getCostoUnitario(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_signo", ((ProduccionOE)OE).getMezclaFormulaMateria().getSigno(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		
		return ejecutar(OE, PACKAGE+".prc_insertarMateriaPrima", parametros);	
	}
	

	public ObjetoSalida actualizarMateriaPrima(ObjetoEntrada OE) 
	{
		List<SentenciaParametroDAO> parametros = new ArrayList<SentenciaParametroDAO>();
	
		parametros.add(new SentenciaParametroDAO("p_id_mezcla_formula_materia", ((ProduccionOE)OE).getMezclaFormulaMateria().getIdMezclaFormulaMateria(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_mezcla_formula", ((ProduccionOE)OE).getMezclaFormulaMateria().getIdMezclaFormula(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_materia", ((ProduccionOE)OE).getMezclaFormulaMateria().getIdTipoMateria(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_masa_unitaria", ((ProduccionOE)OE).getMezclaFormulaMateria().getMasaUnitaria(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_volumen", ((ProduccionOE)OE).getMezclaFormulaMateria().getVolumen(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_costo_unitario", ((ProduccionOE)OE).getMezclaFormulaMateria().getCostoUnitario(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_signo", ((ProduccionOE)OE).getMezclaFormulaMateria().getSigno(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
				
		return ejecutar(OE, PACKAGE+".prc_actualizarMateriaPrima", parametros);
	}


	public ObjetoSalida listarIdTipoMezcla(ProduccionOE OE) 
	{
        List<SentenciaParametroDAO> parametros = new ArrayList<SentenciaParametroDAO>();
        
        parametros.add(new SentenciaParametroDAO("p_filtro", OE.getFiltro(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
        	        
        return ejecutar(OE, PACKAGE+".prc_ListarIdTipoMezcla", parametros);
	}


	public ObjetoSalida listarIdTipoInsumo(ProduccionOE OE)
	{
		List<SentenciaParametroDAO> parametros = new ArrayList<SentenciaParametroDAO>();
        
        parametros.add(new SentenciaParametroDAO("p_filtro", OE.getFiltro(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
        	        
        return ejecutar(OE, PACKAGE+".prc_ListarIdTipoInsumo", parametros);	
	}

}
