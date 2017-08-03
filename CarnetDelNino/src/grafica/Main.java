package grafica;

import java.io.IOException;

import logica.ColeccionNi�os;
import persistencia.RecuperarNi�o;

public class Main {
	
	public static void main (String[] args) throws ClassNotFoundException, IOException{
		ColeccionNi�os n = new ColeccionNi�os();
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
