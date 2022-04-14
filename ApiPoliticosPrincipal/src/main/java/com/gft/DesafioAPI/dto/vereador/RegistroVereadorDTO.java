package com.gft.DesafioAPI.dto.vereador;

import com.gft.DesafioAPI.dto.RegistroPoliticoDTO;

import java.util.List;

public class RegistroVereadorDTO extends RegistroPoliticoDTO {

    protected List<String> processos;

    public List<String> getProcessos() {
        return processos;
    }

    public void setProcessos(List<String> processos) {
        this.processos = processos;
    }
}
