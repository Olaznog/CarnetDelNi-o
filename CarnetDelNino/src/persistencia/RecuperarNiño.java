package persistencia;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import logica.ColeccionNi�os;

public class RecuperarNi�o {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis;
		try {			
			fis = new FileInputStream("C://DatosNi�o/datos.txt");
			 ObjectInputStream ois = new ObjectInputStream(fis);
			 ColeccionNi�os ni�o = (ColeccionNi�os) ois.readObject();
			 ois.close();
			 ni�o.listarNi�os();
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
