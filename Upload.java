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
@Table(name="uploads")
public class Upload {

	@Id
	@Column(name="u_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="upload_file")
	private String file;
	
	@ManyToOne
	@JoinColumn(name="reimbursement_id")
	private Reimbursement reimID;

	public Upload() {
		super();
	}

	public Upload(int id, String file, Reimbursement reimID) {
		super();
		this.id = id;
		this.file = file;
		this.reimID = reimID;
	}

	public Upload(String file, Reimbursement reimID) {
		super();
		this.file = file;
		this.reimID = reimID;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public Reimbursement getReimID() {
		return reimID;
	}

	public void setReimID(Reimbursement reimID) {
		this.reimID = reimID;
	}

	@Override
	public String toString() {
		return "Upload [id=" + id + ", file=" + file + ", reimID=" + reimID + "]";
	}
	
	
}
