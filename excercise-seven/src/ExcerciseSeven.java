//7- La compañía de autobuses “La curva loca” requiere determinar el costo que
// tendrá el boleto de un viaje sencillo, esto basado en los kilómetros por recorrer
// y en el costo por Kilómetro. Realice un diagrama de flujo y pseudo código que representen
// el algoritmo para tal fin.

import java.util.Scanner;

public class ExcerciseSeven {
    public static void main(String[] args) {
        double kmPrice, kmAmount, totalAmount;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Programa para calcular el precio de un boleto de viaje sencillo");

        System.out.print("Ingrese el precio por Km: ");
        kmPrice = keyboard.nextDouble();

        System.out.print("Ingrese cantidad de Km por recorrer: ");
        kmAmount = keyboard.nextDouble();

        totalAmount = kmAmount * kmPrice;

        System.out.printf("El costo del boleto es de %.2f pesos", totalAmount);
    }
}
