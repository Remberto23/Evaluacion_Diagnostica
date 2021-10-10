package Calentador;

import java.util.Scanner;

public class Calentador {

    private float temperaturaAgua;

    private float temMax = 100;

    private float temAlt = 50;

    private float temMin = 10;

    private float temCero = 0;

    private float temMed = 25;

    private int opcion;

    public Calentador(float temperaturaAgua) {
        this.temperaturaAgua = temperaturaAgua;
    }

    Scanner Leer = new Scanner(System.in);

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    public float getTemCero() {
        return temCero;
    }

    public void setTemCero(float temCero) {
        this.temCero = temCero;
    }

    public float getTemAlt() {
        return temAlt;
    }

    public void setTemAlt(float temAlt) {
        this.temAlt = temAlt;
    }

    public float getTemMax() {
        return temMax;
    }

    public void setTemMax(float temMax) {
        this.temMax = temMax;
    }

    public float getTemMin() {
        return temMin;
    }

    public void setTemMin(float temMin) {
        this.temMin = temMin;
    }

    public float getTemMed() {
        return temMed;
    }

    public void setTemMed(float temMed) {
        this.temMed = temMed;
    }

    public void preguntaOpcion(String as) {
        Scanner Leer = new Scanner(System.in);
        System.out.println("" + as);
        opcion = Leer.nextInt();
        this.setOpcion(opcion);
    }

    public void iniciando() {
        System.out.println("\nIniciando calentador...");
        System.out.println("\n...");
        tempActual();
    }

    public void calentar() {
        iniciando();
        this.temperaturaAgua = this.temAlt;
        System.out.println("\nCalentando...");
        System.out.println("\n!!!Su agua ya alcanzo la temperatura ALTA!!!: " + this.temperaturaAgua + " Grados");
    }

    public void tibio() {
        iniciando();
        this.temperaturaAgua = this.getTemMed();
        System.out.println("\nEntiviando...");
        System.out.println("\nSu agua ya esta a temperatura media: " + this.temperaturaAgua + " Grados");
    }

    public void muyCaliente() {
        iniciando();
        this.temperaturaAgua = this.temMax;
        System.out.println("\nCalentando...");
        System.out.println("\n!!!Su agua ya alcanzo la temperatura MAXIMA!!!: " + this.temperaturaAgua + " Grados");
    }

    public void muyFrio() {
        iniciando();
        this.temperaturaAgua = this.temCero;
        System.out.println("\nEnfriando...");
        System.out.println("\n!!!Su agua ya alcanzo la temperatura MINIMA!!!: " + this.temperaturaAgua + " Grados");
    }

    public void Fria() {
        iniciando();
        this.temperaturaAgua = this.temMin;
        System.out.println("\nEnfriando...");
        System.out.println("\n!!!Su agua ya alcanzo la temperatura MINIMA!!!: " + this.temperaturaAgua + " Grados");
    }

    public void tempActual() {
        System.out.println("\nSu temperatura actual es: " + this.temperaturaAgua + " Grados");
    }

    public void calentador() {
        System.out.println("\n\n\n********************************");
        System.out.println("           CALENTADOR");
        System.out.println("************************");
        tempActual();
        System.out.println("Iniciando...");
        System.out.println("1. Calentar");
        System.out.println("2. Enfriar");
        System.out.println("3. Mantener Temperatura");
        System.out.println("4. Apagar");
        System.out.println("******************************");

        do {
            this.preguntaOpcion("ELIJA UNA OPCION POR FAVOR...");
        } while (this.getOpcion() < 0 || this.getOpcion() > 5);

        switch (this.getOpcion()) {
            case 1:
                if (this.temperaturaAgua < this.temMax) {
                    System.out.println("\n\n\n*********************************");
                    System.out.println("     ¿QUE TEMPERATURA DESEA?");
                    System.out.println("************************");
                    System.out.println("Iniciando...");
                    System.out.println("1. Tibia: 25 Grados");
                    System.out.println("2. Caliente: 50 Grados");
                    System.out.println("3. Muy Caliente: 100 Grados");
                    System.out.println("4. Atras");
                    System.out.println("*********************************");

                    do {
                        this.preguntaOpcion("\nELIJA UNA OPCION POR FAVOR...");
                    } while (this.getOpcion() < 0 || this.getOpcion() > 5);
                } else {
                    tempActual();
                    System.out.println("\n¡¡¡Su agua ya esta demasiado caliente!!!");
                    calentador();
                }

                switch (this.getOpcion()) {
                    case 1:
                        if (this.temperaturaAgua < this.temMed) {
                            tibio();
                            calentador();
                        } else {
                            tempActual();
                            System.out.println("\n¡¡¡Si desea un agua tibia presione Enfriar xfavor!!!");
                            calentador();
                        }
                        break;
                    case 2:
                        if (this.temperaturaAgua < this.temMed) {
                            calentar();
                            calentador();
                        } else {
                            tempActual();
                            System.out.println("\n¡¡¡Si desea un agua tibia presione Enfriar xfavor!!!");
                            calentador();
                        }

                        break;
                    case 3:
                        muyCaliente();
                        calentador();
                        break;
                    case 4:
                        calentador();
                }

            case 2:
                if (this.temperaturaAgua > this.temCero) {
                    System.out.println("\n\n\n*************************");
                    System.out.println(" ¿QUE TEMPERATURA DESEA?");
                    System.out.println("************************");
                    System.out.println("Iniciando...");
                    System.out.println("1. Muy fria: 0.0 Grados");
                    System.out.println("2. Fria: 10 Grados");
                    System.out.println("3. Atras");
                    System.out.println("*************************");

                    do {
                        this.preguntaOpcion("\nELIJA UNA OPCION POR FAVOR...");
                    } while (this.getOpcion() < 0 || this.getOpcion() > 4);

                } else {
                    tempActual();
                    System.out.println("\n¡¡¡Su agua ya esta demasiado fria!!!");
                    calentador();
                }

                switch (this.getOpcion()) {
                    case 1:
                        muyFrio();
                        calentador();
                        break;
                    case 2:
                        if (this.temperaturaAgua > this.temMin) {
                            Fria();
                            calentador();
                        } else {
                            tempActual();
                            System.out.println("\n¡¡¡Su agua ya esta fria!!!");
                            calentador();
                        }
                        break;
                    case 3:
                        calentador();
                }
                break;
            case 3:
                iniciando();
                System.out.println("\nSE MANTENDRA LA TEMPERATURA DE SU AGUA A:" + this.temperaturaAgua);
                calentador();
                break;
            case 4:
                break;
        }
    }

}
