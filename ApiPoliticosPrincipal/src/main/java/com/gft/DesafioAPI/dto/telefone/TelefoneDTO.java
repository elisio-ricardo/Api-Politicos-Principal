package com.gft.DesafioAPI.dto.telefone;

public class TelefoneDTO {

    private String numeroResidencia;
    private String numeroCelular;

    public TelefoneDTO() {
    }

    public TelefoneDTO(String numeroResidencia, String numeroCelular) {
        this.numeroResidencia = numeroResidencia;
        this.numeroCelular = numeroCelular;
    }

    public String getNumeroResidencia() {
        return numeroResidencia;
    }

    public void setNumeroResidencia(String numeroResidencia) {
        this.numeroResidencia = numeroResidencia;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }
}
