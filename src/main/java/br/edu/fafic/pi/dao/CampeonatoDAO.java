package br.edu.fafic.pi.dao;

import br.edu.fafic.pi.model.Campeonato;
import br.edu.fafic.pi.model.Equipe;

import java.util.List;
import java.util.UUID;

public class CampeonatoDAO extends GenericDAOimpl<Campeonato> {

    public List<Campeonato> findByTeam(UUID uuid) {
        try {
            return this.getManager().createNamedQuery("findAllTeams").getResultList();
                    //.setParameter("equipeUUID", uuid).getResultList();
        } catch (javax.persistence.NoResultException e) {
            System.out.println("Equipe nao encontrada!");
            return null;
        }
    }

}
