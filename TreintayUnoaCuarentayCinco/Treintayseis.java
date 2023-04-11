package TreintayUnoaCuarentayCinco;

/** Programa 36
 * Author: José Emmanuel Reyes Hernández
 * Intrucción: Diagrama de flujo y programa en Java que determine el pago de los jugadores de un equipo de futbol profesional quienes ganan 
 * de acuerdo a lo siguiente: Tiene un sueldo base Si es portero, tiene una prima de un 1% de su sueldo base por cada penalti que detenga, si el 
 * penalti fue en liguilla la prima es de 2%. Si es delantero, tiene una prima de 2% por gol, si gol fue en liguilla la prima es de 3%.
 * Date: 30/Marzo/2023
*/  

import java.io.*;

public class Treintayseis {
public static void main(String args[]) throws IOException {

    BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
    double acumulador;
    int contador = 0;
    int i = 0;
    String resp;
    String resp1;
    String resp2;
    String resp3;
    int rol;
    double sueldobase;

    do {
        i = i+1;
        System.out.println("Porfavor da el sueldo de base del jugador");
        sueldobase = Double.parseDouble(bufEntrada.readLine());
        System.out.println("Seleccione el rol del jugador");
        System.out.println("1. Portero ");
        System.out.println("2. Defensa ");
        System.out.println("3. Medio ");
        System.out.println("4. Delantero ");
        rol = Integer.parseInt(bufEntrada.readLine());
        acumulador = 0;
        switch (rol) {
        case 1:
            System.out.println("El portero detuvo algun penalti?");
            resp1 = bufEntrada.readLine();
            if (resp1.equals("si") || resp1.equals("Si") || resp1.equals("SI") || resp1.equals("S") || resp1.equals("s")) {
                do {
                    contador = contador+1;
                    System.out.println("El penalti atajado fue en liguilla?");
                    resp2 = bufEntrada.readLine();
                    if (resp2.equals("si") || resp2.equals("Si") || resp2.equals("SI") || resp2.equals("S") || resp2.equals("s")) {
                        acumulador = acumulador+sueldobase*0.02;
                    } else {
                        acumulador = acumulador+sueldobase*0.01;
                    }
                    System.out.println("El portero atajo otro penal?");
                    resp3 = bufEntrada.readLine();
                } while (!(resp3.equals("No") || resp3.equals("N") || resp3.equals("no") || resp3.equals("NO") || resp3.equals("n")));
                System.out.println("Su sueldo base es de: $"+sueldobase);
                System.out.println("Usted tuvo "+contador+" atajadas de penalti");
                System.out.println("Sus primas por atajar penaltis son de: $"+acumulador);
                System.out.println("Su sueldo total es de: $"+sueldobase+acumulador);
            } else {
                System.out.println("Su sueldo es: "+sueldobase);
            }
            break;
        case 4:
            System.out.println("El jugador anoto gol?");
            resp1 = bufEntrada.readLine();
            if (resp1.equals("si") || resp1.equals("Si") || resp1.equals("SI") || resp1.equals("S") || resp1.equals("s")) {
                do {
                    contador = contador+1;
                    System.out.println("El gol fue en liguilla?");
                    resp2 = bufEntrada.readLine();
                    if (resp2.equals("si") || resp2.equals("Si") || resp2.equals("SI") || resp2.equals("S") || resp2.equals("s")) {
                        acumulador = acumulador+sueldobase*0.03;
                    } else {
                        acumulador = acumulador+sueldobase*0.02;
                    }
                    System.out.println("El jugador anoto otro gol?");
                    resp3 = bufEntrada.readLine();
                } while (!(resp3.equals("No") || resp3.equals("N") || resp3.equals("no") || resp3.equals("NO") || resp3.equals("n")));
                System.out.println("Su sueldo base es de: $"+sueldobase);
                System.out.println("Usted anoto "+contador+" goles");
                System.out.println("Sus primas por goles anotados son de: $"+acumulador);
                System.out.println("Su sueldo total es de: $"+sueldobase+acumulador);
            } else {
                System.out.println("Su sueldo es: "+sueldobase);
            }
            break;
        case 2:
            System.out.println("Su sueldo es: "+sueldobase);
            break;
        case 3:
            System.out.println("Su sueldo es: "+sueldobase);
            break;
        default:
            System.out.println("Opcion Invalida");
        }
        System.out.println("Hay otro jugador? (Si/No)");
        resp = bufEntrada.readLine();
    } while (!(resp.equals("No") || resp.equals("no") || resp.equals("NO") || resp.equals("N") || resp.equals("n")));
}
}