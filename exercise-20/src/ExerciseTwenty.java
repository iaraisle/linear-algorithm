// 20 - Diseñar algoritmo correspondiente que tras introducir una medida expresada
// en centímetros, la convierta a pulgadas (1 pulgada = 2,54cm).

import java.util.Scanner;

public class ExerciseTwenty {
    public static void main(String[] args) {

        double mesureCM;
        double totalConverted;
        final double CONVERSION_TO_INCHES = 2.54;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de centímetros a convertir en pulgadas: ");
        mesureCM = keyboard.nextDouble();

        totalConverted = mesureCM / CONVERSION_TO_INCHES;

        System.out.printf("El equivalente en pulgadas es: %.2f", totalConverted);
        //Otra manera de hacerlo:
        //System.out.println("El equivalente en pulgadas es: " + String.format("%.2f", totalConverted));
    }
}
