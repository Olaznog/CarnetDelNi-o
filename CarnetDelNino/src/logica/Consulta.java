package logica;

public class Consulta extends Registro {
	
	private String medico;
	private String diagnostico;
	private String recomendaciones;
	
	public Consulta(Fecha fecha, String comentario, String medico, String diagnostico, String recomendaciones) {
		super(fecha, comentario);
		this.medico = medico;
		this.diagnostico = diagnostico;
		this.recomendaciones = recomendaciones;
	}

	public String getMedico() {
		return medico;
	}

	public void setMedico(String medico) {
		this.medico = medico;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getRecomendaciones() {
		return recomendaciones;
	}

	public void setRecomendaciones(String recomendaciones) {
		this.recomendaciones = recomendaciones;
	}
	
	
	
	

}
