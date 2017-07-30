package grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logica.ColeccionNi�os;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class VentanaConfiguracion extends JFrame {
	private ColeccionNi�os ni�os;
    private JPanel contentPane;
	private JTextField textCantMaxNi�os;
	private JTextField textCantMaxRegNi�os;

	
	public VentanaConfiguracion(ColeccionNi�os n) {
		this.ni�os = n;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 217);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCantMaxNi�os = new JLabel("Ingrese la cantidad m\u00E1xima de ni\u00F1os:");
		lblCantMaxNi�os.setBounds(10, 66, 237, 22);
		contentPane.add(lblCantMaxNi�os);
		
		JLabel lblCantMaxRegNi�os = new JLabel("Ingrese la cantidad m\u00E1xima de registros por ni\u00F1o:");
		lblCantMaxRegNi�os.setBounds(10, 99, 299, 22);
		contentPane.add(lblCantMaxRegNi�os);
		
		textCantMaxNi�os = new JTextField();
		textCantMaxNi�os.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				 int k = (int) evt.getKeyChar();//k = al valor de la tecla presionada    
		         if (k >= 97 && k <= 122 || k >= 65 && k <= 90) {//Si el caracter ingresado es una letra
		             evt.setKeyChar((char) KeyEvent.VK_CLEAR);//Limpiar el caracter ingresado
		             JOptionPane.showMessageDialog(null, "No puede ingresar letras!!!", "Validando Datos",
		                     JOptionPane.ERROR_MESSAGE);
		        }
			}
		});
		textCantMaxNi�os.setBounds(334, 67, 37, 20);
		contentPane.add(textCantMaxNi�os);
		textCantMaxNi�os.setColumns(10);
		
		textCantMaxRegNi�os = new JTextField();
		textCantMaxRegNi�os.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				 int k = (int) evt.getKeyChar();//k = al valor de la tecla presionada    
		         if (k >= 97 && k <= 122 || k >= 65 && k <= 90) {//Si el caracter ingresado es una letra
		             evt.setKeyChar((char) KeyEvent.VK_CLEAR);//Limpiar el caracter ingresado
		             JOptionPane.showMessageDialog(null, "No puede ingresar letras!!!", "Validando Datos",
		                     JOptionPane.ERROR_MESSAGE);
		        }
			}
		});
		textCantMaxRegNi�os.setBounds(334, 100, 37, 20);
		contentPane.add(textCantMaxRegNi�os);
		textCantMaxRegNi�os.setColumns(10);
		
		JLabel lblConfiguracinDeSistema = new JLabel("CONFIGURACI\u00D3N DE SISTEMA");
		lblConfiguracinDeSistema.setBounds(120, 11, 194, 44);
		contentPane.add(lblConfiguracinDeSistema);
		
		JButton btnIngresar = new JButton("INGRESAR");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Tomar datos ingresados por el usuario
				int cantMaximaNi�os = Integer.parseInt(textCantMaxNi�os.getText());
				int cantMaximaRegistros = Integer.parseInt(textCantMaxRegNi�os.getText());
				//Se llama al metodo configurar de la clase ColeccionNi�os
				n.configurar(cantMaximaNi�os, cantMaximaRegistros);
				VentanaMenu Menu = new VentanaMenu(n);
	            Menu.setVisible(true);
	            dispose();
			}
		});
		btnIngresar.setBounds(92, 147, 102, 23);
		contentPane.add(btnIngresar);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnSalir.setBounds(223, 147, 102, 23);
		contentPane.add(btnSalir);
	}
	
}
