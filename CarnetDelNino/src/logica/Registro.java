package logica;

import java.util.Calendar;

public abstract class Registro {
	
	private Calendar fecha;
	private String comentario;
	
	public Registro(Calendar fecha, String comentario) {
		super();
		this.fecha = fecha;
		this.comentario = comentario;
	}

	public Calendar getFecha() {
		return fecha;
	}

	public void setFecha(Calendar fecha) {
		this.fecha = fecha;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	
	public String toString() {
		String retorno = "Fecha:" + fecha + "Comentario: " +comentario;
		return retorno;
	}
	
	
	

}
