package org.sapsystems.factory;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sapsystems.domain.users.EmployeeRace;

/**
 * Created by ChadMarthinussen2 on 2019/08/14.
 */
public class EmployeeRaceFactoryTest {

    private String EmployeeRaceTest;

    @Before
    public void setUp() throws Exception {
        this.EmployeeRaceTest = "EmployeeRaceTest";
    }

    @Test
    public void buildEmployeeRace() {
        EmployeeRace employeeRace = EmployeeRaceFactory.buildEmployeeRace("700000", "C-123");
        System.out.println(employeeRace);
        Assert.assertNotNull(employeeRace.getEmployeeID());
    }

}