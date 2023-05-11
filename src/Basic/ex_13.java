package Basic;

import java.util.Scanner;

public class ex_13 {
    public static void main(String[] args) {
        /*13) Pide por teclado un número entero positivo (debemos controlarlo) y muestra  el número de cifras que tiene.
         Por ejemplo: si introducimos 1250, nos muestre que tiene 4 cifras. Tendremos que controlar si tiene una o mas
         cifras, al mostrar el mensaje.*/

        Scanner s = new Scanner(System.in);
        int input_num = 0;
        int length_num = 0;

        while(length_num <= 0) {
            System.out.println("Ingrese un número: ");
            input_num = s.nextInt();

            length_num = String.valueOf(input_num).length();
        }


        System.out.println("El número " + input_num + " Tiene " + length_num + " Cifras");
    }
}
