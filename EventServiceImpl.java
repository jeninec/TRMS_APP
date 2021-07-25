package dev.clay.services;

import java.util.List;

import dev.clay.models.Event;
import dev.clay.repos.EventRepo;

public class EventServiceImpl implements EventService {

	EventRepo er;
	
	public EventServiceImpl(EventRepo er) {
		this.er = er;
	}
	
	@Override
	public Event getEvent(int id) {
		return er.getEvent(id);
	}

	@Override
	public List<Event> getAllEvents() {
		return er.getAllEvents();
	}

	@Override
	public Event addEvent(Event ev) {
		return er.addEvent(ev);
	}

	@Override
	public Event updateEvent(Event change) {
		return er.updateEvent(change);
	}

	@Override
	public Event deleteEvent(int id) {
		return er.deleteEvent(id);
	}

}
