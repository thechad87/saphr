package org.sapsystems.repository;

import org.sapsystems.domain.demography.Gender;

import java.util.Set;

/**
 * Created by ChadMarthinussen2 on 2019/08/10.
 */
public interface GenderRepository extends IRepository<Gender, String> {
    Set <Gender> getAll();
}