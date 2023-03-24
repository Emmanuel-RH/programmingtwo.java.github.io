package DieciseisaTreinta;

/**Programa 17
 * Author: José Emmanuel Reyes Hernández
 * Instrucción: Programa en Java que determine cuantos años, meses, días, horas y minutos tiene
 * una persona a partir de su fecha y hora de nacimiento.
 * Fecha: 20/Marzo/2023
*/ 

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Diecisiete {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su fecha y hora de nacimiento en formato yyyy-MM-dd HH:mm:ss:");
        String fechaNacimientoStr = sc.nextLine();
        LocalDateTime fechaNacimiento = LocalDateTime.parse(fechaNacimientoStr);

        LocalDateTime ahora = LocalDateTime.now();

        long anios = ChronoUnit.YEARS.between(fechaNacimiento, ahora);
        long meses = ChronoUnit.MONTHS.between(fechaNacimiento, ahora);
        long dias = ChronoUnit.DAYS.between(fechaNacimiento, ahora);
        long horas = ChronoUnit.HOURS.between(fechaNacimiento, ahora);
        long minutos = ChronoUnit.MINUTES.between(fechaNacimiento, ahora);

        System.out.println("Edad:");
        System.out.println("Años: " + anios);
        System.out.println("Meses: " + meses);
        System.out.println("Días: " + dias);
        System.out.println("Horas: " + horas);
        System.out.println("Minutos: " + minutos);

        sc.close();
    }
}
