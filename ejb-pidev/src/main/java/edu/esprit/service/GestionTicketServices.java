package edu.esprit.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import edu.esprit.persistance.Ticket;

/**
 * Session Bean implementation class GestionTicket
 */
@Stateless
public class GestionTicketServices implements GestionTicketServicesRemote, GestionTicketServicesLocal {

    /**
     * Default constructor. 
     */
	@PersistenceContext
	EntityManager entityManager;

    public GestionTicketServices() {
        // TODO Auto-generated constructor stub
    }


    /**
     * Default constructor. 
     */
    

	@Override
	public  boolean addTicket(Ticket ticket) {
		try {
			entityManager.persist(ticket);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
	@Override
	public boolean deleteTicket(Ticket ticket) {
		try {
			entityManager.remove(entityManager.merge(ticket));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	@Override
	public boolean updateTicket(Ticket ticket) {
		try {
			entityManager.merge(ticket);
			return true;
		} catch (Exception e) {
			System.out.println(e);
			return false;
		}
	}

	@Override
	public Ticket findTicketById(int idticket) {
		return entityManager.find(Ticket.class, idticket);
	}

	@Override
	public List<Ticket> findAllTicket() {
		try {
			Query query=entityManager.createQuery("select c from Ticket c");
			return query.getResultList();
		} catch (Exception e) {
			return null;
		}
	}




}
