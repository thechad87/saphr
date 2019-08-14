package org.sapsystems.repository.impl;

import org.sapsystems.domain.users.EmployeeGender;
import org.sapsystems.repository.EmployeeGenderRepository;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ChadMarthinussen2 on 2019/08/10.
 */
public class EmployeeGenderRepositoryImpl implements EmployeeGenderRepository {

    private static EmployeeGenderRepository repository = null;

    private Set<EmployeeGender> employeeGenders;


    private EmployeeGenderRepositoryImpl(){
        this.employeeGenders = new HashSet<>();
    }

    public static EmployeeGenderRepository getRepository(){
        if (repository == null) repository = new EmployeeGenderRepositoryImpl();
        return repository;
    }

    @Override
    public EmployeeGender create(EmployeeGender employeeGender) {
        return employeeGender;
    }

    @Override
    public EmployeeGender update(EmployeeGender employeeGender) {
        EmployeeGender updatedEmployee = null;
        //EmployeeGender em = new EmployeeGender.Builder().copy(employeeGender).employeeFirstName(); #Due to using SET this is not needed
        EmployeeGender e = read(employeeGender.getEmployeeID());
        if (e != null){
            delete(employeeGender.getEmployeeID());
            this.employeeGenders.add(employeeGender);
            updatedEmployee = employeeGender;
        }
        return updatedEmployee;
    }

    @Override
    public EmployeeGender delete(String s) {
        EmployeeGender e = read(s);
        if (e != null) {
            this.employeeGenders.remove(e);
        }
        return e;
    }

    @Override
    public EmployeeGender read(final String s) {
        return this.employeeGenders.stream().filter(e -> e.getEmployeeID().equals(s)).findAny().orElse(null);
    }

    @Override
    public Set<EmployeeGender> getAll() {
        return this.employeeGenders;
    }
}
