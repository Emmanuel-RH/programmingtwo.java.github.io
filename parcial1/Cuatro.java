//Programa 4
package parcial1;
import java.util.Scanner;

public class Cuatro {
    public static void main (String[] args){

    Scanner sc = new Scanner (System.in);

    System.out.println("Introduce el primer numero a restar: ");
    int num1 = sc.nextInt();

    System.out.println("Introduce el segundo numero a restar: ");
    int num2 = sc.nextInt();

    if(num1>num2){
        int resultado = num1 - num2;
        
        System.out.println("Su resultado es: " + resultado);
    }
    else{
        System.out.print("El primer número debe ser mayor que el segundo.");
    }

    sc.close();
    }
}
