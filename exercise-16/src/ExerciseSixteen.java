// 16 – Realice el diagrama de flujo y pseudocódigo que representen el
// algoritmo para encontrar el área de un cuadrado.

import java.util.Scanner;

public class ExerciseSixteen {
    public static void main(String[] args) {

        System.out.println("Programa para calcular el área de un cuadrado");
        double squareSide, squareArea;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese la medida de un lado del cuadrado en cm: ");
        squareSide = keyboard.nextDouble();

        squareArea = Math.pow(squareSide, 2);

        System.out.printf("El área del cuadrado es de %.2f", squareArea);
    }
}
