package org.sapsystems.repository;

import org.sapsystems.domain.users.Employee;

import java.util.Set;

/**
 * Created by ChadMarthinussen2 on 2019/08/07.
 */
public interface EmployeeRepository extends IRepository<Employee, String> {
    Set<Employee> getAll();
}
