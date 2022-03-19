package br.edu.fafic.pi.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
//@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@NamedQueries(
        {
                @NamedQuery(
                        name = "findByName",
                        query = "SELECT e FROM Equipe e WHERE nome = :nome"
                ),
                @NamedQuery(
                        name = "findByNamePlayer",
                        query = "SELECT e FROM Equipe e LEFT JOIN e.jogadores j WHERE j.nome = :nome"
                ),
                @NamedQuery(
                        name = "findAll",
                        query = "SELECT e FROM Equipe e"
                ),
                @NamedQuery(
                        name = "findChampionship",
                        query = "SELECT e.campeonato FROM Equipe e"
                ),
                @NamedQuery(
                        name = "findAllPlayers",
                        query = "SELECT e.jogadores FROM Equipe e WHERE e.uuid = :uuid"
                ),

        }
)
public class Equipe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID uuid;

    private String nome;

    @OneToMany
    private List<Jogador> jogadores;

    @OneToOne
    private Tecnico tecnico;

    @ManyToOne
    private Campeonato campeonato;

    public UUID getUuid() {
        return uuid;
    }

    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public void setJogadores(List<Jogador> jogadores) {
        this.jogadores = jogadores;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public Campeonato getCampeonato() {
        return campeonato;
    }

    public void setCampeonato(Campeonato campeonato) {
        this.campeonato = campeonato;
    }

    @Override
    public String toString() {
        return "Equipe: " + this.nome +
                ", Jogadores: " + jogadores +
                ", Tecnico: " + tecnico.toString();
    }

}
