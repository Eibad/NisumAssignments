package com.example.schoolmanagement.controller;


import com.example.schoolmanagement.dto.StudentDTO;
import com.example.schoolmanagement.model.Student;
import com.example.schoolmanagement.repository.StudentRepository;
import com.example.schoolmanagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api")
//resr vs conmvn
public class StudentController {

    @Autowired
    StudentService studentService;


    @PostMapping("/student")
    private ResponseEntity<Student> save(@RequestBody StudentDTO studentDTO){

        return new ResponseEntity<Student>(studentService.saveStudent(studentDTO), HttpStatus.CREATED);
    }


    @GetMapping("/student")
    private List<Student> getAllStudents(){
        return studentService.getAllStudent();
    }


    @GetMapping("/student/{id}")
    private ResponseEntity<Student> getStudentById(@PathVariable("id") Long studentId){
        return new ResponseEntity<Student>(studentService.getStudentById(studentId),HttpStatus.OK);
    }

    //dap call repo by auto
    //dao in servce
    //service in contr

    //logic in service

}
