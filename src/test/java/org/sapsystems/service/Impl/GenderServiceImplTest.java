package org.sapsystems.service.Impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sapsystems.domain.demography.Gender;
import org.sapsystems.factory.GenderFactory;
import org.sapsystems.repository.impl.GenderRepositoryImpl;
import org.sapsystems.service.GenderService;

import java.util.Set;

/**
 * Created by ChadMarthinussen2 on 2019/08/14.
 */
public class GenderServiceImplTest {
    private GenderRepositoryImpl repository;
    private Gender gender;
    private GenderService service;


    @Before
    public void setUp() throws Exception {
        this.service = GenderServiceImpl.getGenderService();
    }

    @Test
    public void a_create() {
        Gender employee = GenderFactory.buildGender("Male");
        service.create(employee);
        Gender inRepo = service.read(employee.getGenderId());
        Assert.assertNotNull(inRepo);
    }

    @Test
    public void c_update() {
        Gender employee = GenderFactory.buildGender("Male");
        service.create(employee);
        Gender inRepo = service.read(employee.getGenderId());
//        employee.setDescription("Chad");
        service.update(employee);
        Assert.assertEquals(employee.getGenderId(), inRepo.getGenderId());
    }

    @Test
    public void e_delete() {
        Gender employee = GenderFactory.buildGender("Male");
        service.create(employee);
        Gender inRepo = service.read(employee.getGenderId());
        Assert.assertNotNull(inRepo);
        service.delete(employee.getGenderId());
        Gender deleted = service.read(employee.getGenderId());
        Assert.assertNull(deleted);
    }

    @Test
    public void b_read() {
        Gender employee = GenderFactory.buildGender("Male");
        service.create(employee);
        Gender inRepo = service.read(employee.getGenderId());
        Assert.assertNotNull(inRepo);
    }

    @Test
    public void d_getAll() {
        Set<Gender> employeeSet = service.getAll();
        Assert.assertNotNull(employeeSet);
    }
}