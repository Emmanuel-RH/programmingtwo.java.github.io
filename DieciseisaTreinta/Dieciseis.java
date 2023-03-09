package DieciseisaTreinta;

/*Este código utiliza la clase LocalDate de la librería java.time para obtener la fecha actual 
 *y la fecha de nacimiento de la persona, y luego utiliza la clase Period para calcular la diferencia 
 *entre ambas fechas en años, meses y días. El resultado se imprime en la consola.
*/

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Dieciseis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su fecha de nacimiento (en formato yyyy-mm-dd): ");
        String fechaNacimiento = scanner.nextLine();

        LocalDate fechaNac = LocalDate.parse(fechaNacimiento);
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(fechaNac, fechaActual);

        int años = periodo.getYears();
        int meses = periodo.getMonths();
        int dias = periodo.getDays();

        System.out.println("Usted tiene " + años + " años, " + meses + " meses y " + dias + " días.");

        scanner.close();
    }
}