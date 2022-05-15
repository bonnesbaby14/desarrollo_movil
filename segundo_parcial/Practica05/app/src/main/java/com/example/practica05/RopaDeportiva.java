package com.example.practica05;

public class RopaDeportiva {
    private String codigo;
    private String marca;
    private String modelo;
    private String talla;
    private String colores;
    private String costo;

    public RopaDeportiva() {
        this.codigo = "";
        this.marca = "";
        this.modelo = "";
        this.talla = "";
        this.colores = "";
        this.costo = "";
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColores() {
        return colores;
    }

    public void setColores(String colores) {
        this.colores = colores;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }
}
