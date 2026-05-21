package com.universidad.main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcion;

        do {

            System.out.println("====== SISTEMA UNIVERSITARIO ======");

            System.out.println("1. Registrar estudiante");
            System.out.println("2. Buscar estudiante");
            System.out.println("3. Mostrar estudiantes");
            System.out.println("4. Registrar aula");
            System.out.println("5. Mostrar aulas");
            System.out.println("6. Agregar solicitud");
            System.out.println("7. Procesar solicitud");
            System.out.println("8. Mostrar historial");
            System.out.println("9. Salir");

            System.out.print("Seleccione una opción: ");

            opcion = scanner.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Registrando estudiante...");
                    break;

                case 2:
                    System.out.println("Buscando estudiante...");
                    break;

                case 3:
                    System.out.println("Mostrando estudiantes...");
                    break;

                case 4:
                    System.out.println("Registrando aula...");
                    break;

                case 5:
                    System.out.println("Mostrando aulas...");
                    break;

                case 6:
                    System.out.println("Agregando solicitud...");
                    break;

                case 7:
                    System.out.println("Procesando solicitud...");
                    break;

                case 8:
                    System.out.println("Mostrando historial...");
                    break;

                case 9:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 9);

        scanner.close();
    }
}
