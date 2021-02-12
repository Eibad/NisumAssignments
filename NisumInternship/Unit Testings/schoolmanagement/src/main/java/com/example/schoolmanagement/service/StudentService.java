package com.example.schoolmanagement.service;

import com.example.schoolmanagement.dto.StudentDTO;
import com.example.schoolmanagement.exception.DaoException;
import com.example.schoolmanagement.model.Student;
import com.example.schoolmanagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public Student saveStudent(StudentDTO studentDTO){

        try {
            Student student = new Student();
            student.setName(studentDTO.getName());
            student.setClassStd(studentDTO.getClassStd());
            return studentRepository.save(student);
        }catch (DataIntegrityViolationException ex){
//            throw new DaoException("Could Not PErform Save Operation");
//
//        }catch (Exception ex){
            throw new RuntimeException(ex);
        }
//        HibernateException
    }

    public List<Student> getAllStudent(){

        List<Student> studentList = studentRepository.findAll();
        return studentList;
    }

    public Student getStudentById(Long id){
        Optional<Student> student = studentRepository.findById(id);

        return student.get();
    }

    public void deleteStudentId(Long id){
        studentRepository.deleteById(id);
    }




}
