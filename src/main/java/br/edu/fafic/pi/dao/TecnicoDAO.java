package br.edu.fafic.pi.dao;

import br.edu.fafic.pi.model.Equipe;
import br.edu.fafic.pi.model.Tecnico;

public class TecnicoDAO extends GenericDAOimpl<Tecnico> {

    public Equipe findChampionshipByCoach(String coachName) {
        return (Equipe) this.getManager().createNamedQuery("findChampionshipByCoach")
                .setParameter("nomeTecnico", coachName).getSingleResult();
    }

//    @Override
//    public void saveOrUpdate(Tecnico entity) {
//
//    }
//
//    @Override
//    public Tecnico findById(Class<Tecnico> entity, UUID id) {
//        return null;
//    }
//
//    @Override
//    public List<Tecnico> findAll(String namedQuery) {
//        return null;
//    }
//
//    @Override
//    public void delete(Tecnico entity) {
//
//    }
}
