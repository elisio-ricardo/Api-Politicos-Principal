package com.gft.DesafioAPI.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tb_vereador")
public class Vereador extends Politico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ElementCollection
    protected List<String> processos;

    public Vereador() {
    }

    public Vereador(Long id, String nome, String cpf, Endereco endereco, Telefone telefone, String sigla, String nomePartido, String foto,
                    List<String> projetoDeLei, List<String> processos) {
        super(nome, cpf, endereco, telefone, sigla, nomePartido, foto, projetoDeLei);
        this.id = id;
        this.processos = processos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<String> getProcessos() {
        return processos;
    }

    public void setProcessos(List<String> processos) {
        this.processos = processos;
    }
}
