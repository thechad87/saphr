package org.sapsystems.service;

/**
 * Created by ChadMarthinussen2 on 2019/08/14.
 */
public interface IService <T, ID>{
    T create (T t);
    T update(T t);
    T delete(ID id);
    T read(ID id);
}
