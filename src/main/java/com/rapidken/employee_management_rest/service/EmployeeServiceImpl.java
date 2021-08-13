package com.rapidken.employee_management_rest.service;

import com.rapidken.employee_management_rest.dao.EmployeeDAO;
import com.rapidken.employee_management_rest.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;


@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeDAO employeeDAO;

    @Override
    @Transactional
    public List<Employee> findAll(int records) {
        return employeeDAO.findAll(records);
    }

    @Override
    @Transactional
    public List<Employee> findByDept(String dept) {
        return employeeDAO.findByDept(dept);
    }

    @Override
    @Transactional
    public List<Employee> findByPos(String pos) {
        return employeeDAO.findByPos(pos);
    }
}
