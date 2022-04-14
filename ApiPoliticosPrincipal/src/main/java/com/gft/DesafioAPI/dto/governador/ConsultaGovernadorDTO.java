package com.gft.DesafioAPI.dto.governador;

import com.gft.DesafioAPI.dto.ConsultaPoliticoDTO;
import com.gft.DesafioAPI.dto.endereco.EnderecoDTO;
import com.gft.DesafioAPI.dto.telefone.TelefoneDTO;

import java.util.List;

public class ConsultaGovernadorDTO extends ConsultaPoliticoDTO {


    protected List<String> processos;

    public ConsultaGovernadorDTO() {
    }

    public ConsultaGovernadorDTO(Long id, String nome, String cpf, EnderecoDTO enderecoDTO, TelefoneDTO telefoneDTO, String sigla,
                               String nomePartido, String foto, List<String> projetoDeLei, List<String> processos) {
        super(id, nome, cpf, enderecoDTO, telefoneDTO, sigla, nomePartido, foto, projetoDeLei);
        this.processos = processos;
    }

    public ConsultaGovernadorDTO(String nome, String sigla, String nomePartido, String foto, List<String> projetoDeLei, List<String> processos) {
        super(nome, sigla, nomePartido, foto, projetoDeLei);
        this.processos = processos;
    }

    public List<String> getProcessos() {
        return processos;
    }

    public void setProcessos(List<String> processos) {
        this.processos = processos;
    }
}
