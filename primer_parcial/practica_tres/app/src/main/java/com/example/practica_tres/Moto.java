package com.example.practica_tres;

public class Moto {
    private String marca;
    private String modelo;
    private int ano;
    private boolean activa;

    public Moto(String marca, String modelo, int ano, boolean activa) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.activa = activa;
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

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }
}
