package logica;

import java.util.Calendar;

public class ColeccionNiños {
	
	private Niño[] niños;
	private int tope;
	private int maximoNiños;
	private int maximoRegistros;
	
	public ColeccionNiños() {
		super();
		this.niños = null;
		this.tope = 0;
		this.maximoNiños = 0;
		this.maximoRegistros = 0;
		
	}
	
	public void configurar(int maximoNiños, int maximoRegistros) {
		this.maximoNiños = maximoNiños;
		this.maximoRegistros = maximoRegistros;
		niños = new Niño[maximoNiños];
	}

	public void altaNiño(Niño n) {
		//si hay lugar en el arreglo para otro ninio, 
		//si el ni;o no esta ingresado ya en el arreglo = if(existeNinio(n)
		//---------------
		//crear el arreglo de registros del ninio, de tamanio maximoRegistro
		//se lo setean pasandolo como parametro al metodo setRegistros
		niños[tope] = n;
		tope++;
	}
	//public boolean existeNinio(Ninio n)
	
	public String[] listarNiños() {
		return null;
		
	}
	
	public void altaRegistro(Registro r, int cedulaNiño) {
		
	}
	
	public Niño getDatosNiño(int cedula) {
		return null;
			
	}
	
	public int cuantasConsultasAntesDe(Calendar fecha) {
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
