import java.util.Scanner;

/*Examen - Parcial Uno
 * Author: José Emmanuel Reyes Hernández
 * Date: 04- Mayo - 2023
 * Instrucción: Diagrama de flujo y programa que determine si un estudiante tiene derecho a examen y su calificación de acuerdo con lo siguiente.
 * Si tiene menos de 10% de inasistencias tiene derecho a examen.
 * Si tiene más de del 10% y menos del 20% de inasistencias, se le penaliza con 1 punto en el examen.
 * Si teiene mas del 20% y menos del 30% de inasistencias, se le penaliza con 2 puntos en el examen.
 * De 30% de inasistencias en adelante no tiene derecho a examen.
 */

public class ExamenEjerUNO {
    public static void main (String[] args){
    Scanner sc = new Scanner (System.in);
        double calif = 0;
        int asis, asisalum  = 0;
        

        System.out.println("Por favor ingresa la calificación del estudiante: ");
        calif = sc.nextDouble();

        System.out.println("Ingrese todas las asistencias de la clase: ");
        asis = sc.nextInt();

        System.out.println("Ingrese todas las asistencias del alumno: ");
        asis = sc.nextInt();

        System.out.println(calif);
    }
}
