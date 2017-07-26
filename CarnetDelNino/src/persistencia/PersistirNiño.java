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
	public static void persistir(ColeccionNiños coleccion, String ruta)
	{
		 try {
				FileOutputStream fos = new FileOutputStream(ruta);
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

	public static void main(String[] args) throws ExisteNinioException, hayLugarException {
		// se instancia la coleecion de personas de tamaño 3, 
		ColeccionNiños nuevo = new ColeccionNiños();
		Calendar fnac = Calendar.getInstance();
		fnac.set(2010, 2, 12);
		Niño n = new Niño("Juan", 12345678, fnac, "medica uruguaya", "Lopez", 'S');
		nuevo.altaNiño(n);
		//a los efectos de probar la persistencia se crean a mano 3 personas. 
		// para hacerlo en el proyecto, basta unicamente con pasar a un método que persista, la colección que se desea guardar
        /*Persona p1 = new Persona("Juan", 1234);
        Persona p2 = new Persona("Maria", 2321);
        Persona p3 = new Persona("Cecilia", 4433);
        personas.agregar(p1, 0);
        personas.agregar(p2, 1);
        personas.agregar(p3, 2);*/
        nuevo.listarNiños();// muestra lo que se va a guardar
       
        //persistir(personas, "C://lib/datos.txt");// se guarda en cualquier ruta, en este caso, crear la carpeta lib dentro del directorio raiz C
        persistir(nuevo, "/home/gsenatore/Documentos/datos.txt");
	}


}
