package edu.esprit.gui.authentification;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import edu.esprit.service.AdminServiceRemote;


public class Authentificate extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField login;
	private JPasswordField pwd;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Authentificate frame = new Authentificate();
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
	public Authentificate() {
		setBackground(new Color(204, 102, 153));
		
		setTitle("Tunisian Tennis Federation");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblLogin = new JLabel("Identifiant");
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLogin.setForeground(SystemColor.desktop);
		lblLogin.setBounds(70, 134, 97, 20);
		getContentPane().add(lblLogin);
		
		JLabel lblPwd = new JLabel(" Password");
		lblPwd.setForeground(SystemColor.desktop);
		lblPwd.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPwd.setBounds(63, 166, 105, 23);
		getContentPane().add(lblPwd);
		
		login = new JTextField();
		login.setBounds(170, 133, 114, 20);
		getContentPane().add(login);
		login.setColumns(10);
		
		pwd = new JPasswordField();
		pwd.setBounds(171, 167, 114, 20);
		getContentPane().add(pwd);
		
		JButton btn = new JButton("Connexion");
		btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				System.out.println(login.getText().toString());
				System.out.println(pwd.getText().toString());
				Context ctx1 = null;
				try {
					ctx1 = new InitialContext();
				} catch (NamingException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				AdminServiceRemote proxy = null;
				try {
					proxy = (AdminServiceRemote) ctx1
							.lookup("/ejb-pidev/AdminService!edu.esprit.service.AdminServiceRemote");
				} catch (NamingException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} 

				if(proxy.authentificate(login.getText().toString(),pwd.getText().toString())!=null)
				{		System.out.println("okk");	
					new HomePage().setVisible(true);
				
					setVisible(false);
				}
				else 
					
					System.out.println("MOT de passe ");
				}
			
		});
		btn.setBounds(175, 216, 109, 20);
		getContentPane().add(btn);
		
		JLabel lblAuthentification = new JLabel("Tunisian Tennis Federation");
		lblAuthentification.setForeground(SystemColor.textHighlight);
		lblAuthentification.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblAuthentification.setBounds(119, 38, 196, 38);
		getContentPane().add(lblAuthentification);
		
		JLabel lblAdministration = new JLabel("Administration");
		lblAdministration.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAdministration.setForeground(SystemColor.textHighlight);
		lblAdministration.setBackground(SystemColor.textHighlight);
		lblAdministration.setBounds(169, 73, 94, 23);
		getContentPane().add(lblAdministration);
		
		
	}
	
	
}
