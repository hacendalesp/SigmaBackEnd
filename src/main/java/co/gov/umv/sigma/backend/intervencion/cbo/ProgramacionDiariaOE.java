package co.gov.umv.sigma.backend.intervencion.cbo;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import co.gov.umv.sigma.backend.comun.cbo.ObjetoEntrada;
import co.gov.umv.sigma.backend.comun.entidad.TabInformeDiarioCuadrilla;
import co.gov.umv.sigma.backend.comun.entidad.TabProgDiariaCalidad;
import co.gov.umv.sigma.backend.comun.entidad.TabProgDiariaCantidadObra;
import co.gov.umv.sigma.backend.comun.entidad.TabProgDiariaMaquinaria;
import co.gov.umv.sigma.backend.comun.entidad.TabProgDiariaMaterial;
import co.gov.umv.sigma.backend.comun.entidad.TabProgDiariaObservacion;
import co.gov.umv.sigma.backend.comun.entidad.TabProgDiariaPersonal;
import co.gov.umv.sigma.backend.comun.entidad.TabProgDiariaSalidaMaterial;
import co.gov.umv.sigma.backend.comun.entidad.TabProgramacionDiaria;

public class ProgramacionDiariaOE extends ObjetoEntrada {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private TabProgramacionDiaria progDiaria;
	private TabProgDiariaPersonal personal;
	private TabProgDiariaMaterial material;
	private TabProgDiariaMaquinaria maquinaria;

	
	private TabInformeDiarioCuadrilla informeDiarioCuadrilla;
	private TabProgDiariaCalidad calidad;
	private TabProgDiariaObservacion observacion;
	private TabProgDiariaCantidadObra cantidadObra;
	private TabProgDiariaSalidaMaterial salidaMaterial;
	
	//mezcla y entrada material esta tdo ahora en material....
	//private TabProgDiariaMaterial infDiacuaMezclaConc;
	//private TabProgDiariaMaterial infDiacuaEntrMaterial;
	
	private Long id;
	private Long tipo;

	private Long idTipoAsignacion;
	private Long idRecursoDisponibilidad;
	
	public TabProgramacionDiaria getProgDiaria() {
		return progDiaria;
	}
	public void setProgDiaria(TabProgramacionDiaria progDiaria) {
		this.progDiaria = progDiaria;
	}
	public TabProgDiariaPersonal getPersonal() {
		return personal;
	}
	public void setPersonal(TabProgDiariaPersonal personal) {
		this.personal = personal;
	}
	public TabProgDiariaMaterial getMaterial() {
		return material;
	}
	public void setMaterial(TabProgDiariaMaterial material) {
		this.material = material;
	}
	public TabProgDiariaMaquinaria getMaquinaria() {
		return maquinaria;
	}
	public void setMaquinaria(TabProgDiariaMaquinaria maquinaria) {
		this.maquinaria = maquinaria;
	}
	public TabInformeDiarioCuadrilla getInformeDiarioCuadrilla() {
		return informeDiarioCuadrilla;
	}
	public void setInformeDiarioCuadrilla(TabInformeDiarioCuadrilla informeDiarioCuadrilla) {
		this.informeDiarioCuadrilla = informeDiarioCuadrilla;
	}
	public TabProgDiariaCalidad getCalidad() {
		return calidad;
	}
	public void setCalidad(TabProgDiariaCalidad calidad) {
		this.calidad = calidad;
	}
	public TabProgDiariaObservacion getObservacion() {
		return observacion;
	}
	public void setObservacion(TabProgDiariaObservacion observacion) {
		this.observacion = observacion;
	}
	public TabProgDiariaCantidadObra getCantidadObra() {
		return cantidadObra;
	}
	public void setCantidadObra(TabProgDiariaCantidadObra cantidadObra) {
		this.cantidadObra = cantidadObra;
	}
	public TabProgDiariaSalidaMaterial getSalidaMaterial() {
		return salidaMaterial;
	}
	public void setSalidaMaterial(TabProgDiariaSalidaMaterial salidaMaterial) {
		this.salidaMaterial = salidaMaterial;
	}
	
	
	public static void main(String[] args) throws JsonProcessingException
	{
		 Map<String, Object> m = new HashMap<>();
		 TabInformeDiarioCuadrilla e = new TabInformeDiarioCuadrilla();
	     
        Class<?> c = e.getClass();
        for(Field f : c.getDeclaredFields())
        {
             f.setAccessible(true);
             m.put(f.getName(),  (f.getType() == String.class ? "string" : "numero")   );
         }
        ObjectMapper mapper = new ObjectMapper();
        System.out.println( mapper.writeValueAsString(m));
	
	}
	public Long getIdTipoAsignacion() {
		return idTipoAsignacion;
	}
	public void setIdTipoAsignacion(Long idTipoAsignacion) {
		this.idTipoAsignacion = idTipoAsignacion;
	}
	public Long getIdRecursoDisponibilidad() {
		return idRecursoDisponibilidad;
	}
	public void setIdRecursoDisponibilidad(Long idRecursoDisponibilidad) {
		this.idRecursoDisponibilidad = idRecursoDisponibilidad;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getTipo() {
		return tipo;
	}
	public void setTipo(Long tipo) {
		this.tipo = tipo;
	}
	
	
	
	
	
	
}
