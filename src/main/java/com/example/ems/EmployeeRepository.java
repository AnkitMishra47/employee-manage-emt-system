package com.example.ems;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class EmployeeRepository {

    Map<Integer , Employee> employees = new HashMap<>();

    public Employee getEmployee(Integer employeeId){
        return employees.get(employeeId);
    }

    public void addEmployee(Employee employee){
        employees.put(employee.getEmployee_id() , employee);
    }

    public Collection<Employee> getAllEmployees(){
        return employees.values();
    }
}
