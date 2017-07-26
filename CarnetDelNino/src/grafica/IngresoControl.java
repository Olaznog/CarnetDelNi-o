package grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import com.toedter.calendar.JCalendar;

import excepciones.ExisteNinioException;
import excepciones.hayLugarException;
import logica.ColeccionNiños;
import logica.Control;
import logica.Niño;

import java.awt.event.ActionListener;
import java.util.Calendar;
import java.awt.event.ActionEvent;

public class IngresoControl extends JFrame {

	private JPanel contentPane;
	private JTextField textPeso;
	private JTextField textAltura;
	private JTextField textComentario;
	private JCalendar  fechaControl;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IngresoControl frame = new IngresoControl();
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
	public IngresoControl() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 429);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPeso = new JLabel("Peso:");
		lblPeso.setBounds(10, 58, 46, 14);
		contentPane.add(lblPeso);
		
		textPeso = new JTextField();
		textPeso.setBounds(98, 55, 86, 20);
		contentPane.add(textPeso);
		textPeso.setColumns(10);
		
		JLabel lblAltura = new JLabel("Altura:");
		lblAltura.setBounds(10, 99, 46, 14);
		contentPane.add(lblAltura);
		
		textAltura = new JTextField();
		textAltura.setBounds(98, 96, 86, 20);
		contentPane.add(textAltura);
		textAltura.setColumns(10);
		
		JLabel lblFechaControl = new JLabel("Fecha:");
		lblFechaControl.setBounds(10, 143, 46, 14);
		contentPane.add(lblFechaControl);
		
		JLabel lblComentario = new JLabel("Comentario:");
		lblComentario.setBounds(21, 316, 71, 14);
		contentPane.add(lblComentario);
		
		textComentario = new JTextField();
		textComentario.setBounds(102, 302, 261, 43);
		contentPane.add(textComentario);
		textComentario.setColumns(10);
		
		JLabel lblIngresoControl = new JLabel("INGRESO CONTROL");
		lblIngresoControl.setBounds(151, 11, 134, 14);
		contentPane.add(lblIngresoControl);
		
		JButton btnIngresar = new JButton("INGRESAR");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Tomar datos ingresados por el usuario
                int peso = Integer.parseInt(textPeso.getText());
				int altura = Integer.parseInt(textAltura.getText());
				Calendar fechaCon = Calendar.getInstance();
				String comentario = textComentario.getText();
				Control c = new Control(fechaCon,comentario,peso, altura);
				/*ColeccionNiños coleccion = new ColeccionNiños();
				try {
					coleccion.altaNiño(n);
				} catch (ExisteNinioException e) {
					e.printStackTrace();
				} catch (hayLugarException e) {
					e.printStackTrace();
				}*/
			}
		});
		btnIngresar.setBounds(196, 356, 89, 23);
		contentPane.add(btnIngresar);
		
		JButton btnVolver = new JButton("VOLVER");
		btnVolver.setBounds(314, 356, 89, 23);
		contentPane.add(btnVolver);
		
		JCalendar calendar = new JCalendar();
		calendar.setBounds(101, 138, 184, 153);
		contentPane.add(calendar);
	}
}
