package edu.esprit.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import edu.esprit.persistance.Club;

/**
 * Session Bean implementation class ManageClub
 */
@Stateless
public class ManageClub implements ManageClubRemote, ManageClubLocal {

	/**
	 * Default constructor.
	 */
	@PersistenceContext
	EntityManager entityManager;

	public ManageClub() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean addClub(Club club) {

		try {
			entityManager.persist(club);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean deleteClub(Club club) {
		try {
			entityManager.remove(entityManager.merge(club));
			return true;

		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean updateClub(Club club) {
		try {
			entityManager.merge(club);
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}

	@Override
	public Club findClubById(int idclub) {
		return entityManager.find(Club.class, idclub);
	}

	@Override
	public List<Club> findAllClub() {
		try {
			Query query = entityManager.createQuery("select c from Club c");
			return query.getResultList();
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public boolean addClub(String club_name, String nbr_player) {
		// TODO Auto-generated method stub
		return false;
	}

}
