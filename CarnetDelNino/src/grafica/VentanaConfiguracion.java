package grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logica.ColeccionNiños;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class VentanaConfiguracion extends JFrame {
	private ColeccionNiños niños;
    private JPanel contentPane;
	private JTextField textCantMaxNiños;
	private JTextField textCantMaxRegNiños;

	
	public VentanaConfiguracion(ColeccionNiños n) {
		this.niños = n;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 217);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCantMaxNiños = new JLabel("Ingrese la cantidad m\u00E1xima de ni\u00F1os:");
		lblCantMaxNiños.setBounds(10, 66, 237, 22);
		contentPane.add(lblCantMaxNiños);
		
		JLabel lblCantMaxRegNiños = new JLabel("Ingrese la cantidad m\u00E1xima de registros por ni\u00F1o:");
		lblCantMaxRegNiños.setBounds(10, 99, 299, 22);
		contentPane.add(lblCantMaxRegNiños);
		
		textCantMaxNiños = new JTextField();
		textCantMaxNiños.addKeyListener(new KeyAdapter() {
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
		textCantMaxNiños.setBounds(334, 67, 37, 20);
		contentPane.add(textCantMaxNiños);
		textCantMaxNiños.setColumns(10);
		
		textCantMaxRegNiños = new JTextField();
		textCantMaxRegNiños.addKeyListener(new KeyAdapter() {
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
		textCantMaxRegNiños.setBounds(334, 100, 37, 20);
		contentPane.add(textCantMaxRegNiños);
		textCantMaxRegNiños.setColumns(10);
		
		JLabel lblConfiguracinDeSistema = new JLabel("CONFIGURACI\u00D3N DE SISTEMA");
		lblConfiguracinDeSistema.setBounds(120, 11, 194, 44);
		contentPane.add(lblConfiguracinDeSistema);
		
		JButton btnIngresar = new JButton("INGRESAR");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Tomar datos ingresados por el usuario
				int cantMaximaNiños = Integer.parseInt(textCantMaxNiños.getText());
				int cantMaximaRegistros = Integer.parseInt(textCantMaxRegNiños.getText());
				//Se llama al metodo configurar de la clase ColeccionNiños
				n.configurar(cantMaximaNiños, cantMaximaRegistros);
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
