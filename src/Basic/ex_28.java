package Basic;

import java.util.Scanner;

public class ex_28 {
    public static void main(String[] args) {

        /*Fibonacci*/

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de números que quiere ver del Fibonacci");
        int cant = s.nextInt();


        int a = 0, b = 1, c = 0;

        for(int i = 0; i < cant; i++) {
            System.out.print(a + " | ");

            c = a + b ;
            a = b;
            b = c;
        }

        System.out.println();

        for(int i = 0; i < cant; i++) {

            System.out.println(factorial(i));
        }
    }

    public static int factorial(int n) {
        //Algoritmo de complejidad baja, baja eficiencia Big O exponencial.
        if (n < 2) return n;
        return (factorial(n - 1) + factorial(n - 2));
    }
}
