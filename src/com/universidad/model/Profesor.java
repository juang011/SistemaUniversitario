package com.universidad.model;

public class Profesor extends Persona {

    private String especialidad;

    public Profesor(String nombre,
                     String identificacion,
                     String especialidad) {

        super(nombre, identificacion);

        this.especialidad = especialidad;
    }

    @Override
    public void mostrarInformacion() {

        System.out.println("Profesor: " + nombre);
        System.out.println("Especialidad: " + especialidad);
    }
}
