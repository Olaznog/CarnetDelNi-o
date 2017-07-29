package grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logica.ColeccionNiños;
import persistencia.PersistirNiño;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

public class VentanaMenu extends JFrame {
	private ColeccionNiños niños;

	public VentanaMenu(ColeccionNiños n) {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				int i = JOptionPane.showConfirmDialog(null, "Desea cerrar el sistema?");
				//el numero que retorna el metodo es el numero de la respuesta del usuario:
				//YES = 0
				//NO = 1
				//CANCEL = 2
				if(i == 0)
				{
					//ACA SE DEBERIA GUARDAR EN PERSISTENCIA LOS DATOS
					// Y DESPUED< SI< CERRAR LA VENTANA Y CERRAR EL SISTEMA
					PersistirNiño.persistir(n, "C://DatosNiño/datos.txt");
					System.exit(0);
				}
				//SI HACE FALTA IMPLEMENTAR EL COMPORTAMIENTO SI EL USUARIO SELECCIONA NO O CANECLAR, ESCRIBIR LOS ELSE
			}
		});
		niños = n;
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 525, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnIngresar = new JMenu("Ingresar");
		menuBar.add(mnIngresar);
		
		JMenuItem mnIngresarDatosNiño = new JMenuItem("Datos del Ni\u00F1o");
		mnIngresarDatosNiño.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarVentNiño();
			}
		});
		
		JMenu mnNuevoRegistro = new JMenu("Nuevo Registro");
		mnIngresar.add(mnNuevoRegistro);
		
		JMenuItem mnConsulta = new JMenuItem("Consulta");
		mnConsulta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarVentConsulta();
			}
		});
		mnNuevoRegistro.add(mnConsulta);
		
		JMenuItem mnControl = new JMenuItem("Control");
		mnControl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarVentControl();
			}
		});
		mnNuevoRegistro.add(mnControl);
		
		JMenuItem mnVacuna = new JMenuItem("Vacuna");
		mnVacuna.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarVentVacuna();
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
		mnConsultaMedicaPor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarVentConsultasMedicas();
				//comentarios
			}
		});
		mnConsultar.add(mnConsultaMedicaPor);
		
		
	}
	private void mostrarVentVacuna()
	{
		IngresoVacuna Vacuna = new IngresoVacuna(niños, this);
        Vacuna.setVisible(true);
	}
	private void mostrarVentControl()
	{
		IngresoControl Control = new IngresoControl(niños, this);
		Control.setVisible(true);
	}
	private void mostrarVentConsulta()
	{
		IngresoConsulta Consulta = new IngresoConsulta(niños, this);
		Consulta.setVisible(true);
	}
	private void mostrarVentNiño()
	{
		IngresoNiño Niño = new IngresoNiño(niños, this);
		Niño.setVisible(true);
	}
	private void mostrarVentConsultasMedicas()
	{
		ConsultaMedAntesDeFecha CuantasConsultas = new ConsultaMedAntesDeFecha(niños, this);
		CuantasConsultas.setVisible(true);
	}
	
}
