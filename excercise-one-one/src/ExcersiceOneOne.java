import sun.awt.geom.AreaOp;

import java.util.Scanner;

public class ExcersiceOneOne {

    public static void main(String[] args) {
        int catetoA, catetoB, area;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese valor del primer cateto: ");
        catetoA = keyboard.nextInt();

        System.out.print("Ingrese valor del segundo cateto: ");
        catetoB = keyboard.nextInt();

        area = (catetoA * catetoB) /2;

        System.out.println("El area del triangulo es " + area);
    }
}
