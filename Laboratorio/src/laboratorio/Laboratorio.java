package laboratorio;

import java.util.Scanner;

public class Laboratorio {

    public static void main(String[] args) {
        contenedor A = new contenedor(2);
        contenedor B = new contenedor(2);
        contenedor C = new contenedor(2);
        int x;
        int conA = 0;
        int conB = 0;
        int conC = 0;
        do {
            x = menu();
            switch (x) {
                case 1:
                    int y;
                    do {
                        y = menu2();
                        switch (y) {
                            case 1:
                                if (conA < 2) {
                                    paraleloA();
                                    agregar(A);
                                    conA++;
                                } else {
                                    System.out.println("CUPOS AGOTADOS");
                                    paraleloA();
                                    ver(A);
                                }
                                break;
                            case 2:
                                if (conB < 2) {
                                    paraleloB();
                                    agregar(B);
                                    conB++;
                                } else {
                                    System.out.println("CUPOS AGOTADOS");
                                    paraleloB();
                                    ver(B);
                                }
                                break;
                            case 3:
                                if (conC < 2) {
                                    paraleloC();
                                    agregar(C);
                                    conC++;
                                } else {
                                    System.out.println("CUPOS AGOTADOS");
                                    paraleloC();
                                    ver(C);
                                }
                                break;
                        }
                    } while (y != 4);
                    break;
                case 2:

                    paraleloA();
                    ver(A);
                    paraleloB();
                    ver(B);
                    paraleloC();
                    ver(C);
                    break;
                case 3:
                    break;
            }
        } while (x != 3);
    }

    private static int menu() {
        int x;
        Scanner en = new Scanner(System.in);

        System.out.println("\n*****************************");
        System.out.println("   LABORATORIO DE PROGRAMACION");
        System.out.println("**************************");
        System.out.println("1.- Agregar Estudiante");
        System.out.println("2.- Ver");
        System.out.println("3.- Salir");
        System.out.println("*****************************");
        System.out.println("ELIJA UNA OPCION... ");

        x = en.nextInt();
        return x;
    }

    private static int menu2() {
        int x;
        Scanner en = new Scanner(System.in);

        System.out.println("\n*****************************");
        System.out.println("   PARALELOS DISPONIBLES");
        System.out.println("**************************");
        System.out.println("1.- PARALELO A");
        System.out.println("2.- PARALELO B");
        System.out.println("3.- PARALELO C");
        System.out.println("4.- ATRAS");
        System.out.println("*****************************");
        System.out.println("ELIJA UN PARALELO");

        x = en.nextInt();
        return x;
    }

    private static void ver(contenedor C) {
        System.out.println(C.mostrar());
    }

    private static void agregar(contenedor C) {
        Scanner en = new Scanner(System.in);
        String Nombre;
        String Codigo;

        System.out.println("Codigo de Estudiante: ");
        Codigo = en.nextLine();

        System.out.println("Nombre de Estudiante: ");
        Nombre = en.nextLine();

        C.agregar(new Curso(Nombre, Codigo));
    }

    private static void paraleloA() {
        System.out.println("PARALELO A: ");
        System.out.println("SIS-211   Ing Yolanda Escobar Mancilla  Turno Mañana");
    }

    private static void paraleloB() {
        System.out.println("PARALELO B: ");
        System.out.println("SIS-211   Freddy Salgueiro Trujillo   Turno Tarde");
    }

    private static void paraleloC() {
        System.out.println("PARALELO C: ");
        System.out.println("SIS-211   Ing Yuli Ramirez Limachi   Turno Noche");
    }
}
