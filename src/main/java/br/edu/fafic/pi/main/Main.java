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
//
//        tecnicoDAO.saveOrUpdate(tecnico);
//
//        Jogador jogador1 = jogadorDAO.findById(Jogador.class, UUID.fromString("13522c1a-fbfa-49fe-8021-5d377cbfe872"));
//        Jogador jogador2 = jogadorDAO.findById(Jogador.class, UUID.fromString("5e0f6303-55ce-4574-b895-523e356a1d2b"));
//
//        Tecnico tecnico = tecnicoDAO.findById(Tecnico.class, UUID.fromString("d4a31da5-c43c-4e2f-9449-007592066875"));
//
//        Equipe equipe = Equipe.builder()
//                .jogadores(List.of(jogador1, jogador2))
//                .tecnico(tecnico)
//                .nome("Flamengo")
//                .build();
//
//        equipeDAO.saveOrUpdate(equipe);

//                Campeonato campeonato = campeonatoDAO.findById(Campeonato.class,
//                        UUID.fromString("3927c35e-d645-49ee-ae83-fb0962fc2e48"));

//        Campeonato camp = Campeonato.builder()
//                .nome("Mundial")
//                .build();
//
//        Equipe eq = equipeDAO.findById(Equipe.class, UUID.fromString("416a51a8-670c-40a6-a2ec-d81a9b76d30d"));
//
//        camp.setEquipes(List.of(eq));
//        campeonatoDAO.saveOrUpdate(camp);

//        eq.setCampeonato(campeonato);
////        equipeDAO.saveOrUpdate(eq);
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
        //TODO: parcialmente correto. VERIFICAR
//        List<Campeonato> campeonato = campeonatoDAO.findByTeam(UUID.fromString("416a51a8-670c-40a6-a2ec-d81a9b76d30d"));
//        System.out.println(campeonato);

    }

}
