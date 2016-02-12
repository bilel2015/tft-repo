package edu.esprit.service;

import java.util.List;

import javax.ejb.Remote;

import edu.esprit.persistance.Club;

@Remote
public interface ManageClubRemote {
	
	public boolean addClub(Club club);
	
	 public boolean deleteClub(Club club);
	public boolean updateClub(Club club);
	public Club findClubById(int idclub );
	 public List<Club> findAllClub();
	

}
