package TreintayUnoaCuarentayCinco;

/** Programa 37
 * Author: José Emmanuel Reyes Hernández
 * Intrucción: Diagrama de flujo y programa en Java que determine la calificación de los estudiantes de un grupo de acuerdo a lo siguiente: 
 * 10% lo obtiene en caso de tener todas las asistencias, sino se calcula cuanto le toca de porcentaje de asistencia. 20% por la participación, 
 * se calcula de acuerdo al número de tareas encargadas y cuantas entrego el estudiante. 70% de exámenes, fueron 2 exámenes.
 * Date: 30/Marzo/2023
*/  

import java.util.Scanner;

public class Treintaysiete {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int i = 0, totalAsistencia, totalTareas, asistenciaAlumno, tareasEntregadas;
        double prom_asistencia, prom_asistenciaf, prom_tareas, prom_tareasf, cal1, cal2, promExamenes, calexamenes, promExamenesf;
        char resp;

        System.out.println("Introduce el total de asistencias durante el semestre: ");
        totalAsistencia = sc.nextInt();

        System.out.println("Introduce el total de tareas encargadas durante el semestre: ");
        totalTareas = sc.nextInt();

        do {
            i++;

            System.out.println("Introduce el total de asistencias del alumno: " + i);
            asistenciaAlumno = sc.nextInt();
            prom_asistencia = (double) asistenciaAlumno / totalAsistencia;
            prom_asistenciaf = prom_asistencia / 0.1;
            System.out.println("El alumno tiene: " + prom_asistenciaf + "% en asistencias.");

            System.out.println("Introduce el total de tareas entregadas por el alumno: " + i);
            tareasEntregadas = sc.nextInt();
            prom_tareas = (double) tareasEntregadas / totalTareas;
            prom_tareasf = (prom_tareas / 0.10) * 2;
            System.out.println("El alumno tiene: " + prom_tareasf + "% en tareas");

            System.out.println("Introduce la calificacion que obtuvo el alumno " + i + " en el primer examen.");
            cal1 = sc.nextDouble();

            System.out.println("Introduce la calificacion que obtuvo el alumno " + i + " en el segundo examen.");
            cal2 = sc.nextDouble();

            calexamenes = (cal1 + cal2) / 2;
            promExamenes = (calexamenes * 0.7) * 10;
            System.out.println("El alumno tiene " + (int) promExamenes + "% en Examenes");

            promExamenesf = promExamenes + prom_asistenciaf + prom_tareasf;
            System.out.println("La calificacion final del alumno " + i + " es de " + (int) promExamenesf + "%");

            System.out.println("¿Hay otro alumno? (s/n)");
            resp = sc.next().charAt(0);

        } while (resp == 's' || resp == 'S');

        System.out.println("El programa termino.");

        sc.close();
    }
}