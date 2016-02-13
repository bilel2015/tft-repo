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
@Table(name="Matchs")

public class Matchs implements Serializable {

	
	private Integer idmatchs;
	private Date DateMatchs;
	private static final long serialVersionUID = 1L;
	private Staduim staduim;
	private Referee referee;
	private List<Reservtion>reservations;
	public Matchs() {
		super();
	}   
	@Id  
	@GeneratedValue(strategy=GenerationType.IDENTITY)
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
	public Staduim getStaduim() {
		return staduim;
	}
	
	public void setStaduim(Staduim staduim) {
		this.staduim = staduim;
	}
	@ManyToOne
	public Referee getReferee() {
		return referee;
	}
	public void setReferee(Referee referee) {
		this.referee = referee;
	}
	@OneToMany(mappedBy="match")
	public List<Reservtion> getReservations() {
		return reservations;
	}
	public void setReservations(List<Reservtion> reservations) {
		this.reservations = reservations;
	}
   
}
