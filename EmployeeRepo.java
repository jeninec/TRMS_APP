package dev.clay.repos;

import java.util.List;

import dev.clay.models.Employee;

public interface EmployeeRepo {

	public Employee getEmployee(int id);
	
	public List<Employee> getAllEmployees();
	
	public Employee addEmployee(Employee e);
	
	public Employee updateEmployee(Employee change);
	
	public Employee deleteEmployee(int id);
	
}
