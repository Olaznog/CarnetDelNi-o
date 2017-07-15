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
		
		//si el ni;o no esta ingresado ya en el arreglo = if(existeNinio(n)
		//---------------
		//n.existeNinio(int doc);
		//crear el arreglo de registros del ninio, de tamanio maximoRegistro
		//se lo setean pasandolo como parametro al metodo setRegistros
		if(existeNinio() == false)
			if(hayLugar() == true)
		n.setRegistros(getRegistros()[maximoRegistros]);	
		niños[tope] = n;
		tope++;
	}
	public boolean existeNinio(int doc){
	boolean existe = false;
	int i = 0;

	while (!existe && i < tope) {
		if (niños[i].getDocumento() == doc) {
			existe = true;
			System.out.println("Error: El niño ya esta ingresado");
		}
		i++;
	}
	return existe;
	}
	public boolean hayLugar() {
		boolean hayLugar  = false;
		if(tope != niños.length)
			hayLugar = true;
		return hayLugar;
	}
	
	public String[] listarNiños() {
		for(int i = o; i < niños.length; i++)
			
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
	
	
	
	public boolean estaConfigurado() {
		return false;
		
	}
	
	
}
