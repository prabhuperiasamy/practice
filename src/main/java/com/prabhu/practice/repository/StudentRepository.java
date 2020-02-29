package com.prabhu.practice.repository;


import com.prabhu.practice.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {

//    List<Student> findAllByDepartment(String dept);
}
