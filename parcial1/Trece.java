package parcial1;
import java.util.Scanner;

public class Trece {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el precio por hora trabajada: ");
        double PH = sc.nextDouble();

        System.out.print("Ingrese las horas trabajadas: ");
        int HT = sc.nextInt();

        double ST = 0;

        if (HT <= 40) {
            ST = PH * HT;
        } 
        else if (HT <= 60) {
            int horasNormales = 40;
            int horasExtra = HT - horasNormales;
            double precioHoraExtra = PH * 1.5;

            ST = (PH * horasNormales) + (precioHoraExtra * horasExtra);
        }
        else{
            int horasmax = 20;
            double precioHoraExtra = PH * 1.5;

            ST = (horasmax * precioHoraExtra + (PH * 40));
            System.out.println("Excediste el máximo de horas extra, solo se te pagará el máximo (20)");
        }

        double descuentoInfonavit = 0;
        System.out.print("¿El trabajador tiene casa propia? (Si/No): ");
        String respuesta = sc.next();

        if (respuesta.equalsIgnoreCase("No")) {
            descuentoInfonavit = ST * 0.1;
        } 
        else if (respuesta.equalsIgnoreCase("Si")) {
            descuentoInfonavit = ST * 0.25;
        }

        double PensionAlim = 0.00;
        System.out.print("¿Paga pensión alimenticia? (Si/No): ");
        String respuesta1 = sc.next();

        if (respuesta1.equalsIgnoreCase("No")) {
            PensionAlim = 0;
        } 
        else if (respuesta1.equalsIgnoreCase("Si")) {
            
            System.out.print("Introduza el descuento de su Pensión: ");
            double varia = sc.nextDouble();

            PensionAlim = (ST * varia) / 100.00;

        }

        double sueldoTotal = ST - (descuentoInfonavit + PensionAlim);

        System.out.println("Sueldo del trabajador: $" + ST);
        System.out.println("Descuento por Infonavit: $" + descuentoInfonavit);
        System.out.println("Descuento por Pensión Alimenticia: $" + PensionAlim);
        System.out.println("Sueldo total: $" + sueldoTotal);

        sc.close();
    }
}