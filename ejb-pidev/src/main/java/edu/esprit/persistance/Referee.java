package edu.esprit.persistance;

import edu.esprit.persistance.User;
import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Referee
 *
 */
@Entity
@Table(name="Referee")

public class Referee extends User implements Serializable {

	
	private String Grade;
	private String status;
	private List<Matchs>matchs;
	private List<UpgradeContest>upgradecontest;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	private static final long serialVersionUID = 1L;

	public Referee() {
		super();
	}   
	public String getGrade() {
		return this.Grade;
	}

	public void setGrade(String Grade) {
		this.Grade = Grade;
	}
	@OneToMany(mappedBy="referee")
	public List<Matchs> getMatchs() {
		return matchs;
	}
	public void setMatchs(List<Matchs> matchs) {
		this.matchs = matchs;
	}
	@OneToMany(mappedBy="referee")
	public List<UpgradeContest> getUpgradecontest() {
		return upgradecontest;
	}
	public void setUpgradecontest(List<UpgradeContest> upgradecontest) {
		this.upgradecontest = upgradecontest;
	}
   
}
