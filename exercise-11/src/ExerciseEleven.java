//11 – La compañía de luz y sombras (CLS) requiere determinar el pago que debe
// realizar una persona por el consumo de energía eléctrica, la cual se mide en
// kilowatts (KW). Realice un diagrama de flujo y pseudo código que representen el
// algoritmo que permita determinar ese pago.

import java.util.Scanner;

public class ExerciseEleven {
    public static void main(String[] args) {
        System.out.println("Programa para calcular el costo del consumo de energía eléctrica");

        double kilowattPrice, kilowattConsumtion, totalCost;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese el costo por kilowatts:$ ");
        kilowattPrice = keyboard.nextDouble();

        System.out.print("Ingrese la cantidad de kilowatts consumidos: ");
        kilowattConsumtion = keyboard.nextDouble();

        totalCost = kilowattConsumtion * kilowattPrice;

        System.out.printf("El pago a realizar es de $ %.2f", totalCost);
    }
}
