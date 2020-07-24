import java.util.Scanner;

public class EjercicioUno {
    public static void main(String[] args) {
        System.out.println("Programa que suma dos numeros dados");
        //Defino las variables
        int firstNumber;
        int secondNumber;
        int result;

        //habilito el ingreso de datos por teclado
        Scanner keyboard = new Scanner(System.in);

        //leo los datos ingresados
        System.out.print("Ingrese primer numero a calcular: ");
        firstNumber = keyboard.nextInt();

        System.out.print("Ingrese segundo numero a calcular: ");
        secondNumber = keyboard.nextInt();

        //realizo el proceso y lo guardo en la variable result
        result = firstNumber + secondNumber;

        //Muestro el resultado por pantalla
        System.out.println("El resultado es: " + result);

    }
}
