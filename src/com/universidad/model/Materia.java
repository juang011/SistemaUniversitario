package com.universidad.model;

public class Materia {

    private String nombre;
    private int creditos;

    public Materia(String nombre, int creditos) {

        this.nombre = nombre;
        this.creditos = creditos;
    }

    public void mostrarMateria() {

        System.out.println("Materia: " + nombre);
        System.out.println("Créditos: " + creditos);
    }
}
