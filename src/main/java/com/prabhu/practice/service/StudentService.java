package com.prabhu.practice.service;


import com.prabhu.practice.model.Student;
import com.prabhu.practice.repository.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;


    //get all students
    @Cacheable(key = "#sid",value = "Student",condition = "#sid!=null")
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    //get student by id
    @Cacheable(key = "#sid",value = "Student",condition = "#sid!=null")
    public Student getStudentById(int id){
        return studentRepository.findById(id).orElse(new Student());
    }

    //create student
    public String createStudent(Student student){
      studentRepository.save(student);
      return "Student Added";
    }

    //update student
//    public Student updateStudent(Student student){
//        Student updatedStudent=studentRepository.findById(student.getId()).orElse(new Student());
//        updatedStudent.setName(student.getName());
//        return updatedStudent;
//    }

    //delete student by id
    public Student deleteStudentById(int id){
        Student deletedStudent=studentRepository.findById(id).orElse(new Student());
        studentRepository.deleteById(id);
        return deletedStudent;
    }




}
