package org.sapsystems.repository.impl;

import org.sapsystems.domain.users.EmployeeRace;
import org.sapsystems.repository.EmployeeRaceRepository;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ChadMarthinussen2 on 2019/08/14.
 */
public class EmployeeRaceRepositoryImpl implements EmployeeRaceRepository {


    private static EmployeeRaceRepositoryImpl repository = null;
    private Set<EmployeeRace> employeeRaces;

    private EmployeeRaceRepositoryImpl(){
        this.employeeRaces = new HashSet<>();
    }

    public static EmployeeRaceRepositoryImpl getRepository(){
        if (repository==null)
            repository = new EmployeeRaceRepositoryImpl();

        return repository;
    }


    @Override
    public Set<EmployeeRace> getAll() {
        return this.employeeRaces;
    }

    @Override
    public EmployeeRace create(EmployeeRace empRace) {
        this.employeeRaces.add(empRace);
        return empRace;
    }

    @Override
    public EmployeeRace update(EmployeeRace empRace) {
        EmployeeRace oldEmpRace = read(empRace.getEmployeeID());
        if (oldEmpRace != null){
            EmployeeRace newEmpRace = new EmployeeRace.Builder()
                    .copy(oldEmpRace)
                    .build();
            return newEmpRace;
        }
        return null;
    }

    @Override
    public EmployeeRace delete(String id) {
        this.employeeRaces.remove(read(id));
        return null;
    }

    @Override
    public EmployeeRace read(String id) {
        for (EmployeeRace employeeRace : this.employeeRaces) {
            if (employeeRace.getEmployeeID().equals(id))
                return employeeRace;
        }
        return null;
    }
}


