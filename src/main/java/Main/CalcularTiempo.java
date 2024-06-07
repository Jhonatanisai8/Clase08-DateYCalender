package Main;

import java.util.Date;

public class CalcularTiempo {
    public static void main(String[] args) {
        System.out.println("Tiempo en ejecución");
        ejemplo();
    }

    public static void ejemplo() {
        Date fechaInicio = new Date();
        long j = 0;
        for (int i = 0; i < 100000000; i++) {
            j += i;// suma en cada iteracion
        }
        System.out.println("j = " + j);
        Date fechaFin = new Date();
        long tiempoFinal = fechaFin.getTime() - fechaInicio.getTime();
        System.out.println("Tiempo de ejecucion: " + tiempoFinal + "s");
    }
}
