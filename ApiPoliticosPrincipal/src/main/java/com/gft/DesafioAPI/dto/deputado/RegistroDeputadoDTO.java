package com.gft.DesafioAPI.dto.deputado;

import com.gft.DesafioAPI.dto.RegistroPoliticoDTO;

public class RegistroDeputadoDTO extends RegistroPoliticoDTO {

    private Boolean lider;

    public Boolean getLider() {
        return lider;
    }

    public void setLider(Boolean lider) {
        this.lider = lider;
    }
}
