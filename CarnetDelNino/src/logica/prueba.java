package logica;

import java.util.Calendar;

import excepciones.hayLugarException;
import javax.swing.JOptionPane;
import excepciones.ExisteNinioException;

public class prueba {
	public static void main(String[]args) {
		try{
   ColeccionNi�os col = new ColeccionNi�os();
   col.configurar(2, 4);
   Calendar fnac = Calendar.getInstance();
   fnac.set(2010, 2, 12);
   Ni�o n = new Ni�o("Juan", 12345678, fnac, "medica uruguaya", "Lopez", false);
   Ni�o n2 = new Ni�o("Juan", 1522477, fnac, "medica uruguaya", "Lopez", false);
   Ni�o n3 = new Ni�o("Juan", 4523998, fnac, "medica uruguaya", "Lopez", false);
   col.altaNi�o(n);
   
   String [] datos = col.listarNi�os();
   for(int i = 0; i<datos.length; i++)
   {
	   System.out.println(datos[i]);
   }
   Registro r = new Vacuna(fnac, "prueba primer registro","antitetanica",1,true);
  // col.altaRegistro(r, 12345678);
   Ni�o ninio = col.getNi�o(12345678);
   System.out.println(ninio);
   /*n.agregarRegistroNi�o(r);
   n.agregarRegistroNi�o(r);
   n.agregarRegistroNi�o(r);
   n.agregarRegistroNi�o(r);
   n.agregarRegistroNi�o(r);*/
   col.altaRegistro(r, 12345678);
   col.altaRegistro(r, 12345678);
   col.altaRegistro(r, 12345678);
   col.altaRegistro(r, 12345678);
   col.altaRegistro(r, 1234567);
   
   System.out.println(n.toString());
   //col.altaNi�o(n);
   col.altaNi�o(n2);
   col.altaNi�o(n3);
   
   //No despliega el mensaje de hayLugarException
		}catch(ExisteNinioException e)
		{
			JOptionPane.showMessageDialog(null, e.getMensaje());
		}catch(hayLugarException e)
		{
			JOptionPane.showMessageDialog(null, e.getMensaje());
		}
	
 
   }
}
