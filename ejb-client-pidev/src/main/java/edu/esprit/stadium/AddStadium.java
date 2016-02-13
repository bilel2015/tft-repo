package edu.esprit.stadium;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import edu.esprit.persistance.Stadium;
import edu.esprit.persistance.Player;
import edu.esprit.persistance.Stadium;
import edu.esprit.service.ManageStadiumRemote;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;

public class AddStadium extends JFrame {

	private JPanel contentPane;
	private JTextField stadiumName;
	private JTextField cap;
	private JTextField plc;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddStadium frame = new AddStadium();
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
	public AddStadium() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 638, 408);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane
				.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(20)
								.addComponent(panel, GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
								.addContainerGap()));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addGap(21)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 282, GroupLayout.PREFERRED_SIZE)
						.addContainerGap(48, Short.MAX_VALUE)));

		JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Context ctx1 = null;
				Stadium s = new Stadium();
				s.setName(stadiumName.getText());
				s.setCapacity(Integer.valueOf(cap.getText()));
				s.setPlace(plc.getText());

				try {
					ctx1 = new InitialContext();
				} catch (NamingException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				ManageStadiumRemote proxy = null;
				try {
					proxy = (ManageStadiumRemote) ctx1
							.lookup("/ejb-pidev/ManageStadium!edu.esprit.service.ManageStadiumRemote");
					proxy.addStadium(s);

				} catch (NamingException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		stadiumName = new JTextField();
		stadiumName.setColumns(10);

		JLabel lblStadiumName = new JLabel("Name stadium");

		cap = new JTextField();
		cap.setColumns(10);

		plc = new JTextField();
		plc.setColumns(10);

		JLabel lblCapacity = new JLabel("Capacity");

		JLabel lblPlace = new JLabel("Place");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup().addGap(221).addComponent(btnNewButton,
										GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup().addContainerGap()
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING).addComponent(lblStadiumName)
										.addComponent(lblCapacity, GroupLayout.PREFERRED_SIZE, 67,
												GroupLayout.PREFERRED_SIZE)
								.addComponent(lblPlace, GroupLayout.PREFERRED_SIZE, 67, GroupLayout.PREFERRED_SIZE))
								.addGap(57)
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(cap, GroupLayout.PREFERRED_SIZE, 86, GroupLayout.PREFERRED_SIZE)
										.addComponent(stadiumName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(plc, GroupLayout.PREFERRED_SIZE, 86,
												GroupLayout.PREFERRED_SIZE))))
						.addContainerGap(245, Short.MAX_VALUE)));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addGap(62)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(stadiumName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblStadiumName))
				.addPreferredGap(ComponentPlacement.UNRELATED)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(cap, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(lblCapacity))
				.addGap(18)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(plc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPlace)).addGap(44).addComponent(btnNewButton)
				.addContainerGap(64, Short.MAX_VALUE)));
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
}
