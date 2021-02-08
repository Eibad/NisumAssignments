package com.example.schoolmanagement.controller;


import com.example.schoolmanagement.dto.StudentDTO;
import com.example.schoolmanagement.model.Student;
import com.example.schoolmanagement.repository.StudentRepository;
import com.example.schoolmanagement.service.StudentService;

import static org.mockito.ArgumentMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;
import javafx.beans.binding.When;
import org.apache.catalina.connector.Response;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.hamcrest.CoreMatchers.is;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.mockito.BDDMockito.given;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//@RunWith(SpringRunner.class)
////@SpringBootTest
//@WebMvcTest(StudentController.class)

@RunWith(MockitoJUnitRunner.class)
public class StudentControllerTest {

    @Autowired
    MockMvc mockMvc;

    @MockBean
    private StudentService studentService;

    @Test
    public void test() throws Exception {
        Student mockTicket = new Student(1L,"n","e");


        Mockito.when(studentService.getStudentById(anyLong())).thenReturn(mockTicket);

        String URI = "/api/ticketId/1";
        RequestBuilder requestBuilder = MockMvcRequestBuilders.get(
                URI).accept(
                MediaType.APPLICATION_JSON);

        MvcResult result = mockMvc.perform(requestBuilder).andReturn();
        String expectedJson = this.mapToJson(mockTicket);
        String outputInJson = result.getResponse().getContentAsString();
        assertThat(outputInJson).isEqualTo(expectedJson);
    }
    private String mapToJson(Object object) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.writeValueAsString(object);
    }


//    private MockMvc mockMvc;
//    @Autowired
//    private WebApplicationContext context;
//    ObjectMapper om = new ObjectMapper();
//
//    @Before
//    public void setUp() {
//        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
//    }
//    @Autowired
//    MockMvc mockMvc;

//    @MockBean
//    StudentService studentService;

//    @MockBean
//    StudentRepository studentRepository;
//
//    @Autowired
//    ObjectMapper objectMapper;

//    @Test
//    public void test() throws Exception {
//        Student student= new Student(1L,"1","1");
//        Student student1= new Student(2L,"1","1");
////        List<Student> studentList = Arrays.asList(student,student1);
//        List<Student> studentList = new ArrayList<>();
//        studentList.add(student);
//        studentList.add(student1);
//        MvcResult result = mockMvc
//                .perform(get("/api/getEmployees").content(MediaType.APPLICATION_JSON_VALUE))
//                .andExpect(status().isOk()).andReturn();
//        result.getResponse();
//        String resultContent = result.getResponse().getContentAsString();
//        Response response = om.readValue(resultContent, Response.class);
//        Assert.assertTrue(response.isStatus() == Boolean.TRUE);
//        Mockito.when(studentRepository.findAll()).thenReturn(studentList);

//        String url ="/students";
//        mockMvc.perform(get(url)).andExpect(status().isOk());

//        Mockito.doNothing().when(studentService.getAllStudent());
//        mockMvc.perform(get("/student")).andReturn();
//        mockMvc.equals(new Student());
//    }

//    @Mock
//    StudentService studentService;

//    @Mock
//    StudentRepository studentRepository;


//    @Test
//    public void testController() throws Exception {
//        Student student= new Student("1","1");
//        Student student1= new Student("1","1");
//
////        StudentDTO student2= new StudentDTO("1","1");
//        List<Student> studentList = Arrays.asList(student,student1);
////        List<StudentDTO> studentList1 = Arrays.asList(student2,student2);
//
//
//        when(studentService.getAllStudent()).thenReturn(studentList);
//
//        String url = "/student";
//        mockMvc.perform(get(url)).andExpect(status().isOk());
//
//
//    }
//
//    @InjectMocks
//    private StudentController helloWorldController;
//
//    private MockMvc mockMvc;
//
//    @Before
//    public void setup() {
//        MockitoAnnotations.initMocks(this);
//        this.mockMvc = MockMvcBuilders.standaloneSetup(helloWorldController).build();
//    }
//
//    @Test
//    public void testCreateSignupFormInvalidUser() throws Exception {
//        this.mockMvc.perform(get("/api/student")).andExpect(status().isOk());
//    }

//    @Autowired
//    MockMvc mockMvc;
//
//    @InjectMocks
//    StudentService studentService;
//
//    @Mock
//    StudentRepository studentRepository;
//
//    @Test
//    public void shouldFetchAllUsers() throws Exception {
//        Student student= new Student("1","1");
//        Student student1= new Student("1","1");
//        Student student2= new Student("1","1");
//        List<Student> studentList = Arrays.asList(student,student1,student2);
//        given(studentService.getAllStudent()).willReturn(studentList);
//
//        mockMvc.perform(get("/api/student"))
//                .andExpect(status().isOk())
//                .andExpect(jsonPath("$.size()", is(studentList.size())));
//    }
//
//
//    @Test
//    public void getStudent() throws Exception {
//        Student student= new Student("1","1");
//        Student student1= new Student("1","1");
//        Student student2= new Student("1","1");
//        List<Student> studentList = Arrays.asList(student,student1,student2);
//
//        when(studentService.getAllStudent()).thenReturn(studentList);
//        when(studentRepository.findAll()).thenReturn(studentList);
//
//        String url = "/api/students";
//        MvcResult mvcResult = mockMvc.perform(get(url)).andExpect(status().isOk()).andReturn();
////        MvcResult mvcResult = mockMvc.perform(get("/api")).andExpect(redirectedUrl("/students")).andExpect(status().isFound()).andReturn();
//
//        System.out.println(mvcResult);
//
//    }

}
