package org.sapsystems.controller;

import org.sapsystems.domain.demography.Gender;
import org.sapsystems.domain.demography.Race;
import org.sapsystems.domain.users.Employee;
import org.sapsystems.domain.users.EmployeeGender;
import org.sapsystems.domain.users.EmployeeRace;
import org.sapsystems.factory.*;
import org.sapsystems.service.*;
import org.sapsystems.service.Impl.*;

/**
 * Created by ChadMarthinussen2 on 2019/08/14.
 */
public class EmployeeController {

    private EmployeeService employeeService = EmployeeServiceImpl.getEmployeeService();
    private EmployeeGenderService employeeGenderService = EmployeeGenderServiceImpl.getEmployeeGenderService();
    private EmployeeRaceService employeeRaceService = EmployeeRaceServiceImpl.getEmployeeRaceService();
    private RaceService raceService = RaceServiceImpl.getRaceService();
    private GenderService genderService = GenderServiceImpl.getGenderService();

    public void create(String firstName, String lastName, int genderId, int raceId){

        Employee employee = EmployeeFactory.buildEmployee(firstName, lastName, "123456");
        employeeService.create(employee);

        EmployeeGender employeeGender = EmployeeGenderFactory.buildEmployeeGender("7037822", "M-001");
        employeeGenderService.create(employeeGender);
        EmployeeRace employeeRace = EmployeeRaceFactory.buildEmployeeRace("6000212", "C-990");
        employeeRaceService.create(employeeRace);

        Race race = RaceFactory.buildRace("Coloured");
        raceService.create(race);
        Gender gender = GenderFactory.buildGender("Male");
        genderService.create(gender);

    }

}
