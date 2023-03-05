package parcial1;
import java.util.Scanner;

public class Once {
    public static void main (String[] args){

        System.out.println("'¡Bienvendo al convertidor de divisas!");

        Scanner sc = new Scanner (System.in);

        System.out.print("Ingresa la cantidad de dolares que deseas convertir: ");
        int dolar = sc.nextInt();

        double pesosmx = 17.96;
        double repesosmx = pesosmx * dolar;
        System.out.println("Tienes: $" + repesosmx + " pesos mexicanos.");

        double pesoscolom = 4788.63;
        double repesoscolom = pesoscolom * dolar;
        System.out.println("Tienes: $" + repesoscolom + " pesos colombianos.");
        
        double pesoschil = 803.16;
        double repesoschil = pesoschil * dolar;
        System.out.println("Tienes: $" + repesoschil + " pesos chilenos.");

        double pesosperu = 3.78;
        double repesosperu = pesosperu * dolar;
        System.out.println("Tienes: $" + repesosperu + " soles peruanos.");

        sc.close();
    }
}
