package grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IngresoNiño extends JFrame {

	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textDocumento;
	private JTextField textMedCabecera;
	private JTextField textCantRegistros;
	private JTextField textFechaNac;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IngresoNiño frame = new IngresoNiño();
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
	public IngresoNiño() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 387);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 70, 70, 20);
		contentPane.add(lblNombre);
		
		JLabel lblDocumento = new JLabel("Documento:");
		lblDocumento.setBounds(10, 101, 70, 20);
		contentPane.add(lblDocumento);
		
		JLabel lblFechaNac = new JLabel("Fecha de Nacimiento:");
		lblFechaNac.setBounds(10, 135, 116, 14);
		contentPane.add(lblFechaNac);
		
		JLabel lblSerMed = new JLabel("Servicio M\u00E9dico:");
		lblSerMed.setBounds(10, 160, 103, 20);
		contentPane.add(lblSerMed);
		
		JLabel lblMedCabecera = new JLabel("M\u00E9dico Cabecera:");
		lblMedCabecera.setBounds(10, 191, 103, 20);
		contentPane.add(lblMedCabecera);
		
		JLabel lblTieneFonasa = new JLabel("Tiene Fonasa:");
		lblTieneFonasa.setBounds(10, 222, 103, 20);
		contentPane.add(lblTieneFonasa);
		
		JLabel lblCantRegistros = new JLabel("Cantidad de Registros Ingresados:");
		lblCantRegistros.setBounds(10, 253, 177, 20);
		contentPane.add(lblCantRegistros);
		
		textNombre = new JTextField();
		textNombre.setBounds(186, 70, 86, 20);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		textDocumento = new JTextField();
		textDocumento.setBounds(186, 101, 86, 20);
		contentPane.add(textDocumento);
		textDocumento.setColumns(10);
		
		textMedCabecera = new JTextField();
		textMedCabecera.setBounds(186, 191, 86, 20);
		contentPane.add(textMedCabecera);
		textMedCabecera.setColumns(10);
		
		textCantRegistros = new JTextField();
		textCantRegistros.setBounds(186, 253, 86, 20);
		contentPane.add(textCantRegistros);
		textCantRegistros.setColumns(10);
		
		JCheckBox chckbxSiSerMed = new JCheckBox("SI");
		chckbxSiSerMed.setSelected(true);
		chckbxSiSerMed.setBounds(186, 159, 41, 23);
		contentPane.add(chckbxSiSerMed);
		
		JCheckBox chckbxNoSerMed = new JCheckBox("NO");
		chckbxNoSerMed.setBounds(231, 159, 41, 23);
		contentPane.add(chckbxNoSerMed);
		
		JCheckBox chckbxSiTieneFon = new JCheckBox("SI");
		chckbxSiTieneFon.setSelected(true);
		chckbxSiTieneFon.setBounds(186, 219, 35, 23);
		contentPane.add(chckbxSiTieneFon);
		
		JCheckBox chckbxNoTieneFon = new JCheckBox("NO");
		chckbxNoTieneFon.setBounds(231, 219, 41, 23);
		contentPane.add(chckbxNoTieneFon);
		
		JButton btnIngresar = new JButton("INGRESAR");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnIngresar.setBounds(114, 315, 89, 23);
		contentPane.add(btnIngresar);
		
		JButton btnVolver = new JButton("VOLVER");
		btnVolver.setBounds(245, 315, 89, 23);
		contentPane.add(btnVolver);
		
		JLabel lblIngresoNio = new JLabel("INGRESO NI\u00D1O");
		lblIngresoNio.setBounds(161, 0, 74, 44);
		contentPane.add(lblIngresoNio);
		
		textFechaNac = new JTextField();
		textFechaNac.setBounds(186, 132, 86, 20);
		contentPane.add(textFechaNac);
		textFechaNac.setColumns(10);
		
		JLabel lblFechaNacFormato = new JLabel("Ej: dd/mm/yyyy");
		lblFechaNacFormato.setBounds(292, 135, 86, 14);
		contentPane.add(lblFechaNacFormato);
	}
}
