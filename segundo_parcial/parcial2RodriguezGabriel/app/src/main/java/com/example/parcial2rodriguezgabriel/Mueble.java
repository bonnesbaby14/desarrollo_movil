package com.example.parcial2rodriguezgabriel;

public class Mueble {

    private String modelo;
    private String codigo;
    private float costo;
    private String material;
    private int acabados;

    public Mueble(String modelo, String codigo, float costo, String material, int acabados) {
        this.modelo = modelo;
        this.codigo = codigo;
        this.costo = costo;
        this.material = material;
        this.acabados = acabados;
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

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public int getAcabados() {
        return acabados;
    }

    public void setAcabados(int acabados) {
        this.acabados = acabados;
    }
}
