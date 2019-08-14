package org.sapsystems.service.Impl;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.sapsystems.domain.demography.Race;
import org.sapsystems.factory.RaceFactory;
import org.sapsystems.repository.impl.RaceRepositoryImpl;
import org.sapsystems.service.RaceService;

import java.util.Set;

/**
 * Created by ChadMarthinussen2 on 2019/08/14.
 */
public class RaceServiceImplTest {
    private RaceRepositoryImpl repository;
    private Race race;
    private RaceService service;


    @Before
    public void setUp() throws Exception {
        this.service = RaceServiceImpl.getRaceService();
    }

    @Test
    public void a_create() {
        Race employee = RaceFactory.buildRace("Coloured");
        service.create(employee);
        Race inRepo = service.read(employee.getRaceID());
        Assert.assertNotNull(inRepo);
    }

    @Test
    public void c_update() {
        Race employee = RaceFactory.buildRace("Coloured");
        service.create(employee);
        Race inRepo = service.read(employee.getRaceID());
//        employee.setDescription("Chad");
        service.update(employee);
        Assert.assertEquals(employee.getRaceID(), inRepo.getRaceID());
    }

    @Test
    public void e_delete() {
        Race employee = RaceFactory.buildRace("Coloured");
        service.create(employee);
        Race inRepo = service.read(employee.getRaceID());
        Assert.assertNotNull(inRepo);
        service.delete(employee.getRaceID());
        Race deleted = service.read(employee.getRaceID());
        Assert.assertNull(deleted);
    }

    @Test
    public void b_read() {
        Race employee = RaceFactory.buildRace("Coloured");
        service.create(employee);
        Race inRepo = service.read(employee.getRaceID());
        Assert.assertNotNull(inRepo);
    }

    @Test
    public void d_getAll() {
        Set<Race> employeeSet = service.getAll();
        Assert.assertNotNull(employeeSet);
    }
}