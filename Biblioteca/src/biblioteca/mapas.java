
package biblioteca;

import java.util.Scanner;

public class mapas extends documento{
    private String Ubicacion;
    private String Latitud;
    private String Longitud;
    
    public mapas(String Codigo, String Titulo, String Autor, String Ubicacion, String Latitud, String Longitud) {
        super(Codigo, Titulo, Autor);
        this.Ubicacion = Ubicacion;
        this.Latitud = Latitud;
        this.Longitud = Longitud;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }

    public String getLatitud() {
        return Latitud;
    }

    public void setLatitud(String Latitud) {
        this.Latitud = Latitud;
    }

    public String getLongitud() {
        return Longitud;
    }

    public void setLongitud(String Longitud) {
        this.Longitud = Longitud;
    }

    @Override
    public String mostraDatos(){
        return "Codigo: "+Codigo+"\nTitulo"+Titulo+"\nAutor"+Autor+"\nUbicacion"+Ubicacion+"\nLatitud"+Latitud+"\nLongitud"+Longitud;
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
        
        System.out.println("Ubicacion: ");
        Ubicacion = en.nextLine();
        
        System.out.println("Latitud: ");
        Latitud = en.nextLine();
        
        System.out.println("Longitud: ");
        Longitud = en.nextLine();
        

        C.agregar(new mapas(Codigo, Titulo, Autor, Ubicacion, Latitud, Longitud));
    }
    
    public void ver(contenedor C) {
        System.out.println(C.mostrar());
    }
    
    public String toString(){
        String s = "";
        System.out.println("Mapa:               C:"+Codigo+"     T:"+Titulo+"     A:"+Autor+"     U:"+Ubicacion+"   LA:"+Latitud+"   L:"+Longitud+"\n");
        return s;
    }
}
