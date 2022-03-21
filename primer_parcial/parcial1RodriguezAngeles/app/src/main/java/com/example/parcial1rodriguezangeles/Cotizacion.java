package com.example.parcial1rodriguezangeles;

public class Cotizacion {

    private String marca;
    private String modelo;
    private float costo;
    private int plazo;
    private float mensualidad;
    private float enganche;
    private float comision;

    public Cotizacion() {
    }

    public Cotizacion(String marca, String modelo, float costo, int plazo, float mensualidad, float enganche, float comision) {
        this.marca = marca;
        this.modelo = modelo;
        this.costo = costo;
        this.plazo = plazo;
        this.mensualidad = mensualidad;
        this.enganche = enganche;
        this.comision = comision;
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

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    public float getMensualidad() {
        return mensualidad;
    }

    public void setMensualidad(float mensualidad) {
        this.mensualidad = mensualidad;
    }

    public float getEnganche() {
        return enganche;
    }

    public void setEnganche(float enganche) {
        this.enganche = enganche;
    }

    public float getComision() {
        return comision;
    }

    public void setComision(float comision) {
        this.comision = comision;
    }
}
