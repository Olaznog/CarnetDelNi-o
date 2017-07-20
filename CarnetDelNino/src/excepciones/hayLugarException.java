package excepciones;

public class hayLugarException extends Exception {
	private String mensaje;

	public hayLugarException(String mensaje) {
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
