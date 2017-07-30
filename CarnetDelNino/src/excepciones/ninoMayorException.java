package excepciones;

public class ninoMayorException extends Exception{
	private String mensaje;

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public ninoMayorException(String mensaje) {
		super();
		this.mensaje = mensaje;
	}

}
