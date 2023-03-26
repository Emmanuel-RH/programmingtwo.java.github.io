package DieciseisaTreinta;

/** Porgrama 29
 * Author: José Emmanuel Reyes Hernández
 * Intrucción: Programa calcule el monto a pagar en una tienda de cada uno de sus clientes, que pida el precio de los artículos 
 * y a muestre el precio final incluyendo el 16% del IVA.
 * Date: 15/Marzo/2023
*/ 

import java.util.Scanner;

public class Treinta {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String resp1, resp2;
        
        int i = 0;
        double precio, acumulador = 0, iva;
        
        do {
            System.out.println("¿Hay un cliente? (Si/No)");
            resp1 = sc.nextLine();
            i++;
            if (resp1.equalsIgnoreCase("si") || resp1.equalsIgnoreCase("s")) {
                do {
                    System.out.println("Da el precio del producto");
                    precio = sc.nextDouble();
                    acumulador += precio;
                    iva = acumulador * 0.16;
                    sc.nextLine();
                    System.out.println("¿Hay otro producto? (Si/No)");
                    resp2 = sc.nextLine();
                } while (resp2.equalsIgnoreCase("si") || resp2.equalsIgnoreCase("s"));
                
                System.out.println("");
                System.out.println("Precio por artículos: " + acumulador);
                System.out.println("IVA 16% :" + iva);
                System.out.println("Total a pagar del cliente " + i + " es de: " + (acumulador + iva));
                System.out.println("");
            } else {
                System.out.println("Salio del sistema");
            }
        } while (resp1.equalsIgnoreCase("si") || resp1.equalsIgnoreCase("s"));
        
        sc.close();
    }
}