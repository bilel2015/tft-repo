package edu.esprit.persistance;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.sql.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Competition
 *
 */
@Entity
@Table(name="Competition")

public class Competition implements Serializable {

	
	private Integer idcompetition;
	private String namecompetition;
	private Date Datecompetion;
	private String Typecompetition;
	private static final long serialVersionUID = 1L;

	public Competition() {
		super();
	}   
	@Id    
	@GeneratedValue(strategy=GenerationType.IDENTITY)
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
