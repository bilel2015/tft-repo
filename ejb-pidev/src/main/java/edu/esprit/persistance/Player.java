package edu.esprit.persistance;

import edu.esprit.persistance.User;
import java.io.Serializable;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Player
 *
 */
@Entity
@Table(name="Player")

public class Player extends User implements Serializable {

	
	private String type;
	private String rank;
	private List<Matchs> matchs;
	private static final long serialVersionUID = 1L;

	public Player() {
		super();
	}   
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}   
	public String getRank() {
		return this.rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}
	
	@OneToMany(mappedBy="player")
	public List<Matchs> getMatchs() {
		return matchs;
	}
	public void setMatchs(List<Matchs> matchs) {
		this.matchs = matchs;
	}
   
}
