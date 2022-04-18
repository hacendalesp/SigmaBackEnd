package co.gov.umv.sigma.backend.comun.entidad;

import java.util.Date;

public class TabProgDiariaPersonal {

	private Long 	idProgdiariaPersonal;
	private Long 	idProgramacionDiaria;
	private Long 	idTipoRol;
	private Long 	idTipoOrigen;
	private Long 	cantidad;
	private Long    idPersona;
	
	private Long 	idTipoHorarioIdc;
	private Long 	idTipoCargoIdc;
	private Date 	horarioLlegadaIdc;
	private Date 	horarioSalidaIdc;
	private String 	observacionesIdc;
	
	private int registradoIdc;
	
	public int getRegistradoIdc() {
		return registradoIdc;
	}
	public void setRegistradoIdc(int registradoIdc) {
		this.registradoIdc = registradoIdc;
	}
	
	
	public Long getIdProgdiariaPersonal() {
		return idProgdiariaPersonal;
	}
	public void setIdProgdiariaPersonal(Long idProgdiariaPersonal) {
		this.idProgdiariaPersonal = idProgdiariaPersonal;
	}
	public Long getIdProgramacionDiaria() {
		return idProgramacionDiaria;
	}
	public void setIdProgramacionDiaria(Long idProgramacionDiaria) {
		this.idProgramacionDiaria = idProgramacionDiaria;
	}
	public Long getIdTipoRol() {
		return idTipoRol;
	}
	public void setIdTipoRol(Long idTipoRol) {
		this.idTipoRol = idTipoRol;
	}
	public Long getIdTipoOrigen() {
		return idTipoOrigen;
	}
	public void setIdTipoOrigen(Long idTipoOrigen) {
		this.idTipoOrigen = idTipoOrigen;
	}
	public Long getCantidad() {
		return cantidad;
	}
	public void setCantidad(Long cantidad) {
		this.cantidad = cantidad;
	}
	public Long getIdPersona() {
		return idPersona;
	}
	public void setIdPersona(Long idPersona) {
		this.idPersona = idPersona;
	}
	public Long getIdTipoHorarioIdc() {
		return idTipoHorarioIdc;
	}
	public void setIdTipoHorarioIdc(Long idTipoHorarioIdc) {
		this.idTipoHorarioIdc = idTipoHorarioIdc;
	}
	public Long getIdTipoCargoIdc() {
		return idTipoCargoIdc;
	}
	public void setIdTipoCargoIdc(Long idTipoCargoIdc) {
		this.idTipoCargoIdc = idTipoCargoIdc;
	}
	public Date getHorarioLlegadaIdc() {
		return horarioLlegadaIdc;
	}
	public void setHorarioLlegadaIdc(Date horarioLlegadaIdc) {
		this.horarioLlegadaIdc = horarioLlegadaIdc;
	}
	public Date getHorarioSalidaIdc() {
		return horarioSalidaIdc;
	}
	public void setHorarioSalidaIdc(Date horarioSalidaIdc) {
		this.horarioSalidaIdc = horarioSalidaIdc;
	}
	public String getObservacionesIdc() {
		return observacionesIdc;
	}
	public void setObservacionesIdc(String observacionesIdc) {
		this.observacionesIdc = observacionesIdc;
	}
	
	
	
	
}
