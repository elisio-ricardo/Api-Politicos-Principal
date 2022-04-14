package com.gft.DesafioAPI.dto.deputado;

import com.gft.DesafioAPI.dto.ConsultaPoliticoDTO;
import com.gft.DesafioAPI.dto.endereco.EnderecoDTO;
import com.gft.DesafioAPI.dto.telefone.TelefoneDTO;

import java.util.List;

public class ConsultaDeputadoDTO extends ConsultaPoliticoDTO {

    private Boolean lider;

    public ConsultaDeputadoDTO() {
    }

    public ConsultaDeputadoDTO(Long id, String nome, String cpf, EnderecoDTO enderecoDTO, TelefoneDTO telefoneDTO, String sigla,
                                 String nomePartido, Boolean lider, String foto, List<String> projetoDeLei) {
        super(id, nome, cpf, enderecoDTO, telefoneDTO, sigla, nomePartido, foto, projetoDeLei);
        this.lider = lider;
    }

    public ConsultaDeputadoDTO(String nome, String sigla, String nomePartido, Boolean lider, String foto, List<String> projetoDeLei) {
        super( nome,  sigla, nomePartido, foto, projetoDeLei);
        this.lider = lider;
    }

    public Boolean getLider() {
        return lider;
    }

    public void setLider(Boolean lider) {
        this.lider = lider;
    }
}
