package edu.esprit.persistance;

import java.io.Serializable;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.sql.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Trainingsession
 *
 */
@Entity
@Table(name="Trainingsession")

public class Trainingsession implements Serializable {

	
	private Integer idsession;
	private Date StartDate;
	private Date endDate;
	private String Place;
	private Double MaxNumber;
	private static final long serialVersionUID = 1L;

	public Trainingsession() {
		super();
	}   
	@Id    
	public Integer getIdsession() {
		return this.idsession;
	}

	public void setIdsession(Integer idsession) {
		this.idsession = idsession;
	}   
	public Date getStartDate() {
		return this.StartDate;
	}

	public void setStartDate(Date StartDate) {
		this.StartDate = StartDate;
	}   
	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}   
	public String getPlace() {
		return this.Place;
	}

	public void setPlace(String Place) {
		this.Place = Place;
	}   
	public Double getMaxNumber() {
		return this.MaxNumber;
	}

	public void setMaxNumber(Double MaxNumber) {
		this.MaxNumber = MaxNumber;
	}
   
}
