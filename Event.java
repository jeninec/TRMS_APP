package dev.clay.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="events")
public class Event {

	@Id
	@Column(name="ev_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@ManyToOne
	@JoinColumn(name="event_type_id")
	private EventType eventTypeId;
	
	@Column(name="start_date")
	private long startDate;
	
	@Column(name="end_date")
	private long endDate;
	
	private String location;
	private double cost;
	private String description;

	@ManyToOne
	@JoinColumn(name="grading_id")
	private Grading gradingId;
	
	
	public Event() {
		super();
	}


	

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	

	public long getStartDate() {
		return startDate;
	}


	public void setStartDate(long startDate) {
		this.startDate = startDate;
	}


	public long getEndDate() {
		return endDate;
	}


	public void setEndDate(long endDate) {
		this.endDate = endDate;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public double getCost() {
		return cost;
	}


	public void setCost(double cost) {
		this.cost = cost;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}




	public Event(int id, EventType eventTypeId, long startDate, long endDate, String location, double cost,
			String description, Grading gradingId) {
		super();
		this.id = id;
		this.eventTypeId = eventTypeId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.location = location;
		this.cost = cost;
		this.description = description;
		this.gradingId = gradingId;
	}




	public Event(EventType eventTypeId, long startDate, long endDate, String location, double cost, String description,
			Grading gradingId) {
		super();
		this.eventTypeId = eventTypeId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.location = location;
		this.cost = cost;
		this.description = description;
		this.gradingId = gradingId;
	}




	public EventType getEventTypeId() {
		return eventTypeId;
	}




	public void setEventTypeId(EventType eventTypeId) {
		this.eventTypeId = eventTypeId;
	}




	public Grading getGradingId() {
		return gradingId;
	}




	public void setGradingId(Grading gradingId) {
		this.gradingId = gradingId;
	}




	@Override
	public String toString() {
		return "Event [id=" + id + ", eventTypeId=" + eventTypeId + ", startDate=" + startDate + ", endDate=" + endDate
				+ ", location=" + location + ", cost=" + cost + ", description=" + description + ", gradingId="
				+ gradingId + "]\n";
	}


	
}
