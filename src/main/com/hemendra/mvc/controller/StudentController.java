package com.hemendra.mvc.controller;

import com.hemendra.mvc.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hp on 14-06-2017.
 */
@Controller
@RequestMapping(value = "/student")
public class StudentController {
    @RequestMapping(value = "/processForm")
    public String processForm(@ModelAttribute("student")Student student) {
        System.out.println(student);
        return "success";
    }
}
