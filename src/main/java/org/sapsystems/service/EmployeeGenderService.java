package org.sapsystems.service;

import org.sapsystems.domain.users.EmployeeGender;

import java.util.Set;

/**
 * Created by ChadMarthinussen2 on 2019/08/14.
 */
public interface EmployeeGenderService extends IService<EmployeeGender, String> {
    Set<EmployeeGender> getAll();
}
