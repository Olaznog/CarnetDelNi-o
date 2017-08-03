package persistencia;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import logica.ColeccionNiños;
import logica.Niño;

public class RecuperarNiño {
<<<<<<< HEAD
	
	private static String rutaPersistenciaNinos = "C://DatosNiño/datosNiños.obj";
	//private static String rutaPersistenciaNinos = "/home/gsenatore/Documentos/datosNiños.obj";
	
=======
	//RUTA DESDE DONDE RECUPERA EL ARCHIVO
	private static String rutaPersistenciaNinos = "C://DatosNiño/datosNiños.obj";
		
>>>>>>> branch 'master' of https://github.com/Olaznog/CarnetDelNino.git
	public static ColeccionNiños recuperar() {
		
		ColeccionNiños data = null;
		
		FileInputStream fis;
		//Se instancia un objeto de tipo File para controlar la excepción si existe el archivo por primera vez.
		File file = new File(rutaPersistenciaNinos);
		
		if(file.exists()) {
			try {			
				fis = new FileInputStream(file);
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
		}
		return data;
		
	}
	
}