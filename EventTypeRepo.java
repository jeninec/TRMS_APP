package dev.clay.repos;

import java.util.List;

import dev.clay.models.EventType;

public interface EventTypeRepo {

	public EventType getEventType(int id);
	
	public List<EventType> getAllEventTypes();
	
	public EventType addEventType(EventType et);
	
	public EventType updateEventType(EventType change);
	
	public EventType deleteEventType(int id);
	
}
