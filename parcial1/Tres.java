package parcial1;
import java.util.Scanner;

public class Tres {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite el primer numero a sumar: ");
        int numero1 = sc.nextInt();

        System.out.println("Digite el siguiente número a sumar: ");
        int numero2 = sc.nextInt();

        int resultado = numero1+numero2;

        System.out.println("Su resultado es: " + resultado);

        sc.close();
    } 
}
