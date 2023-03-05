package parcial1;
import java.util.Scanner;

public class Diez {
    public static void main (String[] args){

        Scanner sc = new Scanner (System.in);
        
        System.out.println("¡Bienvenido a calculador de IVA!");

        System.out.println("Ingresa el valor de tu artículo: ");
        int precio = sc.nextInt();

        double iva = 1.16;
        double resultado = iva * precio;

        System.out.println("El precio de su producto es de: " + precio + ". El precio final de su producto con IVA es de: " + resultado);

        sc.close();
    }
}
