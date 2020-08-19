//15 – Se desea calcular la potencia eléctrica de circuito de la figura 1.6.(Hay que averiguar la intensidad)
// Realice un diagrama de flujo y el pseudocódigo que representen el algoritmo
// para resolver el problema. Considere que: P = V*I y V = R*I.

import java.util.Scanner;

public class ExerciseFifteen {
    public static void main(String[] args) {

        double voltage, intensity, resistance;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de voltaje: ");
        voltage = keyboard.nextDouble();

        System.out.print("Ingrese la resistencia en OHMS: ");
        resistance = keyboard.nextDouble();

        intensity = voltage / resistance;

        System.out.printf("El resultado es Intensidad = " + intensity);
    }
}
