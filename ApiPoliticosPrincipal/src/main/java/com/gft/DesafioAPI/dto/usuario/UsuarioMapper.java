package com.gft.DesafioAPI.dto.usuario;

import com.gft.DesafioAPI.model.Perfil;
import com.gft.DesafioAPI.model.Usuario;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class UsuarioMapper {

    public static Usuario fromDTO(RegistroUsuarioDTO dto){
        Perfil perfil = new Perfil();
        perfil.setId(dto.getPerfilId());

        return  new Usuario(null, dto.getEmail(), new BCryptPasswordEncoder().encode(dto.getSenha()), perfil);
    }

    public  static ConsultaUsuarioDTO fromEntity(Usuario usuario){
        return  new ConsultaUsuarioDTO(usuario.getEmail(), usuario.getPerfil().getNome());
    }

}
