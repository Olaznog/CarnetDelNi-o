package grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logica.ColeccionNiños;
import logica.Niño;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Vector;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;

public class ListadoDeNiños extends JFrame {
	private ColeccionNiños niños;
	private JPanel contentPane;
	private VentanaMenu Menu;
	private JList list;
	private JList list_ninos;
	
	public ListadoDeNiños(ColeccionNiños n, VentanaMenu menu) {
		this.niños = n;
		this.Menu = menu;
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		dispose();
		setBounds(100, 100, 450, 332);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnVolver = new JButton("VOLVER");
		btnVolver.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu.setVisible(true);
				dispose();
			}
		});
		
		JScrollPane scrollPane_1 = new JScrollPane();
		
		JLabel lblListadoDeTodos = new JLabel("Listado de Todos los Ni\u00F1os");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(scrollPane_1, GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
								.addContainerGap())
							.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
								.addComponent(btnVolver, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE)
								.addGap(162)))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(lblListadoDeTodos, GroupLayout.PREFERRED_SIZE, 153, GroupLayout.PREFERRED_SIZE)
							.addGap(129))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblListadoDeTodos, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)
					.addGap(28)
					.addComponent(scrollPane_1, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(btnVolver, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(7))
		);
		

		list_ninos = new JList();
		scrollPane_1.setViewportView(list_ninos);
		
		//cargo lista con niños
		DefaultListModel listModel = new DefaultListModel();
		for(int x = 0; x < n.listarNiños().length ; x = x + 1) {
			listModel.addElement(n.listarNiños()[x]);
	      }
		
		list_ninos.setModel(listModel);
		contentPane.setLayout(gl_contentPane);
		//comentarios
		
	
		

	}
}
