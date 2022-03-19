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
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@NamedQueries(
        {
                @NamedQuery(
                        name = "findAllTeams", query = "SELECT c.equipes FROM Campeonato c WHERE c.nome = :nomeCampeonato"
                )
        }
)
public class Campeonato {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID uuid;

    private String nome;

    @OneToMany
    private List<Equipe> equipes;

}
