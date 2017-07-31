package logica;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Calendar;
import excepciones.hayLugarException;
import excepciones.ninoMayorException;
import persistencia.RecuperarNiño;
import excepciones.ExisteNinioException;

public class ColeccionNiños implements Serializable {
	
	//private static final long serialVersionUID = 100L;
	
	private Niño[] niños;
	private int tope;
	private int maximoNiños;
	private int maximoRegistros;

	public ColeccionNiños() throws ClassNotFoundException, IOException {	
		super();
		this.niños = null;
		this.tope = 0;
		this.maximoNiños = 0;
		this.maximoRegistros = 0;
		this.LoadData();
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
	
	
	/* Se crea un metodo para cargar a memoria la pesistencia de archivo.
	 * Esto se hace para seguir trabajando en memoria y no tener que modificar los metodos ya configurados.
	 */
	private void LoadData() throws ClassNotFoundException, IOException {
			ColeccionNiños aux = RecuperarNiño.recuperar();
			if(aux != null)
			{
				 this.niños = aux.niños;
				 this.tope = aux.tope;
				 this.maximoNiños = aux.maximoNiños;
				 this.maximoRegistros = aux.maximoRegistros;
			}
		
	}
	
	public boolean SolicitarConfiguracionSistema()
	{
		return this.niños == null;
	}

	public int getMaximoNiños() {
		return maximoNiños;
	}


	public int getMaximoRegistros() {
		return maximoRegistros;
	}
	
	public Niño[] getNinos() {
		return this.niños;
	}
		
}
