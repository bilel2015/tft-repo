package edu.esprit.persistance;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * Entity implementation class for Entity: Reservtion
 *
 */
@Entity

public class Reservtion implements Serializable {

	private Date DateReservation;
	private int NumberRes;
	private double Price;
	private ReservationPK ReservationPK;
	private static final long serialVersionUID = 1L;
	private Fan fan;
	private Matchs match;

	public Reservtion() {
		super();
	}

	public Date getDateReservation() {
		return this.DateReservation;
	}

	public void setDateReservation(Date DateReservation) {
		this.DateReservation = DateReservation;
	}

	public int getNumberRes() {
		return this.NumberRes;
	}

	public void setNumberRes(int NumberRes) {
		this.NumberRes = NumberRes;
	}

	public double getPrice() {
		return this.Price;
	}

	public void setPrice(double Price) {
		this.Price = Price;
	}

	@EmbeddedId
	public ReservationPK getReservationPK() {
		return this.ReservationPK;
	}

	public void setReservationPK(ReservationPK ReservationPK) {
		this.ReservationPK = ReservationPK;
	}

	@ManyToOne

	@JoinColumn(name = "idFan", referencedColumnName = "idUser", insertable = false, updatable = false)
	public Fan getFan() {
		return fan;
	}

	public void setFan(Fan fan) {
		this.fan = fan;
	}

	@ManyToOne
	@JoinColumn(name = "idMatch", referencedColumnName = "idmatchs", insertable = false, updatable = false)
	public Matchs getMatch() {
		return match;
	}

	public void setMatch(Matchs match) {
		this.match = match;
	}

	public Reservtion(Date dateReservation, int numberRes, double price, Fan fan, Matchs match) {
		super();
		DateReservation = dateReservation;
		NumberRes = numberRes;
		Price = price;
		this.fan = fan;
		this.match = match;
		this.ReservationPK = new ReservationPK(fan.getIdUser(), match.getIdmatchs());
	}

}
