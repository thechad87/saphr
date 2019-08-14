package org.sapsystems.repository;

import org.sapsystems.domain.demography.Race;

import java.util.Set;

/**
 * Created by ChadMarthinussen2 on 2019/08/10.
 */
public interface RaceRepository extends IRepository<Race, String>{
        Set<Race> getAll();
}