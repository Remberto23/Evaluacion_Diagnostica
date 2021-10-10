package contenedorcito;

import java.util.Scanner;

public class ContenedorCito {

    public static void main(String[] args) {

        contenedor C = new contenedor(30);

        documento doc1 = new documento("Examen", "word");
        C.agregar(doc1);

        documento doc2 = new documento("investigacion", "pdf");
        C.agregar(doc2);

        documento doc3 = new documento("proyecto", "pdf");
        C.agregar(doc3);

        documento doc4 = new documento("graficos", "excel");
        C.agregar(doc4);

        Scanner en = new Scanner(System.in);

        int x;

        do {
            x = menu();

            switch (x) {
                case 1:
                    agregar(C);
                    break;
                case 2:
                    ver(C);
                    break;
                case 3:
                    buscar(C);
                    break;
                case 4:
                    eliminar(C);
                    break;
                case 5:
                    modoficar(C);
                    break;

            }
        } while (x != 6);

    }

    private static int menu() {
        int x;
        Scanner en = new Scanner(System.in);

        System.out.println("\n**************************");
        System.out.println("   GESTOR DE DOCUMENTOS");
        System.out.println("**************************");
        System.out.println("1.- Agregar");
        System.out.println("2.- Ver");
        System.out.println("3.- Buscar");
        System.out.println("4.- Eliminar");
        System.out.println("5.- Modificar");
        System.out.println("6.- Salir");
        System.out.println("**************************");
        System.out.println("ELIJA UNA OPCION... ");

        x = en.nextInt();
        return x;
    }

    private static void agregar(contenedor C) {
        Scanner en = new Scanner(System.in);
        String Nombre;
        String Ced;

        System.out.println("Nombre: ");
        Nombre = en.nextLine();

        System.out.println("extencion: ");
        Ced = en.nextLine();

        C.agregar(new documento(Nombre, Ced));
    }

    private static void ver(contenedor C) {
        System.out.println(C.mostrar());
    }

    private static void buscar(contenedor C) {
        Scanner en = new Scanner(System.in);
        String Nombre;

        System.out.println("Ingrese el nombre: ");
        Nombre = en.nextLine();

        documento aux = C.buscar(Nombre);

        if (aux != null) {
            System.out.println(aux.toString());
        } else {
            System.out.println("No existe el documento");
        }
    }

    private static void eliminar(contenedor C) {
        Scanner en = new Scanner(System.in);
        String Nombre;

        System.out.println("¿Que documento desea eliminar?");
        System.out.println(C.mostrar());

        System.out.println("\nIngrese el nombre: ");
        Nombre = en.nextLine();

        if (C.eliminar(Nombre)) {
            System.out.println("Eliminado correctamente");
        } else {
            System.out.println("No existe el documento");
        }

    }

    private static void modoficar(contenedor C) {
        Scanner en = new Scanner(System.in);
        String Nombre;
        String Nuevo;

        System.out.println("¿Que documento desea modificar?");
        System.out.println(C.mostrar());

        System.out.println("\nIngrese el nombre: ");
        Nombre = en.nextLine();

        documento aux = C.buscar(Nombre);
        if (aux != null) {
            System.out.println("Nombre Nuevo");
            Nuevo = en.nextLine();
            aux.setNombre(Nuevo);
            System.out.println("Modificado correctamente");
        } else {
            System.out.println("No existe el documento");
        }
    }

}
