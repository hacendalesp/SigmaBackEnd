package co.gov.umv.sigma.backend.comun.entidad;

public class TabOrdenProduccionDetalle {

	private Long 	idOrdenProduccionDetalle;
	private Long 	idOrdenProduccion;
	private Long 	idProgdiariaMaterial;
	private Double 	cantidadProgramada;
	private Double 	cantidadProducida;
	private String 	observaciones;  //causal 
	
	public Long getIdOrdenProduccionDetalle() {
		return idOrdenProduccionDetalle;
	}
	public void setIdOrdenProduccionDetalle(Long idOrdenProduccionDetalle) {
		this.idOrdenProduccionDetalle = idOrdenProduccionDetalle;
	}
	public Long getIdOrdenProduccion() {
		return idOrdenProduccion;
	}
	public void setIdOrdenProduccion(Long idOrdenProduccion) {
		this.idOrdenProduccion = idOrdenProduccion;
	}
	public Long getIdProgdiariaMaterial() {
		return idProgdiariaMaterial;
	}
	public void setIdProgdiariaMaterial(Long idProgdiariaMaterial) {
		this.idProgdiariaMaterial = idProgdiariaMaterial;
	}
	public Double getCantidadProgramada() {
		return cantidadProgramada;
	}
	public void setCantidadProgramada(Double cantidadProgramada) {
		this.cantidadProgramada = cantidadProgramada;
	}
	public Double getCantidadProducida() {
		return cantidadProducida;
	}
	public void setCantidadProducida(Double cantidadProducida) {
		this.cantidadProducida = cantidadProducida;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
	
}
