package org.sapsystems.service;

import org.sapsystems.domain.users.EmployeeRace;

import java.util.Set;

/**
 * Created by ChadMarthinussen2 on 2019/08/14.
 */
public interface EmployeeRaceService extends IService<EmployeeRace, String> {
    Set<EmployeeRace> getAll();
}