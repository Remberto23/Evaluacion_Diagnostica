
package laboratorio;

class Curso {
    protected String Codigo;
    protected String Nombre;

    public Curso(String Codigo, String Nombre) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    
    
    
    public String toString(){
        String s = "";
        System.out.println("Nombre:          "+Codigo+"  "+Nombre);
        return s;
    }
}
