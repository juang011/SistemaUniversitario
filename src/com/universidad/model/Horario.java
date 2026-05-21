package com.universidad.model;

public class Horario {

    private String dia;
    private String hora;

    public Horario(String dia, String hora) {

        this.dia = dia;
        this.hora = hora;
    }

    public void mostrarHorario() {

        System.out.println("Día: " + dia);
        System.out.println("Hora: " + hora);
    }
}
