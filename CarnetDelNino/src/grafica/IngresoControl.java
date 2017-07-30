package grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import com.toedter.calendar.JCalendar;

import excepciones.ExisteNinioException;
import excepciones.hayLugarException;
import logica.ColeccionNiños;
import logica.Control;
import logica.Niño;
import logica.Registro;

import java.awt.event.ActionListener;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class IngresoControl extends JFrame {
	private ColeccionNiños niños;
	private VentanaMenu Menu;
	private JPanel contentPane;
	private JTextField textPeso;
	private JTextField textAltura;
	private JTextField textComentario;
	private JCalendar  fechaControl;
	private JTextField textDocumento;

	public IngresoControl(ColeccionNiños n,  VentanaMenu menu) {
		this.niños = n;
		this.Menu = menu;
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 429);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPeso = new JLabel("Peso:");
		lblPeso.setBounds(10, 84, 46, 14);
		contentPane.add(lblPeso);
		
		textPeso = new JTextField();
		textPeso.addKeyListener(new KeyAdapter() {
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
		textPeso.setBounds(98, 83, 99, 16);
		contentPane.add(textPeso);
		textPeso.setColumns(10);
		
		JLabel lblAltura = new JLabel("Altura:");
		lblAltura.setBounds(10, 109, 46, 14);
		contentPane.add(lblAltura);
		
		textAltura = new JTextField();
		textAltura.addKeyListener(new KeyAdapter() {
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
		textAltura.setBounds(98, 107, 99, 17);
		contentPane.add(textAltura);
		textAltura.setColumns(10);
		
		JLabel lblFechaControl = new JLabel("Fecha:");
		lblFechaControl.setBounds(10, 143, 46, 14);
		contentPane.add(lblFechaControl);
		
		JLabel lblComentario = new JLabel("Comentario:");
		lblComentario.setBounds(10, 317, 71, 14);
		contentPane.add(lblComentario);
		
		textComentario = new JTextField();
		textComentario.setBounds(98, 316, 259, 43);
		contentPane.add(textComentario);
		textComentario.setColumns(10);
		
		JLabel lblIngresoControl = new JLabel("INGRESO CONTROL");
		lblIngresoControl.setBounds(151, 11, 134, 14);
		contentPane.add(lblIngresoControl);
		
		JButton btnIngresar = new JButton("INGRESAR");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Tomar datos ingresados por el usuario
				int documento = Integer.parseInt(textDocumento.getText());
                int peso = Integer.parseInt(textPeso.getText());
				int altura = Integer.parseInt(textAltura.getText());
				Calendar fechaCon = Calendar.getInstance();
				String comentario = textComentario.getText();
				Registro cont = new Control(fechaCon,comentario,peso, altura);
				try{
					  niños.altaRegistro(cont, documento);
						JOptionPane.showMessageDialog(null, "Se ingreso el control del niño");
						dispose();
					} catch (ExisteNinioException e) {
						JOptionPane.showMessageDialog(null, e.getMensaje());
					} catch (hayLugarException e) {
						JOptionPane.showMessageDialog(null, e.getMensaje());
					}
				
				
			}
		});
		btnIngresar.setBounds(112, 383, 99, 23);
		contentPane.add(btnIngresar);
		
		JButton btnVolver = new JButton("VOLVER");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Menu.setVisible(true);
				dispose();
			}
		});
		btnVolver.setBounds(222, 383, 99, 23);
		contentPane.add(btnVolver);
		
		JCalendar calendar = new JCalendar();
		calendar.setBounds(98, 143, 184, 153);
		contentPane.add(calendar);
		
		JLabel lblCedula = new JLabel("Cedula:");
		lblCedula.setBounds(10, 57, 56, 16);
		contentPane.add(lblCedula);
		
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
		textDocumento.setBounds(98, 55, 99, 17);
		contentPane.add(textDocumento);
		textDocumento.setColumns(10);
	}
}
