package org.sapsystems.repository.impl;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sapsystems.domain.users.Employee;
import org.sapsystems.factory.EmployeeFactory;
import org.sapsystems.repository.EmployeeRepository;

import java.util.Set;

/**
 * Created by ChadMarthinussen2 on 2019/08/14.
 */
public class EmployeeRepositoryImplTest {

    private EmployeeRepository employeeRepository;
    private Employee employee;

    private Employee getSavedEmployee(){
        Set<Employee> savedEmployees = this.employeeRepository.getAll();
        return savedEmployees.iterator().next();
    }

    @Before
    public void setUp() throws Exception {

        this.employeeRepository = EmployeeRepositoryImpl.getRepository();
    }

    @After
    public void tearDown() throws Exception {

    }


    @Test
    public void a_create() {

        Employee employee = EmployeeFactory.buildEmployee("Chad", "Marty", "700000");
        employeeRepository.create(employee);
        Employee inRepo = employeeRepository.read(employee.getEmployeeID());
        Assert.assertNotNull(inRepo);
    }

    @Test
    public void b_update() {

        Employee employee = EmployeeFactory.buildEmployee("Chad", "Marty", "700000");

        employeeRepository.create(employee);
        Employee inRepo = employeeRepository.read(employee.getEmployeeID());
//        employee.setEmployeeFirstName("Chad");
        employeeRepository.update(employee);
        Assert.assertEquals(employee.getEmployeeID(), inRepo.getEmployeeID());
    }

    @Test
    public void e_delete() {

        Employee employee = EmployeeFactory.buildEmployee("Chad", "Marty", "700000");
        employeeRepository.create(employee);
        Employee inRepo = employeeRepository.read(employee.getEmployeeID());
        Assert.assertNotNull(inRepo);
        employeeRepository.delete(employee.getEmployeeID());
        Employee deleted = employeeRepository.read(employee.getEmployeeID());
        Assert.assertNull(deleted);
    }

    @Test
    public void c_read() {

        Employee employee = EmployeeFactory.buildEmployee("Chad", "Marty", "700000");
        employeeRepository.create(employee);
        Employee inRepo = employeeRepository.read(employee.getEmployeeID());
        Assert.assertNotNull(inRepo);
    }

    @Test
    public void d_getAll() {

        Set<Employee> employeeSet = employeeRepository.getAll();
        Assert.assertNotNull(employeeSet);
    }

}