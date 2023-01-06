package com.example.ems;

public class Employee {
    private Integer employee_id;
    private String name;
    private String email;
    private String department;

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Employee(int employee_id, String name, String email, String department) {
        this.employee_id = employee_id;
        this.name = name;
        this.email = email;
        this.department = department;
    }
}
