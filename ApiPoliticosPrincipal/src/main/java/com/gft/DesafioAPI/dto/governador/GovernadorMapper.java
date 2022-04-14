package com.gft.DesafioAPI.dto.governador;

import com.gft.DesafioAPI.dto.endereco.EnderecoMapper;
import com.gft.DesafioAPI.dto.telefone.TelefoneMapper;
import com.gft.DesafioAPI.model.Governador;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Collection;

public class GovernadorMapper {

    public static Governador fromDTO(RegistroGovernadorDTO dto) {
        return new Governador(null, dto.getNome(), dto.getCpf(), EnderecoMapper.fromDTO(dto.getEnderecoDTO()), TelefoneMapper.fromDTO(dto.getTelefoneDTO()),
                dto.getSigla(), dto.getNomePartido(), dto.getFoto(), dto.getProjetoDeLei(), dto.getProcessos());
    }

    public static ConsultaGovernadorDTO fromEntity(Governador d) {

        Collection<? extends GrantedAuthority> authorities = SecurityContextHolder.getContext().getAuthentication().getAuthorities();

        if (authorities.toString().equalsIgnoreCase("[Admin]")) {
            return new ConsultaGovernadorDTO(d.getId(), d.getNome(), d.getCpf(), EnderecoMapper.fromEntity(d.getEndereco()),
                    TelefoneMapper.fromEntity(d.getTelefone()), d.getSigla(), d.getNomePartido(), d.getFoto(), d.getProjetoDeLei(), d.getProcessos());
        } else {
            return new ConsultaGovernadorDTO(d.getNome(), d.getSigla(), d.getNomePartido(), d.getFoto(), d.getProjetoDeLei(), d.getProcessos());
        }
    }
}
