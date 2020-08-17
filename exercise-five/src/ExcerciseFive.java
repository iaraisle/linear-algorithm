//5- Pinturas “La brocha gorda” requiere determinar cuánto cobrar por trabajos de pintura.
// Considere que se cobra por m2 y realice un diagrama de flujo y pseudocódigo que representen
// el algoritmo que le permita ir generando presupuestos para cada cliente.

import java.util.Scanner;

public class ExcerciseFive {
    public static void main(String[] args) {

        double amountMeter, amountPaint, result;

        System.out.println("Programa para calcular cuánto cobrar por un trabajo de pintura");

        Scanner keyboard = new Scanner(System.in);

        System.out.printf("Ingrese el precio por metro de pintura: ");
        amountMeter = keyboard.nextDouble();

        System.out.printf("Ingrese cantidad de metros a pintar: ");
        amountPaint = keyboard.nextDouble();

        result = amountPaint * amountMeter;

        System.out.printf("El total a cobrar por el trabajo es: %.2f", result);
    }
}
