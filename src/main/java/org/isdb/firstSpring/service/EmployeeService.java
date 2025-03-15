package org.isdb.firstSpring.service;

import java.util.Optional;

import org.isdb.firstSpring.model.Employee;
import org.isdb.firstSpring.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	private final EmployeeRepository repository;

	public EmployeeService(EmployeeRepository repository) {
		this.repository = repository;
	}

	public Employee saveEmployee(Employee employee) {
		int save = repository.save(employee);
		return getEmpById(save);
	}

	public Employee getEmpById(int id) {
		Optional<Employee> byId = repository.findById(id);
		return byId.get();
	}

}
