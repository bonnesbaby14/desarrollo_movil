package com.company;

public class Herramienta {
    private String marca;
    private String modelo;
    private String codigo;
    private String costo;

    public Herramienta(String marca, String modelo, String codigo, String costo) {
        this.marca = marca;
        this.modelo = modelo;
        this.codigo = codigo;
        this.costo = costo;
    }

    public Herramienta() {

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }
}
