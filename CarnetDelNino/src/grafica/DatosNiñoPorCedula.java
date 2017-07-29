package grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JCalendar;

import logica.ColeccionNiños;

import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DatosNiñoPorCedula extends JFrame {
	private ColeccionNiños niños;

	private JPanel contentPane;
	private JTextField textDocumento;
	private JTextField textNombre;
	private JCalendar  fechaNac;
	private JTextField textMedCabecera;
	private JTextField textServicioMedico;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rdbtnTieneFSi_1;
	private JRadioButton rdbtnTieneFNo_1;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	
	public DatosNiñoPorCedula(ColeccionNiños n) {
		setUndecorated(true);
		this.niños = n;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 562);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDatosDelNio = new JLabel("DATOS DEL NI\u00D1O POR C\u00C9DULA");
		lblDatosDelNio.setBounds(119, 11, 176, 14);
		contentPane.add(lblDatosDelNio);
		
		JLabel lblNewLabel = new JLabel("Ingrese c\u00E9dula del ni\u00F1o:");
		lblNewLabel.setBounds(20, 59, 158, 14);
		contentPane.add(lblNewLabel);
		
		textDocumento = new JTextField();
		textDocumento.setBounds(164, 56, 100, 20);
		contentPane.add(textDocumento);
		textDocumento.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(20, 99, 70, 20);
		contentPane.add(lblNombre);
		
		JLabel lblDocumento = new JLabel("Documento:");
		lblDocumento.setBounds(20, 137, 70, 20);
		contentPane.add(lblDocumento);
		
		JLabel lblFechaNac = new JLabel("Fecha de Nacimiento:");
		lblFechaNac.setBounds(20, 170, 144, 14);
		contentPane.add(lblFechaNac);
		
		JLabel lblSerMed = new JLabel("Servicio M\u00E9dico:");
		lblSerMed.setBounds(20, 197, 103, 20);
		contentPane.add(lblSerMed);
		
		JLabel lblMedCabecera = new JLabel("M\u00E9dico Cabecera:");
		lblMedCabecera.setBounds(20, 230, 103, 20);
		contentPane.add(lblMedCabecera);
		
		JLabel lblTieneFonasa = new JLabel("Tiene Fonasa:");
		lblTieneFonasa.setBounds(20, 263, 103, 20);
		contentPane.add(lblTieneFonasa);
		
		textNombre = new JTextField();
		textNombre.setBounds(164, 99, 86, 20);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		textDocumento = new JTextField();
		textDocumento.setBounds(164, 137, 86, 20);
		contentPane.add(textDocumento);
		textDocumento.setColumns(10);
		
		textMedCabecera = new JTextField();
		textMedCabecera.setBounds(164, 197, 86, 20);
		contentPane.add(textMedCabecera);
		textMedCabecera.setColumns(10);
		
		JButton btnBuscar = new JButton("BUSCAR");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int documento = Integer.parseInt(textDocumento.getText());
				n.getNiño(documento);
				
			}
		});
		btnBuscar.setBounds(72, 499, 89, 23);
		contentPane.add(btnBuscar);
		
		JButton btnVolver = new JButton("VOLVER");
		btnVolver.setBounds(248, 499, 89, 23);
		contentPane.add(btnVolver);
		
		textField = new JTextField();
		textField.setBounds(164, 166, 116, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(164, 229, 116, 22);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(164, 262, 116, 22);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JList list = new JList();
		list.setBounds(20, 308, 408, 126);
		contentPane.add(list);
	}
}
