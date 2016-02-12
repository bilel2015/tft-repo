package edu.esprit.persistance;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.sql.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Test
 *
 */
@Entity
@Table(name="Test")
public class Test implements Serializable {

	
	
	private Integer idtest;
	private String description;
	private Date Datetest;
	@ManyToOne
	private Doctor doctors;
	
	private static final long serialVersionUID = 1L;

	public Test() {
		super();
	}   
	@Id   
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@ManyToOne	
	@JoinColumn(name="PlayerFK")
	private Player player;
	
	public Integer getIdtest() {
		return this.idtest;
	}

	public void setIdtest(Integer idtest) {
		this.idtest = idtest;
	}   
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}   
	public Date getDatetest() {
		return this.Datetest;
	}

	public void setDatetest(Date Datetest) {
		this.Datetest = Datetest;
	}
	
	public Doctor getDoctor() {
		return doctors;
	}

	public void setDoctor(Doctor doctor) {
		this.doctors = doctor;
	}
   
}
