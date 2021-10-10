
package biblioteca;

import java.util.Scanner;

public class documento {
    protected String Codigo;
    protected String Titulo;
    protected String Autor;
    
    contenedor C = new contenedor(30);
    
    public documento(String Codigo, String Titulo, String Autor){
        this.Codigo=Codigo;
        this.Titulo=Titulo;
        this.Autor=Autor;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }
    
    
    
    public String mostraDatos(){
        return "Codigo: "+Codigo+"\nTitulo"+Titulo+"\nAutor"+Autor;
    }
    
    
    
    public void agregar(contenedor C) {
        Scanner en = new Scanner(System.in);
        

        System.out.println("Codigo: ");
        Codigo = en.nextLine();

        System.out.println("Titulo: ");
        Titulo = en.nextLine();
        
        System.out.println("Autor: ");
        Autor = en.nextLine();
        
        

        C.agregar(new documento(Codigo, Titulo, Autor));
    }
    
    public void ver(contenedor C) {
        System.out.println(C.mostrar());
    }
    
    public String toString(){
        String s = "";
        System.out.println("Documento:          C:"+Codigo+"     T:"+Titulo+"     A:"+Autor+"\n");
        return s;
    }
    
    
}
