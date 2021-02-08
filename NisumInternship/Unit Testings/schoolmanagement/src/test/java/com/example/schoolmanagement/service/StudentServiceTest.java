package com.example.schoolmanagement.service;

import com.example.schoolmanagement.dto.StudentDTO;
import com.example.schoolmanagement.model.Student;
import com.example.schoolmanagement.repository.StudentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.*;


@RunWith(MockitoJUnitRunner.class)
//@SpringBootTest   //it run whole application
public class StudentServiceTest {

    @InjectMocks
    StudentService studentService;


    @Mock
    StudentRepository studentRepository;

//    @MockBean
//    Student student;

    @Test
    public void getAllStudent(){
        Student student= new Student("1","1");
        Student student1= new Student("1","1");
        Student student2= new Student("1","1");
        List<Student> studentList = Arrays.asList(student,student1,student2);
        when(studentRepository.findAll()).thenReturn(studentList);
        assertEquals(3,studentService.getAllStudent().size());
    }

    @Test
    public void getStudent(){
        Student student = new Student(21L,"Eibad","III");


        when(studentRepository.findById(anyLong())).thenReturn(java.util.Optional.of(student)); //didnt go to db
        assertEquals(student,studentService.getStudentById(21L));
    }

    @Test
    public void addStudent(){
        Student student = new Student(1L,"Eibad","III");
        StudentDTO studentDTO = new StudentDTO(student.getId(),student.getName(),student.getClassStd());

        when(studentRepository.save(any(Student.class))).thenReturn(student);
       Student student1 =  studentService.saveStudent(studentDTO);
       assertNotNull(student1);
//       assertEquals();
//        assertThat(studentService.saveStudent(new StudentDTO(student.getName(),student.getClassStd()))).isEqualTo(student);
    }

    @Test
    public void deleteStudentById(){
        Student student = new Student(anyLong(),"Eibad","III");
        studentService.deleteStudentId(student.getId());
        verify(studentRepository,times(1)).deleteById(student.getId());
    }

}
