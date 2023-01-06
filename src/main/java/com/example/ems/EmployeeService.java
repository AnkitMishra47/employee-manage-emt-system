package com.example.ems;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Set;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeDB ;

    public Employee getEmployee(int employeeId){
        return employeeDB.getEmployee(employeeId);
    }

    public void createEmployee(Employee employee){
         employeeDB.addEmployee(employee);
    }

    public Collection<Employee> getAllEmployees(){
        return employeeDB.getAllEmployees();
    }

}
