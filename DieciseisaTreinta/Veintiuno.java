package DieciseisaTreinta;

/** Porgrama 22
 * Author: José Emmanuel Reyes Hernández
 * Intrucción: Diagrama de flujo y programa en Java que determine la calificación de un estudiante de acuerdo a lo siguiente:
 * 10% lo obtiene en caso de tener todas las asistencias, sino se calcula cuanto le toca de porcentaje de asistencia.
 * 20% por la participación, se calcula de acuerdo al número de tareas encargadas y cuantas entrego el estudiante. 70% de exámenes, fueron 2 exámenes.
 * Date: 15/Marzo/2023
*/ 

import java.util.Scanner;
public class Veintiuno {

	public static void main(String args[]) {
        
		Scanner scanner = new Scanner(System.in);

		int asistenciaalumno;
		double cal1;
		double cal2;
		double calexamenes;

		int i;

		double promexamenes;
		double prom_asistencia;
		double prom_asistenciaf;
		double prom_tareas;
		double prom_tareasf;

		String resp;

		int tareasentregadas;
		int totalasistencia;
		int totaltareas;

		System.out.println("Bienvenido");
		i = 0;

		System.out.println("Escribe el total de asistencias durante el semestre");
		totalasistencia = scanner.nextInt();

		System.out.println("Escribe el total de tareas encargadas durante el semestre");
		totaltareas = scanner.nextInt();

		do {
			i = i+1;
			System.out.println("Escribe el total de asistencias del alumno "+i);
			asistenciaalumno = scanner.nextInt();

			prom_asistencia = (asistenciaalumno/totalasistencia);
			prom_asistenciaf = prom_asistencia/0.1;

			System.out.println("El alumno tiene "+prom_asistenciaf+"% en asistencias");
			System.out.println("-----------------------------------------------------");
			System.out.println("Escribe el total de tareas entregadas por el alumno "+i);
            tareasentregadas = scanner.nextInt();
			
            prom_tareas = (tareasentregadas/totaltareas);
			prom_tareasf = (prom_tareas/0.10)*2;

			System.out.println("El alumno tiene "+prom_tareasf+"% en tareas");
			System.out.println("-----------------------------------------------------");

			System.out.println("Da la calificacion que obtuvo el alumno "+i+" en el primer examen");
			cal1 = scanner.nextDouble();

			System.out.println("Da la calificacion que obtuvo el alumno "+i+" en el segundo examen");
			cal2 = scanner.nextDouble();

			calexamenes = (cal1+cal2)/2;
			promexamenes = (calexamenes*0.7)*10;

			System.out.println("El alumno tiene "+Math.floor(promexamenes)+"% en Examenes");
			System.out.println("-----------------------------------------------------");
			System.out.println("La calificacion final del alumno "+i+" es de "+Math.floor(promexamenes+prom_asistenciaf+prom_tareasf)+"%");
			System.out.println("-----------------------------------------------------");
			System.out.println("Hay otro alumno?");
			resp = scanner.next();

            scanner.close();

		} while (!(resp.equals("no") || resp.equals("NO") || resp.equals("No") || resp.equals("N") || resp.equals("n")));
	}
}