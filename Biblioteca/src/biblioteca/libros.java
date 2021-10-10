package biblioteca;

import java.util.Scanner;

public class libros extends documento {

    private String NumPag;

    contenedor C = new contenedor(30);

    public libros(String Codigo, String Titulo, String Autor, String NumPag) {
        super(Codigo, Titulo, Autor);
        this.NumPag = NumPag;
    }

    public String getNumPag() {
        return NumPag;
    }

    public void setNumPag(String NumPag) {
        this.NumPag = NumPag;
    }

    @Override
    public String mostraDatos() {
        
        return "Codigo: " + Codigo + "\nTitulo" + Titulo + "\nAutor" + Autor + "\nNumPag" + NumPag;
    }

    @Override
    public void ver(contenedor C) {
        System.out.println("_____________________________________________");
        System.out.println(C.mostrar());
    }

    

    public void IniciALibro() {
        contenedor C = new contenedor(30);

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
                    //modoficar(C);
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

    @Override
    public void agregar(contenedor C) {
        Scanner en = new Scanner(System.in);

        System.out.println("Codigo: ");
        Codigo = en.nextLine();

        System.out.println("Titulo: ");
        Titulo = en.nextLine();

        System.out.println("Autor: ");
        Autor = en.nextLine();

        System.out.println("NumPag: ");
        NumPag = en.nextLine();

        C.agregar(new libros(Codigo, Titulo, Autor, NumPag));
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

    public String toString(){
        String s = "";
        System.out.println("Libro:              C:"+Codigo+"     T:"+Titulo+"     A:"+Autor+"     NP:"+NumPag+"\n");
        return s;
    }

    
}
