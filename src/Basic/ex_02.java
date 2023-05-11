package Basic;

import java.util.Scanner;

public class ex_02 {
    public static void main(String[] args) {
        /*2) Haz una aplicación que calcule el área de un círculo(pi*R2). El radio se pedirá por teclado (recuerda pasar
         de String a double con Double.parseDouble). Usa la constante PI y el método pow de Math.*/

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese el valor del radio: ");
        double radio = s.nextDouble();

        System.out.println("El área del círculo es: " + (Math.PI * Math.pow(radio, 2)));
    }
}
