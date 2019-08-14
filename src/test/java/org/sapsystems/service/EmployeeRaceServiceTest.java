package org.sapsystems.service;

import org.junit.Before;
import org.junit.Test;
import org.sapsystems.domain.users.EmployeeRace;
import org.sapsystems.factory.EmployeeRaceFactory;
import org.sapsystems.repository.EmployeeRaceRepository;
import org.sapsystems.repository.impl.EmployeeRaceRepositoryImpl;

import java.util.Set;

/**
 * Created by ChadMarthinussen2 on 2019/08/14.
 */
public class EmployeeRaceServiceTest {
    private EmployeeRaceRepository repository;
    private EmployeeRace employeeRace;

    @Before
    public void setUp() throws Exception {
        this.repository = EmployeeRaceRepositoryImpl.getRepository();
        this.employeeRace = EmployeeRaceFactory.buildEmployeeRace("Chad", "M-123");
    }


    @Test
    public void getAll(){
        Set<EmployeeRace> employeeRace = this.repository.getAll();
        System.out.println("All values : " + employeeRace);
    }
}