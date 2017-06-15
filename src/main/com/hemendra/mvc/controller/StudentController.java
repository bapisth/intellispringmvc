package com.hemendra.mvc.controller;

import com.hemendra.mvc.Student;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

/**
 * Created by hp on 14-06-2017.
 */
@Controller
@RequestMapping(value = "/student")
public class StudentController {

    @InitBinder
    public void preProcessForm(WebDataBinder dataBinder) {
        StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
        dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
    }

    @RequestMapping(value = "/showForm")
    public String showForm(Model model){
        model.addAttribute("student", new Student());
        return "/student";
    }

    @RequestMapping(value = "/processForm")
    public String processForm(
            @Valid
            @ModelAttribute("student")Student student, BindingResult bindingResult) {
        System.out.println(student);
        System.out.println(bindingResult);
        if (bindingResult.hasErrors()){
            return "student";
        }

        return "success";
    }
}
