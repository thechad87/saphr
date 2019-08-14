package org.sapsystems.factory;

import org.sapsystems.domain.users.Employee;
import org.sapsystems.util.Miscellaneous;

/**
 * Created by ChadMarthinussen2 on 2019/08/10.
 */

//Factories builds objects
public class EmployeeFactory {

    public static Employee buildEmployee(String firstName, String lastName, String employeeID){
        return new Employee.Builder().employeeID(Miscellaneous.IDGenerator()).firstName(firstName).lastName(lastName).build();
    }

}
