package org.sapsystems.repository.impl;

import org.sapsystems.domain.demography.Race;
import org.sapsystems.repository.RaceRepository;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ChadMarthinussen2 on 2019/08/10.
 */
public class RaceRepositoryImpl implements RaceRepository{


    private static RaceRepository raceRepository = null;

    private Set<Race> races;


    public RaceRepositoryImpl(){
        this.races = new HashSet<>();
    }

    public static RaceRepository getRepository(){
        if (raceRepository == null) raceRepository = new RaceRepositoryImpl();
        return raceRepository;
    }

    @Override
    public Race create(Race race) {
        this.races.add(race);
        return race;
    }

    @Override
    public Race update(Race race) {
        Race updatedRace = null;
        Race e = read(race.getRaceID());
        if (e != null){
            delete(race.getRaceID());
            this.races.add(race);
            updatedRace = race;
        }
        return updatedRace;
    }

    @Override
    public Race delete(String s) {
        Race e = read(s);
        if (e != null) {
            this.races.remove(e);
        }
        return e;
    }

    @Override
    public Race read(final String s) {
        return this.races.stream().filter((Race e) -> e.getRaceID().equals(s)).findAny().orElse(null);
    }

    @Override
    public Set<Race> getAll() {
        return this.races;
    }
}
