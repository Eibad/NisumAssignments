package com.student.portal.dao;

import com.student.portal.model.Student;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class StudentDao {
    JdbcTemplate template;

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }
//    public int save(Student std){
//        String sql="insert into Emp99(name,salary,designation) values('"+std.getName();+"',"+p.getSalary()+",'"+p.getDesignation()+"')";
//        return template.update(sql);
//    }
    public List<Student> getStudents(){
        return template.query("select * from student",new RowMapper<Student>(){
            public Student mapRow(ResultSet rs, int row) throws SQLException {
                Student std=new Student();
                std.setId(rs.getInt(1));
                std.setRollNumber(rs.getString(2));
                std.setClassStd(rs.getString(4));
                std.setName(rs.getString(3));
                return std;
            }
        });
    }

    public Student getStudentById(String id){

        System.out.printf("12weldfvb");
//        return template.queryForObject(sql, new Object[]{id},new BeanPropertyRowMapper<Emp>(Emp.class));
        String sql = "SELECT * FROM student WHERE id = ?";

        Student student =template.queryForObject(
                sql, new Object[] { id }, new BeanPropertyRowMapper<Student>());

//        return  template.queryForObject("select * from student where id = ?",new Object[]{id} ,new BeanPropertyRowMapper<Student>(Student.class));

        return student;
    }

    public int saveStudent(Student student) {
        String sql="insert into student(stdRollNumber,stdName,stdClass) values('"+student.getRollNumber()+"','"+student.getName()+"','"+student.getClassStd()+"')";
        return template.update(sql);
        //took query to property file
    }

    public int deleteStudent(String id){
        String sql= "DELETE FROM student WHERE stdId="+id;
        return template.update(sql);
    }

    public int updateStudent(String id, Student student){

        String sql = "update student set stdRollNumber ='"+student.getRollNumber()+"',stdName='"+student.getName()+"',stdClass='"+student.getClassStd()+"' WHERE stdId ="+ id;

        return template.update(sql);
    }
}
