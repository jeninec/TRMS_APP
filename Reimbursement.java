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
@Table(name="reimbursements")
public class Reimbursement {

	@Id
	@Column(name="re_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private double claim;
	private String justification;
	
	@Column(name="time_out")
	private long timeOut;
	
	@ManyToOne
	@JoinColumn(name="employee_id")
	private Employee employeeId;
	
	@ManyToOne
	@JoinColumn(name="event_id")
	private Event eventId;

	public Reimbursement() {
		super();
	}

	
	
	public Reimbursement(int id, double claim, String justification, long timeOut, Employee employeeId, Event eventId) {
		super();
		this.id = id;
		this.claim = claim;
		this.justification = justification;
		this.timeOut = timeOut;
		this.employeeId = employeeId;
		this.eventId = eventId;
	}


	

	public Reimbursement(double claim, String justification, long timeOut, Employee employeeId, Event eventId) {
		super();
		this.claim = claim;
		this.justification = justification;
		this.timeOut = timeOut;
		this.employeeId = employeeId;
		this.eventId = eventId;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getClaim() {
		return claim;
	}

	public void setClaim(double claim) {
		this.claim = claim;
	}

	public String getJustification() {
		return justification;
	}

	public void setJustification(String justification) {
		this.justification = justification;
	}

	public long getTimeOut() {
		return timeOut;
	}

	public void setTimeOut(long timeOut) {
		this.timeOut = timeOut;
	}

	
	public Employee getEmployeeId() {
		return employeeId;
	}



	public void setEmployeeId(Employee employeeId) {
		this.employeeId = employeeId;
	}



	public Event getEventId() {
		return eventId;
	}



	public void setEventId(Event eventId) {
		this.eventId = eventId;
	}



	@Override
	public String toString() {
		return "Reimbursement [id=" + id + ", claim=" + claim + ", justification=" + justification + ", timeOut="
				+ timeOut + ", employeeId=" + employeeId + ", eventId=" + eventId + "]";
	}
	
	
	
	
}
