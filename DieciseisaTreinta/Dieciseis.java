package DieciseisaTreinta;

/**Programa 16
 * Author: José Emmanuel Reyes Hernández
 * Instrucción: Programa en Java que determine cuantos años, meses y días tiene una persona a
 * partir de su fecha de nacimiento.
 * Fecha: 15/Marzo/2023
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