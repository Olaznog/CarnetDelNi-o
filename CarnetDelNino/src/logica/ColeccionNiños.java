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
		//crear el arreglo de registros del ninio, de tamanio maximoRegistros
		//se lo setean pasandolo como parametro al metodo setRegistros
		if(existeNinio(n.getDocumento()) == false)
			if(hayLugar() == true){
				Registro[]registros = new Registro[maximoRegistros];
				//Registro[]registro = new Registro(n.setRegistros(registros));
		niños[tope] = n;
		tope++;
		}
	}
	
	
	public boolean existeNinio(int doc){
	boolean existe = false;
	int i = 0;

	while (!existe && i < tope) {
		if (niños[i].getDocumento() == doc) {
			existe = true;
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
		String lista = "";
		String[]Lista = new String[maximoRegistros];
		for(int i = 0; i < niños.length; i++)
		{
			
			lista = lista + niños[i].toString() + "\n";
		}
		Lista[maximoRegistros] = lista; 
		return Lista;
		
	}
	
	public void altaRegistro(Registro r, int cedulaNiño) {
		//Niño ninio1 = new Niño();
		while(existeNinio(cedulaNiño) == false)
			System.out.println("Error: El ninio no existe");
		 
			/*else
			    Niño ninio1 = 
		Si se encuentra el niño, se invoca el método de la clase niño que agrega el registro
		en la lista de registros del mismo. SI ya no hay lugar para más registros de ese niño, se
		emite otro mensaje.*/
	}
	
	public Niño getDatosNiño(int cedula) {
		//Aca se debería invocar al metodo toString de la clase Niño que retorna los datos del niño?
		return null;
			
	}
	
	public int cuantasConsultasAntesDe(Calendar fecha) {
		return maximoRegistros;
			
	}
	
	public boolean estaConfigurado() {
		return false;
		
	}
	
	
}
