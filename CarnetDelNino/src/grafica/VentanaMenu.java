package grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logica.ColeccionNi�os;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaMenu extends JFrame {
	private ColeccionNi�os ni�os;

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
		
		JMenu mnIngresar = new JMenu("Ingresar");
		menuBar.add(mnIngresar);
		
		JMenu mnIngresarDatosNi�o = new JMenu("Datos del Ni\u00F1o");
		mnIngresarDatosNi�o.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		mnIngresar.add(mnIngresarDatosNi�o);
		
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
		ColeccionNi�os ni�os = new ColeccionNi�os();//Este objeto es el sistema?
	}
}
