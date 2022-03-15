package br.edu.fafic.pi.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@NoArgsConstructor
@Builder
@DiscriminatorValue("T")
public class Tecnico extends Pessoa {

//    @OneToOne
//    private Equipe equipe;

}
