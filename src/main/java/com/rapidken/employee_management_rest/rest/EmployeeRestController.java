package com.rapidken.employee_management_rest.rest;

import com.rapidken.employee_management_rest.entity.Employee;
import com.rapidken.employee_management_rest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> findAll(@RequestParam int records) {
        return employeeService.findAll(records);
    }

    @PostMapping("/employees/")
    public List<Employee> filterEmployees(@RequestBody FilterRequest filterRequest){

        if(filterRequest.getFetch_key().equalsIgnoreCase("department")){
            return employeeService.findByDept(filterRequest.getFetch_value());
        }
        if (filterRequest.getFetch_key().equalsIgnoreCase("position")){
            return employeeService.findByPos(filterRequest.getFetch_value());
        }
        //pagination_limit
        return employeeService.findAll(Integer.parseInt(filterRequest.getFetch_value()));
    }
}
