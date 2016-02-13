package edu.esprit.service;

import java.util.List;

import javax.ejb.Remote;

import edu.esprit.persistance.Event;



@Remote
public interface EventServicesRemote {
	public Boolean addEvent(Event event);
	public Boolean updateEvent(Event event);
	public Boolean deleteEvent(Event event);
	public Event findEventById(Integer idEvent);
	public List<Event> findAllEvents();
}
