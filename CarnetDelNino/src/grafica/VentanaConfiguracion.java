package grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class VentanaConfiguracion extends JFrame {

	private JPanel contentPane;
	private JTextField textCantMaxNi�os;
	private JTextField textCantMaxRegNi�os;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaConfiguracion frame = new VentanaConfiguracion();
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
	public VentanaConfiguracion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 225);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCantMaxNi�os = new JLabel("Ingrese la cantidad m\u00E1xima de ni\u00F1os:");
		lblCantMaxNi�os.setBounds(10, 91, 186, 22);
		contentPane.add(lblCantMaxNi�os);
		
		JLabel lblCantMaxRegNi�os = new JLabel("Ingrese la cantidad m\u00E1xima de registros por ni\u00F1o:");
		lblCantMaxRegNi�os.setBounds(10, 124, 237, 22);
		contentPane.add(lblCantMaxRegNi�os);
		
		textCantMaxNi�os = new JTextField();
		textCantMaxNi�os.setBounds(247, 92, 86, 20);
		contentPane.add(textCantMaxNi�os);
		textCantMaxNi�os.setColumns(10);
		
		textCantMaxRegNi�os = new JTextField();
		textCantMaxRegNi�os.setBounds(247, 125, 86, 20);
		contentPane.add(textCantMaxRegNi�os);
		textCantMaxRegNi�os.setColumns(10);
		
		JLabel lblConfiguracinDeSistema = new JLabel("CONFIGURACI\u00D3N DE SISTEMA");
		lblConfiguracinDeSistema.setBounds(120, 11, 148, 44);
		contentPane.add(lblConfiguracinDeSistema);
	}
}