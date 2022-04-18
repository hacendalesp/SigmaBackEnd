package co.gov.umv.sigma.backend.comun.entidad;

public class TabProgDiariaCantidadObra {
	
	private Long 	idProgdiariaCantidadObra;
	private Long 	idProgramacionDiaria;
	private Long 	idTipoActividad;
	private Long 	idTipoMaterial;
	private Long 	idTipoClaseMaterial;
	private Long 	idTipoUnidadMedida;
	private Double 	cantidad;
	private Double 	largo;
	private Double 	ancho;
	private Double 	espesor;
	private Double 	volumenMaterialCompacto;
	private Double 	porcentajeCompactacion;
	private String 	manual;
	private String 	mecanica;
	public Long getIdProgdiariaCantidadObra() {
		return idProgdiariaCantidadObra;
	}
	public void setIdProgdiariaCantidadObra(Long idProgdiariaCantidadObra) {
		this.idProgdiariaCantidadObra = idProgdiariaCantidadObra;
	}
	public Long getIdProgramacionDiaria() {
		return idProgramacionDiaria;
	}
	public void setIdProgramacionDiaria(Long idProgramacionDiaria) {
		this.idProgramacionDiaria = idProgramacionDiaria;
	}
	public Long getIdTipoActividad() {
		return idTipoActividad;
	}
	public void setIdTipoActividad(Long idTipoActividad) {
		this.idTipoActividad = idTipoActividad;
	}
	public Long getIdTipoMaterial() {
		return idTipoMaterial;
	}
	public void setIdTipoMaterial(Long idTipoMaterial) {
		this.idTipoMaterial = idTipoMaterial;
	}
	public Long getIdTipoClaseMaterial() {
		return idTipoClaseMaterial;
	}
	public void setIdTipoClaseMaterial(Long idTipoClaseMaterial) {
		this.idTipoClaseMaterial = idTipoClaseMaterial;
	}
	public Long getIdTipoUnidadMedida() {
		return idTipoUnidadMedida;
	}
	public void setIdTipoUnidadMedida(Long idTipoUnidadMedida) {
		this.idTipoUnidadMedida = idTipoUnidadMedida;
	}
	public Double getCantidad() {
		return cantidad;
	}
	public void setCantidad(Double cantidad) {
		this.cantidad = cantidad;
	}
	public Double getLargo() {
		return largo;
	}
	public void setLargo(Double largo) {
		this.largo = largo;
	}
	public Double getAncho() {
		return ancho;
	}
	public void setAncho(Double ancho) {
		this.ancho = ancho;
	}
	public Double getEspesor() {
		return espesor;
	}
	public void setEspesor(Double espesor) {
		this.espesor = espesor;
	}
	public Double getVolumenMaterialCompacto() {
		return volumenMaterialCompacto;
	}
	public void setVolumenMaterialCompacto(Double volumenMaterialCompacto) {
		this.volumenMaterialCompacto = volumenMaterialCompacto;
	}
	public Double getPorcentajeCompactacion() {
		return porcentajeCompactacion;
	}
	public void setPorcentajeCompactacion(Double porcentajeCompactacion) {
		this.porcentajeCompactacion = porcentajeCompactacion;
	}
	public String getManual() {
		return manual;
	}
	public void setManual(String manual) {
		this.manual = manual;
	}
	public String getMecanica() {
		return mecanica;
	}
	public void setMecanica(String mecanica) {
		this.mecanica = mecanica;
	}
	
	

}
