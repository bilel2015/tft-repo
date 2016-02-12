package edu.esprit.persistance;

import java.io.Serializable;
import java.lang.Double;
import java.lang.Integer;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Ticket
 *
 */
@Entity
@Table(name="Ticket")

public class Ticket implements Serializable {

	
	private Integer idticket;
	private Double Price;
	private Double NumberMaxTicket;
	private static final long serialVersionUID = 1L;
	private Staduim staduim;
	private Matchs matchs;

	public Ticket() {
		super();
	}   
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getIdticket() {
		return this.idticket;
	}

	public void setIdticket(Integer idticket) {
		this.idticket = idticket;
	}   
	public Double getPrice() {
		return this.Price;
	}

	public void setPrice(Double Price) {
		this.Price = Price;
	}   
	public Double getNumberMaxTicket() {
		return this.NumberMaxTicket;
	}

	public void setNumberMaxTicket(Double NumberMaxTicket) {
		this.NumberMaxTicket = NumberMaxTicket;
	}
	@ManyToOne
	public Staduim getStaduim() {
		return staduim;
	}
	public void setStaduim(Staduim staduim) {
		this.staduim = staduim;
	}
	@ManyToOne
	public Matchs getMatchs() {
		return matchs;
	}
	public void setMatchs(Matchs matchs) {
		this.matchs = matchs;
	}
   
}
