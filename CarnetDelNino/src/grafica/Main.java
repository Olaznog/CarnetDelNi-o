package grafica;

import logica.ColeccionNi�os;
import persistencia.RecuperarNi�o;

public class Main {
	public static void main (String[]args){
		ColeccionNi�os ni�o = new ColeccionNi�os();
		boolean conf = ni�o.estaConfigurado();
		if(conf == true){
			RecuperarNi�o.recuperar();
			VentanaMenu Menu = new VentanaMenu(ni�o);
			Menu.setVisible(true);
		}
		else {
			VentanaConfiguracion vent = new VentanaConfiguracion(ni�o);
			vent.setVisible(true);
		}
	}

}
