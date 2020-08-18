// 9/18 - Se requiere determinar el costo que tendrá realizar una llamada telefónica
// con base en el tiempo que dura la llamada y en el costo por minuto. Realice un diagrama
// de flujo y pseudocódigo que representen el algoritmo para tal fin.

import java.util.Scanner;

public class ExerciseNine {
    public static void main(String[] args) {
        System.out.println("Programa para calcular el costo de una llamada");

        double minuteCost, callDuration, callCost;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese el costo por minuto:$ ");
        minuteCost = keyboard.nextDouble();

        System.out.print("Ingrese la duración de la llamada en minutos: ");
        callDuration = keyboard.nextDouble();

        callCost = callDuration * minuteCost;

        System.out.printf("El costo de la llamada es de $ %.2f", callCost);
    }
}
