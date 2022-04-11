package com.example.practica05;

public class Viaje {
    private String codigo;
    private float costo;
    private int dias;
    private int personas;
    private String origen;

    public Viaje(String codigo, float costo, int dias, int personas, String origen) {
        this.codigo = codigo;
        this.costo = costo;
        this.dias = dias;
        this.personas = personas;
        this.origen = origen;
    }

    public Viaje() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public int getPersonas() {
        return personas;
    }

    public void setPersonas(int personas) {
        this.personas = personas;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }
}
