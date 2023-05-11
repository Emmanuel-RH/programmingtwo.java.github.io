import java.util.Scanner;

/*Diagrama de flujo y programa en java que determibe ka calificación de un estudiante de maestria de acuerdo con lo siguiente:
 * Son 5 examenes.
 * Calificación aprobatoria de 8 a 10.
 * Si un estudiante reprueba un examen, no aprueba, aunque el promedio sea aprobatorio.
 * Si aprueba los 5 examenes entonces se le indica el promedio.
 */

public class EjerUnoExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double calif, clasesTotales, inasistencias = 0; 

        System.out.println("Ingrese todas las asistencias de la clase: ");
        clasesTotales = sc.nextInt();

        System.out.println("Ingrese todas las inasistencias del alumno: ");
        inasistencias = sc.nextInt();

        double porcentajeInasistencias = (double) inasistencias / clasesTotales * 100;

        if (porcentajeInasistencias <= 10) {
            System.out.println("El estudiante tuvo derecho a examen.");

            System.out.println("Por favor ingresa la calificación del estudiante: ");
            calif = sc.nextDouble();

            System.out.println("La calificación del estudiante es: " +  calif);

        } else if (porcentajeInasistencias <= 20) {
            System.out.println("El estudiante tiene derecho a examen con penalización de -1.");

            System.out.println("Por favor ingresa la calificación del estudiante: ");
            calif = sc.nextDouble();

            double resuluno = calif - 1;

            System.out.println("La calificación del estudiante es: " + resuluno);

        } else if (porcentajeInasistencias < 30) {

            System.out.println("El estudiante tiene derecho a examen con penalización de -2 puntos.");
            System.out.println("Por favor ingresa la calificación del estudiante: ");
            calif = sc.nextDouble();

            double resuldos = calif - 2;

            System.out.println("La calificación del estudiante es: " + resuldos);

        } else {
            System.out.println("El estudiante no tiene derecho a examen.");
        }

        sc.close();
    }
}
