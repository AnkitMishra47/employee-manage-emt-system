package com.example.ems;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.Collection;
import java.util.Set;

@RestController
public class EmployeeController {

    @Autowired // creating the object on it's own
    EmployeeService employeeService ;

    @RequestMapping("/get-employee/{id}")
    public ResponseEntity<Employee> getEmployee(@PathVariable("id") Integer employeeId){
        Employee employee = employeeService.getEmployee(employeeId);
        return new ResponseEntity<>(employee , HttpStatus.OK);
    }

    @RequestMapping("/get-all-employees")
    public ResponseEntity<Collection<Employee>> getEmployees(){
        Collection<Employee> employees = employeeService.getAllEmployees();
        return new ResponseEntity<>(employees , HttpStatus.OK);
    }

    @PostMapping("/add-employee")
    public ResponseEntity<String> addEmployee(@RequestBody() Employee employee){
        employeeService.createEmployee(employee);
        return new ResponseEntity<>("Employee Added Successfully" , HttpStatus.CREATED);
    }
}
