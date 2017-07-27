package grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JCalendar;
import excepciones.ExisteNinioException;
import excepciones.hayLugarException;
import logica.ColeccionNiños;
import logica.Niño;

import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class IngresoNiño extends JFrame {
	private ColeccionNiños niños;

	private JPanel contentPane;
	private JTextField textNombre;
	private JTextField textDocumento;
	private JCalendar  fechaNac;
	private JTextField textMedCabecera;
	private JRadioButton rdbtnTieneFSi;
	private JRadioButton rdbtnTieneFNo;
	private JTextField textServicioMedico;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public IngresoNiño(ColeccionNiños n) {
		this.niños = n;
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
				Calendar fechaNac = Calendar.getInstance();
				String servicioMedico = textServicioMedico.getText();
				String medicoCabecera = textMedCabecera.getText();
				char tieneFonasa;
				if(rdbtnTieneFSi.isSelected())
					tieneFonasa = 'S';
				else
					tieneFonasa = 'N';
				Niño n = new Niño(nombre, documento, fechaNac, servicioMedico, medicoCabecera, tieneFonasa);
				ColeccionNiños coleccion = new ColeccionNiños();
				try {
					coleccion.altaNiño(n);
				} catch (ExisteNinioException e) {
					e.printStackTrace();
				} catch (hayLugarException e) {
					e.printStackTrace();
				}
			}
		});
		btnIngresar.setBounds(186, 450, 110, 23);
		contentPane.add(btnIngresar);
		
		JButton btnVolver = new JButton("VOLVER");
		btnVolver.setBounds(316, 450, 108, 23);
		contentPane.add(btnVolver);
		
		JLabel lblIngresoNio = new JLabel("INGRESO NI\u00D1O");
		lblIngresoNio.setBounds(161, 0, 123, 44);
		contentPane.add(lblIngresoNio);
		
		JCalendar fechaNac = new JCalendar();
		fechaNac.setBounds(181, 135, 184, 153);
		contentPane.add(fechaNac);
		
		JRadioButton rdbtnTieneFSi = new JRadioButton("Si");
		buttonGroup.add(rdbtnTieneFSi);
		rdbtnTieneFSi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		rdbtnTieneFSi.setBounds(186, 372, 49, 23);
		contentPane.add(rdbtnTieneFSi);
		
		JRadioButton rdbtnTieneFNo = new JRadioButton("No");
		buttonGroup.add(rdbtnTieneFNo);
		rdbtnTieneFNo.setBounds(251, 372, 67, 23);
		contentPane.add(rdbtnTieneFNo);
		
		textServicioMedico = new JTextField();
		textServicioMedico.setBounds(186, 311, 86, 20);
		contentPane.add(textServicioMedico);
		textServicioMedico.setColumns(10);
	}
}
