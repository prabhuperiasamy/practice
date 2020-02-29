package com.prabhu.practice.component;

import com.prabhu.practice.model.Department;
import com.prabhu.practice.service.DepartmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;


    @GetMapping("/department")
    public List<Department> getAllStudents(){
        return departmentService.getAllDepartment();
    }


    @GetMapping("/department/{id}")
    public Department departmentById(@PathVariable int id){
        return departmentService.getDepartmentById(id);
    }


    @PostMapping("/department")
    public Department insertDepartment(@RequestBody Department department){
        return departmentService.createDepartment(department);
    }


//    @PutMapping("/department")
//    public Department updateDepartment(@RequestBody Department department){
//        return departmentService.updateDepartment(department);
//    }


    @DeleteMapping("/department/{id}")
    public Department deleteDepartmentById(@PathVariable int id){
        return departmentService.deleteDepartmentById(id);
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
