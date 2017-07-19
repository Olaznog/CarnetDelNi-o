package grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class IngresoConsulta extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IngresoConsulta frame = new IngresoConsulta();
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
	public IngresoConsulta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 317);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(158, 42, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nombre del M\u00E9dico:");
		lblNewLabel.setBounds(23, 45, 109, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblDiagnstico = new JLabel("Diagn\u00F3stico:");
		lblDiagnstico.setBounds(23, 80, 91, 14);
		contentPane.add(lblDiagnstico);
		
		textField_1 = new JTextField();
		textField_1.setBounds(158, 77, 203, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblReomendaciones = new JLabel("Recomendaciones:");
		lblReomendaciones.setBounds(23, 123, 109, 14);
		contentPane.add(lblReomendaciones);
		
		textField_2 = new JTextField();
		textField_2.setBounds(158, 120, 203, 28);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblFecha = new JLabel("Fecha:");
		lblFecha.setBounds(23, 162, 46, 14);
		contentPane.add(lblFecha);
		
		textField_3 = new JTextField();
		textField_3.setBounds(158, 159, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblComentario = new JLabel("Comentario:");
		lblComentario.setBounds(23, 198, 91, 14);
		contentPane.add(lblComentario);
		
		textField_4 = new JTextField();
		textField_4.setBounds(158, 195, 203, 28);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblEjDdmmyyyy = new JLabel("Ej: dd/mm/yyyy");
		lblEjDdmmyyyy.setBounds(254, 162, 91, 14);
		contentPane.add(lblEjDdmmyyyy);
		
		JLabel lblIngresoConsulta = new JLabel("INGRESO CONSULTA");
		lblIngresoConsulta.setBounds(146, 11, 109, 14);
		contentPane.add(lblIngresoConsulta);
		
		JButton btnIngresar = new JButton("INGRESAR");
		btnIngresar.setBounds(158, 244, 89, 23);
		contentPane.add(btnIngresar);
		
		JButton btnVolver = new JButton("VOLVER");
		btnVolver.setBounds(272, 244, 89, 23);
		contentPane.add(btnVolver);
	}
}
