package br.edu.fafic.pi.dao;

import java.util.List;
import java.util.UUID;

public interface GenericDAO <T> {

    void saveOrUpdate(T entity);
    T findById(Class<T> entity, UUID id);
    List<T> findAll(String namedQuery);
    void delete(T entity);

}
