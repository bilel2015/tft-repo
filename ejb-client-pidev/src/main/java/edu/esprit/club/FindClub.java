package edu.esprit.club;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UIManager;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import edu.esprit.delegate.ClubServiceDelegate;
import edu.esprit.persistance.Club;
import edu.esprit.service.ManageClubRemote;

public class FindClub extends JFrame {

	private JPanel contentPane;
	private JTable table;

	private JPanel panel_1;
	private JTextField club_name;
	List<Club> listclubs;
	Club c = new Club();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FindClub frame = new FindClub();
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
	public FindClub() {
		setTitle("Manage Club");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 794, 451);
		contentPane = new JPanel();
		contentPane.setBorder(new TitledBorder(null, "Club List", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		setContentPane(contentPane);

		JPanel panel = new JPanel();

		panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Update & Delete Club",
				TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addComponent(panel, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE)
				.addGroup(gl_contentPane.createSequentialGroup().addGap(12)
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE).addGap(12)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 211, GroupLayout.PREFERRED_SIZE).addGap(18)
						.addComponent(panel_1, GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE).addContainerGap()));

		JLabel lblName = new JLabel("Name");

		club_name = new JTextField();
		club_name.setColumns(10);

		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Context ctx1 = null;
				Club c = new Club();
				c.getName();
				try {
					ctx1 = new InitialContext();
				} catch (NamingException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				ManageClubRemote proxy = null;
				try {
					proxy = (ManageClubRemote) ctx1.lookup("/ejb-pidev/ManageClub!edu.esprit.service.ManageClubRemote");
					proxy.updateClub(c);

				} catch (NamingException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}

		});

		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (ClubServiceDelegate.delete(c)) {
					System.out.println("delete");
				}
				listclubs = ClubServiceDelegate.listofClub();
			}
		});

		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ManageClub c = new ManageClub();
				c.setVisible(true);
				FindClub.this.setVisible(false);
			}
		});
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1
				.setHorizontalGroup(
						gl_panel_1.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_panel_1.createSequentialGroup().addContainerGap().addComponent(lblName)
										.addGap(18)
										.addGroup(gl_panel_1.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_panel_1.createSequentialGroup().addComponent(btnUpdate)
														.addGap(18)
														.addComponent(btnDelete, GroupLayout.PREFERRED_SIZE, 73,
																GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(ComponentPlacement.RELATED, 403, Short.MAX_VALUE)
										.addComponent(btnBack, GroupLayout.PREFERRED_SIZE, 73,
												GroupLayout.PREFERRED_SIZE).addGap(25))
						.addGroup(gl_panel_1
								.createSequentialGroup().addComponent(club_name, GroupLayout.PREFERRED_SIZE,
										GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addContainerGap(549, Short.MAX_VALUE)))));
		gl_panel_1.setVerticalGroup(gl_panel_1.createParallelGroup(Alignment.LEADING).addGroup(gl_panel_1
				.createSequentialGroup().addContainerGap()
				.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE).addComponent(lblName).addComponent(
						club_name, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
				.addGap(18).addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE).addComponent(btnUpdate)
						.addComponent(btnDelete).addComponent(btnBack))
				.addContainerGap(34, Short.MAX_VALUE)));
		panel_1.setLayout(gl_panel_1);

		JScrollPane scrollPane = new JScrollPane();
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(
				gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup().addContainerGap()
								.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 742, Short.MAX_VALUE)
								.addContainerGap()));
		gl_panel.setVerticalGroup(
				gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup().addContainerGap()
								.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
								.addContainerGap()));

		table = new JTable();
		table.setModel(new DefaultTableModel(new Object[][] {

		}, new String[] { "id Club", "Name Club", "Number of player", "year founded", "Address" }));

		scrollPane.setViewportView(table);
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int row = table.rowAtPoint(e.getPoint());
				c = listclubs.get(table.getSelectedRow());
			}

			public void mousePressed(MouseEvent e) {

			}
		});
	}
}
