package logica;

import java.util.Calendar;

public class prueba {
	public static void main(String[]args) {
   ColeccionNiños col = new ColeccionNiños();
   col.configurar(5, 4);
   Calendar fnac = Calendar.getInstance();
   fnac.set(2010, 2, 12);
   Niño n = new Niño("Juan", 12345678, fnac, "medica uruguaya", "Lopez", false);
   col.altaNiño(n);
   String [] datos = col.listarNiños();
   for(int i = 0; i<datos.length; i++)
   {
	   System.out.println(datos[i]);
   }
   
		
	}

}
