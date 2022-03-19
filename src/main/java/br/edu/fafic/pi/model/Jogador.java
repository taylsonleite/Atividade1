package br.edu.fafic.pi.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@EqualsAndHashCode(callSuper = true)
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
//@Data
@DiscriminatorValue("J")
@NamedQueries(
        {
                @NamedQuery(
                        name = "findPlayer",
                        query = "SELECT j FROM Jogador j WHERE j.nome = :nome"
                ),
                @NamedQuery(
                        name = "findPlayerByStatus",
                        query = "SELECT j FROM Jogador j WHERE j.status = :status"
                ),
        }
)
public class Jogador extends Pessoa {

    private String posicao;
    private String status;

    @ManyToOne
    private Equipe equipe;

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() +
                ", Posição: " + this.posicao +
                ", Status: " + status +
                ", Equipe: " + equipe.getNome();
    }

}
