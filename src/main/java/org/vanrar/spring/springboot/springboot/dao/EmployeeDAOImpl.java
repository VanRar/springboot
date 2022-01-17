package org.vanrar.spring.springboot.springboot.dao;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.vanrar.spring.springboot.springboot.entity.Employee;


import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    private EntityManager entityManager;


    @Override
    public List<Employee> getAllEmployees() {
        Session session = entityManager.unwrap(Session.class);

        Query<Employee> query = session.createQuery("from Employee", Employee.class);
        return query.getResultList();
    }

//    @Override
//    public void saveEmployee(Employee employee) {
//        Session session = sessionFactory.getCurrentSession();
//        session.saveOrUpdate(employee);
//
//    }
//
//    @Override
//    public Employee getEmployees(int id) {
//        Session session = sessionFactory.getCurrentSession();
//        Employee employee = session.get(Employee.class, id);
//        return employee;
//    }
//
//    @Override
//    public void deleteEmployee(int id) {
//        Session session = sessionFactory.getCurrentSession();
//        Query<Employee> query = session.createQuery("delete from Employee where id =:employeeId");
//        query.setParameter("employeeId", id);
//        query.executeUpdate();
//    }
}