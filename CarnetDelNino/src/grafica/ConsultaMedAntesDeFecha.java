package grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JButton;
import com.toedter.calendar.JCalendar;

import logica.ColeccionNiños;

public class ConsultaMedAntesDeFecha extends JFrame {
	private ColeccionNiños niños;

	private JPanel contentPane;
	private JTextField textCantConsultas;

	
	public ConsultaMedAntesDeFecha(ColeccionNiños n) {
		this.niños = n;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 411, 361);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblConsultasMdicasPor = new JLabel("CONSULTAS M\u00C9DICAS POR FECHA");
		lblConsultasMdicasPor.setBounds(117, 11, 194, 14);
		contentPane.add(lblConsultasMdicasPor);
		
		JLabel lblIngreseFecha = new JLabel("Ingrese Fecha:");
		lblIngreseFecha.setBounds(10, 49, 87, 14);
		contentPane.add(lblIngreseFecha);
		
		JButton btnBuscar = new JButton("BUSCAR");
		btnBuscar.setBounds(195, 273, 89, 23);
		contentPane.add(btnBuscar);
		
		JButton btnVolver = new JButton("VOLVER");
		btnVolver.setBounds(294, 273, 89, 23);
		contentPane.add(btnVolver);
		
		JCalendar calendar = new JCalendar();
		calendar.setBounds(94, 47, 184, 153);
		contentPane.add(calendar);
		
		JLabel lblNewLabel = new JLabel("Cantidad de Consultas:");
		lblNewLabel.setBounds(10, 228, 117, 14);
		contentPane.add(lblNewLabel);
		
		textCantConsultas = new JTextField();
		textCantConsultas.setBounds(149, 225, 86, 20);
		contentPane.add(textCantConsultas);
		textCantConsultas.setColumns(10);
	}
}
