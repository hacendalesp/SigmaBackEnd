package co.gov.umv.sigma.backend.mejoramiento.cbo;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import co.gov.umv.sigma.backend.comun.cbo.ObjetoEntrada;

public class ContratoOE extends ObjetoEntrada
{
	private Integer vigencia;
	private Integer numeroContrato;
	
	private String claseContrato ;//= "30 30-Servicios de Mantenimiento y/o Reparación";
	
	public Integer getVigencia() {
		return vigencia;
	}
	public void setVigencia(Integer vigencia) {
		this.vigencia = vigencia;
	}
	
	
	
	public Integer getNumeroContrato() {
		return numeroContrato;
	}
	public void setNumeroContrato(Integer numeroContrato) {
		this.numeroContrato = numeroContrato;
	}
	
	public String getJson()
	{
		
		Map<String, Object> m = new HashMap<>();
	    m.put("vigencia", this.getVigencia());
	    
	    if(this.numeroContrato != null)
	    	m.put("numeroContrato", this.numeroContrato);
	    
	    if(this.claseContrato != null)
	    	m.put("claseContrato", this.claseContrato);
		    
	    ObjectMapper mapper = new ObjectMapper();
	    String jsonString="";
	    
		try {
			jsonString = mapper.writeValueAsString(m);
		} catch (JsonProcessingException e) {
			jsonString="";
		}
	    return jsonString;
	}
	public String getClaseContrato() {
		return claseContrato;
	}
	public void setClaseContrato(String claseContrato) {
		this.claseContrato = claseContrato;
	}
	
	

}
