package edu.esprit.persistance;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: Fan
 *
 */
@Entity
@Table(name = "Fan")

public class Fan extends User implements Serializable {

	private static final long serialVersionUID = 1L;
   private List<Reservtion>reservations;
	public Fan() {
		super();
	}

	@OneToMany(mappedBy="fan")
	public List<Reservtion> getReservations() {
		return reservations;
	}
	public void setReservations(List<Reservtion> reservations) {
		this.reservations = reservations;
	}

}
