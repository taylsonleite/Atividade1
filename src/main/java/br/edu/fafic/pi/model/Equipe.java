package br.edu.fafic.pi.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
                        query = "SELECT e FROM Equipe e INNER JOIN Jogador j ON j.nome = :nome"
                ),
                @NamedQuery(
                        name = "findAll",
                        query = "SELECT e FROM Equipe e"
                ),
                @NamedQuery(
                        name = "findChampionship",
                        query = "SELECT e.campeonato FROM Equipe e"
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

    @Override
    public String toString() {
        return "Equipe: " + this.nome +
                ", Jogadores: " + jogadores +
                ", Tecnico: " + tecnico.toString();
    }

}
