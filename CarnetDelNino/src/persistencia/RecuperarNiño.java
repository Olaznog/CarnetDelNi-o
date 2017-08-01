package persistencia;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import logica.ColeccionNiños;
import logica.Niño;

public class RecuperarNiño {
	//RUTA DESDE DONDE RECUPERA EL ARCHIVO
	private static String rutaPersistenciaNinos = "C://DatosNiño/datosNiños.obj";
	
	
	public static ColeccionNiños recuperar() {
		
		ColeccionNiños data = null;
		
		FileInputStream fis;
		try {			
			 fis = new FileInputStream(rutaPersistenciaNinos);
			 ObjectInputStream ois = new ObjectInputStream(fis);
			 data = (ColeccionNiños) ois.readObject();
			 ois.close();
			 fis.close();
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {		
			e.printStackTrace();
		} catch (ClassNotFoundException e) {		
			e.printStackTrace();
		}
		return data;
		
	}
	
}


