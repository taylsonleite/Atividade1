package br.edu.fafic.pi.dao;

import br.edu.fafic.pi.model.Campeonato;
import br.edu.fafic.pi.model.Equipe;
import br.edu.fafic.pi.model.Jogador;

import java.util.List;
import java.util.UUID;

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

    public Campeonato findChampionship() {
        try {
            return (Campeonato) this.getManager().createNamedQuery("findChampionship").getSingleResult();
            //.setParameter("campeonatoUUID", campeonatoUUID) .getSingleResult();

        } catch (javax.persistence.NoResultException e) {
            System.out.println("Equipe nao encontrada!");
            return null;
        }
    }

    @Override
    public List<Equipe> findAll(String namedQuery) {
        return super.findAll(namedQuery);
    }


    public List<Jogador> findAllPlayers(UUID uuid) {
        return (List<Jogador>) this.getManager().createNamedQuery("findAllPlayers")
                .setParameter("uuid", uuid) .getResultList();
    }
}
