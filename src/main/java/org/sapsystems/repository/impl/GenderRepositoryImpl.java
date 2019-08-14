package org.sapsystems.repository.impl;

import org.sapsystems.domain.demography.Gender;
import org.sapsystems.repository.GenderRepository;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by ChadMarthinussen2 on 2019/08/10.
 */
public class GenderRepositoryImpl implements GenderRepository {


    private static GenderRepository genderRepository = null;
    private Set<Gender> genderSet;

    public static GenderRepository getRepository(){
        if (genderRepository == null) genderRepository = new GenderRepositoryImpl();
        return genderRepository;
    }

    private GenderRepositoryImpl(){
        this.genderSet = new HashSet<>();
    }

    @Override
    public Gender create(Gender gender) {
        this.genderSet.add(gender);
        return gender;
    }

    @Override
    public Gender update(Gender gender) {
        Gender updatedGender = null;
        Gender e = read(gender.getGenderId());
        if (e != null){
            delete(gender.getGenderId());
            this.genderSet.add(gender);
            updatedGender = gender;
        }
        return updatedGender;    }

    @Override
    public Gender read(final String s) {
        return this.genderSet.stream().filter(e -> e.getGenderId().equals(s)).findAny().orElse(null);
    }

    @Override
    public Gender delete(String s) {
        Gender e = read(s);
        if (e != null) {
            this.genderSet.remove(e);
        }
        return e;
    }

    @Override
    public Set <Gender> getAll() {
        return this.genderSet;
    }
}
