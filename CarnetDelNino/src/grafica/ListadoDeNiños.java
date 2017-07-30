package grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logica.ColeccionNi�os;
import logica.Ni�o;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JList;

public class ListadoDeNi�os extends JFrame {
	private ColeccionNi�os ni�os;
	private JPanel contentPane;
	private VentanaMenu Menu;
	private JList list;
	
	public ListadoDeNi�os(ColeccionNi�os n, VentanaMenu menu) {
		this.ni�os = n;
		this.Menu = menu;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 412);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnVolver = new JButton("VOLVER");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu.setVisible(true);
				dispose();
			}
		});
		btnVolver.setBounds(165, 327, 97, 25);
		contentPane.add(btnVolver);
		//comentario
	}
}
