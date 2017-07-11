package logica;

import java.util.Calendar;

public class Fecha {
	
	public static void main(String[] args) {
		/*
		 * para manejar fechas en java existe un objeto ya definido en la clase Calendar. 
		 * Este objeto ya tiene implementados todos los m[etodos que podemos necesitar, 
		 * por ejemplo, dada una fecha, saber si es anterior a otra, 
		 * saber el mes, anio o dia de esa fecha, incluso hora, minuto y segundos
		 * que dia de la semana, etc. 
		 */
		 
		 //para instanciar un objeto Calendar NO se puede ionvocar directamente el constructor, sino:
         Calendar fecha = Calendar.getInstance();
         //en este objeto fecha quedo cargado no solo el dia, sino el exacto momento en que se invoca. 
         // para saber el dia:
         int dia = fecha.get(Calendar.DAY_OF_MONTH);
         // de que mes se trata, considerando que enero es el mes 0, diciembre el mes 11
         int mes = fecha.get(Calendar.MONTH);
         //el anio
         int anio = fecha.get(Calendar.YEAR);
         System.out.println(dia+"/"+(mes+1)+"/"+anio);
         System.out.println("el dia de la semana es: ");
         switch(fecha.get(Calendar.DAY_OF_WEEK)) {
         case 1: System.out.println("domingo");
         break;
         case 2: System.out.println("lunes");
         break;
         case 3: System.out.println("martes");
         break;
         case 4: System.out.println("miercoles");
         break;
         case 5: System.out.println("jueves");
         break;
         case 6: System.out.println("viernes");
         break;
         case 7: System.out.println("sabado");
         break;
         
         }
         //una vez instanciado un objeto calendar, podemos setearle nosotros la fecha
         //de dos maneras>
         Calendar otroDia = Calendar.getInstance();
         otroDia.set(2016, 7, 25);//la fecha quedara seteada para el 25 de agosto de 2016
         //o podemos hacerlo de a uno
         Calendar nacimiento = Calendar.getInstance();
         nacimiento.set(Calendar.YEAR, 2000);
         nacimiento.set(Calendar.MONTH, 4);
         nacimiento.set(Calendar.DAY_OF_MONTH, 20);
         // quedo configurada la fecha para el 20 de mayo de 2000
         
       //COMO SABER SI UNA FECHA ES ANTERIOR A OTRA?
         Calendar hoy = Calendar.getInstance();
         if(nacimiento.before(otroDia))
         System.out.println("EL NACIMIENTO ES ANTERIOR");
         
         //COMO CALCULAR LA DIFERENCIA EN DIAS ENTRE DOS FECHAS?
         int cuantosDias = 0;
         hoy.add(Calendar.DAY_OF_MONTH, 1);
         while(hoy.before(otroDia)) {        	 
        	 hoy.add(Calendar.DAY_OF_MONTH, 1);
        	 cuantosDias++;
         }         
         System.out.println("la diferencia en dias es de "+cuantosDias );
         
         //COMO SABER LA DIFERENCIA EN ANIOS?
         int cuantosAnios = 0;
         nacimiento.add(Calendar.YEAR, 1);
         while(nacimiento.before(hoy)) {
        	 cuantosAnios++;  
        	 nacimiento.add(Calendar.YEAR, 1);        	       	 
         }         
         System.out.println("La diferencia en anios es "+cuantosAnios);         
         
         // CUIDADO< al hacer estos calculos se ha modificado la fecha , por ejemplo
         System.out.println(" ahora el anio de nacimiento es "+nacimiento.get(Calendar.YEAR));
         //SI se quiere hacer calculos con fecha, para no alterar las mismas, 
         //hay que hacer una copia,
         //en lugar de operar directamente con ellas
	}

}
