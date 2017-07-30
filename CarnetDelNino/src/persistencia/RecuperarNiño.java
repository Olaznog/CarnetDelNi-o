package persistencia;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import logica.ColeccionNiños;

public class RecuperarNiño {
	public static void recuperar() {
		
		FileInputStream fis;
		try {			
			 fis = new FileInputStream("C://DatosNiño/datos.obj");
			 ObjectInputStream ois = new ObjectInputStream(fis);
			 ColeccionNiños niño = (ColeccionNiños) ois.readObject();
			 ois.close();
			 niño.listarNiños();
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
