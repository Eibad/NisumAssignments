package com.example.schoolmanagement.controller;

import com.example.schoolmanagement.dto.StudentDTO;
import com.example.schoolmanagement.model.Student;
import com.example.schoolmanagement.service.StudentService;
import com.fasterxml.jackson.databind.ObjectMapper;
//import org.junit.Before;
//import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//@RunWith(SpringJUnit4ClassRunner.class)
//@RunWith(MockitoJUnitRunner.class)
//@SpringBootTest

@ExtendWith(SpringExtension.class)
//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class ControllerTest {
//    @Autowired

//    @Mock
//    StudentController studentController;



    @InjectMocks
    StudentController studentController;
    @Mock
    StudentService studentService;

    MockMvc mockMvc ;

//    @Mock
//    StudentRepository studentRepository;

//    @BeforeAll
//   public void  setUp(){
//        mockMvc = MockMvcBuilders.standaloneSetup(studentController).build();
//    }


    @Test
    public void getAllStudents() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(studentController).build();
        Student student= new Student(1L,"1","1");
        Student student1= new Student(2L,"1","1");
        List<Student> studentList = Arrays.asList(student,student1);

        Mockito.when(studentService.getAllStudent()).thenReturn(studentList);

        MvcResult result = mockMvc.perform(get("/api/student")).andExpect(status().isOk()).andReturn();

        ObjectMapper objectMapper = new ObjectMapper();
        String  productlist = result.getResponse().getContentAsString();
        Student[] students = objectMapper.readValue(productlist,Student[].class);

        assertEquals(studentList.size(),students.length);
    }

    @Test
    public void getStudent() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(studentController).build();
        Student student = new Student(1L,"Eibad","II");

        Mockito.when(studentService.getStudentById(anyLong())).thenReturn(student);

        MvcResult result = mockMvc.perform(get("/api/student/1")).andExpect(status().isOk()).andReturn();

        ObjectMapper objectMapper = new ObjectMapper();
        Student outputStudent = objectMapper.readValue(result.getResponse().getContentAsString(),Student.class);

//        assertEquals(student.toString(),result.getResponse().getContentAsString());
        assertEquals(student.toString(),outputStudent.toString());
    }

    @Test
    public void saveStudent() throws Exception {
        mockMvc = MockMvcBuilders.standaloneSetup(studentController).build();
        Student student = new Student("Eibad","II");
        StudentDTO studentDTO = new StudentDTO(student.getId(),student.getName(),student.getClassStd());
        Mockito.when(studentService.saveStudent(any(StudentDTO.class))).thenReturn(student);

        ObjectMapper objectMapper = new ObjectMapper();
        String json = objectMapper.writeValueAsString(studentDTO);
        MockHttpServletResponse  response = mockMvc.perform(post("/api/student/").content(json).contentType(MediaType.APPLICATION_JSON)).andReturn().getResponse();

//        MockHttpServletResponse response = result.getResponse();
        assertEquals(HttpStatus.CREATED.value(),response.getStatus());


    }


}
