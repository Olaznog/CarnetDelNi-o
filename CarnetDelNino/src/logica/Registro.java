package logica;

public abstract class Registro {
	
	private Fecha fecha;
	private String comentario;
	
	public Registro(Fecha fecha, String comentario) {
		super();
		this.fecha = fecha;
		this.comentario = comentario;
	}

	public Fecha getFecha() {
		return fecha;
	}

	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	

}
