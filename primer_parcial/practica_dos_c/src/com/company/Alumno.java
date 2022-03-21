package com.company;

public class Alumno extends Persona{

    private  String grado;

    public Alumno(String nombre, String apellido, String grado) {
        super(nombre, apellido);
        this.grado = grado;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    @Override
    public void saludo() {
        System.out.println("Hola soy un alumno");
    }
}
