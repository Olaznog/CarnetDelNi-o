package logica;

import java.util.Calendar;

import javax.swing.JOptionPane;

import excepciones.ExisteNinioException;

public class prueba {
	public static void main(String[]args) {
		try{
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
   Registro r = new Vacuna(fnac, "prueba primer registro","antitetanica",1,true);
   col.altaRegistro(r, 12345678);
   
 //  n.agregarRegistroNiño(r);
   System.out.println(n.toString());
   col.altaNiño(n);
		}catch(ExisteNinioException e)
		{
			JOptionPane.showMessageDialog(null, e.getMensaje());
		}/*catch(hayLugarException e)
		{
			JOptionPane.showMessageDialog(null, e.getMessage());
		}*/
	
 
   }
}
