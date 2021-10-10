
package biblioteca;

import java.util.Scanner;

public class cartillas extends documento{
    private String Tema;

    public cartillas(String Codigo, String Titulo, String Autor, String Tema) {
        super(Codigo, Titulo, Autor);
        this.Tema = Tema;
    }

    public String getTema() {
        return Tema;
    }

    public void setTema(String Tema) {
        this.Tema = Tema;
    }
    
    @Override
    public String mostraDatos(){
        return "Codigo: "+Codigo+"\nTitulo"+Titulo+"\nAutor"+Autor+"\nTema"+Tema;
    }
    public void agregar(contenedor C) {
        Scanner en = new Scanner(System.in);
        

        System.out.println("Codigo: ");
        Codigo = en.nextLine();

        System.out.println("Titulo: ");
        Titulo = en.nextLine();
        
        System.out.println("Autor: ");
        Autor = en.nextLine();
        
        System.out.println("Tema: ");
        Tema = en.nextLine();

        C.agregar(new cartillas(Codigo, Titulo, Autor, Tema));
    }
    
    public void ver(contenedor C) {
        System.out.println(C.mostrar());
    }
    
    public String toString(){
        String s = "";
        System.out.println("Cartilla:           C:"+Codigo+"     T:"+Titulo+"     A:"+Autor+"     TM:"+Tema+"\n");
        return s;
    }
    
}
