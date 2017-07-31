package logica;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Calendar;
import excepciones.hayLugarException;
import excepciones.ninoMayorException;
import persistencia.RecuperarNi�o;
import excepciones.ExisteNinioException;

public class ColeccionNi�os implements Serializable {
	
	//private static final long serialVersionUID = 100L;
	
	private Ni�o[] ni�os;
	private int tope;
	private int maximoNi�os;
	private int maximoRegistros;

	public ColeccionNi�os() throws ClassNotFoundException, IOException {	
		super();
		this.ni�os = null;
		this.tope = 0;
		this.maximoNi�os = 0;
		this.maximoRegistros = 0;
		this.LoadData();
	}
	
	
	public void configurar(int maximoNi�os, int maximoRegistros) {
		this.maximoNi�os = maximoNi�os;
		this.maximoRegistros = maximoRegistros;
		ni�os = new Ni�o[maximoNi�os];	
	}
	

	public void altaNi�o(Ni�o n) throws ExisteNinioException, hayLugarException, ninoMayorException { //hay que lanzar la excepcion hayLugarException		
		//si el ni�o no esta ingresado ya en el arreglo = if(existeNinio(n)
		//crear el arreglo de registros del ni�o, de tama�o maximoRegistros
		//se lo setean pasandolo como parametro al metodo setRegistros
		if(existeNinio(n.getDocumento()) == false){
			if(hayLugar() == true){
				if(n.getEdadNi�o(n.getFechaNacimiento()) <= 5){
				Registro[]registros = new Registro[maximoRegistros];
				n.setRegistros(registros);
				
		ni�os[tope] = n;
		tope++;
		}else
			 throw new ninoMayorException("Este ni�o es mayor de 5 a�os");
		}else
			 throw new hayLugarException("Ya no hay lugar en el arreglo de ni�os");
		}else
			 throw new ExisteNinioException("Ya esta ingresado un ni�o con ese documento");
		
		
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
			Lista[i] = ni�os[i].toStringListadoNi�o() + "\n";
		}
		return Lista;
	}
	
	public void altaRegistro(Registro r, int cedulaNi�o)throws ExisteNinioException, hayLugarException {
	    if(existeNinio(cedulaNi�o) == false)
	    	throw new ExisteNinioException("No existe un ni�o con ese documento");
	    else
	    {
	    	Ni�o n = getNi�o(cedulaNi�o);
	    	try{
	    	n.agregarRegistroNi�o(r);
	    	}catch(hayLugarException e)
	    	{
	    		throw new hayLugarException(e.getMensaje());
	    	}
	    }
	    
		/*Si se encuentra el ni�o, se invoca el m�todo de la clase ni�o que agrega el registro
		en la lista de registros del mismo. SI ya no hay lugar para m�s registros de ese ni�o, se
		emite otro mensaje.*/
		
		//se busca el ni�o con esa cedula
		//si el ni�o no existe, aviso error
		//sino
		//invoco el metodo de ni�o que le agrega un registro a su coleccion de registros : n.agregarRegistroNi�o(r);
	}
	
	public Ni�o getNi�o (int cedula)throws ExisteNinioException{
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
		for(int i = 0; i < tope; i++)
		{
			ni�os[i].cuantasConsultasAntesDe(fecha);
			cuantas++;
		}
		return cuantas;
			
	}
	
	
	/* Se crea un metodo para cargar a memoria la pesistencia de archivo.
	 * Esto se hace para seguir trabajando en memoria y no tener que modificar los metodos ya configurados.
	 */
	private void LoadData() throws ClassNotFoundException, IOException {
			ColeccionNi�os aux = RecuperarNi�o.recuperar();
			if(aux != null)
			{
				 this.ni�os = aux.ni�os;
				 this.tope = aux.tope;
				 this.maximoNi�os = aux.maximoNi�os;
				 this.maximoRegistros = aux.maximoRegistros;
			}
		
	}
	
	public boolean SolicitarConfiguracionSistema()
	{
		return this.ni�os == null;
	}

	public int getMaximoNi�os() {
		return maximoNi�os;
	}


	public int getMaximoRegistros() {
		return maximoRegistros;
	}
	
	public Ni�o[] getNinos() {
		return this.ni�os;
	}
		
}
