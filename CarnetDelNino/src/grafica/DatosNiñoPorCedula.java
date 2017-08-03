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
import sun.util.resources.cldr.fo.CalendarData_fo_FO;

import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JTextArea;
import com.toedter.components.JSpinField;
import com.toedter.calendar.JDateChooser;
import javax.swing.JScrollPane;

public class DatosNiñoPorCedula extends JFrame {
	private ColeccionNiños niños;
	private VentanaMenu Menu;
	private JPanel contentPane;
	private JTextField textDocumento;
	private JTextField textField;
	private JTextField textFec;
	private JTextField textSer;
	private JTextField textMed;
	private JTextField textTieneFon;

	
	public DatosNiñoPorCedula(ColeccionNiños n, VentanaMenu menu) {
		this.niños = n;
		this.Menu = menu;
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 457);
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
		
		JLabel lblFechaNac = new JLabel("Fecha de Nacimiento:");
		lblFechaNac.setBounds(20, 132, 144, 14);
		contentPane.add(lblFechaNac);
		
		JLabel lblSerMed = new JLabel("Servicio M\u00E9dico:");
		lblSerMed.setBounds(20, 159, 103, 20);
		contentPane.add(lblSerMed);
		
		JLabel lblMedCabecera = new JLabel("M\u00E9dico Cabecera:");
		lblMedCabecera.setBounds(20, 192, 103, 20);
		contentPane.add(lblMedCabecera);
		
		JLabel lblTieneFonasa = new JLabel("Tiene Fonasa:");
		lblTieneFonasa.setBounds(20, 225, 103, 20);
		contentPane.add(lblTieneFonasa);
		
		JButton btnVolver = new JButton("VOLVER");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu.setVisible(true);
				dispose();
			}
		});
		btnVolver.setBounds(165, 370, 89, 23);
		contentPane.add(btnVolver);
		
		JLabel lblRegistrosDelNio = new JLabel("Registros del ni\u00F1o:");
		lblRegistrosDelNio.setBounds(20, 258, 116, 16);
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
		textDocumento.setBounds(164, 67, 131, 22);
		contentPane.add(textDocumento);
		textDocumento.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 280, 404, 79);
		contentPane.add(scrollPane);
		
		JList listaRegistros = new JList();
		scrollPane.setViewportView(listaRegistros);
		
		//ACÁ UTILIZAMOS EL MÉTODO GETNIÑO() CON LA CI COMO PARÁMETRO.
		JButton btnBuscar = new JButton("BUSCAR");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if(!textDocumento.getText().isEmpty()){
				int ci = Integer.parseInt(textDocumento.getText());
				    if(niños.existeNinio(ci) == true){
					Niño n1 = niños.getNiño(ci);
					textField.setText(n1.getNombre());
					Calendar fec = n1.getFechaNacimiento();
					SimpleDateFormat myDateFormat = new SimpleDateFormat("dd/MM/yyyy"); 
					String formattedDate = myDateFormat.format(fec.getTime());
					textFec.setText(formattedDate);
					textSer.setText(n1.getServicioMedico());
					textMed.setText(n1.getMedicoCabecera());
					String tf = String.valueOf(n1.isTieneFonasa());
					textTieneFon.setText(tf);
					
					//cargo lista con ninos
					DefaultListModel listModel = new DefaultListModel();
					for(int x = 0; x < n1.getRegistros().length ; x = x + 1) {
						if(n1.getRegistros()[x] != null){
						    listModel.addElement(n1.getRegistros()[x].toString());
						}
				      }
					listaRegistros.setModel(listModel);		
				    }else {
						JOptionPane.showMessageDialog(null, "No existe un niño con esa cedula");
				    }
				    }else {
				    	JOptionPane.showMessageDialog(null, "Debe ingresar una cedula");
				    }
				} catch (ExisteNinioException e1) {
				
					JOptionPane.showMessageDialog(null, e1.getMensaje());
				}
				
			}
			
		});
		btnBuscar.setBounds(305, 66, 97, 25);
		contentPane.add(btnBuscar);
		
		textField = new JTextField();
		textField.setBounds(164, 98, 131, 22);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textFec = new JTextField();
		textFec.setBounds(164, 128, 131, 22);
		contentPane.add(textFec);
		textFec.setColumns(10);
		
		textSer = new JTextField();
		textSer.setBounds(164, 158, 131, 22);
		contentPane.add(textSer);
		textSer.setColumns(10);
		
		textMed = new JTextField();
		textMed.setBounds(164, 192, 131, 22);
		contentPane.add(textMed);
		textMed.setColumns(10);
		
		textTieneFon = new JTextField();
		textTieneFon.setBounds(164, 224, 131, 22);
		contentPane.add(textTieneFon);
		textTieneFon.setColumns(10);
		
	}
	
}
