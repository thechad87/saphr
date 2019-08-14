package org.sapsystems.factory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sapsystems.domain.users.EmployeeGender;

/**
 * Created by ChadMarthinussen2 on 2019/08/14.
 */
public class EmployeeGenderFactoryTest {
    private String EmployeeGenderTest;

    @Before
    public void setUp() throws Exception {
        this.EmployeeGenderTest = "EmployeeGenderTest";
    }

    @Test
    public void buildEmployeeGender() {
        EmployeeGender employeeGender = EmployeeGenderFactory.buildEmployeeGender("700000", "M-123");
        System.out.println(employeeGender);
        Assert.assertNotNull(employeeGender.getEmployeeID());
    }
}