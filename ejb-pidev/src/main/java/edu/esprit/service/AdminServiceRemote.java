package edu.esprit.service;

import javax.ejb.Remote;

import edu.esprit.persistance.Admin;

@Remote
public interface AdminServiceRemote {

	public Boolean saveAdmin(Admin a) ;
	public Admin addAdmin(Admin a);
	public Admin authentificate(String login,String pwd);

}
