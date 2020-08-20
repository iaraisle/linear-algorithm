// 19 – El hotel “CamaArena” requiere determinar lo que le debe cobrar a un
// huésped por su estancia en una de sus habitaciones. Realice un diagrama de
// flujo y pseudo código que representen el algoritmo para determinar ese cobro.

import java.util.Scanner;

public class ExerciseEighteen {
    public static void main(String[] args) {

        double roomCost, amountDays, totalCost;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese el costo de la habitación:$ ");
        roomCost = keyboard.nextDouble();

        System.out.print("Ingrese la cantidad de días de estancia: ");
        amountDays = keyboard.nextDouble();

        totalCost = roomCost * amountDays;

        System.out.printf("El costo total es de $ %.2f", totalCost);
    }
}
