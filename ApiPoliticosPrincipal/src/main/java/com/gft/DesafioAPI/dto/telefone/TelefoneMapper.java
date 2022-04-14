package com.gft.DesafioAPI.dto.telefone;

import com.gft.DesafioAPI.model.Telefone;

public class TelefoneMapper {

    public static Telefone fromDTO(TelefoneDTO dto) {
        return new Telefone(dto.getNumeroResidencia(), dto.getNumeroCelular());
    }

    public static TelefoneDTO fromEntity(Telefone telefone) {
        return new TelefoneDTO(telefone.getTelResidencia(), telefone.getTelCelular());
    }

}
