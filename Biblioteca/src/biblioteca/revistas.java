
package biblioteca;

import java.util.Scanner;

public class revistas extends documento{
    private String NumArt;

    public revistas(String Codigo, String Titulo, String Autor, String NumArt) {
        super(Codigo, Titulo, Autor);
        this.NumArt = NumArt;
    }

    public String getNumArt() {
        return NumArt;
    }

    public void setNumArt(String NumArt) {
        this.NumArt = NumArt;
    }
    
    @Override
    public String mostraDatos(){
        return "Codigo: "+Codigo+"\nTitulo"+Titulo+"\nAutor"+Autor+"\nNumArt"+NumArt;
    }
    
    public void agregar(contenedor C) {
        Scanner en = new Scanner(System.in);
        

        System.out.println("Codigo: ");
        Codigo = en.nextLine();

        System.out.println("Titulo: ");
        Titulo = en.nextLine();
        
        System.out.println("Autor: ");
        Autor = en.nextLine();
        
        System.out.println("NumArt: ");
        NumArt = en.nextLine();

        C.agregar(new revistas(Codigo, Titulo, Autor, NumArt));
    }
    
    public void ver(contenedor C) {
        System.out.println(C.mostrar());
    }
    
    public String toString(){
        String s = "";
        System.out.println("Revista:            C:"+Codigo+"     T:"+Titulo+"     A:"+Autor+"     NA:"+NumArt+"\n");
        return s;
    }
}
