package dev.clay.services;

import java.util.List;

import dev.clay.models.Employee;
import dev.clay.repos.EmployeeRepo;

public class EmployeeServiceImpl implements EmployeeService {

	EmployeeRepo er;
	
	public EmployeeServiceImpl(EmployeeRepo er) {
		this.er = er;
	}
	
	
	@Override
	public Employee getEmployee(int id) {
		return er.getEmployee(id);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return er.getAllEmployees();
	}

	@Override
	public Employee addEmployee(Employee e) {
		return er.addEmployee(e);
	}

	@Override
	public Employee updateEmployee(Employee change) {
		return er.updateEmployee(change);
	}

	@Override
	public Employee deleteEmployee(int id) {
		return er.deleteEmployee(id);
	}

}
