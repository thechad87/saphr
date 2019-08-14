package org.sapsystems.repository;

import org.sapsystems.domain.users.EmployeeGender;

import java.util.Set;

/**
 * Created by ChadMarthinussen2 on 2019/08/10.
 */
public interface EmployeeGenderRepository extends IRepository<EmployeeGender, String> {
  Set<EmployeeGender> getAll();
}
