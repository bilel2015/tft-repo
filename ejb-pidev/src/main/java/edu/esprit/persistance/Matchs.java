package edu.esprit.persistance;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

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

	private Staduim stadium;

	private Referee referee;

	private List<Reservtion> reservations;

	private Player player;
	private Player player1;
	private Event event;

	public Event getEvent() {
		return event;
	}

	public void setEvent(Event event) {
		this.event = event;
	}

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

	@OneToMany(mappedBy = "match")
	public List<Reservtion> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservtion> reservations) {
		this.reservations = reservations;
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
		return result;
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
