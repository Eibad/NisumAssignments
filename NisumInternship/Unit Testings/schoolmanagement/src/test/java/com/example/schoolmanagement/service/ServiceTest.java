package com.example.schoolmanagement.service;

import com.example.schoolmanagement.dto.StudentDTO;
import com.example.schoolmanagement.model.Student;
import com.example.schoolmanagement.repository.StudentRepository;
//import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.function.Executable;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(SpringExtension.class)
//@RunWith(MockitoJUnitRunner.class)
public class ServiceTest  {

    @InjectMocks
    StudentService studentService;


    @Mock
    StudentRepository studentRepository;

//    @MockBean
//    Student student;

    @AfterEach
    public void clean(){
        System.out.println("clean method");
    }

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
    public void whenDerivedExceptionThrown_thenAssertionSucceds() {
        Exception exception = assertThrows(Exception.class, () -> {
            Integer.parseInt("1a");
        });

        String expectedMessage = "For input string";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public  void addStudentException(){
        Student studente = new Student(0,null,"III");
        StudentDTO studentDTOe = new StudentDTO(studente.getClassStd());

        when(studentService.saveStudent(studentDTOe)).thenThrow(new DataIntegrityViolationException("Could Not PErform Save Operation"));

//        studentService.saveStudent(studentDTOe);

        Throwable thrown = assertThrows(RuntimeException.class, () -> {
            studentService.saveStudent( new StudentDTO("studentDTOe"));
//            Integer.parseInt("1a");
        });



//        Throwable exception = assertThrows(Exception.class, new Executable() {
//            @Override
//            public void execute() throws Throwable {
//                Student studente = new Student(0,null,"III");
//                StudentDTO studentDTOe = new StudentDTO(studente.getId(),studente.getName(),studente.getClassStd());
//                studentService.saveStudent(studentDTOe);
//            }
//        });
//        assertEquals("we",exception.getMessage());
    }

//    @Test(expected = FileNotFoundException.class) //in junit4
    @Test
    public void addStudent() {
        Student studente = new Student(0,null,"III");
        StudentDTO studentDTOe = new StudentDTO(studente.getId(),studente.getName(),studente.getClassStd());

//        assertThrows(DataIntegrityViolationException.class,()->studentService.saveStudent(studentDTOe),"ww");

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
