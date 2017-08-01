package persistencia;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import logica.ColeccionNi�os;
import logica.Ni�o;

public class RecuperarNi�o {
	//RUTA DESDE DONDE RECUPERA EL ARCHIVO
	private static String rutaPersistenciaNinos = "C://DatosNi�o/datosNi�os.obj";
	
	
	public static ColeccionNi�os recuperar() {
		
		ColeccionNi�os data = null;
		
		FileInputStream fis;
		try {			
			 fis = new FileInputStream(rutaPersistenciaNinos);
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
		return data;
		
	}
	
}


