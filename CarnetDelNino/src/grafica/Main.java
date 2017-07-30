package grafica;

import logica.ColeccionNi�os;
import persistencia.RecuperarNi�o;

public class Main {
	public static void main (String[]args){
		ColeccionNi�os n = new ColeccionNi�os();
		boolean conf = n.estaConfigurado();
		if(conf == true){
			RecuperarNi�o.recuperar();
			VentanaMenu Menu = new VentanaMenu(n);
			Menu.setVisible(true);
		}
		else {
			VentanaConfiguracion vent = new VentanaConfiguracion(n);
			vent.setVisible(true);
		}
	}

}
