package br.edu.fafic.pi.model;

import lombok.*;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
//@Data
@DiscriminatorValue("T")
@NamedQueries(
        {
                @NamedQuery(
                        name = "findChampionshipByCoach", query = "SELECT t.equipe FROM Tecnico t WHERE t.nome = :nomeTecnico"
                )
        }
)
public class Tecnico extends Pessoa {

    @OneToOne
    private Equipe equipe;

    @Override
    public String toString() {
        return this.getNome();
    }

}
