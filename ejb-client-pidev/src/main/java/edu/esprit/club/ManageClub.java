package edu.esprit.club;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ManageClub extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManageClub frame = new ManageClub();
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
	public ManageClub() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 784, 504);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JButton btnNewButton = new JButton("Add Club");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AddClub c=new AddClub();
				c.setVisible(true);
				ManageClub.this.setVisible(false);

			}
		});

		JButton btnUpdateClub = new JButton("Update Club");

		JButton btnFindClub = new JButton("Find Club");

		JButton btnDeleteClub = new JButton("Delete Club");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING).addGroup(gl_contentPane
				.createSequentialGroup()
				.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup().addGap(117)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(btnUpdateClub, GroupLayout.PREFERRED_SIZE, 415,
												GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 415, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnDeleteClub, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 415,
										GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup().addGap(109).addComponent(btnFindClub,
								GroupLayout.PREFERRED_SIZE, 415, GroupLayout.PREFERRED_SIZE)))
				.addContainerGap(224, Short.MAX_VALUE)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup().addComponent(btnNewButton).addGap(53)
						.addComponent(btnUpdateClub).addGap(42).addComponent(btnFindClub).addGap(45)
						.addComponent(btnDeleteClub).addContainerGap(207, Short.MAX_VALUE)));
		contentPane.setLayout(gl_contentPane);
	}

}
