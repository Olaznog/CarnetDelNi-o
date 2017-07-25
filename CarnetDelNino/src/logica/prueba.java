package logica;

import java.util.Calendar;

import excepciones.hayLugarException;
import javax.swing.JOptionPane;
import excepciones.ExisteNinioException;

public class prueba {
	public static void main(String[]args) {
		try{
   ColeccionNiños col = new ColeccionNiños();
   col.configurar(2, 4);
   Calendar fnac = Calendar.getInstance();
   fnac.set(2010, 2, 12);
   Niño n = new Niño("Juan", 12345678, fnac, "medica uruguaya", "Lopez", false);
   Niño n2 = new Niño("Juan", 1522477, fnac, "medica uruguaya", "Lopez", false);
   Niño n3 = new Niño("Juan", 4523998, fnac, "medica uruguaya", "Lopez", false);
   col.altaNiño(n);
   
   String [] datos = col.listarNiños();
   for(int i = 0; i<datos.length; i++)
   {
	   System.out.println(datos[i]);
   }
   Registro r = new Vacuna(fnac, "prueba primer registro","antitetanica",1,true);
  // col.altaRegistro(r, 12345678);
   Niño ninio = col.getNiño(12345678);
   System.out.println(ninio);
   /*n.agregarRegistroNiño(r);
   n.agregarRegistroNiño(r);
   n.agregarRegistroNiño(r);
   n.agregarRegistroNiño(r);
   n.agregarRegistroNiño(r);*/
   col.altaRegistro(r, 12345678);
   col.altaRegistro(r, 12345678);
   col.altaRegistro(r, 12345678);
   col.altaRegistro(r, 12345678);
   col.altaRegistro(r, 1234567);
   
   System.out.println(n.toString());
   //col.altaNiño(n);
   col.altaNiño(n2);
   col.altaNiño(n3);
   
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
