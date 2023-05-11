package Basic;

import java.util.Scanner;

public class ex_03 {
    public static void main(String[] args) {
        /*3) Lee un número por teclado y muestra por consola, el carácter al que pertenece en la tabla ASCII.
        Por ejemplo: si introduzco un 97, me muestre una a, igualmente realizarlo de manera inversa*/

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        int num = s.nextInt();

        System.out.println("El número " + num + " Pertenece al caracter: " + ((char)num));

        System.out.println("Ingrese un caracter: ");
        char data = s.next().charAt(0);

        System.out.println("El caracter " + data + " Pertenece al número: "+ ((int)data));
    }
}
