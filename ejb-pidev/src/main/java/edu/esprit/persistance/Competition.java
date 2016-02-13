package edu.esprit.persistance;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: Competition
 *
 */
@Entity
@Table(name = "Competition")

public class Competition implements Serializable {

	private Integer idcompetition;
	private String namecompetition;
	private Date Datecompetion;
	private String Typecompetition;
	private String Description;
	private List<Matchs> matchs;

	@Override
	public String toString() {
		return "Competition [idcompetition=" + idcompetition + ", namecompetition=" + namecompetition
				+ ", Datecompetion=" + Datecompetion + ", Typecompetition=" + Typecompetition + ", Description="
				+ Description + ", matchs=" + matchs + "]";
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public List<Matchs> getMatchs() {
		return matchs;
	}

	public void setMatchs(List<Matchs> matchs) {
		this.matchs = matchs;
	}

	private static final long serialVersionUID = 1L;

	public Competition() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getIdcompetition() {
		return this.idcompetition;
	}

	public void setIdcompetition(Integer idcompetition) {
		this.idcompetition = idcompetition;
	}

	public String getNamecompetition() {
		return this.namecompetition;
	}

	public void setNamecompetition(String namecompetition) {
		this.namecompetition = namecompetition;
	}

	public Date getDatecompetion() {
		return this.Datecompetion;
	}

	public void setDatecompetion(Date Datecompetion) {
		this.Datecompetion = Datecompetion;
	}

	public String getTypecompetition() {
		return this.Typecompetition;
	}

	public void setTypecompetition(String Typecompetition) {
		this.Typecompetition = Typecompetition;
	}

}
