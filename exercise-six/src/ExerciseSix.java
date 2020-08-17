// 6- Se requiere determinar la hipotenusa de un triángulo rectángulo.
// ¿Cómo sería el diagrama de flujo y el pseudocódigo que representen el algoritmo
// para obtenerla? Recuerde que por Pitágoras se tiene que: C² = A² + B².

import java.util.Scanner;

public class ExerciseSix {
    public static void main(String[] args) {
        double sideA, sideB, result;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese la medida de uno de los lados del triángulo: ");
        sideA = keyboard.nextDouble();

        System.out.print("Ingrese la medida del otro lado del triángulo: ");
        sideB = keyboard.nextDouble();

        result = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2)); // √(A² + B²)

        System.out.printf("La hipótenusa del triángulo es: %.2f", result);
    }
}
