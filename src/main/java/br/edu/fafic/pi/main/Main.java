package br.edu.fafic.pi.main;

import br.edu.fafic.pi.dao.CampeonatoDAO;
import br.edu.fafic.pi.dao.EquipeDAO;
import br.edu.fafic.pi.dao.JogadorDAO;
import br.edu.fafic.pi.dao.TecnicoDAO;
import br.edu.fafic.pi.model.Equipe;
import br.edu.fafic.pi.model.Jogador;

import java.util.List;
import java.util.UUID;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        JogadorDAO jogadorDAO = new JogadorDAO();
        TecnicoDAO tecnicoDAO = new TecnicoDAO();
        CampeonatoDAO campeonatoDAO = new CampeonatoDAO();
        EquipeDAO equipeDAO = new EquipeDAO();

        // INSERINDO JOGADORES
//        Jogador jogador = Jogador.builder()
//                .posicao("Lateral direito")
//                .status("Contratado")
//                .build();
//        jogador.setNome("Taylson");
//
//        Jogador jogador2 = Jogador.builder()
//                .posicao("Zagueiro")
//                .status("Contratado")
//                .build();
//        jogador2.setNome("Klelver");
//
//        jogadorDAO.saveOrUpdate(jogador);
//        jogadorDAO.saveOrUpdate(jogador2);

        // INSERINDO TECNICO
//        Tecnico tecnico = new Tecnico();
//        tecnico.setNome("Jorge Jesus");

//        tecnicoDAO.saveOrUpdate(tecnico);

        // BUSCANDO JOGADORES DO BANCO DE DADOS
//        Jogador jogador1 = jogadorDAO.findById(Jogador.class, UUID.fromString("78afec88-2b6d-4ae8-bdc8-ae8adbdae0be"));
//        Jogador jogador2 = jogadorDAO.findById(Jogador.class, UUID.fromString("bf1bd04a-f4f6-4004-b56c-da9fd9d6e554"));


        // BUSCANDO TECNICO DO BANCO DE DADOS
//        Tecnico tecnico = tecnicoDAO.findById(Tecnico.class, UUID.fromString("5c61b7d8-1149-42ed-8bd6-f3646a5706ba"));


        // INSERINDO EQUIPE CONFIGURANDO OS JOGADORES E O TÉCNICO BUSCADOS DO BANCO
//        Equipe equipe = Equipe.builder()
//                .jogadores(List.of(jogador1, jogador2))
//                .tecnico(tecnico)
//                .nome("Vasco")
//                .build();
//
//        equipeDAO.saveOrUpdate(equipe);


        // BUSCANDO EQUIPE DO BANCO DE DADOS
//        Equipe equipe = equipeDAO.findById(Equipe.class, UUID.fromString("f03252f1-8fc0-4acd-91ef-504b91eac31e"));


        // CONFIGURANDO EQUIPE PARA O TÉCNICO E OS JOGADORES
//        tecnico.setEquipe(equipe);
//        jogador1.setEquipe(equipe);
//        jogador2.setEquipe(equipe);

//        tecnicoDAO.saveOrUpdate(tecnico);
//        jogadorDAO.saveOrUpdate(jogador1);
//        jogadorDAO.saveOrUpdate(jogador2);

        // BUSCANDO CAMPEONATO DO BANCO DE DADOS
//        Campeonato campeonato = campeonatoDAO.findById(Campeonato.class,
//                UUID.fromString("0c8820d5-07f2-4abf-b05f-e9c6bb99bb41"));

        // CRIANDO UM NOVO CAMPEONATO
//        Campeonato camp = Campeonato.builder()
//                .nome("Mundial")
//                .build();

        // CONFIGURANDO EQUIPES PARA O CAMPEONATO BUSCADO DO BANCO
//        campeonato.setEquipes(List.of(equipe));
//        campeonatoDAO.saveOrUpdate(campeonato);

        // CONFIGURANDO CAMPEONATO PARA A EQUIPE BUSCADA DO BANCO
//        equipe.setCampeonato(campeonato);
//        equipeDAO.saveOrUpdate(equipe);

//        campeonato.setEquipes(List.of(eq));


        //========================================= RESOLUÇÃO DA ATIVIDADE =========================================


        // 1- Consultar um time por nome
//        Equipe eq = equipeDAO.findByName("Flamengo");
//        System.out.println("\n");
//        System.out.println(eq);
//        System.out.println("==============================\n");

        // 2- Consultar um time por nome do jogador
//        System.out.println("\n");
//        Equipe eq = equipeDAO.findByNamePlayer("Hugo");
//        System.out.println(eq);
//        System.out.println("==============================\n");


        // 3- Consultar os campeonatos que o time participa
//        Campeonato campeonato = equipeDAO.findChampionship();
//        System.out.println();
//        System.out.println(campeonato);

        // 4- Consultar as equipes que participam de um campeonato através do nome do campeonato
//        List<Equipe> equipes = campeonatoDAO.findByTeam("Mundial");
//        System.out.println();
//        System.out.println(equipes);

        // 5- Consultar jogador por nome
//        System.out.println(" ");
//        Jogador j = jogadorDAO.getPlayer("Taylson");
//        System.out.println(j);

        // 6- Consultar jogadores por status
//        System.out.println(" ");
//        List<Jogador> jogadores = jogadorDAO.getPlayeByStatus("Machucado");
//        System.out.println(jogadores);

        // 7- Consultar jogadores por equipe
//        System.out.println(" ");
//        List<Jogador> jogadores = equipeDAO.findAllPlayers(UUID.fromString("8f3cf099-bc7f-40e2-a258-db323c0785d2"));
//        System.out.println(jogadores);

        // 8- Consultar o time que o técnico treina(pelo nome do técnico) trazendo todos os jogadores desse time
//        Equipe e = tecnicoDAO.findChampionshipByCoach("Guardiola");
//        System.out.println(e);

    }

}
