//13 – Realice un diagrama de flujo y pseudocódigo que representen el algoritmo
// para determinar cuánto dinero ahorra una persona en un año si considera que
// cada semana ahorra 15% de su sueldo (considere cuatro semanas por mes y que no cambia el sueldo).

import java.util.Scanner;

public class ExerciseThirteen {
    public static void main(String[] args) {
        System.out.println("Programa para calcular el total en un año de un ahorro de semanal del 15%");
        double weeklySalary, weeklyPercentage = 0.15, weeklySavings, totalSavings, amountWeeks = 48;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingresar salario semanal:$ ");
        weeklySalary = keyboard.nextDouble();

        weeklySavings = weeklySalary * weeklyPercentage;
        totalSavings = weeklySavings * amountWeeks;

        System.out.printf("La cantidad ahorrada en un año es de $ %.2f", totalSavings);


    }
}
