package com.student.portal.controller;

import com.student.portal.model.Student;
import com.student.portal.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class StudentController {

    @Autowired
    StudentDao studentDao;

//    @RequestMapping("/addstudent")
//    public ModelAndView add(HttpServletRequest request, HttpServletResponse response){
//
//        String name = request.getParameter("name");
//
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("display");
//        modelAndView.addObject("result", name);
//
//        return modelAndView;
//    }

    @RequestMapping("/addstudent")
    public String addStudent(@ModelAttribute("Student") Student student){

          studentDao.saveStudent(student);

          return "redirect:/viewstudent";
//        return "viewStudent";
    }

    @RequestMapping("/viewstudent")
    public String viewStudent(Model model){

        List<Student> list = studentDao.getStudents();
        model.addAttribute("studentList",list);
        return "viewStudent";
    }

    @RequestMapping(value="/deletestudent/{id}")
    public String deleteStudent(@PathVariable String id){
        studentDao.deleteStudent(id);
        return "redirect:/viewstudent";
    }


    @RequestMapping(value="/updatestudent/{id}")
    public String updateStudent(@PathVariable String id, Model m){
        Student student=studentDao.getStudentById(id);
        m.addAttribute("command",student);
        return "redirect:/";
//        return "index";

        //        studentDao.updateStudent(id,student);
//        return "redirect:/viewstudent";
    }

    @ModelAttribute("countryList")
    public Map<String, String> getCountryList() {
        Map<String, String> countryList = new HashMap<String, String>();
        countryList.put("US", "United States");
        countryList.put("CH", "China");
        countryList.put("SG", "Singapore");
        countryList.put("MY", "Malaysia");
        return countryList;
    }
}
