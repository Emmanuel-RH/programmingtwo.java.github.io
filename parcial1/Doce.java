package parcial1;
import java.util.Scanner;

public class Doce {
    public static void main(String []args){

        Scanner input = new Scanner (System.in);
    
        System.out.println ( "Inserte sueldo del trabajador:");
        int Sueldo = input.nextInt(); 

        System.out.println ( "Inserte horas trabajadas:");
        int HT = input.nextInt(); 

        if (HT<=40)
        { 
        System.out.println("El Sueldo total es: " + (Sueldo*HT));          
        } 
        else if (HT<=60) 
        {           
            int HE = HT - 40;
            double SalarioHE = 1.5;
            double SalarioComp = HE * Sueldo * SalarioHE;
            int resultado = Sueldo * 40;

            System.out.println("Las horas extras son: " + HE );
            System.out.println("El sueldo es: " + (SalarioComp +  resultado));
        } 
        else
        { 
            System.out.println("Excediste las horas extra." );
            int HE = 20;
            double SalarioHE = 1.5;
            double SalarioComp = HE * Sueldo * SalarioHE;
            int resultado = Sueldo * 40;

            System.out.println("Las horas extras son: " + HE );
            System.out.println("El sueldo es: " + (SalarioComp +  resultado));
        } 
        input.close(); 
    }
}