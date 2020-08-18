// 10 – La CONAGUA requiere determinar el pago que debe realizar una persona por el total
// de metros cúbicos que consume de agua. Realice un diagrama de flujo y pseudocódigo que
// representen el algoritmo que permita determinar ese pago.

import java.util.Scanner;

public class ExerciseTen {
    public static void main(String[] args) {

        System.out.println("Programa para calcular el precio de los centímetros cubicos utilizados");

        double quanCubic, priceCubic, totalPrice;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese el precio por centímetro cúbico:$ ");
        priceCubic = keyboard.nextDouble();

        System.out.print("Ingrese cantidad de centímetros cúbicos utilizados: ");
        quanCubic = keyboard.nextDouble();

        totalPrice = quanCubic * priceCubic;

        System.out.printf("El total a pagar es de $ %.2f", totalPrice);
    }
}
