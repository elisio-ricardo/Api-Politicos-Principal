package com.gft.DesafioAPI.model;


import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_presidente")
public class Presidente extends Politico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    public Presidente() {
    }

    public Presidente(Long id, String nome, String cpf, Endereco endereco, Telefone telefone, String sigla,
                      String nomePartido, String foto, List<String> projetoDeLei) {
        super(nome, cpf, endereco, telefone, sigla, nomePartido, foto, projetoDeLei);
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
