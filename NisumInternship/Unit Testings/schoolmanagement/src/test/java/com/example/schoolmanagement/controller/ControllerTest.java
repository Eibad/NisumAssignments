package com.example.schoolmanagement.controller;

import com.example.schoolmanagement.dto.StudentDTO;
import com.example.schoolmanagement.model.Student;
import com.example.schoolmanagement.repository.StudentRepository;
import com.example.schoolmanagement.service.StudentService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.mock.mockito.MockBeans;
import org.springframework.http.MediaType;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import java.sql.ResultSet;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//@RunWith(SpringJUnit4ClassRunner.class)
//@WebMvcTest(StudentController.class)
@RunWith(MockitoJUnitRunner.class)

public class ControllerTest {
//    @Autowired

//    @Mock
//    StudentController studentController;





    MockMvc mockMvc;

    @InjectMocks
    StudentController studentController;
    @InjectMocks
    StudentService studentService;


    @Mock
    StudentRepository studentRepository;




    @Before
   public void setUp(){
        mockMvc = MockMvcBuilders.standaloneSetup(studentController).build();
    }

    @Test
    public void test() throws Exception {
       mockMvc.perform(get("/api/hello")).andExpect(status().isOk()).andExpect(content().string("hello world"));
    }

    @Test
    public void getAllStudents() throws Exception {
        Student student= new Student(1L,"1","1");
        Student student1= new Student(2L,"1","1");
        List<Student> studentList = Arrays.asList(student,student1);
//        Mockito.when(studentRepository.findAll()).thenReturn(studentList);
        Mockito.when(studentService.getAllStudent()).thenReturn(studentList);
//        Mockito.when(studentRepository.findAll()).thenReturn(studentList);


//        RequestBuilder requestBuilder = get(
//                "/api/students");
//        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
//        System.out.println(requestBuilder);

        MvcResult result = mockMvc.perform(get("/api/students")).andExpect(status().isOk()).andReturn();
        System.out.println(result.getResponse());


//        assertThat(result.getResponse().getContentLength()).isEqualTo(studentList).toString();
result.getResponse().getContentLength();
        ObjectMapper objectMapper = new ObjectMapper();
        String  productlist = result.getResponse().getContentAsString();
        Student[] students = objectMapper.readValue(productlist,Student[].class);
//         Student productlist = objectMapper.readValue(result.getResponse().getContentAsString(),Student.class);

        System.out.println(students.length);
//        assertThat(students.length).isEqualTo(studentList.size());
        assertEquals(studentList.size(),students.length);

//        assertEquals(expected, result.getResponse();
    }

//    @Test
    public void saveStudent() throws Exception {
        Student student = new Student(1L,"Eibad","III");
        StudentDTO studentDTO = new StudentDTO(student.getId(),student.getName(),student.getClassStd());
//        when(studentService.saveStudent(studentDTO)).thenReturn(student);
//        when(studentRepository.save(any(Student.class)).thenReturn(student);
//        when(studentRepository.save(any(Student.class))).thenReturn(student);

        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(student);
//        MvcResult result = mockMvc.perform(post("/api/studentss").content(json).contentType(MediaType.APPLICATION_JSON)).andReturn();
//        RequestBuilder result = MockMvcRequestBuilders.post("/api/studentss").content(json).contentType(MediaType.APPLICATION_JSON);
//        MvcResult result1 = mockMvc.perform(result).andReturn();
//        MockHttpServletResponse response = result1.getResponse();

//        System.out.println(result);


    }

//    @Test
    public void save() throws Exception {
        Student student = new Student("Eibad","III");
        StudentDTO studentDTO = new StudentDTO(student.getId(),student.getName(),student.getClassStd());
//        when(studentRepository.save(student)).thenReturn(student);
//        when(studentService.saveStudent(studentDTO)).thenReturn(student);

        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(student);
       mockMvc.perform(post("/api/studentss").content(json).contentType(MediaType.APPLICATION_JSON));

        System.out.println();
    }

//    @Test
    public void getStudent() throws Exception {
        Student student= new Student(1L,"1","1");
        Student student1= new Student(2L,"1","1");
        List<Student> studentList = Arrays.asList(student,student1);

//        Mockito.when(studentRepository.findAll()).thenReturn(studentList);
        Mockito.when(studentService.getStudentById(1L)).thenReturn(student);
//        Mockito.when(studentRepository.findAll()).thenReturn(studentList);


//        RequestBuilder requestBuilder = get(
//                "/api/students");
//        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
//        System.out.println(requestBuilder);

        MvcResult result = mockMvc.perform(get("/student/{id}")).andExpect(status().isOk()).andReturn();
        System.out.println(result.getResponse());


//        assertThat(result.getResponse().getContentLength()).isEqualTo(studentList).toString();
        result.getResponse().getContentLength();
        ObjectMapper objectMapper = new ObjectMapper();
        String  productlist = result.getResponse().getContentAsString();
        Student[] students = objectMapper.readValue(productlist,Student[].class);
//         Student productlist = objectMapper.readValue(result.getResponse().getContentAsString(),Student.class);

        System.out.println(students.length);
//        assertThat(students.length).isEqualTo(studentList.size());
        assertEquals(studentList.size(),students.length);

//        assertEquals(expected, result.getResponse();

//        List<Student> studentList = new ArrayList<>();
//        studentList.add(student);
//        studentList.add(student1);

//        when(studentService.getAllStudent()).thenReturn(studentList);

        RequestBuilder requestBuilder = get(
                "/api/student");

//        MvcResult result = mockMvc.perform(requestBuilder).andReturn();

//        System.out.println(result.getResponse());
//        String expected = "{id:Course1,name:Spring,description:10Steps}";

        // {"id":"Course1","name":"Spring","description":"10 Steps, 25 Examples and 10K Students","steps":["Learn Maven","Import Project","First Example","Second Example"]}

//        JSONAssert.assertEquals(expected, result.getResponse()
//                .getContentAsString(), false);

    }

}
