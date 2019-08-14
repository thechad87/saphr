package org.sapsystems.factory;

import org.sapsystems.domain.users.EmployeeRace;

/**
 * Created by ChadMarthinussen2 on 2019/08/14.
 */
public class EmployeeRaceFactory {

    public static EmployeeRace buildEmployeeRace(String employeeID,String raceID){
        return new EmployeeRace.Builder().employeeID(employeeID).raceId(raceID).build();
    }
}
