package Main;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploCalendar {
    public static void main(String[] args) {
        System.out.println("==CLASE CALENDAR==");
        ejemploFecha3();
    }

    public static void ejemploFecha() {
        // creamos la inastancia
        Calendar calendario = Calendar.getInstance();

        // le establecemos la fecha
        calendario.set(2006, 1, 8);
        Date fecha = calendario.getTime();
        // System.out.println(calendario.toString());
        System.out.println("Fecha actual: " + fecha);
    }

    public static void ejemploFecha2() {
        // creamos la inastancia
        Calendar calendario = Calendar.getInstance();

        // le establecemos la fecha con hora,minutos,segundos
        calendario.set(2006, 1, 8, 5, 20, 10);
        Date fecha = calendario.getTime();
        // System.out.println(calendario.toString());
        System.out.println("Fecha actual: " + fecha);
    }

    public static void ejemploFecha3() {
        // creamos la inastancia
        Calendar calendario = Calendar.getInstance();

        // le establecemos la fecha con hora,minutos,segundos
        // calendario.set(2006, Calendar.FEBRUARY, 8, 5, 20, 10);

        // asiganmos parte por parte
        calendario.set(Calendar.YEAR, 2020);
        calendario.set(Calendar.MONTH, Calendar.FEBRUARY);
        calendario.set(Calendar.DAY_OF_MONTH, 25);
        calendario.set(Calendar.HOUR_OF_DAY, 21);
        calendario.set(Calendar.MINUTE, 24);
        calendario.set(Calendar.SECOND, 10);
        
        Date fecha = calendario.getTime();
        // System.out.println(calendario.toString());
        System.out.println("Fecha sin formato: " + fecha);
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String fechaFormateada = formatoFecha.format(fecha);
        System.out.println("Fecha con formato: " + fechaFormateada);

    }
}
