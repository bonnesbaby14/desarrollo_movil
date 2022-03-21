package com.company;

public class Cita {
    String fecha;
    String hora;
    String lugar;

    public Cita(String fecha, String hora, String lugar) {
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
    }

    public Cita() {
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
}
