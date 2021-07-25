package dev.clay.services;

import java.util.List;

import dev.clay.models.Event;

public interface EventService {
	
	public Event getEvent(int id);
	
	public List<Event> getAllEvents();
	
	public Event addEvent(Event ev);
	
	public Event updateEvent(Event change);
	
	public Event deleteEvent(int id);
}
