package br.edu.fafic.pi.model;

import lombok.*;

import javax.persistence.*;
import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@DiscriminatorValue("J")
public class Jogador extends Pessoa {

    private String posicao;
    private String status;

//    @ManyToOne
//    private Equipe equipe;

}
