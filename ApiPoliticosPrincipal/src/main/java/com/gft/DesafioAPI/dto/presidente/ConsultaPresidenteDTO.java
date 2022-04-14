package com.gft.DesafioAPI.dto.presidente;

import com.gft.DesafioAPI.dto.ConsultaPoliticoDTO;
import com.gft.DesafioAPI.dto.endereco.EnderecoDTO;
import com.gft.DesafioAPI.dto.telefone.TelefoneDTO;

import java.util.List;

public class ConsultaPresidenteDTO extends ConsultaPoliticoDTO {

    public ConsultaPresidenteDTO() {
    }

    public ConsultaPresidenteDTO(Long id, String nome, String cpf, EnderecoDTO enderecoDTO, TelefoneDTO telefoneDTO, String sigla,
                                 String nomePartido, String foto, List<String> projetoDeLei) {
        super(id, nome, cpf, enderecoDTO, telefoneDTO, sigla, nomePartido, foto, projetoDeLei);
    }

    public ConsultaPresidenteDTO(String nome, String sigla, String nomePartido, String foto, List<String> projetoDeLei) {
        super(nome, sigla, nomePartido, foto, projetoDeLei);
    }
}
