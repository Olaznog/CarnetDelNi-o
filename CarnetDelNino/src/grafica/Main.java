package grafica;

import java.io.IOException;

import logica.ColeccionNiños;
import persistencia.RecuperarNiño;

public class Main {
	
	public static void main (String[] args) throws ClassNotFoundException, IOException{
		ColeccionNiños n = new ColeccionNiños();
		if(!n.SolicitarConfiguracionSistema()){	
			VentanaMenu Menu = new VentanaMenu(n);
			Menu.setVisible(true);
		}
		else {
			VentanaConfiguracion vent = new VentanaConfiguracion(n);
			vent.setVisible(true);
		}
	}
	


}
