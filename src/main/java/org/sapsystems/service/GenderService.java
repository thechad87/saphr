package org.sapsystems.service;

import org.sapsystems.domain.demography.Gender;

import java.util.Set;

/**
 * Created by ChadMarthinussen2 on 2019/08/14.
 */
public interface GenderService extends IService<Gender, String> {
    Set<Gender> getAll();
}
