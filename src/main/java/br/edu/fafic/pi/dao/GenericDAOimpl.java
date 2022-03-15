package br.edu.fafic.pi.dao;

import lombok.Data;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;
import java.util.UUID;

@Data
public class GenericDAOimpl<T> implements GenericDAO<T> {

    private final EntityManagerFactory emf = Persistence.createEntityManagerFactory("atividade01");
    private final EntityManager manager = emf.createEntityManager();

    @Override
    public void saveOrUpdate(T entity) {
        manager.getTransaction().begin();

        manager.merge(entity);
        manager.getTransaction().commit();

        manager.close();
    }

    @Override
    public T findById(Class<T> entity, UUID id) {
        return manager.find(entity, id);
    }

    @Override
    public List<T> findAll(String namedQuery) {
        return manager.createNamedQuery(namedQuery).getResultList();
    }

    @Override
    public void delete(T entity) {
        manager.remove(entity);
    }

}
