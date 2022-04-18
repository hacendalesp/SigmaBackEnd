package co.gov.umv.sigma.backend.comun.entidad;

import java.util.Date;

public class TabMezclaFormula {

	private Long 	idMezclaFormula;
	private Long 	idTipoMezcla;
	private Long 	especificacion;
	private Date 	fechaInicial;
	private Date 	fechaFinal;
	private Double 	masaUnitaria;
	private Double 	volumen;
	private Double 	costoUnitario;
	private Long 	soporte;
	
	public Long getIdMezclaFormula() {
		return idMezclaFormula;
	}
	public void setIdMezclaFormula(Long idMezclaFormula) {
		this.idMezclaFormula = idMezclaFormula;
	}
	public Long getIdTipoMezcla() {
		return idTipoMezcla;
	}
	public void setIdTipoMezcla(Long idTipoMezcla) {
		this.idTipoMezcla = idTipoMezcla;
	}
	
	public Long getEspecificacion() {
		return especificacion;
	}
	public void setEspecificacion(Long especificacion) {
		this.especificacion = especificacion;
	}
	public Date getFechaInicial() {
		return fechaInicial;
	}
	public void setFechaInicial(Date fechaInicial) {
		this.fechaInicial = fechaInicial;
	}
	public Date getFechaFinal() {
		return fechaFinal;
	}
	public void setFechaFinal(Date fechaFinal) {
		this.fechaFinal = fechaFinal;
	}
	
	public Long getSoporte() {
		return soporte;
	}
	public void setSoporte(Long soporte) {
		this.soporte = soporte;
	}
	public Double getMasaUnitaria() {
		return masaUnitaria;
	}
	public void setMasaUnitaria(Double masaUnitaria) {
		this.masaUnitaria = masaUnitaria;
	}
	public Double getVolumen() {
		return volumen;
	}
	public void setVolumen(Double volumen) {
		this.volumen = volumen;
	}
	public Double getCostoUnitario() {
		return costoUnitario;
	}
	public void setCostoUnitario(Double costoUnitario) {
		this.costoUnitario = costoUnitario;
	}
	
	
	
	
}
