package org.sapsystems.service.Impl;

import org.sapsystems.domain.users.EmployeeGender;
import org.sapsystems.repository.EmployeeGenderRepository;
import org.sapsystems.repository.impl.EmployeeGenderRepositoryImpl;
import org.sapsystems.service.EmployeeGenderService;

import java.util.Set;

/**
 * Created by ChadMarthinussen2 on 2019/08/14.
 */
public class EmployeeGenderServiceImpl implements EmployeeGenderService {

    private static EmployeeGenderService service = null;
    private EmployeeGenderRepository employeeGenderRepository;

    private EmployeeGenderServiceImpl(){
        this.employeeGenderRepository = EmployeeGenderRepositoryImpl.getRepository();
    }

    public static EmployeeGenderService getEmployeeGenderService(){
        if (service == null) service = new EmployeeGenderServiceImpl();
        return service;
    }

    @Override
    public EmployeeGender create(EmployeeGender employeeGender) {
        return this.employeeGenderRepository.create(employeeGender);
    }

    @Override
    public EmployeeGender update(EmployeeGender employeeGender) {
        return this.employeeGenderRepository.update(employeeGender);
    }

    @Override
    public EmployeeGender delete(String s) {
        return this.employeeGenderRepository.delete(s);
    }

    @Override
    public EmployeeGender read(String s) {
        return this.employeeGenderRepository.read(s);
    }

    /*@Override
    public EmployeeGender saveEmployeeGender(String firstName, String lastName, String gender){
        EmployeeGender e = EmployeeGenderFactory.buildEmployeeGender(firstName, lastName);
        //get gender if exist

        create(e);
        return e;
    }*/

    @Override
    public Set<EmployeeGender> getAll() {
        Set<EmployeeGender> employeeGender = this.employeeGenderRepository.getAll();
        System.out.println("In getall, all = " + employeeGender);
        return employeeGender;
    }
}
