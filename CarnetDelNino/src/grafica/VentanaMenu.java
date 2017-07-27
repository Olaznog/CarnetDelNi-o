package grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logica.ColeccionNiños;

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
	private ColeccionNiños niños;

	public VentanaMenu(ColeccionNiños n) {
		niños = n;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 525, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnIngresar = new JMenu("Ingresar");
		menuBar.add(mnIngresar);
		
		JMenuItem mnIngresarDatosNiño = new JMenuItem("Datos del Ni\u00F1o");
		mnIngresarDatosNiño.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IngresoNiño Niño = new IngresoNiño(n);
	            Niño.setVisible(true);
			}
		});
		
		JMenu mnNuevoRegistro = new JMenu("Nuevo Registro");
		mnIngresar.add(mnNuevoRegistro);
		
		JMenuItem mnConsulta = new JMenuItem("Consulta");
		mnConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IngresoConsulta Consulta = new IngresoConsulta(n);
	            Consulta.setVisible(true);
			}
		});
		mnNuevoRegistro.add(mnConsulta);
		
		JMenuItem mnControl = new JMenuItem("Control");
		mnControl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IngresoControl Control = new IngresoControl(n);
	            Control.setVisible(true);
			}
		});
		mnNuevoRegistro.add(mnControl);
		
		JMenuItem mnVacuna = new JMenuItem("Vacuna");
		mnVacuna.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				IngresoVacuna Vacuna = new IngresoVacuna(n);
	            Vacuna.setVisible(true);
			}
		});
		mnNuevoRegistro.add(mnVacuna);
		mnIngresar.add(mnIngresarDatosNiño);
		
		JMenu mnConsultar = new JMenu("Consultar");
		menuBar.add(mnConsultar);
		
		JMenu mnListadoDeNios = new JMenu("Listado de ni\u00F1os");
		mnConsultar.add(mnListadoDeNios);
		
		JMenu mnNewMenu = new JMenu("Mostrar datos de un ni\u00F1o ");
		mnConsultar.add(mnNewMenu);
		
		JMenu mnConsultaMedicaPor = new JMenu("Consulta M\u00E9dica por Fecha");
		mnConsultar.add(mnConsultaMedicaPor);
		//ColeccionNiños niños = new ColeccionNiños();//Este objeto es el sistema?
	}
}
