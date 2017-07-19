package grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JButton;

public class ConsultaMedAntesDeFecha extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsultaMedAntesDeFecha frame = new ConsultaMedAntesDeFecha();
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
	public ConsultaMedAntesDeFecha() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 355);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblConsultasMdicasPor = new JLabel("CONSULTAS M\u00C9DICAS POR FECHA");
		lblConsultasMdicasPor.setBounds(117, 11, 194, 14);
		contentPane.add(lblConsultasMdicasPor);
		
		JLabel lblIngreseFecha = new JLabel("Ingrese Fecha:");
		lblIngreseFecha.setBounds(10, 49, 87, 14);
		contentPane.add(lblIngreseFecha);
		
		textField = new JTextField();
		textField.setBounds(114, 46, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblEjddmmyyyy = new JLabel("Ej:dd/mm/yyyy");
		lblEjddmmyyyy.setBounds(223, 49, 88, 14);
		contentPane.add(lblEjddmmyyyy);
		
		table = new JTable();
		table.setBounds(10, 103, 403, 152);
		contentPane.add(table);
		
		JButton btnBuscar = new JButton("BUSCAR");
		btnBuscar.setBounds(321, 45, 89, 23);
		contentPane.add(btnBuscar);
		
		JButton btnVolver = new JButton("VOLVER");
		btnVolver.setBounds(324, 282, 89, 23);
		contentPane.add(btnVolver);
	}

}
