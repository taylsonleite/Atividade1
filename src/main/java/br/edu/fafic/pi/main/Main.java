package br.edu.fafic.pi.main;

import br.edu.fafic.pi.dao.CampeonatoDAO;
import br.edu.fafic.pi.dao.EquipeDAO;
import br.edu.fafic.pi.dao.JogadorDAO;
import br.edu.fafic.pi.dao.TecnicoDAO;
import br.edu.fafic.pi.model.Campeonato;
import br.edu.fafic.pi.model.Equipe;
import br.edu.fafic.pi.model.Jogador;
import br.edu.fafic.pi.model.Tecnico;

import java.util.List;
import java.util.UUID;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        JogadorDAO jogadorDAO = new JogadorDAO();
        TecnicoDAO tecnicoDAO = new TecnicoDAO();
        CampeonatoDAO campeonatoDAO = new CampeonatoDAO();
        EquipeDAO equipeDAO = new EquipeDAO();

//        Jogador jogador = Jogador.builder()
//                .posicao("Meia esquerda")
//                .status("Contratado")
//                .build();
//        jogador.setNome("Hugo");
//
//        Jogador jogador2 = Jogador.builder()
//                .posicao("Centro-avante")
//                .status("Contratado")
//                .build();
//        jogador2.setNome("Luciano");

        //jogadorDAO.saveOrUpdate(jogador);
        //jogadorDAO.saveOrUpdate(jogador2);
//
//        Tecnico tecnico = Tecnico.builder().build();
//        tecnico.setNome("Guardiola");
////
//        tecnicoDAO.saveOrUpdate(tecnico);
//
//        Jogador jogador1 = jogadorDAO.findById(Jogador.class, UUID.fromString("0c06224d-402a-419a-9f19-7c7da2f16ba5"));
//        Jogador jogador2 = jogadorDAO.findById(Jogador.class, UUID.fromString("83b5bb57-9a19-42d8-80a1-2a4ac7980815"));
////
//        Tecnico tecnico = tecnicoDAO.findById(Tecnico.class, UUID.fromString("88773043-7fe7-48e3-b3ce-8d290f2b1da3"));
//
//        Equipe equipe = Equipe.builder()
//                .jogadores(List.of(jogador1, jogador2))
//                .tecnico(tecnico)
//                .nome("Flamengo")
//                .build();
////
//        equipeDAO.saveOrUpdate(equipe);

//        Equipe equipe = equipeDAO.findById(Equipe.class, UUID.fromString("8f3cf099-bc7f-40e2-a258-db323c0785d2"));
//
//        tecnico.setEquipe(equipe);
//        jogador1.setEquipe(equipe);
//        jogador2.setEquipe(equipe);

//        tecnicoDAO.saveOrUpdate(tecnico);
//        jogadorDAO.saveOrUpdate(jogador1);
//        jogadorDAO.saveOrUpdate(jogador2);

        // Campeonato campeonato = campeonatoDAO.findById(Campeonato.class,
        //UUID.fromString("0c8820d5-07f2-4abf-b05f-e9c6bb99bb41"));

//        Campeonato camp = Campeonato.builder()
//                .nome("Mundial")
//                .build();
//
        //Equipe eq = equipeDAO.findById(Equipe.class, UUID.fromString("8f3cf099-bc7f-40e2-a258-db323c0785d2"));
//
//        camp.setEquipes(List.of(eq));
//        campeonatoDAO.saveOrUpdate(camp);

//        eq.setCampeonato(campeonato);
//        equipeDAO.saveOrUpdate(eq);
////
//        campeonato.setEquipes(List.of(eq));
////
//


        // -Consultar um time por nome
//        Equipe eq = equipeDAO.findByName("Flamengo");
//        System.out.println(eq);
//        System.out.println("==============================\n");

        // -Consultar um time por nome do jogador
//        Equipe eq = equipeDAO.findByNamePlayer("Hugo");
//        System.out.println(eq);
//        System.out.println("==============================\n");


        // -Consultar os campeonatos que o time participa
        Campeonato campeonato = equipeDAO.findChampionship(UUID.fromString("0c8820d5-07f2-4abf-b05f-e9c6bb99bb41"));

        System.out.println("");
        System.out.println(campeonato);

    }

}
