package edu.esprit.service;

import java.util.List;

import javax.ejb.Local;

import edu.esprit.persistance.Event;

@Local
public interface EventServicesLocal {

	Boolean addEvent(Event event);

	Boolean updateEvent(Event event);

	Boolean deleteEvent(Event event);

	Event findEventById(Integer idEvent);

	List<Event> findAllEvents();

}
