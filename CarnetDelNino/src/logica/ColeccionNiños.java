package logica;

public class ColeccionNi�os {
	
	private Ni�o[] ni�o;
	private int tope;
	private int maximoNi�os;
	private int maximoRegistros;
	
	public ColeccionNi�os() {
		super();
		this.ni�o = null;
		this.tope = 0;
		this.maximoNi�os = 0;
		this.maximoRegistros = 0;
		
	}
	
	public void configurar(int maximoNi�os, int maximoRegistros) {
		
	}

	public void altaNi�o(Ni�o n) {
		
	}
	
	public String[] listarNi�os() {
		return null;
		
	}
	
	public void altaRegistro(Registro r, int cedulaNi�o) {
		
	}
	
	public Ni�o getDatosNi�o(int cedula) {
		return null;
			
	}
	
	public int cuantasConsultasAntesDe(Fecha fecha) {
		return maximoRegistros;
			
	}
	
	public boolean existeNi�o(int cedula) {
		return false;
		
	}
	
	public boolean hayLugar() {
		return false;
		
	}
	
	public boolean estaConfigurado() {
		return false;
		
	}
	
	
}
