package Main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ConvetirStringADate {
    static Scanner leer = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("==CONVERTIR FECHA de STRING a DATE==");
        convetirFechaIngresada();
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
}
