package com.gft.DesafioAPI.dto.prefeito;

import com.gft.DesafioAPI.dto.ConsultaPoliticoDTO;
import com.gft.DesafioAPI.dto.endereco.EnderecoDTO;
import com.gft.DesafioAPI.dto.telefone.TelefoneDTO;

import java.util.List;

public class ConsultaPrefeitoDTO extends ConsultaPoliticoDTO {

    public ConsultaPrefeitoDTO() {
    }

    public ConsultaPrefeitoDTO(Long id, String nome, String cpf, EnderecoDTO enderecoDTO, TelefoneDTO telefoneDTO,
                               String sigla, String nomePartido, String foto, List<String> projetoDeLei) {
        super(id, nome, cpf, enderecoDTO, telefoneDTO, sigla, nomePartido, foto, projetoDeLei);
    }

    public ConsultaPrefeitoDTO(String nome, String sigla, String nomePartido, String foto, List<String> projetoDeLei) {
        super(nome, sigla, nomePartido, foto, projetoDeLei);
    }
}
