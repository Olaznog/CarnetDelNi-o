package grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class IngresoControl extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IngresoControl frame = new IngresoControl();
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
	public IngresoControl() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 319);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPeso = new JLabel("Peso:");
		lblPeso.setBounds(10, 58, 46, 14);
		contentPane.add(lblPeso);
		
		textField = new JTextField();
		textField.setBounds(98, 55, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblAltura = new JLabel("Altura:");
		lblAltura.setBounds(10, 99, 46, 14);
		contentPane.add(lblAltura);
		
		textField_1 = new JTextField();
		textField_1.setBounds(98, 96, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblFecha = new JLabel("Fecha:");
		lblFecha.setBounds(10, 143, 46, 14);
		contentPane.add(lblFecha);
		
		textField_2 = new JTextField();
		textField_2.setText("");
		textField_2.setBounds(98, 140, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblComentario = new JLabel("Comentario:");
		lblComentario.setBounds(10, 187, 71, 14);
		contentPane.add(lblComentario);
		
		textField_3 = new JTextField();
		textField_3.setBounds(98, 184, 261, 43);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblIngresoControl = new JLabel("INGRESO CONTROL");
		lblIngresoControl.setBounds(151, 11, 134, 14);
		contentPane.add(lblIngresoControl);
		
		JLabel lblEjDdmmyyyy = new JLabel("Ej: dd/mm/yyyy");
		lblEjDdmmyyyy.setBounds(194, 143, 91, 14);
		contentPane.add(lblEjDdmmyyyy);
		
		JButton btnIngresar = new JButton("INGRESAR");
		btnIngresar.setBounds(166, 246, 89, 23);
		contentPane.add(btnIngresar);
		
		JButton btnVolver = new JButton("VOLVER");
		btnVolver.setBounds(270, 246, 89, 23);
		contentPane.add(btnVolver);
	}

}
