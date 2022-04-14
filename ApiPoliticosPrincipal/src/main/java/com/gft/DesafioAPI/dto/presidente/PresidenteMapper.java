package com.gft.DesafioAPI.dto.presidente;

import com.gft.DesafioAPI.dto.endereco.EnderecoMapper;
import com.gft.DesafioAPI.dto.telefone.TelefoneMapper;
import com.gft.DesafioAPI.model.Presidente;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Collection;

public class PresidenteMapper {

    public static Presidente fromDTO(RegistroPresidenteDTO dto) {
        return new Presidente(null, dto.getNome(), dto.getCpf(), EnderecoMapper.fromDTO(dto.getEnderecoDTO()), TelefoneMapper.fromDTO(dto.getTelefoneDTO()),
                dto.getSigla(), dto.getNomePartido(), dto.getFoto(), dto.getProjetoDeLei());
    }

    public static ConsultaPresidenteDTO fromEntity(Presidente d) {

        Collection<? extends GrantedAuthority> authorities = SecurityContextHolder.getContext().getAuthentication().getAuthorities();

        if (authorities.toString().equalsIgnoreCase("[Admin]")) {
            return new ConsultaPresidenteDTO(d.getId(), d.getNome(), d.getCpf(), EnderecoMapper.fromEntity(d.getEndereco()),
                    TelefoneMapper.fromEntity(d.getTelefone()), d.getSigla(), d.getNomePartido(), d.getFoto(), d.getProjetoDeLei());
        } else {
            return new ConsultaPresidenteDTO( d.getNome(), d.getSigla(), d.getNomePartido(), d.getFoto(), d.getProjetoDeLei());
        }
    }
}
