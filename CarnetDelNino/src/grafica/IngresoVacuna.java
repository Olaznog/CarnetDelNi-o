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
import com.toedter.calendar.JCalendar;

public class IngresoVacuna extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IngresoVacuna frame = new IngresoVacuna();
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
	public IngresoVacuna() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 487);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIngresoVacuna = new JLabel("INGRESO VACUNA");
		lblIngresoVacuna.setBounds(146, 11, 102, 14);
		contentPane.add(lblIngresoVacuna);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 52, 46, 14);
		contentPane.add(lblNombre);
		
		textField = new JTextField();
		textField.setBounds(112, 49, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblDsis = new JLabel("Dosis:");
		lblDsis.setBounds(10, 95, 46, 14);
		contentPane.add(lblDsis);
		
		textField_1 = new JTextField();
		textField_1.setBounds(112, 92, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblObligatoria = new JLabel("Obligatoria:");
		lblObligatoria.setBounds(10, 138, 78, 14);
		contentPane.add(lblObligatoria);
		
		JCheckBox chckbxSi = new JCheckBox("Si");
		chckbxSi.setSelected(true);
		chckbxSi.setBounds(112, 134, 33, 23);
		contentPane.add(chckbxSi);
		
		JCheckBox chckbxNo = new JCheckBox("No");
		chckbxNo.setBounds(151, 134, 46, 23);
		contentPane.add(chckbxNo);
		
		JLabel lblFecha = new JLabel("Fecha:");
		lblFecha.setBounds(10, 178, 46, 14);
		contentPane.add(lblFecha);
		
		JLabel lblNewLabel = new JLabel("Comentario:");
		lblNewLabel.setBounds(10, 359, 78, 14);
		contentPane.add(lblNewLabel);
		
		textField_3 = new JTextField();
		textField_3.setBounds(112, 359, 218, 44);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnIngresar = new JButton("INGRESAR");
		btnIngresar.setBounds(241, 414, 89, 23);
		contentPane.add(btnIngresar);
		
		JButton btnVolver = new JButton("VOLVER");
		btnVolver.setBounds(335, 414, 89, 23);
		contentPane.add(btnVolver);
		
		JCalendar calendar = new JCalendar();
		calendar.setBounds(112, 178, 184, 153);
		contentPane.add(calendar);
	}
}
