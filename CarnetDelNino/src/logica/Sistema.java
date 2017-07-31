package logica;

// Se crea la clase sistema para tener la configuración del programa (Cantidad de registros y Cantidad de Niños)
 
 
public class Sistema {

	private String rutaPersistencia;
	private int cantNiño;
	private int cantRegistro;
	
	public Sistema(String rutaPersistencia, int cantNiño, int cantRegistro) {
		super();
		this.rutaPersistencia = rutaPersistencia;
		this.cantNiño = cantNiño;
		this.cantRegistro = cantRegistro;
	}

	public String getRutaPersistencia() {
		return "C://DatosNiño/datosNiños.obj";
	}
	
	public int getCantNiño() {
		return cantNiño;
	}

	public int getCantRegistro() {
		return cantRegistro;
	}
	
	
	
}
