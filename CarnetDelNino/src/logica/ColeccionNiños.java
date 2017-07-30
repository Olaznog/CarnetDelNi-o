package logica;

import java.io.Serializable;
import java.util.Calendar;
import excepciones.hayLugarException;
import excepciones.ninoMayorException;
import excepciones.ExisteNinioException;

public class ColeccionNiños implements Serializable {
	
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
	

	public void altaNiño(Niño n) throws ExisteNinioException, hayLugarException, ninoMayorException { //hay que lanzar la excepcion hayLugarException		
		//si el niño no esta ingresado ya en el arreglo = if(existeNinio(n)
		//crear el arreglo de registros del niño, de tamaño maximoRegistros
		//se lo setean pasandolo como parametro al metodo setRegistros
		if(existeNinio(n.getDocumento()) == false){
			if(hayLugar() == true){
				if(n.getEdadNiño(n.getFechaNacimiento()) <= 5){
				Registro[]registros = new Registro[maximoRegistros];
				n.setRegistros(registros);
				
		niños[tope] = n;
		tope++;
		}else
			 throw new ninoMayorException("Este niño es mayor de 5 años");
		}else
			 throw new hayLugarException("Ya no hay lugar en el arreglo de niños");
		}else
			 throw new ExisteNinioException("Ya esta ingresado un niño con ese documento");
		
		
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
		String[]Lista = new String[tope];
		for(int i = 0; i < tope; i++)
		{
			if(niños[i]!= null)
			Lista[i] = niños[i].toStringListadoNiño() + "\n";
		}
		return Lista;
	}
	
	public void altaRegistro(Registro r, int cedulaNiño)throws ExisteNinioException, hayLugarException {
	    if(existeNinio(cedulaNiño) == false)
	    	throw new ExisteNinioException("No existe un niño con ese documento");
	    else
	    {
	    	Niño n = getNiño(cedulaNiño);
	    	try{
	    	n.agregarRegistroNiño(r);
	    	}catch(hayLugarException e)
	    	{
	    		throw new hayLugarException(e.getMensaje());
	    	}
	    }
	    
		/*Si se encuentra el niño, se invoca el método de la clase niño que agrega el registro
		en la lista de registros del mismo. SI ya no hay lugar para más registros de ese niño, se
		emite otro mensaje.*/
		
		//se busca el niño con esa cedula
		//si el niño no existe, aviso error
		//sino
		//invoco el metodo de niño que le agrega un registro a su coleccion de registros : n.agregarRegistroNiño(r);
	}
	
	public Niño getNiño (int cedula)throws ExisteNinioException{
		boolean existe = false;
		int i = 0;
		Niño n = null;

		while (!existe && i < tope) {
			if (niños[i].getDocumento() == cedula) {
				existe = true;
				n = niños[i];
			}
			i++;
		}
		return n;
	}

	
	public int cuantasConsultasAntesDe(Calendar fecha) {
		int cuantas = 0;
		for(int i = 0; i < tope; i++)
		{
			niños[i].cuantasConsultasAntesDe(fecha);
			cuantas++;
		}
		return cuantas;
			
	}
	
	public boolean estaConfigurado() {
		boolean resultado = false;
		if(niños != null)
			resultado = true;	
		return resultado;
	}
	
	
}
