package org.sapsystems.factory;

import org.sapsystems.domain.demography.Gender;
import org.sapsystems.util.Miscellaneous;

/**
 * Created by ChadMarthinussen2 on 2019/08/10.
 */
public class GenderFactory {

    public static Gender buildGender(String gender){
        return new Gender.Builder().genderId(Miscellaneous.IDGenerator()).genderDescription(gender).build();
    }
}
