package org.sapsystems.repository.impl;

import org.junit.Assert;
import org.junit.Test;
import org.sapsystems.domain.demography.Race;
import org.sapsystems.domain.users.Employee;
import org.sapsystems.domain.users.EmployeeRace;
import org.sapsystems.factory.EmployeeFactory;
import org.sapsystems.factory.EmployeeRaceFactory;
import org.sapsystems.factory.RaceFactory;
import org.sapsystems.repository.EmployeeRaceRepository;

/**
 * Created by ChadMarthinussen2 on 2019/08/14.
 */
public class EmployeeRaceRepositoryImplTest {


    private static EmployeeRaceRepository repository;
    private static EmployeeRace empRace;
    private String empID, raceID;

    @Test
    public void create() {
        repository = EmployeeRaceRepositoryImpl.getRepository();
        Employee employee = EmployeeFactory.buildEmployee("Chad","Marty", "70000");
        Race race = RaceFactory.buildRace("Coloured");
        empID = employee.getEmployeeID();
        raceID = race.getRaceID();

        empRace = EmployeeRaceFactory.buildEmployeeRace(empID,raceID);
        EmployeeRace result = repository.create(empRace);

        Assert.assertEquals(result.getEmployeeID(),empID);
    }

    @Test
    public void update() {
        create();
        EmployeeRace result = repository.read(empID);
        System.out.println(result.toString());

        Race newRace = RaceFactory.buildRace("White");

        EmployeeRace newResult = new EmployeeRace.Builder().copy(result).raceId(newRace.getRaceID()).build();
        System.out.println(newResult.toString());
        //double check  = getRaceID
        Assert.assertEquals(newRace.getRaceID(),newResult.getRaceId());
    }

    @Test
    public void delete() {
        create();
        EmployeeRace result = repository.read(empID);
        System.out.println(result.toString());

        repository.delete(empID);
        EmployeeRace newResult = repository.read(empID);

        Assert.assertNull(newResult);
    }

    @Test
    public void read() {
        create();
        EmployeeRace result = repository.read(empID);

        Assert.assertEquals(empID,result.getEmployeeID());
    }
}