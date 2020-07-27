import sun.awt.geom.AreaOp;

import java.util.Scanner;

public class ExcersiceOneOne {

    public static void main(String[] args) {
<<<<<<< HEAD

        System.out.println("Aplicación para calcular el area de un triangulo rectangulo");

        int base, altura, area;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese el valor de la base: ");
        base = keyboard.nextInt();

        System.out.print("Ingrese valor de la altura: ");
        altura = keyboard.nextInt();

        area = (base * altura) /2;
=======
        int catetoA, catetoB, area;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese valor del primer cateto: ");
        catetoA = keyboard.nextInt();

        System.out.print("Ingrese valor del segundo cateto: ");
        catetoB = keyboard.nextInt();

        area = (catetoA * catetoB) /2;
>>>>>>> e3a37fa64b3c674221c65e8dc687c691cbad4535

        System.out.println("El area del triangulo es " + area);
    }
}
