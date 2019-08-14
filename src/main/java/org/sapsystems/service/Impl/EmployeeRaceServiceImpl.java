package org.sapsystems.service.Impl;

import org.sapsystems.domain.users.EmployeeRace;
import org.sapsystems.repository.EmployeeRaceRepository;
import org.sapsystems.repository.impl.EmployeeRaceRepositoryImpl;
import org.sapsystems.service.EmployeeRaceService;

import java.util.Set;

/**
 * Created by ChadMarthinussen2 on 2019/08/14.
 */
public class EmployeeRaceServiceImpl implements EmployeeRaceService {

    private static EmployeeRaceService service = null;
    private EmployeeRaceRepository employeeRaceRepository;

    private EmployeeRaceServiceImpl(){
        this.employeeRaceRepository = EmployeeRaceRepositoryImpl.getRepository();
    }

    public static EmployeeRaceService getEmployeeRaceService(){
        if (service == null) service = new EmployeeRaceServiceImpl();
        return service;
    }

    @Override
    public EmployeeRace create(EmployeeRace employeeRace) {
        return this.employeeRaceRepository.create(employeeRace);
    }

    @Override
    public EmployeeRace update(EmployeeRace employeeRace) {
        return this.employeeRaceRepository.update(employeeRace);
    }

    @Override
    public EmployeeRace delete(String s) {
        return this.employeeRaceRepository.delete(s);
    }

    @Override
    public EmployeeRace read(String s) {
        return this.employeeRaceRepository.read(s);
    }

    /*@Override
    public EmployeeRace saveEmployeeRace(String firstName, String lastName, String race){
        EmployeeRace e = EmployeeRaceFactory.buildEmployeeRace(firstName, lastName);
        //get race if exist

        create(e);
        return e;
    }*/

    @Override
    public Set<EmployeeRace> getAll() {
        Set<EmployeeRace> employeeRace = this.employeeRaceRepository.getAll();
        System.out.println("In getall, all = " + employeeRace);
        return employeeRace;
    }
}
