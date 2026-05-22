package com.universidad;

import java.util.LinkedList;
import java.util.Scanner;

import com.universidad.estructuras.GestionAulas;
import com.universidad.estructuras.GestionDistancias;
import com.universidad.estructuras.GestionSolicitudes;
import com.universidad.model.Estudiante;
import com.universidad.model.Materia;
import com.universidad.model.Profesor;
import com.universidad.service.EstudianteService;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        EstudianteService service =
                new EstudianteService();

        GestionSolicitudes gestion =
                new GestionSolicitudes();

        GestionAulas aulas =
                new GestionAulas();

        GestionDistancias distancias =
                new GestionDistancias();

        LinkedList<Materia> materias =
                new LinkedList<>();

        LinkedList<Profesor> profesores =
                new LinkedList<>();

        int opcion;

        do {

            System.out.println("\n===== SISTEMA UNIVERSITARIO =====");

            System.out.println("1. Registrar estudiante");
            System.out.println("2. Buscar estudiante");
            System.out.println("3. Mostrar estudiantes");
            System.out.println("4. Registrar profesor");
            System.out.println("5. Mostrar profesores");
            System.out.println("6. Registrar aula");
            System.out.println("7. Mostrar aulas");
            System.out.println("8. Agregar solicitud");
            System.out.println("9. Procesar solicitud");
            System.out.println("10. Mostrar historial");
            System.out.println("11. Registrar materia");
            System.out.println("12. Mostrar materias");
            System.out.println("13. Registrar distancia");
            System.out.println("14. Mostrar distancias");
            System.out.println("15. Salir");

            System.out.print("Seleccione: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("ID: ");
                    String id = sc.nextLine();

                    System.out.print("Correo: ");
                    String correo = sc.nextLine();

                    System.out.print("Semestre: ");
                    int semestre = sc.nextInt();
                    sc.nextLine();

                    Estudiante estudiante =
                            new Estudiante(
                                    nombre,
                                    id,
                                    correo,
                                    semestre
                            );

                    service.registrarEstudiante(
                            id,
                            estudiante
                    );

                    System.out.println(
                            "Estudiante registrado"
                    );

                    break;

                case 2:

                    System.out.print(
                            "Ingrese ID: "
                    );

                    String buscarId =
                            sc.nextLine();

                    try {

                        Estudiante e =
                                service.buscarEstudiante(
                                        buscarId
                                );

                        e.mostrarInformacion();

                    } catch (Exception ex) {

                        System.out.println(
                                ex.getMessage()
                        );
                    }

                    break;

                case 3:

                    service.mostrarEstudiantes();

                    break;

                case 4:

                    System.out.print(
                            "Nombre profesor: "
                    );

                    String nombreProfesor =
                            sc.nextLine();

                    System.out.print(
                            "ID profesor: "
                    );

                    String idProfesor =
                            sc.nextLine();

                    System.out.print(
                            "Especialidad: "
                    );

                    String especialidad =
                            sc.nextLine();

                    Profesor profesor =
                            new Profesor(
                                    nombreProfesor,
                                    idProfesor,
                                    especialidad
                            );

                    profesores.add(profesor);

                    System.out.println(
                            "Profesor registrado"
                    );

                    break;

                case 5:

                    for (Profesor p : profesores) {

                        p.mostrarInformacion();
                    }

                    break;

                case 6:

                    System.out.print(
                            "Número aula: "
                    );

                    int numero =
                            sc.nextInt();

                    sc.nextLine();

                    System.out.print(
                            "Nombre aula: "
                    );

                    String aula =
                            sc.nextLine();

                    aulas.agregarAula(
                            numero,
                            aula
                    );

                    System.out.println(
                            "Aula registrada"
                    );

                    break;

                case 7:

                    aulas.mostrarAulas();

                    break;

                case 8:

                    System.out.print(
                            "Solicitud: "
                    );

                    String solicitud =
                            sc.nextLine();

                    gestion.agregarSolicitud(
                            solicitud
                    );

                    System.out.println(
                            "Solicitud agregada"
                    );

                    break;

                case 9:

                    gestion.procesarSolicitud();

                    break;

                case 10:

                    gestion.mostrarHistorial();

                    break;

                case 11:

                    System.out.print(
                            "Nombre materia: "
                    );

                    String nombreMateria =
                            sc.nextLine();

                    System.out.print(
                            "Créditos: "
                    );

                    int creditos =
                            sc.nextInt();

                    sc.nextLine();

                    Materia materia =
                            new Materia(
                                    nombreMateria,
                                    creditos
                            );

                    materias.add(materia);

                    System.out.println(
                            "Materia registrada"
                    );

                    break;

                case 12:

                    for (Materia m : materias) {

                        m.mostrarMateria();
                    }

                    break;

                case 13:

                    System.out.print(
                            "Origen: "
                    );

                    int origen =
                            sc.nextInt();

                    System.out.print(
                            "Destino: "
                    );

                    int destino =
                            sc.nextInt();

                    System.out.print(
                            "Distancia: "
                    );

                    int distancia =
                            sc.nextInt();

                    sc.nextLine();

                    distancias.registrarDistancia(
                            origen,
                            destino,
                            distancia
                    );

                    System.out.println(
                            "Distancia registrada"
                    );

                    break;

                case 14:

                    distancias.mostrarDistancias();

                    break;

                case 15:

                    System.out.println(
                            "Saliendo..."
                    );

                    break;

                default:

                    System.out.println(
                            "Opción inválida"
                    );
            }

        } while (opcion != 15);

        sc.close();
    }
}
