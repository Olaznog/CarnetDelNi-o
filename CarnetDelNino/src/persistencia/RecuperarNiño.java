package persistencia;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import logica.ColeccionNiños;

public class RecuperarNiño {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis;
		try {			
			fis = new FileInputStream("C://DatosNiño/datos.txt");
			 ObjectInputStream ois = new ObjectInputStream(fis);
			 ColeccionNiños niño = (ColeccionNiños) ois.readObject();
			 ois.close();
			 niño.listarNiños();
			 fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
