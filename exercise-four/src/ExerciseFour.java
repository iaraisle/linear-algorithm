// 4- Un estacionamiento requiere determinar el cobro que debe aplicar a las personas
// que lo utilizan. Considere que el cobro es con base en las horas que lo disponen y que
// las fracciones de hora se toman como completas y realice un diagrama de flujo y pseudocódigo
// que representen el algoritmo que permita determinar el cobro.

import java.util.Scanner;

public class ExerciseFour {
    public static void main(String[] args) {
        double priceHour, amountHour, result;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Indique el precio por hora: ");
        priceHour = keyboard.nextDouble();

        System.out.print("Ingrese el total de horas en el estacionamiento: ");
        amountHour = keyboard.nextDouble();

        result = amountHour * priceHour;
        System.out.printf("El total a bonar es de: %.2f", result);
    }
}
