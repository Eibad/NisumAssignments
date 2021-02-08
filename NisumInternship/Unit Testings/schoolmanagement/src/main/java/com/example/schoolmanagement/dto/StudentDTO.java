package com.example.schoolmanagement.dto;

public class StudentDTO {

    private long id;
    private String name;
    private String classStd;

    public StudentDTO() {
    }

    public StudentDTO( String name, String classStd) {
        this.name = name;
        this.classStd = classStd;
    }

    public StudentDTO(long id, String name, String classStd) {
        this.id = id;
        this.name = name;
        this.classStd = classStd;
    }

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


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", classStd='" + classStd + '\'' +
                '}';
    }
}
