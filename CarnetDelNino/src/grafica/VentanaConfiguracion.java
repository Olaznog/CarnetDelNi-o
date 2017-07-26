package grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logica.ColeccionNi�os;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class VentanaConfiguracion extends JFrame {
	private ColeccionNi�os ni�os;

	private JPanel contentPane;
	private JTextField textCantMaxNi�os;
	private JTextField textCantMaxRegNi�os;

	/**
	 * Launch the application.
	 */
	
	

	/**
	 * Create the frame.
	 */
	public VentanaConfiguracion(ColeccionNi�os n) {
		this.ni�os = n;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 237);
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
		
		JButton btnIngresar = new JButton("INGRESAR");
		btnIngresar.setBounds(145, 164, 89, 23);
		contentPane.add(btnIngresar);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.setBounds(244, 164, 89, 23);
		contentPane.add(btnSalir);
	}
}
