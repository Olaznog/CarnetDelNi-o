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
		
		JMenu mnIngresarNio = new JMenu("Datos del Ni\u00F1o");
		mnIngresar.add(mnIngresarNio);
		
		JMenu mnConsultar = new JMenu("Consultar");
		menuBar.add(mnConsultar);
		
		JMenu mnModificar = new JMenu("Modificar");
		menuBar.add(mnModificar);
	}
}
