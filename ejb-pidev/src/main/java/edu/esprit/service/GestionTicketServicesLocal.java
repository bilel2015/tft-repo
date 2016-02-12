package edu.esprit.service;

import java.util.List;

import javax.ejb.Local;

import edu.esprit.persistance.Ticket;

@Local
public interface GestionTicketServicesLocal {

public boolean addTicket(Ticket ticket);
	
	public boolean deleteTicket(Ticket ticket);
	public boolean updateTicket(Ticket ticket);
	public Ticket findTicketById(int idticket);
	public List<Ticket> findAllTicket();
}
