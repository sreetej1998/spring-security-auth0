package com.example.oauth.service;


import com.example.oauth.dao.EmployeeRepository;
import com.example.oauth.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    EmployeeRepository employeeRepository;

    public Service(){

    }

    public List<String> getEmployees(){
        List<Employee> employees=employeeRepository.findAll();
        List<String> employeeNames=new ArrayList<>();
        for(Employee emp:employees)
            employeeNames.add(emp.getName());
        return employeeNames;

    }

    public void addEmployee(Employee employee){
        employeeRepository.save(employee);
    }

}
