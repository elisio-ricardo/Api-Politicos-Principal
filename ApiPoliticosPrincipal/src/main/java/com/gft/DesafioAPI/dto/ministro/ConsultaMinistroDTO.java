package com.gft.DesafioAPI.dto.ministro;

import com.gft.DesafioAPI.dto.ConsultaPoliticoDTO;
import com.gft.DesafioAPI.dto.endereco.EnderecoDTO;
import com.gft.DesafioAPI.dto.telefone.TelefoneDTO;

import java.util.List;

public class ConsultaMinistroDTO extends ConsultaPoliticoDTO {

    public ConsultaMinistroDTO() {
    }

    public ConsultaMinistroDTO(Long id, String nome, String cpf, EnderecoDTO enderecoDTO, TelefoneDTO telefoneDTO,
                               String sigla, String nomePartido, String foto, List<String> projetoDeLei) {
        super(id, nome, cpf, enderecoDTO, telefoneDTO, sigla, nomePartido, foto, projetoDeLei);
    }

    public ConsultaMinistroDTO(String nome, String sigla, String nomePartido, String foto, List<String> projetoDeLei) {
        super(nome, sigla, nomePartido, foto, projetoDeLei);
    }
}
