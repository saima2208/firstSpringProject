package org.isdb.firstSpring.controller;

import java.util.List;

import org.isdb.firstSpring.model.Teacher;
import org.isdb.firstSpring.service.TeacherService;
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

@RestController
@RequestMapping(value = "/teacher")
public class TeacherController {

	private final TeacherService teacherService;

	public TeacherController(TeacherService teacherService) {
		this.teacherService = teacherService;
	}

	@PostMapping
	public ResponseEntity<?> saveTeacher(@RequestBody Teacher teacher) {
		Teacher saved = teacherService.saveTeacher(teacher);
		return new ResponseEntity<>(saved,HttpStatus.CREATED);
	}

	@GetMapping("/{id}")
	public Teacher getTeacher(@PathVariable Integer id) {
		return teacherService.getTeacher(id);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteTeacher(@PathVariable Integer id) {
		teacherService.deleteTeacher(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);

	}

	@GetMapping
	public List<Teacher> getAllTeachers() {
		return teacherService.getAllTeachers();
	}

	@PutMapping("/{id}")
	public Teacher updateTeacher(@PathVariable Integer id, @RequestBody Teacher teacher) {

		return teacherService.updateTeacher(id, teacher);
	}

}
