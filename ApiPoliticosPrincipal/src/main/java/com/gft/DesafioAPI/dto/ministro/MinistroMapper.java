package com.gft.DesafioAPI.dto.ministro;

import com.gft.DesafioAPI.dto.endereco.EnderecoMapper;
import com.gft.DesafioAPI.dto.telefone.TelefoneMapper;
import com.gft.DesafioAPI.model.Ministro;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Collection;

public class MinistroMapper {

    public static Ministro fromDTO(RegistroMinistroDTO dto) {
        return new Ministro(null, dto.getNome(), dto.getCpf(), EnderecoMapper.fromDTO(dto.getEnderecoDTO()), TelefoneMapper.fromDTO(dto.getTelefoneDTO()),
                dto.getSigla(), dto.getNomePartido(), dto.getFoto(), dto.getProjetoDeLei());
    }

    public static ConsultaMinistroDTO fromEntity(Ministro d) {

        Collection<? extends GrantedAuthority> authorities = SecurityContextHolder.getContext().getAuthentication().getAuthorities();

        if (authorities.toString().equalsIgnoreCase("[Admin]")) {
            return new ConsultaMinistroDTO(d.getId(), d.getNome(), d.getCpf(), EnderecoMapper.fromEntity(d.getEndereco()),
                    TelefoneMapper.fromEntity(d.getTelefone()), d.getSigla(), d.getNomePartido(), d.getFoto(), d.getProjetoDeLei());
        } else {
            return new ConsultaMinistroDTO(d.getNome(), d.getSigla(), d.getNomePartido(), d.getFoto(), d.getProjetoDeLei());
        }
    }
}
