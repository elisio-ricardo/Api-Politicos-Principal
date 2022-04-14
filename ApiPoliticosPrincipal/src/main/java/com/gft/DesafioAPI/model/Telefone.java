package com.gft.DesafioAPI.model;


import javax.persistence.Embeddable;

@Embeddable
public class Telefone {

    private String telResidencia;
    private String telCelular;

    public Telefone() {
    }

    public Telefone(String telResidencia, String telCelular) {
        this.telResidencia = telResidencia;
        this.telCelular = telCelular;
    }

    public String getTelResidencia() {
        return telResidencia;
    }

    public void setTelResidencia(String telResidencia) {
        this.telResidencia = telResidencia;
    }

    public String getTelCelular() {
        return telCelular;
    }

    public void setTelCelular(String telCelular) {
        this.telCelular = telCelular;
    }
}
