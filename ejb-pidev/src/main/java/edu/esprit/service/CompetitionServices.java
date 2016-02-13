package edu.esprit.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import edu.esprit.persistance.Competition;


/**
 * Session Bean implementation class CompetitionServices
 */
@Stateless
public class CompetitionServices implements CompetitionServicesRemote, CompetitionServicesLocal {

	@PersistenceContext
	EntityManager manager;

	public CompetitionServices() {
		// TODO Auto-generated constructor stub
	}

	public Boolean addCompetition(Competition competition) {

		try {

			manager.persist(competition);
			return true;
		} catch (Exception e) {

			return false;
		}
	}

	@Override
	public Boolean updateCompetition(Competition competition) {
		try {

			manager.merge(competition);
			return true;
		} catch (Exception e) {

			return false;
		}
	}

	@Override
	public Boolean deleteCompetition(Competition competition) {
		try {

			manager.remove(manager.merge(competition));
			return true;
		} catch (Exception e) {

			return false;
		}

	}

	@Override
	public Competition findCompetitionById(Integer idcompetition) {
		Competition competition = null;
		try {

			competition = manager.find(Competition.class, idcompetition);

		} catch (Exception e) {

		}
		return competition;
	}

	@Override
	public List<Competition> findAllCompetitions() {
		Query query = manager.createQuery("Select c from Competition c ");
		return query.getResultList();
	}

	@Override
	public Boolean updateEvent(Competition competition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean deleteEvent(Competition competition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean addEvent(Competition competition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Competition> findAllCompetition() {
		// TODO Auto-generated method stub
		return null;
	}

}
