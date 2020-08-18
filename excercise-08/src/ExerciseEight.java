// 8- Se requiere determinar el tiempo que tarda una persona en llegar de una
// ciudad a otra en bicicleta, considerando que lleva una velocidad constante.
// Realice un diagrama de flujo y pseudocódigo que representen el algoritmo para tal fin.

import java.util.Scanner;

public class ExerciseEight {
    public static void main(String[] args) {
        double kilometers, speed, time;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de Km a recorrer: ");
        kilometers = keyboard.nextDouble();

        System.out.print("Ingrese la velocidad que se utilizará en Km/h: ");
        speed = keyboard.nextDouble();

        time = kilometers / speed;

        System.out.printf("El tiempo que tardará en hacer el recorrido es %.2f horas", time);
    }
}
