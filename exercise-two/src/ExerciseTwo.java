//2- Una empresa importadora desea determinar cuántos dólares puede adquirir con equis cantidad
// de dinero mexicano. Realice un diagrama de flujo y pseudocódigo que representen el algoritmo
// para tal fin.

import java.util.Scanner;

public class ExerciseTwo {
    public static void main(String[] args) {

        double mexicanPesos, dollarAmount;
        final double DOLLAR_PRICE = 21.93;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Cantidad de pesos mexicanos a convertir: ");
        mexicanPesos = keyboard.nextDouble();

        dollarAmount = mexicanPesos / DOLLAR_PRICE;
        System.out.printf("Usted puede adquirir: %.2f dólares", dollarAmount);

    }
}
