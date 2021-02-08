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

    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/hello")
    public String helo(){
        return "hello world";
    }

    @PostMapping("/student")
    private ResponseEntity<Student> save(@RequestBody StudentDTO studentDTO){

        return new ResponseEntity<Student>(studentService.saveStudent(studentDTO), HttpStatus.OK);
    }

    @PostMapping("/studentss")
    private Student saveStudent(@RequestBody Student student){

        return (studentRepository.save(student));
    }

    @GetMapping("/student")
    private List<Student> getAllStudents(){
        return studentService.getAllStudent();
    }

    @GetMapping("/students")
    public List<Student> g(){
        return studentRepository.findAll();
    }

    @CrossOrigin
    @GetMapping(value="/ticketId/{ticketId}",produces= MediaType.APPLICATION_JSON_VALUE)
    public Student getTicketById(@PathVariable("ticketId")Long ticketId){
        return studentService.getStudentById(ticketId);
    }

    @GetMapping("/getEmployees")
    public List<Student> getAllEmployees() {
        List<Student> employees = studentRepository.findAll();
        return employees;
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
