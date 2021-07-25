package dev.clay.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="departments")
public class Department {

	@Id
	@Column(name="d_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="head")
	private String head;
	
	@Column(name="budget")
	private double budget;
	
	public Department() {
		
	}

	public Department(int id, String name, String head, double budget) {
		super();
		this.id = id;
		this.name = name;
		this.head = head;
		this.budget = budget;
	}

	public Department(String name, String head, double budget) {
		super();
		this.name = name;
		this.head = head;
		this.budget = budget;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHead() {
		return head;
	}

	public void setHead(String head) {
		this.head = head;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	@Override
	public String toString() {
		return "Department { id=" + id + ", name=" + name + ", head=" + head + ", budget=" + budget + " }";
	}
	
	
	
}
