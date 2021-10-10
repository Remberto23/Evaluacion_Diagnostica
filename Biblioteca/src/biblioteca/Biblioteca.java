package biblioteca;

import java.util.Scanner;

public class Biblioteca {

    public static void main(String[] args) {
        contenedor C = new contenedor(30);
        documento documento1 = new documento("", "", "");
        documento1 = new documento("", "", "");

        libros libros = new libros("", "", "", "");
        libros libros1 = new libros("001", "Decameron", "Giovani Bokkassio", "800");
        C.agregar(libros1);
        
        enciclopedias enciclopedias = new enciclopedias("", "", "", "", "");
        enciclopedias enciclopedias1 = new enciclopedias("002", "Larousse", "Pierre L", "alto", "1500");
        C.agregar(enciclopedias1);

        mapas mapas = new mapas("", "", "", "", "", "");
        mapas mapas1 = new mapas("003", "España", "Google", "Europa", "40.463667", "-3.74922");
        C.agregar(mapas1);

        revistas revistas = new revistas("", "", "", "");
        revistas revistas1 = new revistas("004", "¡Hola!", "Antonio Sánchez G", "4020");
        C.agregar(revistas1);

        cartillas cartillas = new cartillas("", "", "", "");
        cartillas cartillas1 = new cartillas("005", "Mi Familia", "ONU", "Salud");
        C.agregar(cartillas1);

        int x;

        do {
            x = menu();

            switch (x) {
                case 1:

                    int y;

                    do {
                        y = menu2();

                        switch (y) {
                            
                            case 1:
                                libros.agregar(C);
                                break;
                            case 2:
                                enciclopedias.agregar(C);
                                break;
                            case 3:
                                mapas.agregar(C);
                                break;
                            case 4:
                                revistas.agregar(C);
                                break;
                            case 5:
                                cartillas.agregar(C);
                                break;
                        }
                    } while (y != 6);
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

    private static int menu2() {
        int y;
        Scanner en = new Scanner(System.in);

        System.out.println("\n**************************");
        System.out.println("   AGREGAR DOCUMENTOS");
        System.out.println("**************************");
        System.out.println("1.- Libro");
        System.out.println("2.- Enciclopedias");
        System.out.println("3.- Mapas");
        System.out.println("4.- Revistas");
        System.out.println("5.- Cartillas");
        System.out.println("6.- Atras");
        System.out.println("**************************");
        System.out.println("ELIJA UNA OPCION... ");

        y = en.nextInt();
        return y;
    }

    private static void ver(contenedor C) {
        System.out.println(C.mostrar());
    }

    private static void buscar(contenedor C) {
        Scanner en = new Scanner(System.in);
        String Nombre;

        System.out.println("Ingrese el Codigo: ");
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
        String Codigo;

        System.out.println("¿Que documento desea eliminar?");
        System.out.println(C.mostrar());

        System.out.println("\nIngrese el Codigo: ");
        Codigo = en.nextLine();

        if (C.eliminar(Codigo)) {
            System.out.println("Eliminado correctamente");
        } else {
            System.out.println("No existe el documento");
        }

    }

    private static void modoficar(contenedor C) {
        Scanner en = new Scanner(System.in);
        String Codigo;
        String TitNuevo;
        String AutNuevo;

        System.out.println("¿Que documento desea modificar?");
        System.out.println(C.mostrar());

        System.out.println("\nIngrese el Codigo: ");
        Codigo = en.nextLine();

        documento aux = C.buscar(Codigo);
        if (aux != null) {
            System.out.println("Titulo Nuevo");
            TitNuevo = en.nextLine();
            aux.setTitulo(TitNuevo);
            
            System.out.println("Autor Nuevo");
            AutNuevo = en.nextLine();
            aux.setAutor(AutNuevo);
            
            System.out.println("Modificado correctamente");
        } else {
            System.out.println("No existe el documento");
        }
    }

}
