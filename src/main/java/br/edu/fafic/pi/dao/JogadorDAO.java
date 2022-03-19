package br.edu.fafic.pi.dao;

import br.edu.fafic.pi.model.Jogador;

import java.util.List;

public class JogadorDAO extends GenericDAOimpl<Jogador> {

    public Jogador getPlayer(String nome) {
        return (Jogador) this.getManager().createNamedQuery("findPlayer")
                .setParameter("nome", nome).getSingleResult();
    }

    public List<Jogador> getPlayeByStatus(String status) {
        return (List<Jogador>) this.getManager().createNamedQuery("findPlayerByStatus")
                .setParameter("status", status).getResultList();
    }

//    @Override
//    public void saveOrUpdate(Jogador entity) {
//
//    }
//
//    @Override
//    public Jogador findById(Class<Jogador> entity, UUID id) {
//        return null;
//    }
//
//    @Override
//    public List<Jogador> findAll(String namedQuery) {
//        return null;
//    }
//
//    @Override
//    public void delete(Jogador entity) {
//
//    }
}
