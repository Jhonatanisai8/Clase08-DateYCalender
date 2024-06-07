package Main;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploCalendar {
    public static void main(String[] args) {
        System.out.println("==CLASE CALENDAR==");
        ejemploFecha();
    }

    public static void ejemploFecha() {
        // creamos la instancia
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

        // le establecemos la fecha con año,mes,dia, hora,minutos,segundos
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
        // calendario.set(Calendar.HOUR_OF_DAY, 21);
        calendario.set(Calendar.HOUR, 6);
        calendario.set(Calendar.AM_PM, Calendar.PM);// puede variar ya sea AM o PM

        calendario.set(Calendar.MINUTE, 24);
        calendario.set(Calendar.SECOND, 10);
        calendario.set(Calendar.MILLISECOND, 125);
        Date fecha = calendario.getTime();
        // System.out.println(calendario.toString());
        System.out.println("Fecha sin formato: " + fecha);
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS a");
        String fechaFormateada = formatoFecha.format(fecha);
        System.out.println("Fecha con formato: " + fechaFormateada);

    }

    public static void compararFechasTipoCalendar() {
        // creamos la inastancia
        Calendar calendario = Calendar.getInstance();

        // le establecemos la fecha con hora,minutos,segundos
        // calendario.set(2006, Calendar.FEBRUARY, 8, 5, 20, 10);

        // asiganmos parte por parte
        calendario.set(Calendar.YEAR, 2025);
        calendario.set(Calendar.MONTH, Calendar.FEBRUARY);
        calendario.set(Calendar.DAY_OF_MONTH, 25);
        // calendario.set(Calendar.HOUR_OF_DAY, 21);
        calendario.set(Calendar.HOUR, 6);
        calendario.set(Calendar.AM_PM, Calendar.PM);// puede variar ya sea AM o PM

        calendario.set(Calendar.MINUTE, 24);
        calendario.set(Calendar.SECOND, 10);
        calendario.set(Calendar.MILLISECOND, 125);
        Date fecha = calendario.getTime();
        // System.out.println(calendario.toString());
        System.out.println("Fecha sin formato: " + fecha);
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS a");
        String fechaFormateada = formatoFecha.format(fecha);
        System.out.println("Fecha con formato: " + fechaFormateada);

        // fecha para comparar
        Calendar calendarioActual = Calendar.getInstance();
        Date fechaActual = calendarioActual.getTime();
        if (fecha.compareTo(fechaActual) > 0) {// es mayor que la fecha actual
            System.out.println("Fecha del usuario es despues de la fecha 2");
        } else if (fecha.compareTo(fechaActual) < 0) {// fecha es anterior que fecha actual
            System.out.println("fecha es anteior que la fecha 2");
        } else if (fecha.compareTo(fechaActual) == 0) {
            System.out.println("las fechas iguales");
        }

    }
}
