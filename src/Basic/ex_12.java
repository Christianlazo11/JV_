package Basic;

import java.util.Scanner;

public class ex_12 {
    public static void main(String[] args) {
        /*12) Pide por teclado dos número y genera 10 números aleatorios entre esos números. Usa el método Math.random
        para generar un número entero aleatorio (recuerda el casting de double a int).*/

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        int num01 = s.nextInt();

        System.out.println("Ingrese el segundo número: ");
        int num02 = s.nextInt();

        for(int i = 1; i <= 10; i++) {
            int num_random = (int) Math.floor(Math.random() * (num02 - num01 + 1) + num01);
            System.out.println(num_random);
        }
    }
}
