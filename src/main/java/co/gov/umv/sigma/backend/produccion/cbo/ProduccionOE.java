package co.gov.umv.sigma.backend.produccion.cbo;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import co.gov.umv.sigma.backend.comun.cbo.ObjetoEntrada;
import co.gov.umv.sigma.backend.comun.entidad.TabDespachoMaterial;
import co.gov.umv.sigma.backend.comun.entidad.TabDespachoMaterialDetalle;
import co.gov.umv.sigma.backend.comun.entidad.TabMantenimientoEquipo;
import co.gov.umv.sigma.backend.comun.entidad.TabMezclaFormula;
import co.gov.umv.sigma.backend.comun.entidad.TabMezclaFormulaMateria;
import co.gov.umv.sigma.backend.comun.entidad.TabOrdenProduccion;
import co.gov.umv.sigma.backend.comun.entidad.TabOrdenProduccionDetalle;

public class ProduccionOE extends ObjetoEntrada {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private TabMantenimientoEquipo mantenimiento;
	
	private TabMezclaFormula mezclaFormula;
	private TabMezclaFormulaMateria mezclaFormulaMateria;
	
	private TabDespachoMaterial despachoMaterial;
	private TabDespachoMaterialDetalle detalleDespacho;
	
	private TabOrdenProduccion orden ;
	private TabOrdenProduccionDetalle detalleOrden;

	public TabMantenimientoEquipo getMantenimiento() {
		return mantenimiento;
	}

	public void setMantenimiento(TabMantenimientoEquipo mantenimiento) {
		this.mantenimiento = mantenimiento;
	}

	public static void main(String[] args) throws JsonProcessingException
	{
		 Map<String, Object> m = new HashMap<>();
		 TabMantenimientoEquipo e = new TabMantenimientoEquipo();
	     
        Class<?> c = e.getClass();
        for(Field f : c.getDeclaredFields())
        {
             f.setAccessible(true);
             m.put(f.getName(),  (f.getType() == String.class ? "string" : "numero")   );
         }
        ObjectMapper mapper = new ObjectMapper();
        System.out.println( mapper.writeValueAsString(m));
	
	}

	public TabMezclaFormula getMezclaFormula() {
		return mezclaFormula;
	}

	public void setMezclaFormula(TabMezclaFormula mezclaFormula) {
		this.mezclaFormula = mezclaFormula;
	}

	public TabMezclaFormulaMateria getMezclaFormulaMateria() {
		return mezclaFormulaMateria;
	}

	public void setMezclaFormulaMateria(TabMezclaFormulaMateria mezclaFormulaMateria) {
		this.mezclaFormulaMateria = mezclaFormulaMateria;
	}

	public TabDespachoMaterial getDespachoMaterial() {
		return despachoMaterial;
	}

	public void setDespachoMaterial(TabDespachoMaterial despachoMaterial) {
		this.despachoMaterial = despachoMaterial;
	}

	public TabDespachoMaterialDetalle getDetalleDespacho() {
		return detalleDespacho;
	}

	public void setDetalleDespacho(TabDespachoMaterialDetalle detalleDespacho) {
		this.detalleDespacho = detalleDespacho;
	}

	public TabOrdenProduccion getOrden() {
		return orden;
	}

	public void setOrden(TabOrdenProduccion orden) {
		this.orden = orden;
	}

	public TabOrdenProduccionDetalle getDetalleOrden() {
		return detalleOrden;
	}

	public void setDetalleOrden(TabOrdenProduccionDetalle detalleOrden) {
		this.detalleOrden = detalleOrden;
	}

	

	
	
	
	
}
