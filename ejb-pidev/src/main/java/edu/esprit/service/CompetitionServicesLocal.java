package edu.esprit.service;

import java.util.List;

import javax.ejb.Local;

import edu.esprit.persistance.Competition;

@Local
public interface CompetitionServicesLocal {

	Boolean addEvent(Competition competition);

	Boolean updateEvent(Competition competition);

	Boolean deleteEvent(Competition competition);

	Competition findCompetitionById(Integer idcompetition);

	List<Competition> findAllCompetition();

}
