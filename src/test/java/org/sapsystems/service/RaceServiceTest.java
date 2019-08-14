package org.sapsystems.service;

import org.junit.Before;
import org.junit.Test;
import org.sapsystems.domain.demography.Race;
import org.sapsystems.factory.RaceFactory;
import org.sapsystems.repository.RaceRepository;
import org.sapsystems.repository.impl.RaceRepositoryImpl;

import java.util.Set;

/**
 * Created by ChadMarthinussen2 on 2019/08/14.
 */
public class RaceServiceTest {
    private RaceRepository repository;
    private Race race;

    @Before
    public void setUp() throws Exception {
        this.repository = RaceRepositoryImpl.getRepository();
        this.race = RaceFactory.buildRace("Coloured");
    }


    @Test
    public void getAll(){
        Set<Race> race = this.repository.getAll();
        System.out.println("All values :" + race);
    }

}