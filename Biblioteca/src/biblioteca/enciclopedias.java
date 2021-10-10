
package biblioteca;

import java.util.Scanner;

public class enciclopedias extends documento{
    private String Volumen;
    private String NumPag;
    
    contenedor C = new contenedor(30);
    
    public enciclopedias(String Codigo, String Titulo, String Autor, String Volumen, String NumPag) {
        super(Codigo, Titulo, Autor);
        this.Volumen = Volumen;
        this.NumPag = NumPag;
    }
    

    public String getVolumen() {
        return Volumen;
    }

    public void setVolumen(String Volumen) {
        this.Volumen = Volumen;
    }

    public String getNumPag() {
        return NumPag;
    }

    public void setNumPag(String NumPag) {
        this.NumPag = NumPag;
    }

    @Override
    public String mostraDatos(){
        return "Codigo: "+Codigo+"\nTitulo"+Titulo+"\nAutor"+Autor+"\nVolumen"+Volumen+"\nNumPag"+NumPag;
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
        
        System.out.println("Volumen: ");
        Volumen = en.nextLine();
        
        System.out.println("NumPag: ");
        NumPag = en.nextLine();
        
        

        C.agregar(new enciclopedias(Codigo, Titulo, Autor, Volumen, NumPag));
    }
    
    public void ver(contenedor C) {
        System.out.println(C.mostrar());
    }
    
    public String toString(){
        String s = "";
        System.out.println("Enciclopedia:       C:"+Codigo+"     T:"+Titulo+"     A:"+Autor+"     V:"+Volumen+"   NP:"+NumPag+"\n");
        return s;
    }
}
