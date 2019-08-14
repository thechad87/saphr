package org.sapsystems.repository;

import org.sapsystems.domain.users.EmployeeRace;

import java.util.Set;

/**
 * Created by ChadMarthinussen2 on 2019/08/14.
 */
public interface EmployeeRaceRepository extends IRepository<EmployeeRace, String> {
    Set<EmployeeRace> getAll();
}
