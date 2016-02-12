package edu.esprit.persistance;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.sql.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: UpgradeContest
 *
 */
@Entity
@Table(name="UpgradeContest")

public class UpgradeContest implements Serializable {

	
	private Integer idContest;
	private Date DateContest;
	private String PlaceContest;
	private static final long serialVersionUID = 1L;
	private Referee referee;

	public UpgradeContest() {
		super();
	}   
	@Id  
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Integer getIdContest() {
		return this.idContest;
	}

	public void setIdContest(Integer idContest) {
		this.idContest = idContest;
	}   
	public Date getDateContest() {
		return this.DateContest;
	}

	public void setDateContest(Date DateContest) {
		this.DateContest = DateContest;
	}   
	public String getPlaceContest() {
		return this.PlaceContest;
	}

	public void setPlaceContest(String PlaceContest) {
		this.PlaceContest = PlaceContest;
	}
	@ManyToOne
	public Referee getReferee() {
		return referee;
	}
	public void setReferee(Referee referee) {
		this.referee = referee;
	}
   
}
