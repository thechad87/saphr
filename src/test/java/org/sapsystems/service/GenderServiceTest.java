package org.sapsystems.service;

import org.junit.Before;
import org.junit.Test;
import org.sapsystems.domain.demography.Gender;
import org.sapsystems.factory.GenderFactory;
import org.sapsystems.repository.GenderRepository;
import org.sapsystems.repository.impl.GenderRepositoryImpl;

import java.util.Set;

/**
 * Created by ChadMarthinussen2 on 2019/08/14.
 */
public class GenderServiceTest {
    private GenderRepository repository;
    private Gender gender;

    @Before
    public void setUp() throws Exception {
        this.repository = GenderRepositoryImpl.getRepository();
        this.gender = GenderFactory.buildGender("Male");
    }


    @Test
    public void getAll() {
        Set <Gender> gender = this.repository.getAll();
        System.out.println("All values :" + gender);
    }
}