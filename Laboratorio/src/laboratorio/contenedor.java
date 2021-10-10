
package laboratorio;

public class contenedor {
    private Curso doc[];
    private int Tam;
    private int Can;

    public contenedor(int n) {
        Tam = n;
        doc = new Curso[Tam];
        Can = 0;
    }
    public String mostrar() {
        String s = "";
        System.out.println("\n*******************************************");
        for (int i = 0; i < Can; i++) {
            s += doc[i].toString();
        }
        System.out.println("*******************************************");
        return s;
    }
    public boolean agregar(Curso n) {
        if (Can < Tam) {
            doc[Can++] = n;
            return true;
        }
        return false;
    }
}
