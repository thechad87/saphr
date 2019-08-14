package org.sapsystems.repository.impl;

import org.sapsystems.domain.users.Employee;
import org.sapsystems.repository.EmployeeRepository;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ChadMarthinussen2 on 2019/08/10.
 */
public class EmployeeRepositoryImpl implements EmployeeRepository{


    private static EmployeeRepository employeeRepository = null;

    private Set<Employee> employees;


    private EmployeeRepositoryImpl(){
        this.employees = new HashSet<>();
    }

    public static EmployeeRepository getRepository(){
        if (employeeRepository == null) employeeRepository = new EmployeeRepositoryImpl();
        return employeeRepository;
    }

    @Override
    public Employee create(Employee employee) {
        this.employees.add(employee);
        return employee;
    }

    @Override
    public Employee update(Employee employee) {
        Employee updatedEmployee = null;
        //Employee em = new Employee.Builder().copy(employee).employeeFirstName();
        Employee e = read(employee.getEmployeeID());
        if (e != null){
            delete(employee.getEmployeeID());
            this.employees.add(employee);
            updatedEmployee = employee;
        }
        return updatedEmployee;
    }

    @Override
    public Employee delete(String s) {
        Employee e = read(s);
        if (e != null) {
            this.employees.remove(e);
        }
        return e;
    }

    @Override
    public Employee read(final String s) {
        return this.employees.stream().filter(e -> e.getEmployeeID().equals(s)).findAny().orElse(null);
    }

    @Override
    public Set<Employee> getAll() {
        return this.employees;
    }
}
