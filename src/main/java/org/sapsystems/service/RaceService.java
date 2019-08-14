package org.sapsystems.service;

import org.sapsystems.domain.demography.Race;

import java.util.Set;

/**
 * Created by ChadMarthinussen2 on 2019/08/14.
 */
public interface RaceService extends IService<Race, String> {
    Set<Race> getAll();
}