package edu.esprit.persistance;

import java.io.Serializable;
import java.lang.Integer;
import java.sql.Date;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Matchs
 *
 */
@Entity
@Table(name = "Matchs")

public class Matchs implements Serializable {

	private Integer idmatchs;
	private Date DateMatchs;
	private static final long serialVersionUID = 1L;
	private List<Ticket> tickets;
	private Staduim stadium;
	private Referee referee;
	private Player player;
	private Player player1;
	
	public Matchs() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getIdmatchs() {
		return this.idmatchs;
	}

	public void setIdmatchs(Integer idmatchs) {
		this.idmatchs = idmatchs;
	}

	public Date getDateMatchs() {
		return this.DateMatchs;
	}

	public void setDateMatchs(Date DateMatchs) {
		this.DateMatchs = DateMatchs;
	}

	@ManyToOne
	public Referee getReferee() {
		return referee;
	}

	public void setReferee(Referee referee) {
		this.referee = referee;
	}

	@OneToMany(mappedBy = "matchs")

	public List<Ticket> getTickets() {
		return tickets;
	}

	public void setTickets(List<Ticket> tickets) {
		this.tickets = tickets;
	}

	@ManyToOne
	public Staduim getStadium() {
		return stadium;
	}

	public void setStadium(Staduim stadium) {
		this.stadium = stadium;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((DateMatchs == null) ? 0 : DateMatchs.hashCode());
		result = prime * result + ((idmatchs == null) ? 0 : idmatchs.hashCode());
		result = prime * result + ((stadium == null) ? 0 : stadium.hashCode());
		result = prime * result + ((tickets == null) ? 0 : tickets.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Matchs other = (Matchs) obj;
		if (DateMatchs == null) {
			if (other.DateMatchs != null)
				return false;
		} else if (!DateMatchs.equals(other.DateMatchs))
			return false;
		if (idmatchs == null) {
			if (other.idmatchs != null)
				return false;
		} else if (!idmatchs.equals(other.idmatchs))
			return false;
		if (stadium == null) {
			if (other.stadium != null)
				return false;
		} else if (!stadium.equals(other.stadium))
			return false;
		if (tickets == null) {
			if (other.tickets != null)
				return false;
		} else if (!tickets.equals(other.tickets))
			return false;
		return true;
	}
	@ManyToOne
	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}
	@ManyToOne
	public Player getPlayer1() {
		return player1;
	}

	public void setPlayer1(Player player1) {
		this.player1 = player1;
	}

}
