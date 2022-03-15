package br.edu.fafic.pi.dao;

import br.edu.fafic.pi.model.Equipe;

public class EquipeDAO extends GenericDAOimpl<Equipe> {

    public Equipe findByName(String name) {
        try {
            return (Equipe) this.getManager().createNamedQuery("findByName")
                    .setParameter("nome", name).getSingleResult();
        } catch (javax.persistence.NoResultException e) {
            System.out.println("Equipe nao encontrada!");
            return null;
        }
    }

    public Equipe findByNamePlayer(String name) {
        try {
            return (Equipe) this.getManager().createNamedQuery("findByNamePlayer")
                    .setParameter("nome", name).getSingleResult();
        } catch (javax.persistence.NoResultException e) {
            System.out.println("Equipe nao encontrada!");
            return null;
        }

    }

}
