package com.universidad.estructuras;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GestionSolicitudes {

    Queue<String> solicitudes = new LinkedList<>();

    Stack<String> historial = new Stack<>();

    public void agregarSolicitud(String solicitud) {

        solicitudes.add(solicitud);
    }

    public void procesarSolicitud() {

        if (!solicitudes.isEmpty()) {

            String solicitud = solicitudes.poll();

            historial.push(solicitud);

            System.out.println(
                    "Solicitud procesada: " + solicitud);
        }
    }

    public void mostrarHistorial() {

        System.out.println(historial);
    }
}
