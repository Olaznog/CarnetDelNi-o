package persistencia;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import logica.ColeccionNi�os;
import logica.Ni�o;

public class RecuperarNi�o {
<<<<<<< HEAD
	
	private static String rutaPersistenciaNinos = "C://DatosNi�o/datosNi�os.obj";
	//private static String rutaPersistenciaNinos = "/home/gsenatore/Documentos/datosNi�os.obj";
	
=======
	//RUTA DESDE DONDE RECUPERA EL ARCHIVO
	private static String rutaPersistenciaNinos = "C://DatosNi�o/datosNi�os.obj";
		
>>>>>>> branch 'master' of https://github.com/Olaznog/CarnetDelNino.git
	public static ColeccionNi�os recuperar() {
		
		ColeccionNi�os data = null;
		
		FileInputStream fis;
		//Se instancia un objeto de tipo File para controlar la excepci�n si existe el archivo por primera vez.
		File file = new File(rutaPersistenciaNinos);
		
		if(file.exists()) {
			try {			
				fis = new FileInputStream(file);
				ObjectInputStream ois = new ObjectInputStream(fis);
				data = (ColeccionNi�os) ois.readObject();
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