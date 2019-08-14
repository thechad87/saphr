package org.sapsystems.repository;

/**
 * Created by ChadMarthinussen2 on 2019/08/07.
 */
public interface IRepository <T, ID>{

    T create(T t);
    T update(T t);
    T read(ID id);
    T delete(ID id);

}