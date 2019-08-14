package org.sapsystems.factory;

import org.sapsystems.domain.demography.Race;
import org.sapsystems.util.Miscellaneous;

/**
 * Created by ChadMarthinussen2 on 2019/08/10.
 */
public class RaceFactory {

    //placed race not variables
    public static Race buildRace(String race){
        return new Race.Builder().raceID(Miscellaneous.IDGenerator()).raceType(race).build();
    }

}
