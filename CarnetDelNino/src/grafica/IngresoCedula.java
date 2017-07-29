package grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import excepciones.ExisteNinioException;
import logica.ColeccionNiños;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class IngresoCedula extends JFrame {
	private ColeccionNiños niños;
	private JPanel contentPane;
	private JTextField textDocumento;
	private VentanaMenu Menu;
	private DatosNiñoPorCedula DatosNiño;
	
	public IngresoCedula(ColeccionNiños n, VentanaMenu menu, DatosNiñoPorCedula dn) {
		this.niños = n;
		this.Menu = menu;
		this.DatosNiño = dn;
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 275, 136);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIngresarCi = new JLabel("Ingresar CI:");
		lblIngresarCi.setBounds(12, 34, 78, 16);
		contentPane.add(lblIngresarCi);
		
		textDocumento = new JTextField();
		textDocumento.addKeyListener(new KeyAdapter() {
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
		textDocumento.setBounds(90, 31, 155, 22);
		contentPane.add(textDocumento);
		textDocumento.setColumns(10);
		
		JButton btnBuscar = new JButton("BUSCAR");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int documento = Integer.parseInt(textDocumento.getText());
				try {
					n.getNiño(documento);
				} catch (ExisteNinioException e1) {
					JOptionPane.showMessageDialog(null, e1.getMensaje());
				}
				 
				DatosNiñoPorCedula DatosNiño= new DatosNiñoPorCedula(niños, Menu);
				DatosNiño.setVisible(true);
				dispose();
			}
		});
		btnBuscar.setBounds(12, 86, 97, 25);
		contentPane.add(btnBuscar);
		
		JButton btnNewButton_1 = new JButton("VOLVER");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu.setVisible(true);
				dispose();
			}
		});
		btnNewButton_1.setBounds(148, 86, 97, 25);
		contentPane.add(btnNewButton_1);
	}
}
