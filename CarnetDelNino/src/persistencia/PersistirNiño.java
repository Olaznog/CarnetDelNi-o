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
	
	private static String rutaPersistenciaNinos = "C://DatosNi�o/datosNi�os.obj";
	//private static String rutaPersistenciaNinos = "/home/gsenatore/Documentos/datosNi�os.obj";
	
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
