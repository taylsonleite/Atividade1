package br.edu.fafic.pi.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
                        name = "findAllTeams", query = "SELECT c FROM Campeonato c JOIN Equipe e ON e.uuid = c.uuid"
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
