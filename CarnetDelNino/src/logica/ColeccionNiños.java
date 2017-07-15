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
		//crear el arreglo de registros del ninio, de tamanio maximoRegistros
		//se lo setean pasandolo como parametro al metodo setRegistros
		if(existeNinio(n.getDocumento()) == false)
			if(hayLugar() == true){
				Registro[]registro = new Registro[maximoRegistros];
				//Registro[]registro = new Registro(n.setRegistros(registros));
		ni�os[tope] = n;
		tope++;
		}
	}
	public int getMaximoRegistros() {
		return maximoRegistros;
	}

	public void setMaximoRegistros(int maximoRegistros) {
		this.maximoRegistros = maximoRegistros;
	}

	public boolean existeNinio(int doc){
	boolean existe = false;
	int i = 0;

	while (!existe && i < tope) {
		if (ni�os[i].getDocumento() == doc) {
			existe = true;
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
	
	/*public String[] listarNi�os() {
		String lista = "";
		for(int i = 0; i < ni�os.length; i++)
		{
			
			lista = lista + ni�os[i].toString() + "\n";
		}
		return lista;
		
	}*/
	
	public void altaRegistro(Registro r, int cedulaNi�o) {
		while(existeNinio(cedulaNi�o) == false)
			System.out.println("Error: El ninio no existe");
		 
			if(hayLugar() != true)
				System.out.println("Error: Ya no hay lugar");
			/*else
				registro[] = r;
		Si se encuentra el ni�o, se invoca el m�todo de la clase ni�o que agrega el registro
		en la lista de registros del mismo. SI ya no hay lugar para m�s registros de ese ni�o, se
		emite otro mensaje.*/
	}
	
	public Ni�o getDatosNi�o(int cedula) {
		return null;
			
	}
	
	public int cuantasConsultasAntesDe(Calendar fecha) {
		return maximoRegistros;
			
	}
	
	
	
	
	public boolean estaConfigurado() {
		return false;
		
	}
	
	
}
