package com.prabhu.practice.service;


import com.prabhu.practice.model.Department;
import com.prabhu.practice.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    DepartmentRepository departmentRepository;


    //get all Department
    public List<Department> getAllDepartment(){
        return departmentRepository.findAll();
    }

    //get Department by id
    public Department getDepartmentById(int id){
        return departmentRepository.findById(id).orElse(new Department());
    }

    //create Department
    public Department createDepartment(Department department){
        return departmentRepository.save(department);
    }

    //update Department
//    public Department updateDepartment(Department department){
//        Department updatedDepartment=departmentRepository.findById(department.getId()).orElse(new Department());
//        updatedDepartment.setId(department.getId());
//        updatedDepartment.setName(department.getName());
//        return updatedDepartment;
//    }

    //delete Department by id
    public Department deleteDepartmentById(int id){
        Department deletedDepartment=departmentRepository.findById(id).orElse(new Department());
        departmentRepository.deleteById(id);
        return deletedDepartment;
    }
}
