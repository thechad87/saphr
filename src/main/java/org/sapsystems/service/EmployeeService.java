package org.sapsystems.service;

import org.sapsystems.domain.users.Employee;

import java.util.Set;

/**
 * Created by ChadMarthinussen2 on 2019/08/14.
 */
public interface EmployeeService extends IService<Employee, String> {
    Set<Employee> getAll();
}
