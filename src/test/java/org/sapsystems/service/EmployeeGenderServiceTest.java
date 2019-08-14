package org.sapsystems.service;

import org.junit.Before;
import org.junit.Test;
import org.sapsystems.domain.users.EmployeeGender;
import org.sapsystems.factory.EmployeeGenderFactory;
import org.sapsystems.repository.EmployeeGenderRepository;
import org.sapsystems.repository.impl.EmployeeGenderRepositoryImpl;

import java.util.Set;

/**
 * Created by ChadMarthinussen2 on 2019/08/14.
 */
public class EmployeeGenderServiceTest {
    private EmployeeGenderRepository repository;
    private EmployeeGender employeeGender;

    @Before
    public void setUp() throws Exception {
        this.repository = EmployeeGenderRepositoryImpl.getRepository();
        this.employeeGender = EmployeeGenderFactory.buildEmployeeGender("700000", "C-123");
    }


    @Test
    public void getAll(){
        Set<EmployeeGender> employeeGender = this.repository.getAll();
        System.out.println("All values :" + employeeGender);
    }

}