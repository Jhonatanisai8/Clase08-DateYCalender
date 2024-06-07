package Main;

import java.text.SimpleDateFormat;
import java.util.Date;

public class main {

    public static void main(String[] args) {
        Date fecha = new Date();
        System.out.println("Fecha de hoy => " + fecha);
        
        String fechaHora = " 'Fecha: 'yyyy.MM.dd G 'Hora:' HH:mm:ss z";
        //le damos formato a la f echa 
        SimpleDateFormat df = new SimpleDateFormat("EEEE dd 'de' MMMM, yyyy");
        /*  
        SimpleDateFormat df = new SimpleDateFormat("dd- MM- yyyy");
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
         */
        String fechaStr = df.format(fecha);
        System.out.println("Fecha modificada => " + fechaStr);
    }
}
