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
@Table(name="requests")
public class Request {
	
	@Id
	@Column(name="rq_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String status;
	
	@ManyToOne
	@JoinColumn(name="employee_id")
	private Employee employeeId;
	
	@ManyToOne
	@JoinColumn(name="reimbursement_id")
	private Reimbursement reimID;

	public Request() {
		super();
	}

	public Request(int id, String status, Employee employeeId, Reimbursement reimID) {
		super();
		this.id = id;
		this.status = status;
		this.employeeId = employeeId;
		this.reimID = reimID;
	}

	public Request(String status, Employee employeeId, Reimbursement reimID) {
		super();
		this.status = status;
		this.employeeId = employeeId;
		this.reimID = reimID;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Employee getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Employee employeeId) {
		this.employeeId = employeeId;
	}

	public Reimbursement getReimID() {
		return reimID;
	}

	public void setReimID(Reimbursement reimID) {
		this.reimID = reimID;
	}

	@Override
	public String toString() {
		return "Request [id=" + id + ", status=" + status + ", employeeId=" + employeeId + ", reimID=" + reimID + "]";
	}
	
	
	
}
