package parcial1;
import java.util.Scanner;

public class Cinco {
    public static void main (String[] args){

    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce tu numero: ");
    int num = sc.nextInt();

    if (num % 2 == 0 ){
        System.out.println("El numero: " + num + " es par.");
    }
    else{
        System.out.print("El numero: " +num + " es impar.");
    }

    sc.close();
    }
}
