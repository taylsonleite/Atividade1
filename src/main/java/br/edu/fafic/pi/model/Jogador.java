package br.edu.fafic.pi.model;

import lombok.*;

import javax.persistence.*;
import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
//@Data
@DiscriminatorValue("J")
public class Jogador extends Pessoa {

    private String posicao;
    private String status;

    @ManyToOne
    private Equipe equipe;

//    @Override
//    public String toString() {
//        return "Nome: " + this.getNome() +
//                ", Posição: " + this.posicao +
//                ", Status: " + status;
//    }

}
