package com.rapidken.employee_management_rest.dao;

import com.rapidken.employee_management_rest.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Employee> findAll(int records) {
        Session currentSession = sessionFactory.getCurrentSession();
        Query<Employee> theQuery =
                currentSession.createQuery("from Employee",Employee.class).setMaxResults(records);

        List<Employee> employees = theQuery.getResultList();

        return employees;
    }

    @Override
    public List<Employee> findByDept(String dept) {
        Session currentSession = sessionFactory.getCurrentSession();
        Query<Employee> theQuery =
                currentSession.createQuery("from Employee where department=:employeeDept",Employee.class);
        theQuery.setParameter("employeeDept", dept);
        List<Employee> employees = theQuery.getResultList();
        return employees;
    }

    @Override
    public List<Employee> findByPos(String pos) {
        Session currentSession = sessionFactory.getCurrentSession();
        Query<Employee> theQuery =
                currentSession.createQuery("from Employee where position=:employeePos",Employee.class);
        theQuery.setParameter("employeePos", pos);
        List<Employee> employees = theQuery.getResultList();
        return employees;
    }
}
