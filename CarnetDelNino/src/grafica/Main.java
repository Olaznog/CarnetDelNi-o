package grafica;

import logica.ColeccionNiños;

public class Main {
	public static void main (String[]args){
		ColeccionNiños n = new ColeccionNiños();
		boolean conf = n.estaConfigurado();
		if(conf == true){
		
		VentanaMenu Menu = new VentanaMenu(n);
		Menu.setVisible(true);
		}
		else {
			VentanaConfiguracion vent = new VentanaConfiguracion(n);
			vent.setVisible(true);
		}
	}

}
