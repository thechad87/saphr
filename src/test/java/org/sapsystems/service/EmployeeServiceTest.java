package org.sapsystems.service;

import org.junit.Before;
import org.junit.Test;
import org.sapsystems.domain.users.Employee;
import org.sapsystems.factory.EmployeeFactory;
import org.sapsystems.repository.EmployeeRepository;
import org.sapsystems.repository.impl.EmployeeRepositoryImpl;

import java.util.Set;

/**
 * Created by ChadMarthinussen2 on 2019/08/14.
 */
public class EmployeeServiceTest {
    private EmployeeRepository repository;
    private Employee employee;

    @Before
    public void setUp() throws Exception {
        this.repository = EmployeeRepositoryImpl.getRepository();
        this.employee = EmployeeFactory.buildEmployee("Chad", "Marty", "700000");
    }


    @Test
    public void getAll(){
        Set<Employee> employee = this.repository.getAll();
        System.out.println("All values :" + employee);
    }

}