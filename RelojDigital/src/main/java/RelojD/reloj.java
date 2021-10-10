package RelojD;

import java.util.Scanner;

public class reloj {

    int horas = 0, minutos = 0, segundos = 55, opcion = 0, horasAlarma = 1000, minutosAlarma = 1000;
    
    Scanner en = new Scanner(System.in);

    public int getHorasAlarma() {
        return horasAlarma;
    }

    public void setHorasAlarma(int horasAlarma) {
        this.horasAlarma = horasAlarma;
    }

    public int getMinutosAlarma() {
        return minutosAlarma;
    }

    public void setMinutosAlarma(int minutosAlarma) {
        this.minutosAlarma = minutosAlarma;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

    public int getOpcion() {
        return opcion;
    }

    public void setOpcion(int opcion) {
        this.opcion = opcion;
    }

    public void inicio() throws InterruptedException {
        System.out.println("**********************");
        System.out.println("    RELOJ DIGITAL");
        System.out.println("**********************\n");
        System.out.println("1.- Ajustar Hora");
        System.out.println("2.- Programar Alarma");
        System.out.println("**********************");

        this.setOpcion(en.nextInt());

        switch (this.getOpcion()) {
            case 1:
                ajustar();
                break;
            case 2:
                alarma();
                break;
            case 3:
                break;

        }
    }
    
    public void ajustar() throws InterruptedException{
        
        System.out.println("Ajuste la Hora por favor: ");
        
        System.out.println("Horas: ");
        this.setHoras(en.nextInt());
        
        System.out.println("Minutos: ");
        this.setMinutos(en.nextInt());
        
        menuReloj();
    }
    
    public void alarma() throws InterruptedException{
        System.out.println("Horas: ");
        this.setHorasAlarma(en.nextInt());
        
        System.out.println("Minutos: ");
        this.setMinutosAlarma(en.nextInt());
        
        System.out.println("Su alarma sonara a las: "+this.getHorasAlarma()+":"+this.getMinutosAlarma());
        
        ajustar();
    }

    public void menuReloj() throws InterruptedException {
        
        System.out.println(this.getHoras()+":"+this.getMinutos());

        while (true) {

            //mostrar
            if (this.getSegundos() == 0) {
                if (this.getHoras() < 10) {
                    System.out.print("0");
                }
                System.out.print(this.getHoras() + ":");

                if (this.getMinutos() < 10) {
                    System.out.print("0");
                }
                System.out.println(this.getMinutos());
            }

            //aumnetar
            this.setSegundos(segundos+1);

            //comprobar
            if (this.getSegundos() == 60) {
                this.setSegundos(0);
                this.setMinutos(minutos+1);
                if (this.getMinutos() == 60) {
                    this.setMinutos(0);
                    this.setHoras(horas+1);
                    if (this.getHoras() == 24) {
                        this.setHoras(0);
                    }
                }
            }
            
            if(this.getHoras()==this.getHorasAlarma()& this.getMinutos()==this.getMinutosAlarma()){
                System.out.println("¡¡¡ALARMA!!!");
            }
            
            Thread.sleep(1000);
        }

    }

    public reloj() {
    }
}
