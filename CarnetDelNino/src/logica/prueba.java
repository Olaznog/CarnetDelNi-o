package logica;

import java.util.Calendar;

public class prueba {
	public static void main(String[]args) {
   ColeccionNi�os col = new ColeccionNi�os();
   col.configurar(5, 4);
   Calendar fnac = Calendar.getInstance();
   fnac.set(2010, 2, 12);
   Ni�o n = new Ni�o("Juan", 12345678, fnac, "medica uruguaya", "Lopez", false);
   col.altaNi�o(n);
   String [] datos = col.listarNi�os();
   for(int i = 0; i<datos.length; i++)
   {
	   System.out.println(datos[i]);
   }
   
		
	}

}
