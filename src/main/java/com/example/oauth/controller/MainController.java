package com.example.oauth.controller;

import com.auth0.client.auth.AuthAPI;
import com.example.oauth.entities.Employee;
import com.example.oauth.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    Service service;


    @RequestMapping("/hello")
    public String firstPage(){
        return "hello world";
    }

    @GetMapping("/employees")
    public List<String> getEmp(){
        return  service.getEmployees();
    }

    @PostMapping("/addEmp")
    public String addEmployee(@RequestBody Employee employee){
    service.addEmployee(employee);
    return "added";
    }


}
