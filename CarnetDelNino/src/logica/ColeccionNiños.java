package logica;

import java.util.Calendar;

public class ColeccionNi�os {
	
	private Ni�o[] ni�os;
	private int tope;
	private int maximoNi�os;
	private int maximoRegistros;
	
	public ColeccionNi�os() {
		super();
		this.ni�os = null;
		this.tope = 0;
		this.maximoNi�os = 0;
		this.maximoRegistros = 0;
		
	}
	
	public void configurar(int maximoNi�os, int maximoRegistros) {
		this.maximoNi�os = maximoNi�os;
		this.maximoRegistros = maximoRegistros;
		ni�os = new Ni�o[maximoNi�os];
	}

	public void altaNi�o(Ni�o n) {
		//si hay lugar en el arreglo para otro ninio, 
		//si el ni;o no esta ingresado ya en el arreglo = if(existeNinio(n)
		//---------------
		//crear el arreglo de registros del ninio, de tamanio maximoRegistro
		//se lo setean pasandolo como parametro al metodo setRegistros
		ni�os[tope] = n;
		tope++;
	}
	//public boolean existeNinio(Ninio n)
	
	public String[] listarNi�os() {
		return null;
		
	}
	
	public void altaRegistro(Registro r, int cedulaNi�o) {
		
	}
	
	public Ni�o getDatosNi�o(int cedula) {
		return null;
			
	}
	
	public int cuantasConsultasAntesDe(Calendar fecha) {
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
