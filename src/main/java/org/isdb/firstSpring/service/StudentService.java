package org.isdb.firstSpring.service;

import java.util.List;
import java.util.Optional;

import org.isdb.firstSpring.model.Student;
import org.isdb.firstSpring.repository.StudentRepository;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class StudentService {
	private final StudentRepository repository;

	public StudentService(StudentRepository repository) {
		this.repository = repository;
	}

	public Student saveStudent(Student student) {
		if (student != null)

			return repository.save(student);
		else
			return null;
	}

	public List<Student> getStudents() {

		return repository.findAll();
	}

	public void deleteById(int id) {
		repository.deleteById(id);
	}

	public Optional<Student> findStudentById(int id) {

		return repository.findById(id);
	}

	public List<Student> getStudentByName(String name) {

		return null;
	}

}
