package org.sapsystems.controller;

import org.junit.Before;
import org.junit.Test;
import org.sapsystems.domain.demography.Gender;
import org.sapsystems.domain.demography.Race;
import org.sapsystems.domain.users.Employee;
import org.sapsystems.domain.users.EmployeeGender;
import org.sapsystems.domain.users.EmployeeRace;
import org.sapsystems.factory.*;

/**
 * Created by ChadMarthinussen2 on 2019/08/14.
 */
public class EmployeeControllerTest {

        private EmployeeController employeeController;


    @Before
    public void setUp() throws Exception {
        employeeController = new EmployeeController();
    }

    @Test
    public void create() {

        Gender gender = GenderFactory.buildGender("Male");
        Race race = RaceFactory.buildRace("Coloured");
        EmployeeGender employeeGender = EmployeeGenderFactory.buildEmployeeGender("700000", "123");
        EmployeeRace employeeRace = EmployeeRaceFactory.buildEmployeeRace("700000", "123");
        Employee employee = EmployeeFactory.buildEmployee("Chad", "Marty", "700000");

        //employeeController.create(employee.getEmployeeNumber(), employee.getEmployeeFirstName() ,employee.getEmployeeLastName(), gender.getId(),race.getId());

        employeeController.create("Chad", "Marty", 123, 123);

    }

}

