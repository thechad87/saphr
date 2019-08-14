package org.sapsystems.factory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sapsystems.domain.users.Employee;

/**
 * Created by ChadMarthinussen2 on 2019/08/14.
 */
public class EmployeeFactoryTest {
    private String EmployeeTest;

    @Before
    public void setUp() throws Exception {
        this.EmployeeTest = "EmployeeFacTest";
    }

    @Test
    public void buildEmployee() {
        Employee employee = EmployeeFactory.buildEmployee("Chad", "Marty", "700000");
        System.out.println(employee);
        Assert.assertNotNull(employee.getEmployeeID());
    }
}