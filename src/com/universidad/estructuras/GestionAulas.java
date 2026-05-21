package com.universidad.estructuras;

import java.util.TreeMap;

public class GestionAulas {

    TreeMap<Integer, String> aulas = new TreeMap<>();

    public void agregarAula(int numero,
                            String nombre) {

        aulas.put(numero, nombre);
    }

    public void mostrarAulas() {

        System.out.println(aulas);
    }
}
