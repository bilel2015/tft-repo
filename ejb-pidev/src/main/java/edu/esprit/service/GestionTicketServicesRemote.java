package edu.esprit.service;

import java.util.List;

import javax.ejb.Remote;

import edu.esprit.persistance.Ticket;

@Remote
public interface GestionTicketServicesRemote {

public   boolean addTicket(Ticket ticket);
	
	public boolean deleteTicket(Ticket ticket);
	public boolean updateTicket(Ticket ticket);
	public Ticket findTicketById(int idticket);
	public List<Ticket> findAllTicket();
}
