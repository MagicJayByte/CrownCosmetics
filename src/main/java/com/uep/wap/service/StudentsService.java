package com.uep.wap.service;

import com.uep.wap.model.Student;
import com.uep.wap.repository.StudentRepository;
import com.uep.wap.dto.StudentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentsService
{

    @Autowired
    private StudentRepository studentRepository;

    public void addStudent(StudentDTO studentDTO) {
        Student student = new Student();
        student.setName(studentDTO.getName());
        student.setPoints(studentDTO.getPoints());
        studentRepository.save(student);
        System.out.println("Student added!");
    }

    public Iterable<Student> getAllStudents() {
        return studentRepository.findAll();
    }

}
