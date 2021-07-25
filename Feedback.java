package dev.clay.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Feedback {

	@Id
	@Column(name="f_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String msg;
	private String author;
	
	@ManyToOne
	@JoinColumn(name="reimbursement_id")
	private Reimbursement reimId;

	public Feedback() {
		super();
	}

	public Feedback(int id, String msg, String author, Reimbursement reimId) {
		super();
		this.id = id;
		this.msg = msg;
		this.author = author;
		this.reimId = reimId;
	}

	public Feedback(String msg, String author, Reimbursement reimId) {
		super();
		this.msg = msg;
		this.author = author;
		this.reimId = reimId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Reimbursement getReimId() {
		return reimId;
	}

	public void setReimId(Reimbursement reimId) {
		this.reimId = reimId;
	}

	@Override
	public String toString() {
		return "Feedback [id=" + id + ", msg=" + msg + ", author=" + author + ", reimId=" + reimId + "]";
	}
	
	
}
