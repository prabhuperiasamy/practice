package com.prabhu.practice.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue
    private int sid;
    private String sname;

    @JsonIgnoreProperties("student")
    @ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinColumn(name="dept_id")

    private Department department;

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int id) {
        this.sid = id;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String name) {
        this.sname = name;
    }

}
