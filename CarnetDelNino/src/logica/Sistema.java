package logica;

// Se crea la clase sistema para tener la configuraci�n del programa (Cantidad de registros y Cantidad de Ni�os)
 
 
public class Sistema {

	private String rutaPersistencia;
	private int cantNi�o;
	private int cantRegistro;
	
	public Sistema(String rutaPersistencia, int cantNi�o, int cantRegistro) {
		super();
		this.rutaPersistencia = rutaPersistencia;
		this.cantNi�o = cantNi�o;
		this.cantRegistro = cantRegistro;
	}

	public String getRutaPersistencia() {
		return "C://DatosNi�o/datosNi�os.obj";
	}
	
	public int getCantNi�o() {
		return cantNi�o;
	}

	public int getCantRegistro() {
		return cantRegistro;
	}
	
	
	
}
