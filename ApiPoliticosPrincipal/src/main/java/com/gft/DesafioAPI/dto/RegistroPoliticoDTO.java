package com.gft.DesafioAPI.dto;

import com.gft.DesafioAPI.dto.endereco.EnderecoDTO;
import com.gft.DesafioAPI.dto.telefone.TelefoneDTO;

import javax.persistence.MappedSuperclass;
import java.util.List;

@MappedSuperclass
public abstract class RegistroPoliticoDTO {


    protected String nome;

    protected String cpf;

    protected EnderecoDTO enderecoDTO;

    protected TelefoneDTO telefoneDTO;

    protected String sigla;

    protected String nomePartido;

    protected List<String> projetoDeLei;

    protected String foto;

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
