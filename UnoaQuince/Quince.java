package UnoaQuince;

/**Programa 15
 * Author: José Emmanuel Reyes Hernández
 * Instrucción: na empresa mexicana de construcción es trasnacional, por ese motivo tiene
 * trabajadores de México, Colombia, Chile y Perú. En cada país existe un precio por
 * hora trabajada, existe diferente porcentaje de retención del ISR y también diferente
 * porcentaje de retención del sistema de asignación de casas (infonavit) tanto para
 * quienes ya obtuvieron la casa como para quienes todavía no la tienen. Calcular el
 * sueldo semanal de un trabajador de acuerdo a sus horas trabajadas y mostrar los
 * montos en su moneda nacional y su equivalente en pesos mexicanos.
 * Fecha: 05/03/23
*/ 

import java.util.Scanner; 

public class Quince {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("¡Hola trabajador! Elige tu país (1,2,3,4): ");
        System.out.println("1. Mexico");
        System.out.println("2. Colombia ");
        System.out.println("3. Chile ");
        System.out.println("4. Perú");
        int opcion = sc.nextInt();
        
        switch (opcion){

            case 1:{

                System.out.println("Usted eligió la opcion (1) - Mexico");
                System.out.println("Ingresa tus horas trabajadas (Maximo 8): ");

                int HT = sc.nextInt();
                int SalarioM  = 17;
                double sueldoTotal = SalarioM * HT; //sueldo total diario con horas
                double ImpuestoMex = 0.10;
                double SueldoISR = sueldoTotal - (sueldoTotal * ImpuestoMex);
                
                System.out.println("Tu sueldo con descuendo de ISR es de: $" + SueldoISR);

                double descuentoInfonavit = 0;
                System.out.print("¿Tiene casa propia? (Si/No): ");
                String respuesta = sc.next();

                if (respuesta.equalsIgnoreCase("No")) {
                descuentoInfonavit = SueldoISR * 0.0;
                } 
                else if (respuesta.equalsIgnoreCase("Si")) {
                descuentoInfonavit = SueldoISR* 0.25;
                }

                sueldoTotal = SueldoISR - (descuentoInfonavit);

                Double SalarioSem = sueldoTotal * 7;

                System.out.println("Tu descuento de INFONAVIT es de: $" + descuentoInfonavit);
                System.out.println("Tu sueldo NETO es de: $" + sueldoTotal);
                System.out.println("Tu sueldo neto semanal con descuento de ISR e INFONAVIT es de: $" + SalarioSem);

                break;
            }

            case 2:{

                System.out.println("Usted eligió la opcion (2) - Colombia");

                System.out.println("Ingresa tus horas trabajadas (Maximo 8): ");

                int HT = sc.nextInt();
                int SalarioM  = 115000;
                double sueldoTotal = SalarioM * HT; //sueldo total diario con horas
                double ImpuestoCol = 0.28;
                double SueldoISR = sueldoTotal - (sueldoTotal * ImpuestoCol);
                
                System.out.println("Tu sueldo con descuendo de ISR es de: $" + SueldoISR);

                double descuentoInfonavit = 0;
                System.out.print("¿Tiene casa propia? (Si/No): ");
                String respuesta = sc.next();

                if (respuesta.equalsIgnoreCase("No")) {
                descuentoInfonavit = SueldoISR * 0.1;
                } 
                else if (respuesta.equalsIgnoreCase("Si")) {
                descuentoInfonavit = SueldoISR* 0.20;
                }

                sueldoTotal = SueldoISR - (descuentoInfonavit);

                Double SalarioSem = sueldoTotal * 7;

                System.out.println("Tu descuento de INFONAVIT es de: $" + descuentoInfonavit);
                System.out.println("Tu sueldo NETO es de: $" + sueldoTotal);
                System.out.println("Tu sueldo neto semanal con descuento de ISR e INFONAVIT es de: $" + SalarioSem);
                System.out.println("Tu sueldo neto en pesos mexicanos es: $" + (SalarioSem * 0.0037));


                break;
            }

            case 3:{

                System.out.println("Usted eligió la opcion (3) - Chile");

                System.out.println("Ingresa tus horas diarias trabajadas (Maximo 8): ");

                int HT = sc.nextInt();
                int SalarioM  = 4000;
                double sueldoTotal = SalarioM * HT; //sueldo total diario con horas
                double ImpuestoChil = 0.05;
                double SueldoISR = sueldoTotal - (sueldoTotal * ImpuestoChil);
                
                System.out.println("Tu sueldo con descuendo de ISR es de: $" + SueldoISR);

                double descuentoInfonavit = 0;
                System.out.print("¿Tiene casa propia? (Si/No): ");
                String respuesta = sc.next();

                if (respuesta.equalsIgnoreCase("No")) {
                descuentoInfonavit = SueldoISR * 0.0;
                } 
                else if (respuesta.equalsIgnoreCase("Si")) {
                descuentoInfonavit = SueldoISR* 0.23;
                }

                sueldoTotal = SueldoISR - (descuentoInfonavit);

                Double SalarioSem = sueldoTotal * 7;

                System.out.println("Tu descuento de INFONAVIT es de: $" + descuentoInfonavit);
                System.out.println("Tu sueldo NETO es de: $" + sueldoTotal);
                System.out.println("Tu sueldo neto semanal con descuento de ISR e INFONAVIT es de: $" + SalarioSem);
                System.out.println("Tu sueldo neto en pesos mexicanos es: $" + (SalarioSem * 0.022));


                break;
            }

            case 4:{

                System.out.println("Usted eligió la opcion (4) - Perú");

                System.out.println("Ingresa tus horas diarias trabajadas (Maximo 8): ");

                int HT = sc.nextInt();
                int SalarioM  = 7;
                double sueldoTotal = SalarioM * HT; //sueldo total diario con horas
                double ImpuestoChil = 0.15;
                double SueldoISR = sueldoTotal - (sueldoTotal * ImpuestoChil);
                
                System.out.println("Tu sueldo con descuendo de ISR es de: $" + SueldoISR);

                double descuentoInfonavit = 0;
                System.out.print("¿Tiene casa propia? (Si/No): ");
                String respuesta = sc.next();

                if (respuesta.equalsIgnoreCase("No")) {
                descuentoInfonavit = SueldoISR * 0.0;
                } 
                else if (respuesta.equalsIgnoreCase("Si")) {
                descuentoInfonavit = SueldoISR* 0.11;
                }

                sueldoTotal = SueldoISR - (descuentoInfonavit);

                Double SalarioSem = sueldoTotal * 7;

                System.out.println("Tu descuento de INFONAVIT es de: $" + descuentoInfonavit);
                System.out.println("Tu sueldo NETO es de: $" + sueldoTotal);
                System.out.println("Tu sueldo neto semanal con descuento de ISR e INFONAVIT es de: $" + SalarioSem);
                System.out.println("Tu sueldo neto en pesos mexicanos es: $" + (SalarioSem * 4.76));
                break;
            }

            default: {

                System.out.println("Opcion Invalida");
            }
        }

        sc.close();
        
    }
}