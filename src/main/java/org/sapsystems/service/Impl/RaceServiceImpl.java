package org.sapsystems.service.Impl;

import org.sapsystems.domain.demography.Race;
import org.sapsystems.repository.RaceRepository;
import org.sapsystems.repository.impl.RaceRepositoryImpl;
import org.sapsystems.service.RaceService;

import java.util.Set;

/**
 * Created by ChadMarthinussen2 on 2019/08/14.
 */
public class RaceServiceImpl implements RaceService {
    private static RaceService service = null;
    private RaceRepository raceRepository;

    private RaceServiceImpl(){
        this.raceRepository = RaceRepositoryImpl.getRepository();
    }

    public static RaceService getRaceService(){
        if (service == null) service = new RaceServiceImpl();
        return service;
    }

    @Override
    public Race create(Race race) {
        return this.raceRepository.create(race);
    }

    @Override
    public Race update(Race race) {
        return this.raceRepository.update(race);
    }

    @Override
    public Race delete(String s) {
        return this.raceRepository.delete(s);
    }

    @Override
    public Race read(String s) {
        return this.raceRepository.read(s);
    }

    /*@Override
    public Race saveRace(String firstName, String lastName, String gender){
        Race e = RaceFactory.buildRace(firstName, lastName);
        //get gender if exist

        create(e);
        return e;
    }*/

    @Override
    public Set<Race> getAll() {
        Set<Race> race = this.raceRepository.getAll();
        System.out.println("In getall, all = " + race);
        return race;
    }
}
