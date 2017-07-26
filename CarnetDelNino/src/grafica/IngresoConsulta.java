package grafica;

import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.util.Calendar;
import java.awt.event.ActionEvent;

import com.toedter.calendar.JCalendar;

import logica.ColeccionNiños;
import logica.Consulta;
import logica.Control;
import logica.Niño;
import logica.Registro;


public class IngresoConsulta extends JFrame {

	private JPanel contentPane;
	private JTextField textNombreMed;
	private JTextField textDiagnostico;
	private JTextField textRecomenda;
	private JTextField textComentario;
	private JCalendar  fechaCon;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IngresoConsulta frame = new IngresoConsulta();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public IngresoConsulta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 462);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textNombreMed = new JTextField();
		textNombreMed.setBounds(158, 42, 86, 20);
		contentPane.add(textNombreMed);
		textNombreMed.setColumns(10);
		
		JLabel lblNomMed = new JLabel("Nombre del M\u00E9dico:");
		lblNomMed.setBounds(23, 45, 109, 14);
		contentPane.add(lblNomMed);
		
		JLabel lblDiagnstico = new JLabel("Diagn\u00F3stico:");
		lblDiagnstico.setBounds(23, 80, 91, 14);
		contentPane.add(lblDiagnstico);
		
		textDiagnostico = new JTextField();
		textDiagnostico.setBounds(158, 77, 203, 20);
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
		lblComentario.setBounds(23, 349, 91, 14);
		contentPane.add(lblComentario);
		
		textComentario = new JTextField();
		textComentario.setBounds(158, 342, 203, 28);
		contentPane.add(textComentario);
		textComentario.setColumns(10);
		
		JLabel lblIngresoConsulta = new JLabel("INGRESO CONSULTA");
		lblIngresoConsulta.setBounds(146, 11, 151, 14);
		contentPane.add(lblIngresoConsulta);
		
		JButton btnIngresar = new JButton("INGRESAR");

		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Tomar datos ingresados por el usuario
				String nomMed = textNombreMed.getText();
				String diagnostico = textDiagnostico.getText();
				String recomendaciones = textRecomenda.getText();
				Calendar fechaCon = Calendar.getInstance();
				String comentario = textComentario.getText();
				Consulta c = new Consulta(fechaCon,comentario,nomMed,diagnostico,recomendaciones);
				Registro registros = new Registro();
			}
		});
		btnIngresar.setBounds(158, 244, 89, 23);

		btnIngresar.setBounds(227, 389, 89, 23);

		contentPane.add(btnIngresar);
		
		JButton btnVolver = new JButton("VOLVER");
		btnVolver.setBounds(335, 389, 89, 23);
		contentPane.add(btnVolver);
		
		JCalendar calendar = new JCalendar();
		calendar.setBounds(158, 159, 184, 153);
		contentPane.add(calendar);
	}
}
