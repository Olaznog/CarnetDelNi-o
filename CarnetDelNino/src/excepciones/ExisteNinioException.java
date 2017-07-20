package excepciones;

public class ExisteNinioException extends Exception {
	private String mensaje;

	public ExisteNinioException(String mensaje) {
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
