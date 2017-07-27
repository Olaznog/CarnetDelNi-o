package grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logica.ColeccionNi�os;

import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class DatosNi�oPorCedula extends JFrame {
	private ColeccionNi�os ni�os;

	private JPanel contentPane;
	private JTable table;
	private JTextField textField;

	
	public DatosNi�oPorCedula(ColeccionNi�os n) {
		this.ni�os = n;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 356);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setBounds(10, 89, 414, 184);
		contentPane.add(table);
		
		JLabel lblDatosDelNio = new JLabel("DATOS DEL NI\u00D1O POR C\u00C9DULA");
		lblDatosDelNio.setBounds(119, 11, 176, 14);
		contentPane.add(lblDatosDelNio);
		
		JLabel lblNewLabel = new JLabel("Ingrese c\u00E9dula del ni\u00F1o:");
		lblNewLabel.setBounds(10, 61, 158, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(164, 56, 100, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnBuscar = new JButton("BUSCAR");
		btnBuscar.setBounds(198, 283, 89, 23);
		contentPane.add(btnBuscar);
		
		JButton btnVolver = new JButton("VOLVER");
		btnVolver.setBounds(292, 283, 89, 23);
		contentPane.add(btnVolver);
	}
}
