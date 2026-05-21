package com.universidad.service;

import java.util.HashMap;

import com.universidad.model.Estudiante;
import com.universidad.excepciones.EstudianteNoEncontradoException;

public class EstudianteService {

    HashMap<String, Estudiante> estudiantes = new HashMap<>();

    public void registrarEstudiante(String id,
                                    Estudiante estudiante) {

        estudiantes.put(id, estudiante);
    }

    public Estudiante buscarEstudiante(String id)
            throws EstudianteNoEncontradoException {

        if (!estudiantes.containsKey(id)) {

            throw new EstudianteNoEncontradoException(
                    "Estudiante no encontrado");
        }

        return estudiantes.get(id);
    }

    public void mostrarEstudiantes() {

        for (Estudiante e : estudiantes.values()) {

            e.mostrarInformacion();
        }
    }
}
