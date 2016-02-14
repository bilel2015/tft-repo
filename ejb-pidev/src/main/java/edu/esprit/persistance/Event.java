package edu.esprit.persistance;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity implementation class for Entity: Event
 *
 */
@Entity
@Table(name = "event")
public class Event implements Serializable {

	private Integer idevent;
	private Date startDate;
	private Date endDate;
	private String name;
	private String Description;
	private String Type;
	private List<Matchs> matchs;

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	private static final long serialVersionUID = 1L;

	public Event() {
		super();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getIdevent() {
		return this.idevent;
	}

	public void setIdevent(Integer idevent) {
		this.idevent = idevent;
	}

	public Date getStartDate() {
		return startDate;
	}

	@Override
	public String toString() {
		return "Event [idevent=" + idevent + ", startDate=" + startDate + ", endDate=" + endDate + ", name=" + name
				+ ", Description=" + Description + ", Type=" + Type + ", matchs=" + matchs + "]";
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public List<Matchs> getMatchs() {
		return matchs;
	}

	public void setMatchs(List<Matchs> matchs) {
		this.matchs = matchs;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
