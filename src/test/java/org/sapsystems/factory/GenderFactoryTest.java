package org.sapsystems.factory;

import org.junit.Assert;
import org.junit.Test;
import org.sapsystems.domain.demography.Gender;

/**
 * Created by ChadMarthinussen2 on 2019/08/14.
 */
public class GenderFactoryTest {

    @Test
    public void buildGender() {
        Gender gender = GenderFactory.buildGender("Male");
        Assert.assertEquals("Male", gender.getGenderDescription());
        Assert.assertNotNull(gender.getGenderId());
        System.out.println(gender.getGenderId());
        Assert.assertNotNull(gender);
    }

}