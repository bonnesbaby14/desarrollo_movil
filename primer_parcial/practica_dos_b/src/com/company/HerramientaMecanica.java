package com.company;

public class HerramientaMecanica extends Herramienta{

    private String peso;
    private String tamano;
    private String dimensiones;


    public HerramientaMecanica(String marca, String modelo, String codigo, String costo, String peso, String tamano, String dimensiones) {
        super(marca, modelo, codigo, costo);
        this.peso = peso;
        this.tamano = tamano;
        this.dimensiones = dimensiones;
    }

    public HerramientaMecanica(String peso, String tamano, String dimensiones) {
        this.peso = peso;
        this.tamano = tamano;
        this.dimensiones = dimensiones;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }
}
