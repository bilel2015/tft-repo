package edu.esprit.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import edu.esprit.persistance.Event;

/**
 * Session Bean implementation class EventServices
 */
@Stateless
public class EventServices implements EventServicesRemote, EventServicesLocal {

	@PersistenceContext
	EntityManager manager;

	public EventServices() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Boolean addEvent(Event event) {

		try {

			manager.persist(event);
			return true;
		} catch (Exception e) {

			return false;
		}
	}

	@Override
	public Boolean updateEvent(Event event) {
		try {

			manager.merge(event);
			return true;
		} catch (Exception e) {

			return false;
		}
	}

	@Override
	public Boolean deleteEvent(Event event) {
		try {

			manager.remove(manager.merge(event));
			return true;
		} catch (Exception e) {

			return false;
		}

	}

	@Override
	public Event findEventById(Integer idEvent) {
		Event event = null;
		try {

			event = manager.find(Event.class, idEvent);

		} catch (Exception e) {

		}
		return event;
	}

	@Override
	public List<Event> findAllEvents() {
		Query query = manager.createQuery("Select e from Event e ");
		return query.getResultList();
	}

}
