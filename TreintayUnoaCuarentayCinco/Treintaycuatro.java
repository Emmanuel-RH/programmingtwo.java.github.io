package TreintayUnoaCuarentayCinco;

/** Programa 34
 * Author: José Emmanuel Reyes Hernández
 * Intrucción: Una empresa mexicana de construcción es trasnacional, por ese motivo tiene trabajadores de México, Colombia, Chile y Perú. 
 * En cada país existe un precio por hora trabajada, existe diferente porcentaje de retención del ISR y también diferente porcentaje de 
 * retención del sistema de asignación de casas (infonavit) tanto para quienes ya obtuvieron la casa como para quienes todavía no la tienen. Calcular el
 * sueldo semanal de N trabajadores de acuerdo a sus horas trabajadas y mostrar los montos en su moneda nacional y su equivalente en pesos mexicanos.
 * Date: 29/Marzo/2023
*/  

import java.util.Scanner; //Importar libreria para leer datos ingresados por el usuario.

public class Treintaycuatro {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double precioHora, horasTrabajadas, sueldoSemanal, isr, infonavit, sueldoSemanalfinal, retenciones;
        int estadoMigratorio, i = 0;
        String resp;
        precioHora = 0;

        do {
            i++;
            System.out.println("Trabajador " + i);
            System.out.print("Introduce las horas trabajadas: ");
            horasTrabajadas = sc.nextDouble();
            System.out.println("Introduce el pais de procedencia del trabajador:");
            System.out.println("1 - México");
            System.out.println("2 - Colombia");
            System.out.println("3 - Chile");
            System.out.println("4 - Perú");
            estadoMigratorio = sc.nextInt();

            switch (estadoMigratorio) {
                case 1:
                    System.out.print("Introduce el precio por hora: ");
                    precioHora = sc.nextDouble();
                    System.out.print("Introduce el porcentaje de retención del impuesto sobre la renta: ");
                    isr = sc.nextDouble();
                    System.out.print("Introduce el porcentaje de retención de sistema de asignación de casas: ");
                    infonavit = sc.nextDouble();
                    sueldoSemanal = precioHora * horasTrabajadas;
                    retenciones = sueldoSemanal * isr / 100 + sueldoSemanal * infonavit / 100;
                    sueldoSemanalfinal = sueldoSemanal - retenciones;
                    System.out.printf("El sueldo semanal es: $%.2f pesos mexicanos%n", sueldoSemanalfinal);
                    break;
                case 2:
                    System.out.print("Introduce el precio por hora en pesos colombianos: ");
                    precioHora = sc.nextDouble();
                    System.out.print("Introduce el porcentaje de retención del impuesto sobre la renta: ");
                    isr = sc.nextDouble();
                    System.out.print("Introduce el porcentaje de retención de sistema de asignación de casas: ");
                    infonavit = sc.nextDouble();
                    sueldoSemanal = precioHora * horasTrabajadas;
                    retenciones = sueldoSemanal * isr / 100 + sueldoSemanal * infonavit / 100;
                    sueldoSemanalfinal = sueldoSemanal - retenciones;
                    System.out.printf("El sueldo semanal es: $%.2f pesos colombianos%n", sueldoSemanalfinal);
                    System.out.printf("En pesos mexicanos es: $%.2f pesos mexicanos%n", sueldoSemanalfinal / 167.72);
                    break;
                case 3:
                    System.out.print("Introduce el precio por hora en pesos chilenos: ");
                    precioHora = sc.nextDouble();
                    System.out.print("Introduce el porcentaje de retención del impuesto sobre la renta: ");
                    isr = sc.nextDouble();
                    System.out.print("Introduce el porcentaje de retención de sistema de asignación de casas: ");
                    infonavit = sc.nextDouble();
                    sueldoSemanal = precioHora * horasTrabajadas;
                    retenciones = sueldoSemanal * isr / 100 + sueldoSemanal * infonavit / 100;
                    sueldoSemanalfinal = sueldoSemanal - retenciones;
                    System.out.printf("El sueldo semanal es: $%.2f  pesos chilenos%n", sueldoSemanalfinal);
                    System.out.printf("En pesos mexicanos es: $%.2f pesos mexicanos%n", sueldoSemanalfinal/20.68);
                    break;

                case 4:
                    System.out.print("Introduce el precio por hora en soles peruanos: ");
                    precioHora = sc.nextDouble();
                    System.out.print("Introduce el porcentaje de retención del impuesto sobre la renta: ");
                    isr = sc.nextDouble();
                    System.out.print("Introduce el porcentaje de retención de sistema de asignación de casas: ");
                    infonavit = sc.nextDouble();
                    sueldoSemanal = (precioHora*horasTrabajadas);
				    retenciones = (sueldoSemanal*isr/100+sueldoSemanal*infonavit/100);
				    sueldoSemanalfinal = sueldoSemanal-retenciones;
                    System.out.printf("El sueldo semanal es: $%.2f  soles peruanos%n", sueldoSemanalfinal);
                    System.out.printf("En pesos mexicanos es: $%.2f pesos mexicanos%n", sueldoSemanalfinal/3.77);
                    break;

                default:
                    System.out.println("Opción inválida");
			}
            System.out.println("Hay otro trabajador? (Si/No)");
            resp = sc.next();
            
        }while (!(resp.equals("No") || resp.equals("no") || resp.equals("NO") || resp.equals("N") || resp.equals("n")));
        sc.close();
        
    }
}

