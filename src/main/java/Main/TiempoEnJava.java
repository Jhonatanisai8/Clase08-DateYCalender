package Main;

import java.util.Date;

public class TiempoEnJava {

    public static void main(String[] args) {
        Date fecha1 = new Date();
        System.out.println("La fecha es => " + fecha1);
        long j = 0;
        for (int i = 0; i < 100000000; i++) {
            j += i;
        }
        System.out.println("Suma del 1 al 1000000 => " + j);

        Date fecha2 = new Date();
        long tiempofinal = fecha2.getTime() - fecha1.getTime();

        System.out.println("Tiemo Transcurrido en el for => " + tiempofinal);

    }
}
