package grafica;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.util.Calendar;
import java.awt.event.ActionEvent;

import com.toedter.calendar.JCalendar;

import excepciones.ExisteNinioException;
import excepciones.hayLugarException;
import logica.ColeccionNi�os;
import logica.Consulta;
import logica.Control;
import logica.Ni�o;
import logica.Registro;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


public class IngresoConsulta extends JFrame {
	private ColeccionNi�os ni�os;
	private VentanaMenu Menu;
	private JPanel contentPane;
	private JTextField textNombreMed;
	private JTextField textDiagnostico;
	private JTextField textRecomenda;
	private JTextField textComentario;
	private JCalendar  fechaCon;
	private JTextField textDocumento;

	
	public IngresoConsulta(ColeccionNi�os n, VentanaMenu menu) {
		this.ni�os = n;
		this.Menu = menu;
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 498);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		textNombreMed = new JTextField();
		textNombreMed.setBounds(158, 42, 203, 20);
		textNombreMed.addKeyListener(new KeyAdapter() {
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
		contentPane.setLayout(null);
		contentPane.add(textNombreMed);
		textNombreMed.setColumns(10);
		
		JLabel lblNomMed = new JLabel("Nombre del M\u00E9dico:");
		lblNomMed.setBounds(23, 45, 131, 14);
		contentPane.add(lblNomMed);
		
		JLabel lblDiagnstico = new JLabel("Diagn\u00F3stico:");
		lblDiagnstico.setBounds(23, 80, 91, 14);
		contentPane.add(lblDiagnstico);
		
		textDiagnostico = new JTextField();
		textDiagnostico.setBounds(158, 77, 203, 28);
		textDiagnostico.addKeyListener(new KeyAdapter() {
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
		contentPane.add(textDiagnostico);
		textDiagnostico.setColumns(10);
		
		JLabel lblReomendaciones = new JLabel("Recomendaciones:");
		lblReomendaciones.setBounds(23, 123, 109, 14);
		contentPane.add(lblReomendaciones);
		
		textRecomenda = new JTextField();
		textRecomenda.setBounds(158, 120, 203, 28);
		contentPane.add(textRecomenda);
		textRecomenda.setColumns(10);
		
		JLabel lblFechaCons = new JLabel("Fecha:");
		lblFechaCons.setBounds(23, 162, 46, 14);
		contentPane.add(lblFechaCons);
		
		JLabel lblComentario = new JLabel("Comentario:");
		lblComentario.setBounds(23, 367, 91, 14);
		contentPane.add(lblComentario);
		
		textComentario = new JTextField();
		textComentario.setBounds(158, 360, 203, 20);
		contentPane.add(textComentario);
		textComentario.setColumns(10);
		
		JLabel lblIngresoConsulta = new JLabel("INGRESO CONSULTA");
		lblIngresoConsulta.setBounds(146, 11, 151, 14);
		contentPane.add(lblIngresoConsulta);
		
		//AC� UTILIZAMOS EL M�TODO ALTAREGISTRO()
		JButton btnIngresar = new JButton("INGRESAR");
		btnIngresar.setBounds(132, 406, 109, 23);

		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Tomar datos ingresados por el usuario
				try {
					if(!textDocumento.getText().isEmpty()){
				int documento = Integer.parseInt(textDocumento.getText());
				String nomMed = textNombreMed.getText();
				String diagnostico = textDiagnostico.getText();
				String recomendaciones = textRecomenda.getText();
				Calendar calendar = fechaCon.getCalendar();
				String comentario = textComentario.getText();
				Registro cons = new Consulta(calendar,comentario,nomMed,diagnostico,recomendaciones);
				
				if(nomMed.isEmpty() || diagnostico.isEmpty() || recomendaciones.isEmpty()){
					JOptionPane.showMessageDialog(null, "Debe llenar todos los campos ");
				}else {
					ni�os.altaRegistro(cons, documento);
					JOptionPane.showMessageDialog(null, "Se ingreso la consulta del ni�o");
					dispose();
				}	
				}else {
					JOptionPane.showMessageDialog(null, "Debe llenar la cedula ");	
				}
				} catch (ExisteNinioException e1) {
					JOptionPane.showMessageDialog(null, e1.getMensaje());
				} catch (hayLugarException e1) {
					JOptionPane.showMessageDialog(null, e1.getMensaje());
				}
				
			}
		});

		contentPane.add(btnIngresar);
		
		JButton btnVolver = new JButton("VOLVER");
		btnVolver.setBounds(259, 406, 116, 23);
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Menu.setVisible(true);
				dispose();
			}
		});
		contentPane.add(btnVolver);
		
		fechaCon = new JCalendar();
		fechaCon.setBounds(158, 159, 184, 153);
		contentPane.add(fechaCon);
		
		JLabel lblCedula = new JLabel("C\u00E9dula:");
		lblCedula.setBounds(23, 331, 56, 16);
		contentPane.add(lblCedula);
		
		textDocumento = new JTextField();
		textDocumento.setBounds(158, 333, 116, 20);
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
		contentPane.add(textDocumento);
		textDocumento.setColumns(10);
	}
}
