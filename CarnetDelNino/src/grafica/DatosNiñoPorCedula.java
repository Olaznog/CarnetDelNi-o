package grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

import com.toedter.calendar.JCalendar;

import excepciones.ExisteNinioException;
import logica.ColeccionNiños;
import logica.Niño;

import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class DatosNiñoPorCedula extends JFrame {
	private ColeccionNiños niños;
	 private VentanaMenu Menu;
	private JPanel contentPane;
	private JCalendar  fechaNac;
	private JTextField textServicioMedico;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rdbtnTieneFSi_1;
	private JRadioButton rdbtnTieneFNo_1;
	private JTextField textDocumento;

	
	public DatosNiñoPorCedula(ColeccionNiños n, VentanaMenu menu) {
		this.niños = n;
		this.Menu = menu;
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 534);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDatosDelNio = new JLabel("DATOS DEL NI\u00D1O POR C\u00C9DULA");
		lblDatosDelNio.setBounds(119, 11, 176, 14);
		contentPane.add(lblDatosDelNio);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(20, 99, 70, 20);
		contentPane.add(lblNombre);
		
		JLabel lblDocumento = new JLabel("Documento:");
		lblDocumento.setBounds(20, 137, 70, 20);
		contentPane.add(lblDocumento);
		
		JLabel lblFechaNac = new JLabel("Fecha de Nacimiento:");
		lblFechaNac.setBounds(20, 170, 144, 14);
		contentPane.add(lblFechaNac);
		
		JLabel lblSerMed = new JLabel("Servicio M\u00E9dico:");
		lblSerMed.setBounds(20, 197, 103, 20);
		contentPane.add(lblSerMed);
		
		JLabel lblMedCabecera = new JLabel("M\u00E9dico Cabecera:");
		lblMedCabecera.setBounds(20, 230, 103, 20);
		contentPane.add(lblMedCabecera);
		
		JLabel lblTieneFonasa = new JLabel("Tiene Fonasa:");
		lblTieneFonasa.setBounds(20, 263, 103, 20);
		contentPane.add(lblTieneFonasa);
		
		JButton btnVolver = new JButton("VOLVER");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu.setVisible(true);
				dispose();
			}
		});
		btnVolver.setBounds(164, 448, 89, 23);
		contentPane.add(btnVolver);
		
		JList list = new JList();
		list.setBounds(164, 311, 129, 57);
		contentPane.add(list);
		
		JLabel lblRegistrosDelNio = new JLabel("Registros del ni\u00F1o:");
		lblRegistrosDelNio.setBounds(20, 312, 116, 16);
		contentPane.add(lblRegistrosDelNio);
		
		JLabel lblIngreseCi = new JLabel("Ingrese CI:");
		lblIngreseCi.setBounds(20, 70, 78, 16);
		contentPane.add(lblIngreseCi);
		
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
		textDocumento.setBounds(164, 67, 129, 22);
		contentPane.add(textDocumento);
		textDocumento.setColumns(10);
		
		JButton btnBuscar = new JButton("BUSCAR");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ci = Integer.parseInt(textDocumento.getText());
				try {
					Niño n1 = niños.getNiño(ci);
					n1.toString();
				} catch (ExisteNinioException e1) {
				
					JOptionPane.showMessageDialog(null, e1.getMensaje());
				}
			}
		});
		btnBuscar.setBounds(305, 66, 97, 25);
		contentPane.add(btnBuscar);
	}
}
