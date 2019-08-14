package org.sapsystems.repository.impl;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sapsystems.domain.demography.Gender;
import org.sapsystems.factory.GenderFactory;
import org.sapsystems.repository.GenderRepository;

import java.util.Set;

/**
 * Created by ChadMarthinussen2 on 2019/08/14.
 */
public class GenderRepositoryImplTest {

    private GenderRepository genderRepository;
    private Gender gender;

    private Gender getSavedGender(){
        Set<Gender> savedGenders = this.genderRepository.getAll();
        return savedGenders.iterator().next();
    }

    @Before
    public void setUp() throws Exception {
        this.genderRepository = GenderRepositoryImpl.getRepository();
        this.gender = GenderFactory.buildGender("Male");
    }

    @After
    public void tearDown() throws Exception {

    }


    @Test
    public void a_create() {

        Gender employee = GenderFactory.buildGender("Male");
        genderRepository.create(employee);
        Gender inRepo = genderRepository.read(employee.getGenderId());
        Assert.assertNotNull(inRepo);

    }

    @Test
    public void b_update() {

        Gender employee = GenderFactory.buildGender("Male");
        genderRepository.create(employee);
        Gender inRepo = genderRepository.read(employee.getGenderId());
        genderRepository.update(employee);
//        employee.setDescription("Female");
        Assert.assertEquals(employee.getGenderDescription(), inRepo.getGenderDescription());
    }

    @Test
    public void e_delete() {

        Gender employee = GenderFactory.buildGender("Male ");
        genderRepository.create(employee);
        Gender inRepo = genderRepository.read(employee.getGenderId());
        Assert.assertNotNull(inRepo);
        genderRepository.delete(employee.getGenderId());
        Gender deleted = genderRepository.read(employee.getGenderId());
        Assert.assertNull(deleted);
    }

    @Test
    public void c_read() {

        Gender employee = GenderFactory.buildGender("Male");
        genderRepository.create(employee);
        Gender inRepo = genderRepository.read(employee.getGenderId());
        Assert.assertNotNull(inRepo);
    }

    @Test
    public void d_getAll() {

        Set<Gender> employeeSet = genderRepository.getAll();
        Assert.assertNotNull(employeeSet);
    }

}