package dev.clay.services;

import java.util.List;

import dev.clay.models.EventType;
import dev.clay.repos.EventTypeRepo;

public class EventTypeServiceImpl implements EventTypeService {

	EventTypeRepo er;
	
	public EventTypeServiceImpl(EventTypeRepo er) {
		this.er = er;
	}
	
	@Override
	public EventType getEventType(int id) {
		return er.getEventType(id);
	}

	@Override
	public List<EventType> getAllEventTypes() {
		return er.getAllEventTypes();
	}

	@Override
	public EventType addEventType(EventType et) {
		return er.addEventType(et);
	}

	@Override
	public EventType updateEventType(EventType change) {
		return er.updateEventType(change);
	}

	@Override
	public EventType deleteEventType(int id) {
		return er.deleteEventType(id);
	}

}
