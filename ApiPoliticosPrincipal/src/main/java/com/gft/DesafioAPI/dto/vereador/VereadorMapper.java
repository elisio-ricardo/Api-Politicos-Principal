package com.gft.DesafioAPI.dto.vereador;

import com.gft.DesafioAPI.dto.endereco.EnderecoMapper;
import com.gft.DesafioAPI.dto.telefone.TelefoneMapper;
import com.gft.DesafioAPI.model.Vereador;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Collection;

public class VereadorMapper {

    public static Vereador fromDTO(RegistroVereadorDTO dto) {
        return new Vereador(null, dto.getNome(), dto.getCpf(), EnderecoMapper.fromDTO(dto.getEnderecoDTO()), TelefoneMapper.fromDTO(dto.getTelefoneDTO()),
                dto.getSigla(), dto.getNomePartido(), dto.getFoto(), dto.getProjetoDeLei(), dto.getProcessos());
    }

    public static ConsultaVereadorDTO fromEntity(Vereador d) {

        Collection<? extends GrantedAuthority> authorities = SecurityContextHolder.getContext().getAuthentication().getAuthorities();

        if (authorities.toString().equalsIgnoreCase("[Admin]")) {
            return new ConsultaVereadorDTO(d.getId(), d.getNome(), d.getCpf(), EnderecoMapper.fromEntity(d.getEndereco()),
                    TelefoneMapper.fromEntity(d.getTelefone()), d.getSigla(), d.getNomePartido(), d.getFoto(), d.getProjetoDeLei(), d.getProcessos());
        } else {
            return new ConsultaVereadorDTO(d.getNome(), d.getSigla(), d.getNomePartido(), d.getFoto(), d.getProjetoDeLei(), d.getProcessos());
        }
    }

}
