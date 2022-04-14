package com.gft.DesafioAPI.dto.governador;

import com.gft.DesafioAPI.dto.RegistroPoliticoDTO;

import java.util.List;

public class RegistroGovernadorDTO extends RegistroPoliticoDTO {

    protected List<String> processos;

    public List<String> getProcessos() {
        return processos;
    }

    public void setProcessos(List<String> processos) {
        this.processos = processos;
    }
}
