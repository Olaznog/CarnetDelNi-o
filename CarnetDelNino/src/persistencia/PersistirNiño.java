package persistencia;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Calendar;

import excepciones.ExisteNinioException;
import excepciones.hayLugarException;
import logica.ColeccionNi�os;
import logica.Ni�o;

public class PersistirNi�o {
<<<<<<< HEAD
	
	private static String rutaPersistenciaNinos = "C://DatosNi�o/datosNi�os.obj";
	//private static String rutaPersistenciaNinos = "/home/gsenatore/Documentos/datosNi�os.obj";
	
=======
	//RUTA DONDE SE VA A CREAR EL ARCHIVO DE LA PERSISTENCIA DE DATOS
	private static String rutaPersistenciaNinos = "C://DatosNi�o/datosNi�os.obj";
		
>>>>>>> branch 'master' of https://github.com/Olaznog/CarnetDelNino.git
	public static void persistir(ColeccionNi�os coleccion)
	{
		 try {
				FileOutputStream fos = new FileOutputStream(rutaPersistenciaNinos);
				ObjectOutputStream oos = new ObjectOutputStream(fos);
				oos.writeObject(coleccion);
				oos.close();
				fos.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}

}
