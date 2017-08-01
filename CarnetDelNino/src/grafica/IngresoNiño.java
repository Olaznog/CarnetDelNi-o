package grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JCalendar;
import excepciones.ExisteNinioException;
import excepciones.hayLugarException;
import excepciones.ninoMayorException;
import logica.ColeccionNiños;
import logica.Niño;



import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class IngresoNiño extends JFrame {
	private ColeccionNiños niños;
	private VentanaMenu Menu;
	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textDocumento;
	private JCalendar  calendar;
	private JTextField textMedCabecera;
	private JTextField textServicioMedico;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rdbtnTieneFSi_1;
	private JRadioButton rdbtnTieneFNo_1;

	public IngresoNiño(ColeccionNiños n, VentanaMenu menu) {
		this.niños = n;
		this.Menu = menu;
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 559);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 62, 70, 20);
		contentPane.add(lblNombre);
		
		JLabel lblDocumento = new JLabel("Documento:");
		lblDocumento.setBounds(10, 103, 70, 20);
		contentPane.add(lblDocumento);
		
		JLabel lblFechaNac = new JLabel("Fecha de Nacimiento:");
		lblFechaNac.setBounds(10, 145, 116, 14);
		contentPane.add(lblFechaNac);
		
		JLabel lblSerMed = new JLabel("Servicio M\u00E9dico:");
		lblSerMed.setBounds(10, 349, 103, 20);
		contentPane.add(lblSerMed);
		
		JLabel lblMedCabecera = new JLabel("M\u00E9dico Cabecera:");
		lblMedCabecera.setBounds(10, 380, 103, 20);
		contentPane.add(lblMedCabecera);
		
		JLabel lblTieneFonasa = new JLabel("Tiene Fonasa:");
		lblTieneFonasa.setBounds(10, 424, 103, 20);
		contentPane.add(lblTieneFonasa);
		
		textNombre = new JTextField();
		textNombre.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				 int k = (int) evt.getKeyChar();//k = al valor de la tecla presionada   
			        if (k > 47 && k < 58) {//Si el caracter ingresado es una letra
			             evt.setKeyChar((char) KeyEvent.VK_CLEAR);//Limpiar el caracter ingresado
			             JOptionPane.showMessageDialog(null, "No puede ingresar numeros!!!", "Validando Datos",
		                     JOptionPane.ERROR_MESSAGE);
			}
			}
		});
		textNombre.setBounds(136, 62, 133, 20);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
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
		textDocumento.setBounds(136, 103, 133, 20);
		contentPane.add(textDocumento);
		textDocumento.setColumns(10);
		
		textMedCabecera = new JTextField();
		textMedCabecera.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				 int k = (int) evt.getKeyChar();//k = al valor de la tecla presionada   
			        if (k > 47 && k < 58) {//Si el caracter ingresado es una letra
			             evt.setKeyChar((char) KeyEvent.VK_CLEAR);//Limpiar el caracter ingresado
			             JOptionPane.showMessageDialog(null, "No puede ingresar numeros!!!", "Validando Datos",
		                     JOptionPane.ERROR_MESSAGE);
			}
			}
		});
		textMedCabecera.setBounds(136, 380, 123, 20);
		contentPane.add(textMedCabecera);
		textMedCabecera.setColumns(10);
		
		JButton btnIngresar = new JButton("INGRESAR");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Tomar datos ingresados por el usuario
				try {
					if(!textDocumento.getText().isEmpty()){
				String nombre = textNombre.getText();
				int documento = Integer.parseInt(textDocumento.getText());
				Calendar fechaNac = calendar.getCalendar();
				String servicioMedico = textServicioMedico.getText();
				String medicoCabecera = textMedCabecera.getText();
				boolean tieneFonasa;
				if(rdbtnTieneFSi_1.isSelected())
					tieneFonasa = true;
				else
					tieneFonasa = false;
				Niño n = new Niño(nombre, documento, fechaNac, servicioMedico, medicoCabecera, tieneFonasa);
					
				//ColeccionNiños coleccion = new ColeccionNiños();
				if(nombre.isEmpty() || servicioMedico.isEmpty() || medicoCabecera.isEmpty()){
					JOptionPane.showMessageDialog(null, "Debe llenar todos los campos ");			
				}else {
					niños.altaNiño(n);
					JOptionPane.showMessageDialog(null, "Se ingreso el niño ");
					dispose();
				}
					}else {
						JOptionPane.showMessageDialog(null, "Debe llenar la cedula ");	
					}
				} catch (ExisteNinioException e) {
					JOptionPane.showMessageDialog(null, e.getMensaje());
				} catch (hayLugarException e) {
					JOptionPane.showMessageDialog(null, e.getMensaje());
				} catch (ninoMayorException e) {
					JOptionPane.showMessageDialog(null, e.getMensaje());
				}
			}
		});
		btnIngresar.setBounds(101, 470, 116, 23);
		contentPane.add(btnIngresar);
		
		JButton btnVolver = new JButton("VOLVER");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Menu.setVisible(true);
				dispose();
			}
		});
		btnVolver.setBounds(243, 470, 116, 23);
		contentPane.add(btnVolver);
		
		JLabel lblIngresoNio = new JLabel("INGRESO NI\u00D1O");
		lblIngresoNio.setBounds(161, 0, 123, 44);
		contentPane.add(lblIngresoNio);
		
		calendar = new JCalendar();
		calendar.setBounds(136, 145, 184, 153);
		contentPane.add(calendar);
		
		rdbtnTieneFSi_1 = new JRadioButton("Si");
		rdbtnTieneFSi_1.setSelected(true);
		buttonGroup.add(rdbtnTieneFSi_1);
		rdbtnTieneFSi_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		rdbtnTieneFSi_1.setBounds(136, 423, 49, 23);
		contentPane.add(rdbtnTieneFSi_1);
		
		rdbtnTieneFNo_1 = new JRadioButton("No");
		buttonGroup.add(rdbtnTieneFNo_1);
		rdbtnTieneFNo_1.setBounds(199, 423, 67, 23);
		contentPane.add(rdbtnTieneFNo_1);
		
		textServicioMedico = new JTextField();
		textServicioMedico.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent evt) {
				 int k = (int) evt.getKeyChar();//k = al valor de la tecla presionada   
			        if (k > 47 && k < 58) {//Si el caracter ingresado es una letra
			             evt.setKeyChar((char) KeyEvent.VK_CLEAR);//Limpiar el caracter ingresado
			             JOptionPane.showMessageDialog(null, "No puede ingresar numeros!!!", "Validando Datos",
		                     JOptionPane.ERROR_MESSAGE);
			}
	}
		});
		textServicioMedico.setBounds(136, 349, 123, 20);
		contentPane.add(textServicioMedico);
		textServicioMedico.setColumns(10);
	}
}
