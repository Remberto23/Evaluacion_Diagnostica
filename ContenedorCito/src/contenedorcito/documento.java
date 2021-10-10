
package contenedorcito;

public class documento {
    private String Nombre;
    private String Extencion;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getExtencion() {
        return Extencion;
    }

    public void setExtencion(String Extencion) {
        this.Extencion = Extencion;
    }

    public documento(String Nombre, String Extencion) {
        this.Nombre = Nombre;
        this.Extencion = Extencion;
    }
    
    public String toString(){
        String s = "";
        System.out.println("Nombre:          "+Nombre+"."+Extencion+"\n");
        return s;
    }
}
