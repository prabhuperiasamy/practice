package com.prabhu.practice.component;

import com.prabhu.practice.model.Student;
import com.prabhu.practice.service.StudentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;



    @GetMapping(value = "/students",produces = "application/json")
    public List<Student> getAllStudents(){
        Logger logger= LoggerFactory.getLogger(StudentController.class);
        logger.info("controller called");
        return studentService.getAllStudents();
    }


    //@Cacheable(key = "#sid",value = "Student")
    @GetMapping("/students/{id}")
    public Student StudentById(@PathVariable int id){
         return studentService.getStudentById(id);
    }

    @GetMapping("/check")
    public String check(){
        return "checked ";
    }

    @PostMapping("/students")
    public String insertStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }


//    @PutMapping("/students")
//    public Student updateStudent(@RequestBody Student student){
//        return studentService.updateStudent(student);
//    }


    @DeleteMapping("/students/{id}")
    public Student deleteStudent(@PathVariable int id){
        return studentService.deleteStudentById(id);
    }




//    @GetMapping("/students/department/{dept}")
//    public List<Student> studentByDepartment(@PathVariable String dept){
//        return repository.findAllByDepartment(dept);
//    }
//
//    @PutMapping("/students/department/{id}")
//    public String updateStudentDepartment(@PathVariable int id,@RequestBody String department){
//        Student s1=repository.findById(id).orElse(new Student());
//        s1.setDepartment(department);
//        repository.save(s1);
//        return "Updated successfully";
//    }

}
