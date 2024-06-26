package Main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ConvetirStringADate {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("==CONVERTIR FECHA de STRING a DATE==");
        mayorDeDosFechasConComparteTo();
    }

    public static void convetirFecha() {
        // instanciamos
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
        // SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");

        Date fecha;
        try {
            fecha = formatoFecha.parse("2006-02-08");
            System.out.println("Fecha sin formato: " + fecha);
            System.out.println("Fecha con formato: " + formatoFecha.format(fecha));
        } catch (ParseException e) {
            System.out.println("Error: " + e.toString());
        }
    }

    public static void convetirFechaIngresada() {
        // instanciamos
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
        // SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");

        // pedimos la fecha
        System.out.println("Ingrese la fecha (yyyy-MM-dd)");
        String fechaIngresada = leer.next();
        Date fecha;
        try {
            fecha = formatoFecha.parse(fechaIngresada);
            System.out.println("Fecha sin formato: " + fecha);
            System.out.println("Fecha con formato: " + formatoFecha.format(fecha));

        } catch (ParseException e) {
            System.out.println("Error: " + e.toString());
        }
    }

    // metodo para saber cual de dos fechas es mayor
    public static void mayorDeDosFechas() {
        // instanciamos
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
        // SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");

        // pedimos la fecha
        System.out.println("Ingrese la fecha (yyyy-MM-dd)");
        String fechaIngresada = leer.next();
        Date fecha;
        try {
            fecha = formatoFecha.parse(fechaIngresada);
            System.out.println("Fecha sin formato: " + fecha);
            System.out.println("Fecha con formato: " + formatoFecha.format(fecha));

            // fecha para comparar
            Date nuevaActual = new Date();
            System.out.println("Fecha actual : " + nuevaActual);
            if (fecha.after(nuevaActual)) {
                System.out.println("Fecha del usuario es despues de la fecha 2");
            } else if (fecha.before(nuevaActual)) {
                System.out.println("fecha es anteior que la fecha 2");
            } else if (fecha.equals(nuevaActual)) {
                System.out.println("las fechas iguales");
            }
        } catch (ParseException e) {
            System.out.println("Error: " + e.toString());
        }
    }

    public static void mayorDeDosFechasConComparteTo() {
        // instanciamos
        SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
        // SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-yyyy");

        // pedimos la fecha
        System.out.println("Ingrese la fecha (yyyy-MM-dd)");
        String fechaIngresada = leer.next();
        Date fecha;
        try {
            fecha = formatoFecha.parse(fechaIngresada);
            System.out.println("Fecha sin formato: " + fecha);
            System.out.println("Fecha con formato: " + formatoFecha.format(fecha));

            // fecha para comparar
            Date nuevaActual = new Date();
            System.out.println("Fecha actual : " + nuevaActual);
            if (fecha.compareTo(nuevaActual) > 0) {// es mayor que la fecha actual
                System.out.println("Fecha del usuario es despues de la fecha 2");
            } else if (fecha.compareTo(nuevaActual) < 0) {// fecha es anterior que fecha actual
                System.out.println("fecha es anteior que la fecha 2");
            } else if (fecha.compareTo(nuevaActual) == 0) {
                System.out.println("las fechas iguales");
            }
        } catch (ParseException e) {
            System.out.println("Error: " + e.toString());
        }
    }
}
