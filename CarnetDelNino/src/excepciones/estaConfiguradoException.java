package excepciones;

public class estaConfiguradoException extends Exception{
	private String mensaje;

	public estaConfiguradoException(String mensaje) {
		super();
		this.mensaje = mensaje;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	

}
