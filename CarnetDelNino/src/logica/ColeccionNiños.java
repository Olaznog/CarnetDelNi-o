package logica;

public class ColeccionNiños {
	
	private Niño[] niño;
	private int tope;
	private int maximoNiños;
	private int maximoRegistros;
	
	public ColeccionNiños() {
		super();
		this.niño = null;
		this.tope = 0;
		this.maximoNiños = 0;
		this.maximoRegistros = 0;
		
	}
	
	public void configurar(int maximoNiños, int maximoRegistros) {
		
	}

	public void altaNiño(Niño n) {
		
	}
	
	public String[] listarNiños() {
		return null;
		
	}
	
	public void altaRegistro(Registro r, int cedulaNiño) {
		
	}
	
	public Niño getDatosNiño(int cedula) {
		return null;
			
	}
	
	public int cuantasConsultasAntesDe(Fecha fecha) {
		return maximoRegistros;
			
	}
	
	public boolean existeNiño(int cedula) {
		return false;
		
	}
	
	public boolean hayLugar() {
		return false;
		
	}
	
	public boolean estaConfigurado() {
		return false;
		
	}
	
	
}
