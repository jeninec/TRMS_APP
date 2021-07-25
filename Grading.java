package dev.clay.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Grading {

	@Id
	@Column(name="g_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name="g_type")
	private String type;
	
	private String cutoff;
	private boolean upload;
	
	
	public Grading() {
		super();
	}


	public Grading(int id, String type, String cutoff, boolean upload) {
		super();
		this.id = id;
		this.type = type;
		this.cutoff = cutoff;
		this.upload = upload;
	}


	public Grading(String type, String cutoff, boolean upload) {
		super();
		this.type = type;
		this.cutoff = cutoff;
		this.upload = upload;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public String getCutoff() {
		return cutoff;
	}


	public void setCutoff(String cutoff) {
		this.cutoff = cutoff;
	}


	public boolean hasUpload() {
		return upload;
	}


	public void setUpload(boolean upload) {
		this.upload = upload;
	}


	@Override
	public String toString() {
		return "Grading { id=" + id + ", type=" + type + ", cutoff=" + cutoff + ", upload=" + upload + " }";
	}
	
	
	
	
}
