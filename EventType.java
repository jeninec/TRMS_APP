package dev.clay.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="event_types")
public class EventType {

	@Id
	@Column(name="ev_type_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String title;
	private int coverage;
	
	public EventType() {
		super();
	}

	public EventType(int id, String title, int coverage) {
		super();
		this.id = id;
		this.title = title;
		this.coverage = coverage;
	}

	public EventType(String title, int coverage) {
		super();
		this.title = title;
		this.coverage = coverage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getCoverage() {
		return coverage;
	}

	public void setCoverage(int coverage) {
		this.coverage = coverage;
	}

	@Override
	public String toString() {
		return "EventTypes { id=" + id + ", title=" + title + ", coverage=" + coverage + " }";
	}
	
	
	
}
