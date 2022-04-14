package com.gft.DesafioAPI.dto.senador;

import com.gft.DesafioAPI.dto.ConsultaPoliticoDTO;
import com.gft.DesafioAPI.dto.endereco.EnderecoDTO;
import com.gft.DesafioAPI.dto.telefone.TelefoneDTO;

import java.util.List;

public class ConsultaSenadorDTO extends ConsultaPoliticoDTO {

    public ConsultaSenadorDTO() {
    }

    public ConsultaSenadorDTO(Long id, String nome, String cpf, EnderecoDTO enderecoDTO, TelefoneDTO telefoneDTO,
                              String sigla, String nomePartido, String foto, List<String> projetoDeLei) {
        super(id, nome, cpf, enderecoDTO, telefoneDTO, sigla, nomePartido, foto, projetoDeLei);
    }

    public ConsultaSenadorDTO(String nome, String sigla, String nomePartido, String foto, List<String> projetoDeLei) {
        super(nome, sigla, nomePartido, foto, projetoDeLei);
    }
}
