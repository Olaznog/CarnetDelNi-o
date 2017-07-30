package persistencia;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import logica.ColeccionNi�os;

public class RecuperarNi�o {
	public static void recuperar() {
		
		FileInputStream fis;
		try {			
			 fis = new FileInputStream("C://DatosNi�o/datos.obj");
			 ObjectInputStream ois = new ObjectInputStream(fis);
			 ColeccionNi�os ni�o = (ColeccionNi�os) ois.readObject();
			 ois.close();
			 ni�o.listarNi�os();
			 fis.close();
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}

	}

}
