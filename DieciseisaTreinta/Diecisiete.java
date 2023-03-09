package DieciseisaTreinta;

import java.time.LocalDateTime;
import java.time.Duration;
import java.util.Scanner;

public class Diecisiete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su fecha y hora de nacimiento (en formato yyyy-mm-ddThh:mm:ss): ");
        String fechaHoraNacimiento = scanner.nextLine();

        LocalDateTime fechaHoraNac = LocalDateTime.parse(fechaHoraNacimiento);
        LocalDateTime fechaHoraActual = LocalDateTime.now();
        Duration duracion = Duration.between(fechaHoraNac, fechaHoraActual);

        long anios = duracion.toDays() / 365;
        long meses = (duracion.toDays() % 365) / 30;
        long dias = duracion.toDays() % 30;
        long horas = duracion.toHours() % 24;
        long minutos = duracion.toMinutes() % 60;

        System.out.println("Usted tiene " + anios + " años, " + meses + " meses, " + dias + " días, " + horas + " horas y " + minutos + " minutos.");

        scanner.close();
    }
}

