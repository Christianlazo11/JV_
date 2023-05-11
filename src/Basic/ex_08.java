package Basic;


import java.util.Scanner;

public class ex_08 {
    public static void main(String[] args) {
        /*8) Realiza una aplicación que nos pida un número de ventas a introducir, después nos pedirá tantas ventas
        por teclado como número de ventas se hayan indicado. Al final mostrara la suma de todas las ventas. Piensa que
         es lo que se repite y lo que no.*/

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese el número de ventas del día: $");
        int numero_ventas = s.nextInt();

        double ventas[] = new double[numero_ventas];
        double suma_ventas = 0;

        for(int i = 0; i < ventas.length; i++) {
            System.out.println("Ingrese el valor de la venta número: " + (i + 1));
            ventas[i] = s.nextDouble();
            suma_ventas += ventas[i];
        }

        System.out.println("El total de las ventas del día es: $" + suma_ventas);
    }
}
