package com.gft.DesafioAPI.dto.deputado;

import com.gft.DesafioAPI.dto.endereco.EnderecoMapper;
import com.gft.DesafioAPI.dto.telefone.TelefoneMapper;
import com.gft.DesafioAPI.model.Deputado;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;

import java.util.Collection;

public class DeputadoMapper {


    public static Deputado fromDTO(RegistroDeputadoDTO dto) {
        return new Deputado(null, dto.getNome(), dto.getCpf(), EnderecoMapper.fromDTO(dto.getEnderecoDTO()), TelefoneMapper.fromDTO(dto.getTelefoneDTO()),
                dto.getSigla(), dto.getNomePartido(), dto.getLider(), dto.getFoto(), dto.getProjetoDeLei());

    }

    public static ConsultaDeputadoDTO fromEntity(Deputado d) {

        Collection<? extends GrantedAuthority> authorities = SecurityContextHolder.getContext().getAuthentication().getAuthorities();

        if (authorities.toString().equalsIgnoreCase("[Admin]")) {
            return new ConsultaDeputadoDTO(d.getId(), d.getNome(), d.getCpf(), EnderecoMapper.fromEntity(d.getEndereco()),
                    TelefoneMapper.fromEntity(d.getTelefone()), d.getSigla(), d.getNomePartido(), d.getLider(), d.getFoto(), d.getProjetoDeLei());
        } else {
            return new ConsultaDeputadoDTO(d.getNome(), d.getSigla(), d.getNomePartido(), d.getLider(), d.getFoto(), d.getProjetoDeLei());
        }
    }

}
