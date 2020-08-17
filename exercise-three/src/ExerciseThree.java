// 3- Una empresa que contrata personal requiere de terminar la edad de las personas que
// solicitan trabajo, pero cuando se les realiza la entrevista sólo se les pregunta el año
// en que nacieron. Realice el diagrama de flujo y pseudocódigo que representen el algoritmo
// para solucionar este problema.

import java.time.Year;
import java.util.Scanner;

public class ExerciseThree {
    public static void main(String[] args) {

        int birthday, currentYear;

        System.out.println("Programa para calcular la edad de los empleados. ");

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese el año de nacimiento: ");
        birthday = keyboard.nextInt();

        currentYear = Year.now().getValue();

        System.out.printf("La edad del empleado es: " + (currentYear - birthday) + " años.");

    }
}
