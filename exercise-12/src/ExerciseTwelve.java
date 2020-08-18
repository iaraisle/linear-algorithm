// 12 – Realice un diagrama de flujo y pseudocódigo que representen el
// algoritmo para determinar cuánto pagará finalmente una persona por un
// artículo equis, considerando que tiene un descuento de 20%, y debe pagar 15%
// de IVA (debe mostrar el precio con descuento y el precio final).

import java.util.Scanner;

public class ExerciseTwelve {
    public static void main(String[] args) {

        double originalPrice, discount = 1.20, iva = 1.15, discountPrice, ivaPrice, finalPrice;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Ingrese el precio original del producto:$ ");
        originalPrice = keyboard.nextDouble();

        discountPrice = originalPrice * discount;
        System.out.printf("El precio con descuento es:$ %.2f", discountPrice);

        finalPrice = discountPrice * iva;
        System.out.printf("\nEl precio total con descuento + iva es:$ %.2f",finalPrice);

    }
}
