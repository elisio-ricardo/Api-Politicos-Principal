package com.gft.DesafioAPI.dto.prefeito;

import com.gft.DesafioAPI.dto.endereco.EnderecoMapper;
import com.gft.DesafioAPI.dto.telefone.TelefoneMapper;
import com.gft.DesafioAPI.model.Prefeito;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Collection;

public class PrefeitoMapper {

    public static Prefeito fromDTO(RegistroPrefeitoDTO dto) {
        return new Prefeito(null, dto.getNome(), dto.getCpf(), EnderecoMapper.fromDTO(dto.getEnderecoDTO()), TelefoneMapper.fromDTO(dto.getTelefoneDTO()),
                dto.getSigla(), dto.getNomePartido(), dto.getFoto(), dto.getProjetoDeLei());
    }

    public static ConsultaPrefeitoDTO fromEntity(Prefeito d) {

        Collection<? extends GrantedAuthority> authorities = SecurityContextHolder.getContext().getAuthentication().getAuthorities();

        if (authorities.toString().equalsIgnoreCase("[Admin]")) {
            return new ConsultaPrefeitoDTO(d.getId(), d.getNome(), d.getCpf(), EnderecoMapper.fromEntity(d.getEndereco()),
                    TelefoneMapper.fromEntity(d.getTelefone()), d.getSigla(), d.getNomePartido(), d.getFoto(), d.getProjetoDeLei());
        } else {
            return new ConsultaPrefeitoDTO(d.getNome(), d.getSigla(), d.getNomePartido(), d.getFoto(), d.getProjetoDeLei());
        }
    }
}
