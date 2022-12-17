package com.java.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EmployeeController {

    @GetMapping("/iteration")
    public String bootstarp(Model model){
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Ramesh","Fadetare","ramesh@gmail.com"));
        employees.add(new Employee("anil","gundapaneni","anilg@gmail.com"));
        employees.add(new Employee("chaitanya","annam","chaituA@gmail.com"));
        employees.add(new Employee("mokshitha","ramisetti","mokshithaR@gmail.com"));
        model.addAttribute("employees",employees);
        return "iteration";
    }
}

