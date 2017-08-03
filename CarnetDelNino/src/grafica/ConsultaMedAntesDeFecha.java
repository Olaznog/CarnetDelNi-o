package grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.JButton;
import com.toedter.calendar.JCalendar;

import logica.ColeccionNiños;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.awt.event.ActionEvent;

public class ConsultaMedAntesDeFecha extends JFrame {
	private ColeccionNiños niños;
	private JCalendar calendar;
	private JPanel contentPane;
    private VentanaMenu Menu;
	
    public ConsultaMedAntesDeFecha(ColeccionNiños n, VentanaMenu menu) {
		this.niños = n;
		this.Menu = menu;
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 411, 361);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblConsultasMdicasPor = new JLabel("CONSULTAS M\u00C9DICAS POR FECHA");
		lblConsultasMdicasPor.setBounds(94, 13, 221, 14);
		contentPane.add(lblConsultasMdicasPor);
		
		JLabel lblIngreseFecha = new JLabel("Ingrese Fecha:");
		lblIngreseFecha.setBounds(12, 65, 87, 14);
		contentPane.add(lblIngreseFecha);
		
		//ACÁ INVOCAMOS EL MÉTODO DE LA CLASE COLECCIÓN NIÑOS
		JButton btnBuscar = new JButton("BUSCAR");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Calendar fecha = calendar.getCalendar();
				int cantidad = niños.cuantasConsultasAntesDe(fecha);
				JOptionPane.showMessageDialog(null, "La cantidad de consultas es: "+cantidad);
				dispose();
			}
		});
		btnBuscar.setBounds(108, 274, 89, 23);
		contentPane.add(btnBuscar);
		
		JButton btnVolver = new JButton("VOLVER");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu.setVisible(true);
				dispose();
			}
		});
		btnVolver.setBounds(231, 274, 89, 23);
		contentPane.add(btnVolver);
		
	    calendar = new JCalendar();
		calendar.setBounds(109, 70, 184, 153);
		contentPane.add(calendar);
	}
}
