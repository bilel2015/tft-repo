package edu.esprit.service;

import java.util.List;

import javax.ejb.Remote;

import edu.esprit.persistance.Competition;;

@Remote
public interface CompetitionServicesRemote {
	public Boolean addEvent(Competition competition);

	public Boolean updateCompetition(Competition competition);

	public Boolean deleteCompetition(Competition competition);

	public Competition findCompetitionById(Integer idcompetition);

	public List<Competition> findAllCompetition();
}
