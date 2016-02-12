package edu.esprit.persistance;

import java.io.Serializable;
import java.lang.Integer;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Bets
 *
 */
@Entity
@Table(name="Bets")

public class Bets implements Serializable {

	
	private Integer idBets;
	private Double Amount; 
	private double Potentielwining;
	public double getPotentielwining() {
		return Potentielwining;
	}
	public void setPotentielwining(double potentielwining) {
		Potentielwining = potentielwining;
	}
	public Double getAmount() {
		return Amount;
	}
	public void setAmount(Double amount) {
		Amount = amount;
	}

	private static final long serialVersionUID = 1L;

	public Bets() {
		super();
	}   
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getIdBets() {
		return this.idBets;
	}

	public void setIdBets(Integer idBets) {
		this.idBets = idBets;
	}
   
}
