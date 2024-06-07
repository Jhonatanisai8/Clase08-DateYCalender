package Main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Fechas {
    public static void main(String[] args) {
        pedirFecha();
        ejemploFecha();
    }

    public static void ejemploFecha() {
        System.out.println("=Ejemplo de fechas=");
        // creamos un objeto de la clase Date
        Date fecha = new Date();
        // imprimimos la fecha
        System.out.println("Fecha de hoy: " + fecha);

        // para darle formato
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd MMMM, yyyy");
        String fechaFormateada = formatoFecha.format(fecha);
        System.out.println("Fecha con nuevo formato: " + fechaFormateada);
    }

    public static void ejemploFecha2() {
        // creamos un objeto de la clase Date
        Date fecha = new Date();
        // imprimimos la fecha
        System.out.println("Fecha de hoy: " + fecha);

        // para darle formato
        SimpleDateFormat formatoFecha = new SimpleDateFormat("EEEE, MMM d, ''yy");
        String fechaFormateada = formatoFecha.format(fecha);
        System.out.println("Fecha con nuevo formato: " + fechaFormateada);
    }

    public static void pedirFecha() {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese una fecha
        System.out.print("Ingrese una fecha (dd/MM/yyyy): ");
        String fechaStr = scanner.nextLine();

        // Definir un formato de fecha y analizar la entrada
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = null;
        try {
            fecha = formato.parse(fechaStr);
            System.out.println("Fecha ingresada: " + fecha);
        } catch (ParseException e) {
            System.out.println("Formato de fecha inválido.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
