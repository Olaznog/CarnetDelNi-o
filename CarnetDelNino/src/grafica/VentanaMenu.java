package grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class VentanaMenu extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaMenu frame = new VentanaMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VentanaMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 525, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnConfigurarPrograma = new JMenu("Configurar");
		menuBar.add(mnConfigurarPrograma);
		
		JMenu mnIngresarParametrosIniciales = new JMenu("Ingresar Parametros Iniciales");
		mnConfigurarPrograma.add(mnIngresarParametrosIniciales);
		
		JMenu mnIngresar = new JMenu("Ingresar");
		menuBar.add(mnIngresar);
		
		JMenu mnIngresarDatosNiño = new JMenu("Datos del Ni\u00F1o");
		mnIngresar.add(mnIngresarDatosNiño);
		
		JMenu mnNuevoRegistro = new JMenu("Nuevo Registro");
		mnIngresar.add(mnNuevoRegistro);
		
		JMenu mnConsulta = new JMenu("Consulta");
		mnNuevoRegistro.add(mnConsulta);
		
		JMenu mnControl = new JMenu("Control");
		mnNuevoRegistro.add(mnControl);
		
		JMenu mnVacuna = new JMenu("Vacuna");
		mnNuevoRegistro.add(mnVacuna);
		
		JMenu mnConsultar = new JMenu("Consultar");
		menuBar.add(mnConsultar);
		
		JMenu mnListadoDeNios = new JMenu("Listado de ni\u00F1os");
		mnConsultar.add(mnListadoDeNios);
		
		JMenu mnNewMenu = new JMenu("Mostrar datos de un ni\u00F1o ");
		mnConsultar.add(mnNewMenu);
		
		JMenu mnConsultaMedicaPor = new JMenu("Consulta M\u00E9dica por Fecha");
		mnConsultar.add(mnConsultaMedicaPor);
		
		JMenu mnModificar = new JMenu("Modificar");
		menuBar.add(mnModificar);
	}
}
