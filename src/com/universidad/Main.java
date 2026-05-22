package com.universidad;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcion;

        do {

            System.out.println("=== SISTEMA UNIVERSITARIO ===");

            System.out.println("1. Registrar estudiante");
            System.out.println("2. Mostrar estudiantes");
            System.out.println("3. Gestionar aulas");
            System.out.println("4. Gestionar solicitudes");
            System.out.println("5. Salir");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:

                    System.out.println(
                            "Estudiante registrado");
                    break;

                case 2:

                    System.out.println(
                            "Mostrando estudiantes");
                    break;

                case 3:

                    System.out.println(
                            "Gestión de aulas");
                    break;

                case 4:

                    System.out.println(
                            "Gestión de solicitudes");
                    break;

                case 5:

                    System.out.println(
                            "Saliendo del sistema");
                    break;

                default:

                    System.out.println(
                            "Opción inválida");
            }

        } while (opcion != 5);

        sc.close();
    }
}
