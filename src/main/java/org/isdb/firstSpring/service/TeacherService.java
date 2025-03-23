package org.isdb.firstSpring.service;

import java.util.List;

import org.isdb.firstSpring.model.Teacher;
import org.isdb.firstSpring.repository.TeacherRepository;
import org.springframework.stereotype.Service;

@Service
public class TeacherService {
    public final TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public Teacher saveTeacher(Teacher teacher) {
        return teacherRepository.save(teacher);

    }

    public Teacher getTeacher(Integer id) {

        return teacherRepository.findById(id).orElse(null);
    }

    public void deleteTeacher(Integer id) {
        teacherRepository.deleteById(id);
    }

    public List<Teacher> getAllTeachers() {
        return teacherRepository.findAll();

    }

    public Teacher updateTeacher(Integer id, Teacher teacher) {
        Teacher teacherById = teacherRepository.findById(id).orElse(null);

        if (teacherById != null) {
            if (teacher.getName() != null) {
                teacherById.setName(teacher.getName());
            }
            if (teacher.getEmail() != null) {
                teacherById.setEmail(teacher.getEmail());
            }
            if (teacher.getGender() != null) {
                teacherById.setGender(teacher.getGender());
            }
            if (teacher.getAddress() != null) {
                teacherById.setAddress(teacher.getAddress());
            }
            if (teacher.getPhone() != null) {
                teacherById.setPhone(teacher.getPhone());
            }
            if (teacher.getJoiningDate() != null) {
                teacherById.setJoiningDate(teacher.getJoiningDate());
            }
            if (teacher.getSalary() != null) {
                teacherById.setSalary(teacher.getSalary());
            }
            if (teacher.getIsMarried() != null) {
                teacherById.setIsMarried(teacher.getIsMarried());
            }
            return teacherRepository.save(teacherById);
        } else {
            return null;
        }

    }

}
