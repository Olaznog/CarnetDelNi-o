package grafica;

import logica.ColeccionNiños;
import persistencia.RecuperarNiño;

public class Main {
	public static void main (String[]args){
		ColeccionNiños niño = new ColeccionNiños();
		boolean conf = niño.estaConfigurado();
		if(conf == true){
			RecuperarNiño.recuperar();
			VentanaMenu Menu = new VentanaMenu(niño);
			Menu.setVisible(true);
		}
		else {
			VentanaConfiguracion vent = new VentanaConfiguracion(niño);
			vent.setVisible(true);
		}
	}

}
