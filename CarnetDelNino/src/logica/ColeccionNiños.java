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
		
		//si el ni;o no esta ingresado ya en el arreglo = if(existeNinio(n)
		//---------------
		//n.existeNinio(int doc);
		//crear el arreglo de registros del ninio, de tamanio maximoRegistro
		//se lo setean pasandolo como parametro al metodo setRegistros
		if(existeNinio() == false)
			if(hayLugar() == true)
		n.setRegistros(getRegistros()[maximoRegistros]);	
		ni�os[tope] = n;
		tope++;
	}
	public boolean existeNinio(int doc){
	boolean existe = false;
	int i = 0;

	while (!existe && i < tope) {
		if (ni�os[i].getDocumento() == doc) {
			existe = true;
			System.out.println("Error: El ni�o ya esta ingresado");
		}
		i++;
	}
	return existe;
	}
	public boolean hayLugar() {
		boolean hayLugar  = false;
		if(tope != ni�os.length)
			hayLugar = true;
		return hayLugar;
	}
	
	public String[] listarNi�os() {
		for(int i = o; i < ni�os.length; i++)
			
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
	
	
	
	public boolean estaConfigurado() {
		return false;
		
	}
	
	
}
