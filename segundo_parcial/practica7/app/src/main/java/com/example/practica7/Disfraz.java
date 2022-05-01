package com.example.practica7;

import java.io.Serializable;

public class Disfraz implements Serializable {

    String nombre;
    String domiclio;
    String item;
    String talla;
    String telefono;

    public Disfraz(String nombre, String domiclio, String item, String talla, String telefono) {
        this.nombre = nombre;
        this.domiclio = domiclio;
        this.item = item;
        this.talla = talla;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomiclio() {
        return domiclio;
    }

    public void setDomiclio(String domiclio) {
        this.domiclio = domiclio;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
