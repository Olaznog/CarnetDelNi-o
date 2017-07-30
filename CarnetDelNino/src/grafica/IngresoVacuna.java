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
import com.toedter.calendar.JCalendar;

import excepciones.ExisteNinioException;
import excepciones.hayLugarException;
import logica.ColeccionNiños;
import logica.Consulta;
import logica.Registro;
import logica.Vacuna;

import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class IngresoVacuna extends JFrame {
	private ColeccionNiños niños;
    private VentanaMenu Menu;
	private JPanel contentPane;
	private JTextField textNombreVac;
	private JTextField textDosis;
	private JTextField textComentario;
	private JRadioButton rdbtnObliSi;
	private JRadioButton rdbtnObliNo;
	private JCalendar  fechaVac;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField textDocumento;

	public IngresoVacuna(ColeccionNiños n, VentanaMenu menu) {
		this.niños = n;
		this.Menu = menu;
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 450, 526);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIngresoVacuna = new JLabel("INGRESO VACUNA");
		lblIngresoVacuna.setBounds(149, 11, 133, 14);
		contentPane.add(lblIngresoVacuna);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 69, 46, 14);
		contentPane.add(lblNombre);
		
		textNombreVac = new JTextField();
		textNombreVac.addKeyListener(new KeyAdapter() {
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
		textNombreVac.setBounds(112, 67, 124, 17);
		contentPane.add(textNombreVac);
		textNombreVac.setColumns(10);
		
		JLabel lblDsis = new JLabel("Dosis:");
		lblDsis.setBounds(10, 125, 46, 14);
		contentPane.add(lblDsis);
		
		textDosis = new JTextField();
		textDosis.setBounds(112, 123, 124, 17);
		contentPane.add(textDosis);
		textDosis.setColumns(10);
		
		JLabel lblObligatoria = new JLabel("Obligatoria:");
		lblObligatoria.setBounds(10, 150, 78, 14);
		contentPane.add(lblObligatoria);
		
		JLabel lblFecha = new JLabel("Fecha:");
		lblFecha.setBounds(10, 190, 46, 14);
		contentPane.add(lblFecha);
		
		JLabel lblNewLabel = new JLabel("Comentario:");
		lblNewLabel.setBounds(10, 387, 78, 14);
		contentPane.add(lblNewLabel);
		
		textComentario = new JTextField();
		textComentario.setBounds(109, 388, 218, 60);
		contentPane.add(textComentario);
		textComentario.setColumns(10);
		
		JButton btnIngresar = new JButton("INGRESAR");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//Tomar datos ingresados por el usuario
				int documento = Integer.parseInt(textDocumento.getText());
				String nomVac = textNombreVac.getText();
				 int dosis = Integer.parseInt(textDosis.getText()); 
				 boolean obligatoria;
					if(rdbtnObliSi.isSelected())
						obligatoria = true;
					else
						obligatoria = false;
				Calendar fechaVac = Calendar.getInstance();
				String comentarioVac = textComentario.getText();
				Registro v = new Vacuna(fechaVac,comentarioVac,nomVac,dosis,obligatoria);
				try {
					niños.altaRegistro(v, documento);
					JOptionPane.showMessageDialog(null, "Se ingreso la vacuna del niño");
					dispose();
				} catch (ExisteNinioException e) {
					JOptionPane.showMessageDialog(null, e.getMensaje());
				} catch (hayLugarException e) {
					JOptionPane.showMessageDialog(null, e.getMensaje());
				}
			}
		});
		btnIngresar.setBounds(112, 470, 96, 23);
		contentPane.add(btnIngresar);
		
		JButton btnVolver = new JButton("VOLVER");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Menu.setVisible(true);
				dispose();
			}
		});
		btnVolver.setBounds(218, 470, 96, 23);
		contentPane.add(btnVolver);
		
		JCalendar calendar = new JCalendar();
		calendar.setBounds(112, 190, 184, 153);
		contentPane.add(calendar);
		
		JRadioButton rdbtnObliSi = new JRadioButton("Si");
		buttonGroup.add(rdbtnObliSi);
		rdbtnObliSi.setBounds(112, 146, 53, 23);
		contentPane.add(rdbtnObliSi);
		
		JRadioButton rdbtnObliNo = new JRadioButton("No");
		buttonGroup.add(rdbtnObliNo);
		rdbtnObliNo.setBounds(179, 146, 46, 23);
		contentPane.add(rdbtnObliNo);
		
		textDocumento = new JTextField();
		textDocumento.setColumns(10);
		textDocumento.setBounds(112, 95, 124, 17);
		contentPane.add(textDocumento);
		
		JLabel label = new JLabel("Cedula:");
		label.setBounds(10, 98, 56, 16);
		contentPane.add(label);
	}
}
