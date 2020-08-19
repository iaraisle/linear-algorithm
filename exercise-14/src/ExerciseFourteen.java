// 14 – Una empresa desea determinar el monto de un cheque que debe proporcionar a
// uno de sus empleados que tendrá que ir por equis número de días a la ciudad de Monterrey;
// los gastos que cubre la empresa son: hotel, comida y 100.00 pesos diarios para otros gastos.
// El monto debe estar desglosado para cada concepto. Realice un diagrama de flujo y pseudocódigo
// que representen el algoritmo que determine el monto del cheque.

import java.util.Scanner;

public class ExerciseFourteen {
    public static void main(String[] args) {

        double amountDays;
        double hotelCost;
        double foodCost;
        double totalHotel;
        double totalFood;
        double totalCost;
        double otherExpenses;
        final double DAILY_AMOUNT = 100;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de días por viajar: ");
        amountDays = keyboard.nextDouble();

        System.out.print("Ingrese el costo del hotel por día: ");
        hotelCost = keyboard.nextDouble();

        System.out.print("Ingrese el costo de la comida por día: ");
        foodCost = keyboard.nextDouble();

        totalHotel = hotelCost * amountDays;
        totalFood = foodCost * amountDays;
        otherExpenses = amountDays * DAILY_AMOUNT;
        totalCost = totalHotel + totalFood + otherExpenses;

        System.out.printf("El monto del cheque debe ser de $ %.2f", totalCost);

    }
}
