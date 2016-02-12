package edu.esprit.delegate;

import edu.esprit.locator.ServiceLocator;
import edu.esprit.persistance.Admin;
import edu.esprit.service.AdminServiceRemote;

public class AdminServicedelegate {
	private final static String jndiName = "/ejb-pidev/AdminService!edu.esprit.service.AdminServiceRemote";

	private static AdminServiceRemote getProxy() {
		return (AdminServiceRemote) ServiceLocator.getInstance().getProxy(
				jndiName);

	}
	public static Admin authentificate(String login, String password) {

		return getProxy().authentificate(login, password);
	}


}
