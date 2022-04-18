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

public class ProgDiariaCantidadObraDAO extends CrudDAO  implements ICrudDAO
{

	private final static String PACKAGE = "PKG_PROGDIARIA_CANTIDAD_OBRA";

	@Override
	public ObjetoSalida insertar(ObjetoEntrada OE) 
	{ 
		List<SentenciaParametroDAO> parametros = new ArrayList<SentenciaParametroDAO>();
	
		parametros.add(new SentenciaParametroDAO("p_id_programacion_diaria", ((ProgramacionDiariaOE)OE).getCantidadObra().getIdProgramacionDiaria(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_actividad_idc", ((ProgramacionDiariaOE)OE).getCantidadObra().getIdTipoActividad(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_material_idc", ((ProgramacionDiariaOE)OE).getCantidadObra().getIdTipoMaterial(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_clase_material_idc", ((ProgramacionDiariaOE)OE).getCantidadObra().getIdTipoClaseMaterial(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_unidad_medida_idc", ((ProgramacionDiariaOE)OE).getCantidadObra().getIdTipoUnidadMedida(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_cantidad_idc", ((ProgramacionDiariaOE)OE).getCantidadObra().getCantidad(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_largo_idc", ((ProgramacionDiariaOE)OE).getCantidadObra().getLargo(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_ancho_idc", ((ProgramacionDiariaOE)OE).getCantidadObra().getAncho(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_espesor_idc", ((ProgramacionDiariaOE)OE).getCantidadObra().getEspesor(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_volumen_material_compacto_idc", ((ProgramacionDiariaOE)OE).getCantidadObra().getVolumenMaterialCompacto(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_porcentaje_compactacion_idc", ((ProgramacionDiariaOE)OE).getCantidadObra().getPorcentajeCompactacion(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_manual_idc", ((ProgramacionDiariaOE)OE).getCantidadObra().getManual(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_mecanica_idc", ((ProgramacionDiariaOE)OE).getCantidadObra().getMecanica(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));				
	
		return ejecutar(OE, PACKAGE+".prc_insertar", parametros);	
	}
	
	@Override
	public ObjetoSalida actualizar(ObjetoEntrada OE) 
	{ 
		List<SentenciaParametroDAO> parametros = new ArrayList<SentenciaParametroDAO>();
	
		parametros.add(new SentenciaParametroDAO("p_id_progdiaria_cantidad_obra", ((ProgramacionDiariaOE)OE).getCantidadObra().getIdProgdiariaCantidadObra(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_programacion_diaria", ((ProgramacionDiariaOE)OE).getCantidadObra().getIdProgramacionDiaria(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_actividad_idc", ((ProgramacionDiariaOE)OE).getCantidadObra().getIdTipoActividad(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_material_idc", ((ProgramacionDiariaOE)OE).getCantidadObra().getIdTipoMaterial(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_clase_material_idc", ((ProgramacionDiariaOE)OE).getCantidadObra().getIdTipoClaseMaterial(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_id_tipo_unidad_medida_idc", ((ProgramacionDiariaOE)OE).getCantidadObra().getIdTipoUnidadMedida(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_cantidad_idc", ((ProgramacionDiariaOE)OE).getCantidadObra().getCantidad(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_largo_idc", ((ProgramacionDiariaOE)OE).getCantidadObra().getLargo(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_ancho_idc", ((ProgramacionDiariaOE)OE).getCantidadObra().getAncho(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_espesor_idc", ((ProgramacionDiariaOE)OE).getCantidadObra().getEspesor(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_volumen_material_compacto_idc", ((ProgramacionDiariaOE)OE).getCantidadObra().getVolumenMaterialCompacto(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_porcentaje_compactacion_idc", ((ProgramacionDiariaOE)OE).getCantidadObra().getPorcentajeCompactacion(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
		parametros.add(new SentenciaParametroDAO("p_manual_idc", ((ProgramacionDiariaOE)OE).getCantidadObra().getManual(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));
		parametros.add(new SentenciaParametroDAO("p_mecanica_idc", ((ProgramacionDiariaOE)OE).getCantidadObra().getMecanica(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.VARCHAR));				
	
		
		return ejecutar(OE, PACKAGE+".prc_actualizar", parametros);
	}


	@Override
	public ObjetoSalida eliminar(ObjetoEntrada OE) 
	{ 
        List<SentenciaParametroDAO> parametros = new ArrayList<SentenciaParametroDAO>();
    	
    	parametros.add(new SentenciaParametroDAO("p_id_progdiaria_cantidad_obra", ((ProgramacionDiariaOE)OE).getCantidadObra().getIdProgdiariaCantidadObra(), SentenciaTipoParametroDAO.ENTRADA, OracleTypes.NUMBER));
    		
    			
        return ejecutar(OE, PACKAGE+".prc_eliminar", parametros);
	}

	
	@Override
	public ObjetoSalida consultarXFiltro(ObjetoEntrada OE) 
	{ 
		return consultaXFiltro(OE, PACKAGE+".prc_consultarporfiltro");
	}
	
}