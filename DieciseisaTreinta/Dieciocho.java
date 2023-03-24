package DieciseisaTreinta;

/** Porgrama 18
 * Author: José Emmanuel Reyes Hernández
 * Intrucción: Programa en Java que determine cuantos años, meses y días tiene una persona a
 * partir de su fecha de nacimiento y si esta casado entonces determinar cuantos años,
 * meses y días ha estado casado y cuantos años, meses y días ha estado soltero.
 * Date: 15/Marzo/2023
*/ 

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Dieciocho {
    
    public static void main(String[] args) {
        
        // Pedir la fecha de nacimiento
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese su fecha de nacimiento en el formato AAAA-MM-DD: ");
        String fechaNacimientoStr = scanner.nextLine();
        
        // Convertir la fecha de nacimiento a LocalDate
        LocalDate fechaNacimiento = LocalDate.parse(fechaNacimientoStr);
        
        // Calcular la edad actual
        LocalDate fechaActual = LocalDate.now();
        Period edad = Period.between(fechaNacimiento, fechaActual);
        System.out.println("Usted tiene " + edad.getYears() + " años, " + edad.getMonths() + " meses y " + edad.getDays() + " días.");
        
        // Preguntar si está casado
        System.out.print("¿Está casado? (s/n): ");
        String respuesta = scanner.nextLine();
        if (respuesta.equalsIgnoreCase("s")) {
            
            // Pedir la fecha de casamiento
            System.out.print("Ingrese su fecha de casamiento en el formato AAAA-MM-DD: ");
            String fechaCasamientoStr = scanner.nextLine();
            
            // Convertir la fecha de casamiento a LocalDate
            LocalDate fechaCasamiento = LocalDate.parse(fechaCasamientoStr);
            
            // Calcular la cantidad de tiempo que lleva casado
            Period tiempoCasado = Period.between(fechaCasamiento, fechaActual);
            System.out.println("Usted lleva casado " + tiempoCasado.getYears() + " años, " + tiempoCasado.getMonths() + " meses y " + tiempoCasado.getDays() + " días.");
            
            // Calcular la cantidad de tiempo que lleva soltero
            Period tiempoSoltero = Period.between(fechaNacimiento, fechaCasamiento);
            System.out.println("Usted ha estado soltero " + tiempoSoltero.getYears() + " años, " + tiempoSoltero.getMonths() + " meses y " + tiempoSoltero.getDays() + " días.");
            
        } else {
            System.out.println("Usted no está casado.");
        }
        
        scanner.close();
    }
}

