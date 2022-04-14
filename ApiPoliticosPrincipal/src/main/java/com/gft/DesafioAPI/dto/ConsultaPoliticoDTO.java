package com.gft.DesafioAPI.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.gft.DesafioAPI.dto.endereco.EnderecoDTO;
import com.gft.DesafioAPI.dto.telefone.TelefoneDTO;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class ConsultaPoliticoDTO {

    protected Long id;
    protected String nome;
    protected String cpf;
    protected EnderecoDTO enderecoDTO;
    protected TelefoneDTO telefoneDTO;
    protected String sigla;
    protected String nomePartido;
    protected String foto;
    protected List<String> projetoDeLei;

    public ConsultaPoliticoDTO() {
    }

    public ConsultaPoliticoDTO(Long id, String nome, String cpf, EnderecoDTO enderecoDTO, TelefoneDTO telefoneDTO,
                               String sigla, String nomePartido, String foto, List<String> projetoDeLei) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.enderecoDTO = enderecoDTO;
        this.telefoneDTO = telefoneDTO;
        this.sigla = sigla;
        this.nomePartido = nomePartido;
        this.foto = foto;
        this.projetoDeLei = projetoDeLei;
    }

    public ConsultaPoliticoDTO(String nome, String sigla, String nomePartido, String foto, List<String> projetoDeLei) {
        this.nome = nome;
        this.sigla = sigla;
        this.nomePartido = nomePartido;
        this.foto = foto;
        this.projetoDeLei = projetoDeLei;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public EnderecoDTO getEnderecoDTO() {
        return enderecoDTO;
    }

    public void setEnderecoDTO(EnderecoDTO enderecoDTO) {
        this.enderecoDTO = enderecoDTO;
    }

    public TelefoneDTO getTelefoneDTO() {
        return telefoneDTO;
    }

    public void setTelefoneDTO(TelefoneDTO telefoneDTO) {
        this.telefoneDTO = telefoneDTO;
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

    public List<String> getProjetoDeLei() {
        return projetoDeLei;
    }

    public void setProjetoDeLei(List<String> projetoDeLei) {
        this.projetoDeLei = projetoDeLei;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
