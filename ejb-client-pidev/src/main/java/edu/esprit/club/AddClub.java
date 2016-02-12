package edu.esprit.club;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import edu.esprit.persistance.Club;
import edu.esprit.service.ManageClubRemote;

public class AddClub extends JFrame {

	private JPanel contentPane;
	private JTextField club_name;
	private JTextField nbr_player;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AddClub frame = new AddClub();
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
	public AddClub() {
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
				Club c = new Club();
				c.setName(club_name.getText());
				c.setNumberPlayer(nbr_player.getText());

				try {
					ctx1 = new InitialContext();
				} catch (NamingException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				ManageClubRemote proxy = null;
				try {
					proxy = (ManageClubRemote) ctx1.lookup("/ejb-pidev/ManageClub!edu.esprit.service.ManageClubRemote");
					proxy.addClub(c);

				} catch (NamingException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				// if (proxy.addClub(club_name.getText(), nbr_player.getText()
				// != null)) {
				// System.out.println("okk");
				// setVisible(false);
				// } else {
				// System.out.println("s");
				//
				// }
			}
		});

		club_name = new JTextField();
		club_name.setColumns(10);

		JLabel lblClubName = new JLabel("Club Name");

		nbr_player = new JTextField();
		nbr_player.setColumns(10);

		JLabel lblNumberOfPlayer = new JLabel("Number of player");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel.createSequentialGroup().addGap(221).addComponent(btnNewButton,
										GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panel.createSequentialGroup()
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(
										gl_panel.createSequentialGroup().addContainerGap().addComponent(lblClubName))
								.addGroup(gl_panel.createSequentialGroup().addGap(24).addComponent(lblNumberOfPlayer)))
								.addGap(8)
								.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
										.addComponent(nbr_player, GroupLayout.PREFERRED_SIZE, 116,
												GroupLayout.PREFERRED_SIZE)
										.addComponent(club_name, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE))))
						.addContainerGap(241, Short.MAX_VALUE)));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup().addGap(62)
						.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
								.addComponent(club_name, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
										GroupLayout.PREFERRED_SIZE)
								.addComponent(lblClubName))
				.addGap(43)
				.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(nbr_player, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNumberOfPlayer)).addGap(48).addComponent(btnNewButton)
				.addContainerGap(60, Short.MAX_VALUE)));
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
	}
}
