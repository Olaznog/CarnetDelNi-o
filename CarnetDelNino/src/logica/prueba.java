package logica;

import java.util.Calendar;

import javax.swing.JOptionPane;

import excepciones.ExisteNinioException;

public class prueba {
	public static void main(String[]args) {
		try{
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
   Registro r = new Vacuna(fnac, "prueba primer registro","antitetanica",1,true);
   col.altaRegistro(r, 12345678);
   
 //  n.agregarRegistroNi�o(r);
   System.out.println(n.toString());
   col.altaNi�o(n);
		}catch(ExisteNinioException e)
		{
			JOptionPane.showMessageDialog(null, e.getMensaje());
		}/*catch(hayLugarException e)
		{
			JOptionPane.showMessageDialog(null, e.getMessage());
		}*/
	
 
   }
}
