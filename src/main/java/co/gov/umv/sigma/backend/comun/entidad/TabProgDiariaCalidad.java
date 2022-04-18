package co.gov.umv.sigma.backend.comun.entidad;

public class TabProgDiariaCalidad {

	private Long 	idProgdiariaCalidad;
	private Long 	idProgramacionDiaria;
	private Long 	numeroMuestrasTomadas;
	private Long 	idTipoMaterial;
	private Long 	idTipoEnsayo;
	private String 	resultado;
	
	
	public Long getIdProgdiariaCalidad() {
		return idProgdiariaCalidad;
	}
	public void setIdProgdiariaCalidad(Long idProgdiariaCalidad) {
		this.idProgdiariaCalidad = idProgdiariaCalidad;
	}
	public Long getIdProgramacionDiaria() {
		return idProgramacionDiaria;
	}
	public void setIdProgramacionDiaria(Long idProgramacionDiaria) {
		this.idProgramacionDiaria = idProgramacionDiaria;
	}
	public Long getNumeroMuestrasTomadas() {
		return numeroMuestrasTomadas;
	}
	public void setNumeroMuestrasTomadas(Long numeroMuestrasTomadas) {
		this.numeroMuestrasTomadas = numeroMuestrasTomadas;
	}
	public Long getIdTipoMaterial() {
		return idTipoMaterial;
	}
	public void setIdTipoMaterial(Long idTipoMaterial) {
		this.idTipoMaterial = idTipoMaterial;
	}
	public Long getIdTipoEnsayo() {
		return idTipoEnsayo;
	}
	public void setIdTipoEnsayo(Long idTipoEnsayo) {
		this.idTipoEnsayo = idTipoEnsayo;
	}
	public String getResultado() {
		return resultado;
	}
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	
	
}
