package co.gov.umv.sigma.backend.comun.entidad;

public class TabDespachoMaterialDetalle {

	private Long 	idDespachoMaterialesDetalle;
	private Long 	idDespachoMateriales;
	private Long 	idProgdiariaMaterial;
	private Long 	cantidadDespachada;
	private Long 	idTipoUnidadMedida;
	private String 	observaciones;
	public Long getIdDespachoMaterialesDetalle() {
		return idDespachoMaterialesDetalle;
	}
	public void setIdDespachoMaterialesDetalle(Long idDespachoMaterialesDetalle) {
		this.idDespachoMaterialesDetalle = idDespachoMaterialesDetalle;
	}
	public Long getIdDespachoMateriales() {
		return idDespachoMateriales;
	}
	public void setIdDespachoMateriales(Long idDespachoMateriales) {
		this.idDespachoMateriales = idDespachoMateriales;
	}
	public Long getIdProgdiariaMaterial() {
		return idProgdiariaMaterial;
	}
	public void setIdProgdiariaMaterial(Long idProgdiariaMaterial) {
		this.idProgdiariaMaterial = idProgdiariaMaterial;
	}
	public Long getCantidadDespachada() {
		return cantidadDespachada;
	}
	public void setCantidadDespachada(Long cantidadDespachada) {
		this.cantidadDespachada = cantidadDespachada;
	}
	public Long getIdTipoUnidadMedida() {
		return idTipoUnidadMedida;
	}
	public void setIdTipoUnidadMedida(Long idTipoUnidadMedida) {
		this.idTipoUnidadMedida = idTipoUnidadMedida;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
	
}
