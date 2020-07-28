import sun.awt.geom.AreaOp;

import java.util.Scanner;

public class ExcersiceOneOne {

    public static void main(String[] args) {

        System.out.println("Aplicación para calcular el area de un triangulo rectangulo");

        double base, altura, area;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese el valor de la base: ");
        base = keyboard.nextDouble();

        System.out.print("Ingrese valor de la altura: ");
        altura = keyboard.nextDouble();

        area = (base * altura) /2;

        System.out.println("El area del triangulo es " + String.format("%.2f",area));
    }
}
