package com.gft.DesafioAPI.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_deputado")
public class Deputado extends Politico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Boolean lider = false;

    public Deputado() {
    }

    public Deputado(Long id, String nome, String cpf, Endereco endereco, Telefone telefone, String sigla, String nomePartido,  Boolean lider, String foto, List<String> projetoDeLei) {
        super(nome, cpf, endereco, telefone, sigla, nomePartido, foto, projetoDeLei);
        this.id = id;
        this.lider = lider;
    }

    public Deputado(String nome, String sigla, String nomePartido, Boolean lider,
                    String foto, List<String> projetoDeLei) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getLider() {
        return lider;
    }

    public void setLider(Boolean lider) {
        this.lider = lider;
    }
}
