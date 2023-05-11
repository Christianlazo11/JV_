package Basic;

import java.util.Scanner;

public class ex_18 {
    public static void main(String[] args) {
        /*27) Crear una aplicación que nos permite insertar números hasta que insertemos un -1. Calcular el numero de
        números introducidos.*/

        Scanner s = new Scanner(System.in);
        int num = 0;
        int cant = 0;

        while(num != -1) {
            System.out.println("Ingresa un número: ");
            num = s.nextInt();
            cant++;
        }

        System.out.println("La cantidad de números ingresados es: " + cant);


    }
}
