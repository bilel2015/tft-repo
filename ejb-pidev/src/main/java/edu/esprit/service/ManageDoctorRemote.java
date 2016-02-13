package edu.esprit.service;

import javax.ejb.Remote;

import edu.esprit.persistance.Doctor;

@Remote
public interface ManageDoctorRemote {
	public boolean addDoctor(Doctor doctor);

}
