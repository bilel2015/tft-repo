package edu.esprit.persistance;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.sql.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Event
 *
 */
@Entity
@Table(name="event")
public class Event implements Serializable {

	
	private Integer idevent;
	private Date datebeginevent;
	private Date dateendevent;
	private String name;
	private static final long serialVersionUID = 1L;

	public Event() {
		super();
	}   
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getIdevent() {
		return this.idevent;
	}

	public void setIdevent(Integer idevent) {
		this.idevent = idevent;
	}   
	public Date getDatebeginevent() {
		return this.datebeginevent;
	}

	public void setDatebeginevent(Date datebeginevent) {
		this.datebeginevent = datebeginevent;
	}   
	public Date getDateendevent() {
		return this.dateendevent;
	}

	public void setDateendevent(Date dateendevent) {
		this.dateendevent = dateendevent;
	}   
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
   
}
