package co.gov.umv.sigma.backend.intervencion.dao.impl;

import java.util.ArrayList;
import java.util.List;

import co.gov.umv.sigma.backend.comun.cbo.CodError;
import co.gov.umv.sigma.backend.comun.cbo.ObjetoSalida;
import co.gov.umv.sigma.backend.comun.dao.GenericoDAO;
import co.gov.umv.sigma.backend.comun.dao.SentenciaDAO;
import co.gov.umv.sigma.backend.comun.dao.SentenciaParametroDAO;
import co.gov.umv.sigma.backend.comun.dao.SentenciaTipoParametroDAO;
import co.gov.umv.sigma.backend.mejoramiento.cbo.ConsultaOE;
import oracle.jdbc.OracleTypes;

public class ConsultasProgramacionDiariaDAO extends GenericoDAO {
	
	private final static String PACKAGE = "PKG_CONSULTAS_PROGRAMACION_DIARIA";
	
	public ObjetoSalida consultaProgramacionDiaria(ConsultaOE OE) {
		ObjetoSalida objetoSalida = new ObjetoSalida();
	    try 
	    {
	        SentenciaDAO sentencia = new SentenciaDAO(PACKAGE+".PRC_PROGRAMACION_DIARIA", OE.getUsuario());
	        List<SentenciaParametroDAO> parametros = new ArrayList<SentenciaParametroDAO>();
	        sentencia.setParametros(parametros);
	        
	        parametros.add(new SentenciaParametroDAO("p_id_mantenimiento_vial", OE.getIdMantenimientoVial(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		         
	        objetoSalida = this.ejecutarProcedure(sentencia, objetoSalida);
		    
	    } 
	    catch (Exception e) 
	    {
	        objetoSalida.setCodError(CodError.ERROR_INTERNO);
	        objetoSalida.setMsgError(e.getMessage());
	    }
	    return objetoSalida;
	}

	
	public ObjetoSalida consultaProgramacionDiariaPersonal(ConsultaOE OE) {
		ObjetoSalida objetoSalida = new ObjetoSalida();
	    try 
	    {
	        SentenciaDAO sentencia = new SentenciaDAO(PACKAGE+".PRC_PROGDIARIA_PERSONAL", OE.getUsuario());
	        List<SentenciaParametroDAO> parametros = new ArrayList<SentenciaParametroDAO>();
	        sentencia.setParametros(parametros);
	        
	        parametros.add(new SentenciaParametroDAO("p_id_programacion_diaria", OE.getIdProgramacionDiaria(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
			   
	        objetoSalida = this.ejecutarProcedure(sentencia, objetoSalida);
		    
	    } 
	    catch (Exception e) 
	    {
	        objetoSalida.setCodError(CodError.ERROR_INTERNO);
	        objetoSalida.setMsgError(e.getMessage());
	    }
	    return objetoSalida;
	}

	
	public ObjetoSalida consultaProgramacionDiariaMaquinaria(ConsultaOE OE) {
		ObjetoSalida objetoSalida = new ObjetoSalida();
	    try 
	    {
	        SentenciaDAO sentencia = new SentenciaDAO(PACKAGE+".PRC_PROGDIARIA_MAQUINARIA", OE.getUsuario());
	        List<SentenciaParametroDAO> parametros = new ArrayList<SentenciaParametroDAO>();
	        sentencia.setParametros(parametros);
	        
	        parametros.add(new SentenciaParametroDAO("p_id_programacion_diaria", OE.getIdProgramacionDiaria(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
			    
	        objetoSalida = this.ejecutarProcedure(sentencia, objetoSalida);
		    
	    } 
	    catch (Exception e) 
	    {
	        objetoSalida.setCodError(CodError.ERROR_INTERNO);
	        objetoSalida.setMsgError(e.getMessage());
	    }
	    return objetoSalida;
	}

	
	public ObjetoSalida consultaProgramacionDiariaMaterial(ConsultaOE OE) {
		ObjetoSalida objetoSalida = new ObjetoSalida();
	    try 
	    {
	        SentenciaDAO sentencia = new SentenciaDAO(PACKAGE+".PRC_PROGDIARIA_MATERIAL", OE.getUsuario());
	        List<SentenciaParametroDAO> parametros = new ArrayList<SentenciaParametroDAO>();
	        sentencia.setParametros(parametros);
	        
	        parametros.add(new SentenciaParametroDAO("p_id_programacion_diaria", OE.getIdProgramacionDiaria(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
			  
	        objetoSalida = this.ejecutarProcedure(sentencia, objetoSalida);
		    
	    } 
	    catch (Exception e) 
	    {
	        objetoSalida.setCodError(CodError.ERROR_INTERNO);
	        objetoSalida.setMsgError(e.getMessage());
	    }
	    return objetoSalida;
	}
	
	
	
	public ObjetoSalida totalizarMaterialPorTipoYClase(ConsultaOE OE) {
		ObjetoSalida objetoSalida = new ObjetoSalida();
	    try 
	    {
	        SentenciaDAO sentencia = new SentenciaDAO(PACKAGE+".prc_totalizarSolMaterial_TipoClase", OE.getUsuario());
	        List<SentenciaParametroDAO> parametros = new ArrayList<SentenciaParametroDAO>();
	        sentencia.setParametros(parametros);
	        
	        parametros.add(new SentenciaParametroDAO("p_filtro", OE.getFiltro(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		         
	        objetoSalida = this.ejecutarProcedure(sentencia, objetoSalida);
		    
	    } 
	    catch (Exception e) 
	    {
	        objetoSalida.setCodError(CodError.ERROR_INTERNO);
	        objetoSalida.setMsgError(e.getMessage());
	    }
	    return objetoSalida;
	}

	
	public ObjetoSalida totalizarMaterialPorTipo(ConsultaOE OE) {
		ObjetoSalida objetoSalida = new ObjetoSalida();
	    try 
	    {
	        SentenciaDAO sentencia = new SentenciaDAO(PACKAGE+".prc_totalizarSolMaterial_Tipo", OE.getUsuario());
	        List<SentenciaParametroDAO> parametros = new ArrayList<SentenciaParametroDAO>();
	        sentencia.setParametros(parametros);
	        
	        parametros.add(new SentenciaParametroDAO("p_filtro", OE.getFiltro(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		         
	        objetoSalida = this.ejecutarProcedure(sentencia, objetoSalida);
		    
	    } 
	    catch (Exception e) 
	    {
	        objetoSalida.setCodError(CodError.ERROR_INTERNO);
	        objetoSalida.setMsgError(e.getMessage());
	    }
	    return objetoSalida;
	}
}
