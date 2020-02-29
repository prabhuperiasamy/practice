package com.prabhu.practice.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="department")
public class Department {
    @Id
    private int did;
    private String dname;


    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    @JsonIgnoreProperties("department")
//    @JsonBackReference
    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "department")
    private List<Student> student;


    public int getDid() {
        return did;
    }

    public void setDid(int id) {
        this.did = id;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String name) {
        this.dname = name;
    }
}
