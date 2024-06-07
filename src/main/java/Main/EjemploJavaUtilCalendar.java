package Main;

import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();
       // calendario.set(2024, Calendar.FEBRUARY, 22, 9, 07, 10);
       
       //asignar parte por parte 
       calendario.set(Calendar.YEAR, 2020);
       calendario.set(Calendar.MONTH , Calendar.JULY);
       calendario.set(Calendar.DAY_OF_MONTH, 22);
       calendario.set(Calendar.HOUR_OF_DAY, 10);
       calendario.set(Calendar.MINUTE, 25);
       calendario.set(Calendar.SECOND, 10);
               
       Date fecha = calendario.getTime();
       // System.out.println("Calendario : " + calendario);
        System.out.println("Fecha : " + fecha);
    }
    
}
