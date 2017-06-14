package com.hemendra.mvc.controller;

import com.hemendra.mvc.Student;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by hp on 11-06-2017.
 */
@Controller
public class IndexController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("student", new Student());
        return "home";
    }
}
