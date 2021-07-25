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
@Table(name="employees")
public class Employee {

	@Id
	@Column(name="e_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String username;
	private String password;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	private String birthdate;
	private boolean is_ben_co;
	
	@ManyToOne
	@JoinColumn(name="department_id")
	private Department deptId;
	
	@ManyToOne
	@JoinColumn(name="super_id")
	private Employee superId;

	public Employee() {
		super();
	}

	
	public Employee(int id, String username, String password, String firstName, String lastName, String birthdate,
			boolean is_ben_co, Department deptId, Employee superId) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthdate = birthdate;
		this.is_ben_co = is_ben_co;
		this.deptId = deptId;
		this.superId = superId;
	}

	

	public Employee(String username, String password, String firstName, String lastName, String birthdate,
			boolean is_ben_co, Department deptId, Employee superId) {
		super();
		this.username = username;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthdate = birthdate;
		this.is_ben_co = is_ben_co;
		this.deptId = deptId;
		this.superId = superId;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public boolean isIs_ben_co() {
		return is_ben_co;
	}

	public void setIs_ben_co(boolean is_ben_co) {
		this.is_ben_co = is_ben_co;
	}

	public Department getDeptId() {
		return deptId;
	}


	public void setDeptId(Department deptId) {
		this.deptId = deptId;
	}


	public Employee getSuperId() {
		return superId;
	}


	public void setSuperId(Employee superId) {
		this.superId = superId;
	}


	@Override
	public String toString() {
		return "Employee [id=" + id + ", username=" + username + ", password=" + password + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", birthdate=" + birthdate + ", is_ben_co=" + is_ben_co + ", deptId="
				+ deptId + ", superId=" + superId + "]";
	}
	
	
	
	
}
