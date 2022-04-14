package com.gft.DesafioAPI.dto.vereador;

import com.gft.DesafioAPI.dto.ConsultaPoliticoDTO;
import com.gft.DesafioAPI.dto.endereco.EnderecoDTO;
import com.gft.DesafioAPI.dto.telefone.TelefoneDTO;

import java.util.List;

public class ConsultaVereadorDTO extends ConsultaPoliticoDTO {

    protected List<String> processos;

    public ConsultaVereadorDTO() {
    }

    public ConsultaVereadorDTO(Long id, String nome, String cpf, EnderecoDTO enderecoDTO, TelefoneDTO telefoneDTO, String sigla,
                               String nomePartido, String foto, List<String> projetoDeLei, List<String> processos) {
        super(id, nome, cpf, enderecoDTO, telefoneDTO, sigla, nomePartido, foto, projetoDeLei);
        this.processos = processos;
    }

    public ConsultaVereadorDTO(String nome, String sigla, String nomePartido, String foto, List<String> projetoDeLei, List<String> processos) {
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
