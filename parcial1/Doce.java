package parcial1;

/**Programa 12
 * Author: José Emmanuel Reyes Hernández
 * Instrucción: Calcular el sueldo de un trabajador tomando en cuenta lo siguiente. El trabajador
 * tiene un precio por hora trabajada, el trabajador puede laborar hasta 40 horas a la
 * semana como tiempo normal, de las 41 a 60 horas se consideran como tiempo extra,
 * el tiempo extra se paga al 1.5 del precio de hora normal.
 * Fecha: 05/03/23
*/ 

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