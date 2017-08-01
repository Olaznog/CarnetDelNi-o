package persistencia;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Calendar;

import excepciones.ExisteNinioException;
import excepciones.hayLugarException;
import logica.ColeccionNiños;
import logica.Niño;

public class PersistirNiño {
	
	private static String rutaPersistenciaNinos = "C://DatosNiño/datosNiños.obj";
	//private static String rutaPersistenciaNinos = "/home/gsenatore/Documentos/datosNiños.obj";
	
	public static void persistir(ColeccionNiños coleccion)
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
