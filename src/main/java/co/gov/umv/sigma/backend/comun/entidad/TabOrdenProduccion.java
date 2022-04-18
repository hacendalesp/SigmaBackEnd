package co.gov.umv.sigma.backend.comun.entidad;

import java.util.Date;

public class TabOrdenProduccion {

	private Long 	idOrdenProduccion;
	private Long 	numeroOrden;
	private Date 	fechaOrden;
	private String 	centroOperaciones;
	private Long 	idTipoMaquina1;
	private Long 	idTipoMaquina2;
	private Long 	idTipoTurno;
	private Long 	idTipoMaterial;  //lista 122
	private Long 	idTipoClaseMaterial; //lista 123
	private Double 	cantidadProgramada;
	private String 	observaciones;
	private Long 	idTipoEstadoOrden;
	
	public Long getIdOrdenProduccion() {
		return idOrdenProduccion;
	}
	public void setIdOrdenProduccion(Long idOrdenProduccion) {
		this.idOrdenProduccion = idOrdenProduccion;
	}
	public Long getNumeroOrden() {
		return numeroOrden;
	}
	public void setNumeroOrden(Long numeroOrden) {
		this.numeroOrden = numeroOrden;
	}
	public Date getFechaOrden() {
		return fechaOrden;
	}
	public void setFechaOrden(Date fechaOrden) {
		this.fechaOrden = fechaOrden;
	}
	public String getCentroOperaciones() {
		return centroOperaciones;
	}
	public void setCentroOperaciones(String centroOperaciones) {
		this.centroOperaciones = centroOperaciones;
	}
	public Long getIdTipoMaquina1() {
		return idTipoMaquina1;
	}
	public void setIdTipoMaquina1(Long idTipoMaquina1) {
		this.idTipoMaquina1 = idTipoMaquina1;
	}
	public Long getIdTipoMaquina2() {
		return idTipoMaquina2;
	}
	public void setIdTipoMaquina2(Long idTipoMaquina2) {
		this.idTipoMaquina2 = idTipoMaquina2;
	}
	public Long getIdTipoTurno() {
		return idTipoTurno;
	}
	public void setIdTipoTurno(Long idTipoTurno) {
		this.idTipoTurno = idTipoTurno;
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
	public Double getCantidadProgramada() {
		return cantidadProgramada;
	}
	public void setCantidadProgramada(Double cantidadProgramada) {
		this.cantidadProgramada = cantidadProgramada;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	public Long getIdTipoEstadoOrden() {
		return idTipoEstadoOrden;
	}
	public void setIdTipoEstadoOrden(Long idTipoEstadoOrden) {
		this.idTipoEstadoOrden = idTipoEstadoOrden;
	}
	
	
	
}
