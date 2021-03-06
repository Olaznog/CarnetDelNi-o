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
				if(i == 0)
				{
					//ACA SE GUARDA EL ARCHIVO
					PersistirNiño.persistir(n);
					System.exit(0);
				}
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
		
		//ACÁ UTILIZAMOS EL MÉTODO LISTARNIÑOS() Y POR ÚLTIMO UTILIZAMOS EL MÉTODO QUE MUESTRA LA VENTANA CON LA LISTA.
		JMenuItem mntmNewMenuItem = new JMenuItem("Listado de Ni\u00F1os");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				niños.listarNiños();
				mostrarVentListadoNiños();
			}
		});
		mnConsultar.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Mostrar datos de un ni\u00F1o");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarVentDatosNiñosPorCI();
			}
			
		});
		mnConsultar.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_2 = new JMenuItem("Consulta M\u00E9dica por fecha");
		mntmNewMenuItem_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mostrarVentConsultasMedicas();
			}
		});
		mnConsultar.add(mntmNewMenuItem_2);
	}
	//ESTOS METODOS SE INVONCAN EN LOS EVENTOS DE LOS BOTONES PARA VISUALIZAR LAS VENTANAS CORRESPONDIENTES
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
	private void mostrarVentDatosNiñosPorCI()
	{
		DatosNiñoPorCedula DatosNiño = new DatosNiñoPorCedula(niños, this);
		DatosNiño.setVisible(true);
	}
	private void mostrarVentListadoNiños()
	{
		ListadoDeNiños ListaNiño = new ListadoDeNiños(niños, this);
		ListaNiño.setVisible(true);
	}
	
	
}
