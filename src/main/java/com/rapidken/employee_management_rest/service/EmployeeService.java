package com.rapidken.employee_management_rest.service;

import com.rapidken.employee_management_rest.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> findAll(int records);

    public List<Employee> findByDept(String dept);

    public List<Employee> findByPos(String pos);

}
