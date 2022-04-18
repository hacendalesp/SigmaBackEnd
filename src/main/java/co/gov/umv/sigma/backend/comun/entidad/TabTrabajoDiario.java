package co.gov.umv.sigma.backend.comun.entidad;

import java.util.Date;

public class TabTrabajoDiario {

	private Long 	idProgramacionDiaria;
	private Long 	idMantenimientoVial;
	private Date 	fecha;
	private Long 	idTipoJornada;
	
	public Long getIdProgramacionDiaria() {
		return idProgramacionDiaria;
	}
	public void setIdProgramacionDiaria(Long idProgramacionDiaria) {
		this.idProgramacionDiaria = idProgramacionDiaria;
	}
	public Long getIdMantenimientoVial() {
		return idMantenimientoVial;
	}
	public void setIdMantenimientoVial(Long idMantenimientoVial) {
		this.idMantenimientoVial = idMantenimientoVial;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Long getIdTipoJornada() {
		return idTipoJornada;
	}
	public void setIdTipoJornada(Long idTipoJornada) {
		this.idTipoJornada = idTipoJornada;
	}

	
	
	
}
