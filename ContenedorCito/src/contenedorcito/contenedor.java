package contenedorcito;

public class contenedor {

    private documento doc[];
    private int Tam;
    private int Can;

    public contenedor(int n) {
        Tam = n;
        doc = new documento[Tam];
        Can = 0;
    }

    public boolean agregar(documento n) {
        if (Can < Tam) {
            doc[Can++] = n;
            return true;
        }
        return false;
    }

    public documento buscar(String Nombre) {
        for (int i = 0; i < Can; i++) {
            if (doc[i].getNombre().contentEquals(Nombre)) {
                return doc[i];
            }
        }
        return null;
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

    boolean eliminar(String Nombre) {
        for (int i = 0; i < Can; i++) {
            if (doc[i].getNombre().equals(Nombre)) {
                correrIzquierda(i);
                return true;
            }
        }
        return false;
    }

    private void correrIzquierda(int x) {
        for (int i = x; i < Can; i++) {
            doc[i] = doc[i + 1];
        }
        Can--;
    }
}
