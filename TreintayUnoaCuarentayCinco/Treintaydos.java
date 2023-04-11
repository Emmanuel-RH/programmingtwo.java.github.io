package TreintayUnoaCuarentayCinco;

/** Programa 32
 * Author: José Emmanuel Reyes Hernández
 * Intrucción: Calcular el sueldo de N trabajadores tomando en cuenta lo siguiente. Se considera lo mismo en horas normales y horas 
 * extras que el ejercicio anterior. Todos los impuestos se calculan sobre las horas normales trabajadas. Si el trabajador tiene infonavit 
 * y no ha obtenido la casa se le decrementa el 10% de su sueldo, si ya tiene la casa el descuento es del 25%. El trabajador puede tener 
 * descuento por pensión alimenticia y el porcentaje puede variar.
 * Date: 29/Marzo/2023
*/ 

import java.io.*; //Importación de libreria para guardar en en el búfer y leer caracteres que leen a la perfección caracteres, matrices o líneas.

public class Treintaydos {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double decremento;
		double desc_pensalim;
		double hora;
		double horaextra;
		double horanormal;
		double horas;
		double horas1;
		int i;
		String resp;
		String resp2;
		String resp3;
		String resp4;
		double sueldo;
		double sueldoextra;
		double sueldonormal;
		sueldo = 0;
		hora = 0;
		i = 0;
		decremento = 0;

