package com.universidad.model;

public class Estudiante extends Persona {

    private String correo;
    private int semestre;

    public Estudiante(String nombre,
                       String identificacion,
                       String correo,
                       int semestre) {

        super(nombre, identificacion);

        this.correo = correo;
        this.semestre = semestre;
    }

    @Override
    public void mostrarInformacion() {

        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + identificacion);
        System.out.println("Correo: " + correo);
        System.out.println("Semestre: " + semestre);
    }
}
