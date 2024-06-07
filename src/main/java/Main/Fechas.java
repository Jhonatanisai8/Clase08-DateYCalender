package Main;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Fechas {
    public static void main(String[] args) {
        ejemploFecha();
    }

    public static void ejemploFecha() {
        // creamos un objeto de la clase Date
        Date fecha = new Date();
        // imprimimos la fecha
        System.out.println("Fecha de hoy: " + fecha);

        // para darle formato
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd MMMM, yyyy");
        String fechaFormateada = formatoFecha.format(fecha);
        System.out.println("Fecha con nuevo formato: " + fechaFormateada);
    }
}
