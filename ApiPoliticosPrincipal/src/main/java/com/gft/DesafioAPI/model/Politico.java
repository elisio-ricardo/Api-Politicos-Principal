package com.gft.DesafioAPI.model;

import org.hibernate.validator.constraints.br.CPF;

import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.MappedSuperclass;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import java.util.List;

@MappedSuperclass
public abstract class Politico {

    @NotEmpty
    protected String nome;

    @CPF
    @NotEmpty
    protected String cpf;

    @Embedded
    protected Endereco endereco;

    @Embedded
    protected Telefone telefone;

    @NotEmpty
    protected String sigla;

    @NotEmpty
    protected String nomePartido;

    @NotEmpty
    protected String foto;

    @ElementCollection
    protected List<String> projetoDeLei;

    public Politico() {
    }

    public Politico(String nome, String cpf, Endereco endereco, Telefone telefone, String sigla, String nomePartido, String foto, List<String> projetoDeLei) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.sigla = sigla;
        this.nomePartido = nomePartido;
        this.foto = foto;
        this.projetoDeLei = projetoDeLei;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNomePartido() {
        return nomePartido;
    }

    public void setNomePartido(String nomePartido) {
        this.nomePartido = nomePartido;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public List<String> getProjetoDeLei() {
        return projetoDeLei;
    }

    public void setProjetoDeLei(List<String> projetoDeLei) {
        this.projetoDeLei = projetoDeLei;
    }
}
