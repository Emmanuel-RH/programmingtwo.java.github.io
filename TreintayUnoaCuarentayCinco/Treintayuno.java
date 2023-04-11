package TreintayUnoaCuarentayCinco;

/** Porgrama 31
 * Author: José Emmanuel Reyes Hernández
 * Intrucción: Calcular el sueldo de N trabajadores tomando en cuenta lo siguiente. El trabajador tiene un precio por hora trabajada, 
 * el trabajador puede laborar hasta 40 horas a la semana como tiempo normal, de las 41 a 60 horas se consideran como tiempo extra, el 
 * tiempo extra se paga al 1.5 del precio de hora normal.
 * Date: 29/Marzo/2023
*/ 

import java.util.Scanner;

public class Treintayuno {
    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in);
        double hora;
        double sueldo;
        double horas;
        double horaNormal;
        double horaExtra;
        double sueldoNormal;
        double sueldoExtra;
        int i = 0;
        char Resp;
        horas = 0;

        do {
            i++;
            System.out.print("¿Cuántas horas laboró el trabajador " + i + "? ");
            hora = sc.nextDouble();
            System.out.print("¿Cuánto gana por hora? ");
            sueldo = sc.nextDouble();

            if (hora <= 40) {
                horas = hora * sueldo;
                System.out.println("Sueldo del trabajador: " + i + " de $" + horas);

            } else if (hora <= 60) {
                horaExtra = hora - 40;
                sueldoNormal = sueldo * 40;
                sueldoExtra = (horaExtra * sueldo) * 1.5;
                horas = sueldoExtra + sueldoNormal;
                System.out.println("Sueldo del trabajador: " + i + " de $" + horas);

            } else if (hora > 60) {
                horaNormal = sueldo * 40;
                horaExtra = (sueldo * 1.5) * 20;
                horas = horaNormal + horaExtra;
                System.out.println("Sueldo del trabajador: " + i + " de $" + horas);
            }
            System.out.print("¿Hay otro trabajador? (S/N) ");
            Resp = sc.next().charAt(0);
        } while (Resp == 'S' || Resp == 's');
        sc.close();
    }
}
