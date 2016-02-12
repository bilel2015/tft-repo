package edu.esprit.persistance;

import edu.esprit.persistance.User;
import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Doctor
 *
 */
@Entity
@Table(name="Doctor")

public class Doctor extends User implements Serializable {

	
	private static final long serialVersionUID = 1L;

	public Doctor() {
		super();
	}
   private List<Test> tests;
@OneToMany(mappedBy="doctors")
public List<Test> getTests() {
	return tests;
}
public void setTests(List<Test> tests) {
	this.tests = tests;
}
}
