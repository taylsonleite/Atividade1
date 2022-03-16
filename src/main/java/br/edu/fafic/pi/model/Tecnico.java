package br.edu.fafic.pi.model;

import lombok.*;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@EqualsAndHashCode(callSuper = true)
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@DiscriminatorValue("T")
public class Tecnico extends Pessoa {

    @OneToOne
    private Equipe equipe;

    @Override
    public String toString() {
        return this.getNome();
    }

}