		do {
			i = i+1;
			System.out.println("Cuantas horas laboro el tarabajador "+i+"?");
			hora = Double.parseDouble(bufEntrada.readLine());
			System.out.println("Cuanto gana por hora?");
			sueldo = Double.parseDouble(bufEntrada.readLine());
			System.out.println("Tiene Infonavit? (Si/No)");
			resp = bufEntrada.readLine();
			if (hora<=40) {
				if (resp.equals("Si")) {
					System.out.println("Ya ha obtenido la casa?(Si/No)");
					resp2 = bufEntrada.readLine();
					if (resp2.equals("Si")) {
						System.out.println("Tiene descuento por pension alimenticia?(Si/No)");
						resp3 = bufEntrada.readLine();
						if (resp3.equals("Si")) {
							System.out.println("Cuanto descuento es por pension?");
							desc_pensalim = Double.parseDouble(bufEntrada.readLine());
							horas = hora*sueldo;
							horas1 = (horas*desc_pensalim)/100;
							decremento = (horas*0.25);
							System.out.println("Sueldo final es de $"+(horas-decremento-horas1));
						} else {
							horas = hora*sueldo;
							decremento = horas-(horas*0.25);
							System.out.println("Sueldo es de $"+decremento);
						}
					} else {
						System.out.println("Tiene descuento por pension alimenticia?(Si/No)");
						resp3 = bufEntrada.readLine();
						if (resp3.equals("Si")) {
							System.out.println("Cuanto descuento es por pension?");
							desc_pensalim = Double.parseDouble(bufEntrada.readLine());
							horas = hora*sueldo;
							horas1 = (horas*desc_pensalim)/100;
							decremento = (horas*0.10);
							System.out.println("Sueldo final es de $"+(horas-decremento-horas1));
						} else {
							horas = hora*sueldo;
							decremento = horas-(horas*0.10);
							System.out.println("Sueldo final es de $"+decremento);
						}
					}
				} else {
					System.out.println("Tiene descuento por pension alimenticia?(Si/No)");
					resp3 = bufEntrada.readLine();
					if (resp3.equals("Si")) {
						System.out.println("Cuanto descuento es por pension?");
						desc_pensalim = Double.parseDouble(bufEntrada.readLine());
						horas = hora*sueldo;
						horas = horas-(horas*desc_pensalim)/100;
						System.out.println("Sueldo final es de $"+horas);
					} else {
						horas = hora*sueldo;
						System.out.println("Sueldo es de $"+horas);
					}
				}
			}
			if (hora<=60 && hora>40) {
				if (resp.equals("Si")) {
					System.out.println("Ya ha obtenido la casa?(Si/No)");
					resp2 = bufEntrada.readLine();
					if (resp2.equals("Si")) {
						System.out.println("Tiene descuento por pension alimenticia?(Si/No)");
						resp3 = bufEntrada.readLine();
						if (resp3.equals("Si")) {
							System.out.println("Cuanto descuento es por pension?");
							desc_pensalim = Double.parseDouble(bufEntrada.readLine());
							horas = 40*sueldo;
							horas1 = (horas*desc_pensalim)/100;
							decremento = (horas*0.25);
							hora = hora-40;
							hora = hora*sueldo;
							System.out.println("Sueldo final es de $"+(horas-decremento-horas1+(hora*1.5)));
						} else {
							horas = 40*sueldo;
							decremento = (horas*0.25);
							horas = horas-decremento;
							hora = (hora-40)*sueldo;
							System.out.println("Sueldo es de $"+horas+(hora*1.5));
						}
					} else {
						System.out.println("Tiene descuento por pension alimenticia?(Si/No)");
						resp3 = bufEntrada.readLine();
						if (resp3.equals("Si")) {
							System.out.println("Cuanto descuento es por pension?");
							desc_pensalim = Double.parseDouble(bufEntrada.readLine());
							horas = hora*sueldo;
							horas1 = (horas*desc_pensalim)/100;
							decremento = (horas*0.10);
							System.out.println("Sueldo final es de $"+(horas-decremento-horas1));
						} else {
							horas = hora*sueldo;
							decremento = horas-(horas*0.10);
							System.out.println("Sueldo final es de $"+decremento);
						}
					}
				} else {
					System.out.println("Tiene descuento por pension alimenticia?(Si/No)");
					resp3 = bufEntrada.readLine();
					if (resp3.equals("Si")) {
						System.out.println("Cuanto descuento es por pension?");
						desc_pensalim = Double.parseDouble(bufEntrada.readLine());
						horas = 40*sueldo;
						horas1 = (horas*desc_pensalim)/100;
						hora = hora-40;
						hora = hora*sueldo;
						System.out.println("Sueldo final es de $"+(horas-horas1+(hora*1.5)));
					} else {
						horaextra = hora-40;
						sueldonormal = sueldo*40;
						sueldoextra = (horaextra*sueldo)*1.5;
						horas = sueldoextra+sueldonormal;
						System.out.println("Sueldo es de $"+horas);
					}
				}
			}
			if (hora>60) {
				if (resp.equals("Si")) {
					System.out.println("Ya ha obtenido la casa?(Si/No)");
					resp2 = bufEntrada.readLine();
					if (resp2.equals("Si")) {
						System.out.println("Tiene descuento por pension alimenticia?(Si/No)");
						resp3 = bufEntrada.readLine();
						if (resp3.equals("Si")) {
							System.out.println("Cuanto descuento es por pension?");
							desc_pensalim = Double.parseDouble(bufEntrada.readLine());
							horanormal = sueldo*40;
							horaextra = (sueldo*1.5)*20;
							horas1 = (horanormal*desc_pensalim)/100;
							decremento = (horanormal*0.25);
							System.out.println("Sueldo final es de $"+((horanormal-horas1)-decremento+(horaextra)));
						} else {
							horanormal = sueldo*40;
							horanormal = horanormal-horanormal*0.25;
							horaextra = (sueldo*1.5)*20;
							System.out.println("Sueldo es de: "+horanormal+horaextra);
						}
					} else {
						System.out.println("Tiene descuento por pension alimenticia?(Si/No)");
						resp3 = bufEntrada.readLine();
						if (resp3.equals("Si")) {
							System.out.println("Cuanto descuento es por pension?");
							desc_pensalim = Double.parseDouble(bufEntrada.readLine());
							horas = hora*sueldo;
							horas1 = (horas*desc_pensalim)/100;
							decremento = (horas*0.10);
							System.out.println("Sueldo final es de $"+((horas-decremento)-horas1));
						} else {
							horas = hora*sueldo;
							decremento = horas-(horas*0.10);
							System.out.println("Sueldo final es de $"+decremento);
						}
					}
				} else {
					System.out.println("Tiene descuento por pension alimenticia?(Si/No)");
					resp3 = bufEntrada.readLine();
					if (resp3.equals("Si")) {
						System.out.println("Cuanto descuento es por pension?");
						desc_pensalim = Double.parseDouble(bufEntrada.readLine());
						horanormal = sueldo*40;
						horaextra = (sueldo*1.5)*20;
						horas1 = (horanormal*desc_pensalim)/100;
						System.out.println("Sueldo final es de $"+(horanormal-horas1)+(horaextra));
					} else {
						horanormal = sueldo*40;
						horaextra = (sueldo*1.5)*20;
						System.out.println("Sueldo es de: "+horanormal+horaextra);
					}
				}
			}
			System.out.println("Hay otro trabajador? (Si/No)");
			resp4 = bufEntrada.readLine();
		} while (!(resp4.equals("No") || resp4.equals("no") || resp4.equals("NO") || resp4.equals("N") || resp4.equals("n")));
	}
}
