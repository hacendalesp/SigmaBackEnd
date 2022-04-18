package co.gov.umv.sigma.backend.comun.entidad;


public class TabMezclaFormulaMateria {

	private Long 	idMezclaFormulaMateria;
	private Long 	idMezclaFormula;
	private Long 	idTipoMateria;
	private Double 	masaUnitaria;
	private Double 	volumen;
	private Double 	costoUnitario;
	private String 	signo;
	
	public Long getIdMezclaFormulaMateria() {
		return idMezclaFormulaMateria;
	}
	public void setIdMezclaFormulaMateria(Long idMezclaFormulaMateria) {
		this.idMezclaFormulaMateria = idMezclaFormulaMateria;
	}
	public Long getIdMezclaFormula() {
		return idMezclaFormula;
	}
	public void setIdMezclaFormula(Long idMezclaFormula) {
		this.idMezclaFormula = idMezclaFormula;
	}
	public Long getIdTipoMateria() {
		return idTipoMateria;
	}
	public void setIdTipoMateria(Long idTipoMateria) {
		this.idTipoMateria = idTipoMateria;
	}

	
	public String getSigno() {
		return signo;
	}
	public void setSigno(String signo) {
		this.signo = signo;
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
