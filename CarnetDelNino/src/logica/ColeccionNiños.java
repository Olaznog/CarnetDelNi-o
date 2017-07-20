package logica;

import java.util.Calendar;

import excepciones.ExisteNinioException;

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
	

	public void altaNi�o(Ni�o n) throws ExisteNinioException{
		
		//si el ni;o no esta ingresado ya en el arreglo = if(existeNinio(n)
		//crear el arreglo de registros del ninio, de tamanio maximoRegistros
		//se lo setean pasandolo como parametro al metodo setRegistros
		if(existeNinio(n.getDocumento()) == false){
			if(hayLugar() == true){
				Registro[]registros = new Registro[maximoRegistros];
				n.setRegistros(registros);
				
		ni�os[tope] = n;
		tope++;
		}
		}else
			throw new ExisteNinioException("Ya esta ingresado un ninio con ese documento");
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
	
	public String[] listarNi�os() {
		String[]Lista = new String[tope];
		for(int i = 0; i < tope; i++)
		{
			if(ni�os[i]!= null)
			Lista[i] = ni�os[i].toString() + "\n";
		}
		return Lista;
	}
	
	public void altaRegistro(Registro r, int cedulaNi�o) {
	    if(existeNinio(cedulaNi�o) == false)
			System.out.println("Error: El ninio no existe");
	    else
	    {
	    	Ni�o n = getNi�o(cedulaNi�o);
	    	n.agregarRegistroNi�o(r);
	    }	    
		/*Si se encuentra el ni�o, se invoca el m�todo de la clase ni�o que agrega el registro
		en la lista de registros del mismo. SI ya no hay lugar para m�s registros de ese ni�o, se
		emite otro mensaje.*/
		
		//se busca el ni;o con esa cedula
		//si el ni;o no existe, aviso error
		//sino
		//invoco el metodo de ni;o que le agrega un registro a su coleccion de registros por ej n.agregarregistroni;o(reg)
	}
	
	public Ni�o getNi�o (int cedula){
		boolean existe = false;
		int i = 0;
		Ni�o n = null;

		while (!existe && i < tope) {
			if (ni�os[i].getDocumento() == cedula) {
				existe = true;
				n = ni�os[i];
			}
			i++;
		}
		return n;
	}

	
	public int cuantasConsultasAntesDe(Calendar fecha) {
		int cuantas = 0;
		return cuantas;
			
	}
	
	public boolean estaConfigurado() {
		return false;
		
	}
	
	
}
