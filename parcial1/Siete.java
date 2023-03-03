package parcial1;
import java.util.Scanner;

public class Siete {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int num1= 0;
        int num2= 0;
        int num3= 0;

        System.out.println("Introduce el primer numero: ");
        int num1 = sc.nextInt();

        System.out.println("Introduce el segundo numero: ");
        int num2 = sc.nextInt();

        System.out.println("Introduce el tercer numero: ");
        int num3 = sc.nextInt();

        if(num1 > num2 && num3){
            if(num2>num3){
                System.out.println("El numero mayor es: " + num1 + " .el siguiente es: " + num2 + " .Y el último es: " + num3);
            }
            else{
                System.out.println("El numero mayor es: " + num1 + " .el siguiente es: " + num3 + " .Y el último es: " + num2);
            }
        }
        else if(num2> num1 && num3){
            
        }
        else{
        }
        }

    }
}
