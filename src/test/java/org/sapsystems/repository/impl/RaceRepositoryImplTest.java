package org.sapsystems.repository.impl;

import org.junit.Assert;
import org.junit.Test;
import org.sapsystems.domain.demography.Race;
import org.sapsystems.factory.RaceFactory;
import org.sapsystems.repository.RaceRepository;

/**
 * Created by ChadMarthinussen2 on 2019/08/14.
 */
public class RaceRepositoryImplTest {

    private static RaceRepository repository;
    private static Race race;
    private String raceID;

    @Test
    public void create() {
        repository = RaceRepositoryImpl.getRepository();
        race = RaceFactory.buildRace("Coloured");
        Race result = repository.create(race);
        raceID = result.getRaceID();
        Assert.assertEquals(raceID,race.getRaceID());

    }

    @Test
    public void update() {
        create();
        Race result = repository.read(raceID);
        System.out.println(result.toString());

        String newRace = "Asian";
        Race newResult = new Race.Builder().copy(result).raceType(newRace).build();
        System.out.println(newResult.toString());
        repository.update(newResult);

        Assert.assertEquals(newRace,newResult.getRaceType());

    }

    @Test
    public void delete() {
        create();
        Race result = repository.read(raceID);
        System.out.println(result.toString());

        repository.delete(raceID);
        Race newResult = repository.read(raceID);
        Assert.assertNull(newResult);
    }

    @Test
    public void read() {
        create();
        Race result = repository.read(raceID);
        System.out.println(result.toString());
        Assert.assertEquals(raceID,result.getRaceID());
    }

}