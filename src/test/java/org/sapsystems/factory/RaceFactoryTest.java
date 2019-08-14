package org.sapsystems.factory;

import org.junit.Assert;
import org.junit.Test;
import org.sapsystems.domain.demography.Race;

/**
 * Created by ChadMarthinussen2 on 2019/08/14.
 */
public class RaceFactoryTest {



    @Test
    public void buildRace() {
        Race race = RaceFactory.buildRace("Coloured");
        Assert.assertEquals("Coloured", race.getRaceType());
        Assert.assertNotNull(race.getRaceID());
        System.out.println(race.getRaceID());
        Assert.assertNotNull(race);
    }
}