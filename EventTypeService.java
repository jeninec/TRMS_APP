package dev.clay.services;

import java.util.List;

import dev.clay.models.EventType;

public interface EventTypeService {

	public EventType getEventType(int id);
	
	public List<EventType> getAllEventTypes();
	
	public EventType addEventType(EventType et);
	
	public EventType updateEventType(EventType change);
	
	public EventType deleteEventType(int id);
	
}
