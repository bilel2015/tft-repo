package edu.esprit.service;

import java.util.List;

import javax.ejb.Local;

import edu.esprit.persistance.Club;

@Local
public interface ManageClubLocal {

	public boolean addClub(String club_name, String nbr_player);

	public boolean deleteClub(Club club);

	public boolean updateClub(Club club);

	public Club findClubById(int idclub);

	public List<Club> findAllClub();

}
