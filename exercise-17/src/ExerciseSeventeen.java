// 17 – Realice el diagrama de flujo y pseudocódigo que representen el algoritmo para
// determinar el promedio que obtendrá un alumno considerando que realiza tres exámenes,
// de los cuales el primero  y el segundo tienen una ponderación de 25%, mientras que el
// tercero de 50%.

import java.util.Scanner;

public class ExerciseSeventeen {
    public static void main(String[] args) {

        double noteOne, noteTwo, noteThree, percentOne = 0.25, percentTwo = 0.50, noteResult;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese nota del primer examen: ");
        noteOne = keyboard.nextDouble();

        System.out.print("Ingrese nota del segundo examen: ");
        noteTwo = keyboard.nextDouble();

        System.out.print("Ingrese nota del tercer examen: ");
        noteThree = keyboard.nextDouble();

        noteResult = (noteOne * percentOne) + (noteTwo * percentOne) + (noteThree * percentTwo);

        System.out.printf("El promedio del alumno es de %.2f", noteResult);

    }
}
