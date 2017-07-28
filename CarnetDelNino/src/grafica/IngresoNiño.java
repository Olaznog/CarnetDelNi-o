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
import logica.ColeccionNi�os;
import logica.Ni�o;

import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class IngresoNi�o extends JFrame {
	private ColeccionNi�os ni�os;

	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textDocumento;
	private JCalendar  calendar;
	private JTextField textMedCabecera;
	private JTextField textServicioMedico;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JRadioButton rdbtnTieneFSi_1;
	private JRadioButton rdbtnTieneFNo_1;

	public IngresoNi�o(ColeccionNi�os n) {
		setUndecorated(true);
		this.ni�os = n;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 523);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 70, 70, 20);
		contentPane.add(lblNombre);
		
		JLabel lblDocumento = new JLabel("Documento:");
		lblDocumento.setBounds(10, 101, 70, 20);
		contentPane.add(lblDocumento);
		
		JLabel lblFechaNac = new JLabel("Fecha de Nacimiento:");
		lblFechaNac.setBounds(10, 135, 116, 14);
		contentPane.add(lblFechaNac);
		
		JLabel lblSerMed = new JLabel("Servicio M\u00E9dico:");
		lblSerMed.setBounds(10, 311, 103, 20);
		contentPane.add(lblSerMed);
		
		JLabel lblMedCabecera = new JLabel("M\u00E9dico Cabecera:");
		lblMedCabecera.setBounds(10, 342, 103, 20);
		contentPane.add(lblMedCabecera);
		
		JLabel lblTieneFonasa = new JLabel("Tiene Fonasa:");
		lblTieneFonasa.setBounds(10, 373, 103, 20);
		contentPane.add(lblTieneFonasa);
		
		textNombre = new JTextField();
		textNombre.setBounds(186, 70, 86, 20);
		contentPane.add(textNombre);
		textNombre.setColumns(10);
		
		textDocumento = new JTextField();
		textDocumento.setBounds(186, 101, 86, 20);
		contentPane.add(textDocumento);
		textDocumento.setColumns(10);
		
		textMedCabecera = new JTextField();
		textMedCabecera.setBounds(186, 342, 86, 20);
		contentPane.add(textMedCabecera);
		textMedCabecera.setColumns(10);
		
		JButton btnIngresar = new JButton("INGRESAR");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Tomar datos ingresados por el usuario
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
				Ni�o n = new Ni�o(nombre, documento, fechaNac, servicioMedico, medicoCabecera, tieneFonasa);
				//ColeccionNi�os coleccion = new ColeccionNi�os();
				try {
					ni�os.altaNi�o(n);
					JOptionPane.showMessageDialog(null, "Se ingreso el ni�o ");
					dispose();
				} catch (ExisteNinioException e) {
					JOptionPane.showMessageDialog(null, e.getMensaje());
				} catch (hayLugarException e) {
					JOptionPane.showMessageDialog(null, e.getMensaje());
				}
			}
		});
		btnIngresar.setBounds(186, 450, 110, 23);
		contentPane.add(btnIngresar);
		
		JButton btnVolver = new JButton("VOLVER");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				VentanaMenu Menu = new VentanaMenu(n);
				Menu.setVisible(true);
				dispose();
			}
		});
		btnVolver.setBounds(316, 450, 108, 23);
		contentPane.add(btnVolver);
		
		JLabel lblIngresoNio = new JLabel("INGRESO NI\u00D1O");
		lblIngresoNio.setBounds(161, 0, 123, 44);
		contentPane.add(lblIngresoNio);
		
		JCalendar calendar = new JCalendar();
		calendar.setBounds(181, 135, 184, 153);
		contentPane.add(calendar);
		
		rdbtnTieneFSi_1 = new JRadioButton("Si");
		buttonGroup.add(rdbtnTieneFSi_1);
		rdbtnTieneFSi_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		rdbtnTieneFSi_1.setBounds(186, 372, 49, 23);
		contentPane.add(rdbtnTieneFSi_1);
		
		rdbtnTieneFNo_1 = new JRadioButton("No");
		buttonGroup.add(rdbtnTieneFNo_1);
		rdbtnTieneFNo_1.setBounds(251, 372, 67, 23);
		contentPane.add(rdbtnTieneFNo_1);
		
		textServicioMedico = new JTextField();
		textServicioMedico.setBounds(186, 311, 86, 20);
		contentPane.add(textServicioMedico);
		textServicioMedico.setColumns(10);
	}
}
