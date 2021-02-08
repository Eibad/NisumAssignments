package com.example.schoolmanagement.model;


import javax.persistence.*;

@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String name;

    private String classStd;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassStd() {
        return classStd;
    }

    public void setClassStd(String classStd) {
        this.classStd = classStd;
    }

    public Student(String name, String classStd) {
        this.name = name;
        this.classStd = classStd;
    }

    public Student(long id, String name, String classStd) {
        this.id = id;
        this.name = name;
        this.classStd = classStd;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", classStd='" + classStd + '\'' +
                '}';
    }
}
