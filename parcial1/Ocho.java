package parcial1;
import java.util.Scanner;

public class Ocho {
    public static void main (String[] args){

        Scanner sc = new Scanner (System.in);

        System.out.print("Ingrese el primer digito: ");
        int a = sc.nextInt();

        System.out.print("Ingrese el primer digito: ");
        int b = sc.nextInt();

        System.out.print("Ingrese el primer digito: ");
        int c = sc.nextInt();

        System.out.println("Los números ordenados de mayor a menor son: ");  
        if(a>=b && b>=c)
        {
        System.out.println("El primer numero es: " +a+ ". El segundo numero es: " +b+ ". El tercer numero es:" +c );  
        }
        else if (a>=c && c>=b)
        {
                 
        System.out.println("El primer numero es: " +a+ ". El segundo numero es: " +c+ ". El tercer numero es: " +b ); 
        }
        else if (b>=a && a>=c)
        {
                 
        System.out.println("El primer numero es: " +b+ ". El segundo numero es: " +a+ ". El tercer numero es: " +c ); 
        }
        else if (b>=c && c>=a)
        {
         
        System.out.println("El primer numero es: " +b+ ". El segundo numero es: " +c+ ". El tercer numero es: "+a ); 
        }
        else if (c>=a && a>=b)
        {
                 
        System.out.println("El primer numero es: " +c+ ". El segundo numero es: " +a+ ". El tercer numero es: " +b ); 
        }
        else
        {
        System.out.println("El primer numero es: " +c+ ". El segundo numero es: " +b+ ". El tercer numero es: " +a );
        }   

        sc.close();
    }
}