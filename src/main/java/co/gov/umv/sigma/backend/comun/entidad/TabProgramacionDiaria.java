package co.gov.umv.sigma.backend.comun.entidad;


public class TabProgramacionDiaria extends TabTrabajoDiario {

	private Long 	idTipoEstadoProgramacion;
	private String 	horaTrabajoDesde;
	private String 	horaTrabajoHasta;
	private Long 	idPersonaElabora;
	private Long 	idPersonaRevisa;
	private Long 	idPersonaAprueba;
	private String 	observaciones;
	
	
	public Long getIdTipoEstadoProgramacion() {
		return idTipoEstadoProgramacion;
	}
	public void setIdTipoEstadoProgramacion(Long idTipoEstadoProgramacion) {
		this.idTipoEstadoProgramacion = idTipoEstadoProgramacion;
	}
	public String getHoraTrabajoDesde() {
		return horaTrabajoDesde;
	}
	public void setHoraTrabajoDesde(String horaTrabajoDesde) {
		this.horaTrabajoDesde = horaTrabajoDesde;
	}
	public String getHoraTrabajoHasta() {
		return horaTrabajoHasta;
	}
	public void setHoraTrabajoHasta(String horaTrabajoHasta) {
		this.horaTrabajoHasta = horaTrabajoHasta;
	}
	public Long getIdPersonaElabora() {
		return idPersonaElabora;
	}
	public void setIdPersonaElabora(Long idPersonaElabora) {
		this.idPersonaElabora = idPersonaElabora;
	}
	public Long getIdPersonaRevisa() {
		return idPersonaRevisa;
	}
	public void setIdPersonaRevisa(Long idPersonaRevisa) {
		this.idPersonaRevisa = idPersonaRevisa;
	}
	public Long getIdPersonaAprueba() {
		return idPersonaAprueba;
	}
	public void setIdPersonaAprueba(Long idPersonaAprueba) {
		this.idPersonaAprueba = idPersonaAprueba;
	}
	public String getObservaciones() {
		return observaciones;
	}
	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}
	
	
}
