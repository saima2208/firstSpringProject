package org.isdb.firstSpring.controller;

import java.util.List;

import org.isdb.firstSpring.dto.StudentDTO;
import org.isdb.firstSpring.model.Student;
import org.isdb.firstSpring.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/student")
public class StudentController {

	private final StudentService studentService;

	public StudentController(StudentService studentService) {
		this.studentService = studentService;
	}

	@PostMapping
	public ResponseEntity<Student> saveStudent(@Valid @RequestBody StudentDTO studentDTO) {
		Student saved = studentService.saveStudent(studentDTO);
		return new ResponseEntity<>(saved, HttpStatus.CREATED);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Student> getStudent(@PathVariable Integer id) {
		Student student = studentService.getStudent(id);
		return new ResponseEntity<>(student, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteStudent(@PathVariable Integer id) {
		studentService.deleteStudent(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

	@GetMapping
	public ResponseEntity<List<Student>> getAllStudent() {
		List<Student> students = studentService.getAllStudent();
		return new ResponseEntity<>(students, HttpStatus.OK);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Student> updateStudent(@PathVariable Integer id, @RequestBody StudentDTO studentDTO) {
		Student updated = studentService.updateStudent(id, studentDTO);
		return new ResponseEntity<>(updated, HttpStatus.OK);
	}
}
