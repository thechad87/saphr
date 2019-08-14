package org.sapsystems.factory;

import org.sapsystems.domain.users.EmployeeGender;
import org.sapsystems.util.Miscellaneous;

/**
 * Created by ChadMarthinussen2 on 2019/08/10.
 */
public class EmployeeGenderFactory {

        //norm var left out
        public static EmployeeGender buildEmployeeGender(String employeeID, String genderID){
            return new EmployeeGender.Builder().employeeID(Miscellaneous.IDGenerator()).genderID(genderID).build();
        }
}

//    private String employeeGenderID;
//    private String genderType;