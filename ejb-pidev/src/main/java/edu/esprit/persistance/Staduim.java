package edu.esprit.persistance;

import java.io.Serializable;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Staduim
 *
 */
@Entity
@Table(name="Staduim")

public class Staduim implements Serializable {

	
	private Integer idstaduim;
	private String namestaduim;
	private Double capacity;
	private String place;
	private static final long serialVersionUID = 1L;
	
	private List<Matchs>matchs;

	public Staduim() {
		super();
	}   
	@Id    
	public Integer getIdstaduim() {
		return this.idstaduim;
	}

	public void setIdstaduim(Integer idstaduim) {
		this.idstaduim = idstaduim;
	}   
	public String getNamestaduim() {
		return this.namestaduim;
	}

	public void setNamestaduim(String namestaduim) {
		this.namestaduim = namestaduim;
	}   
	public Double getCapacity() {
		return this.capacity;
	}

	public void setCapacity(Double capacity) {
		this.capacity = capacity;
	}   
	public String getPlace() {
		return this.place;
	}

	public void setPlace(String place) {
		this.place = place;
	}
	
	@OneToMany(mappedBy="stadium")
	public List<Matchs> getMatchs() {
		return matchs;
	}
	public void setMatchs(List<Matchs> matchs) {
		this.matchs = matchs;
	}
   
}
