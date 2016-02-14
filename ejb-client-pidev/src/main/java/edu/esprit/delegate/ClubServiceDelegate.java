package edu.esprit.delegate;

import java.util.List;

import edu.esprit.locator.ServiceLocator;
import edu.esprit.persistance.Club;
import edu.esprit.service.ManageClubRemote;

public class ClubServiceDelegate {
	private final static String jndiName = "/ejb-pidev/ManageClub!edu.esprit.service.ManageClubRemote";

	private static ManageClubRemote getProxy() {
		return (ManageClubRemote) ServiceLocator.getInstance().getProxy(jndiName);

	}

	public static boolean create(Club club) {
		// TODO Auto-generated method stub
		return getProxy().addClub(club);
	}

	public static boolean delete(Club club) {
		// TODO Auto-generated method stub
		return getProxy().deleteClub(club);
	}

	public static boolean update(Club club) {
		// TODO Auto-generated method stub
		return getProxy().updateClub(club);
	}
	public static List<Club> listofClub() {
		return getProxy().findAllClub();
	}

}
