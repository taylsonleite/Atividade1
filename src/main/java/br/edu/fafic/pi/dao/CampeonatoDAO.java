package br.edu.fafic.pi.dao;

import br.edu.fafic.pi.model.Campeonato;
import br.edu.fafic.pi.model.Equipe;

import java.util.List;

public class CampeonatoDAO extends GenericDAOimpl<Campeonato> {

    public List<Equipe> findByTeam(String nomeCampeonato) {
        try {
            return this.getManager().createNamedQuery("findAllTeams")
                    .setParameter("nomeCampeonato", nomeCampeonato).getResultList();
        } catch (javax.persistence.NoResultException e) {
            System.out.println("Equipe nao encontrada!");
            return null;
        }
    }

}
