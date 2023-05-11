package Basic;

import java.util.Scanner;

public class ex_09 {
    public static void main(String[] args) {
        /*9) Lee un número por teclado y comprueba que este numero es mayor o igual que cero, si no lo es
        lo volverá a pedir (do while), después muestra ese número por consola.*/

        Scanner s = new Scanner(System.in);
        boolean isNum = false;
        int num = 0;
        while(!isNum) {
            System.out.println("Ingrese un número: ");
            num = s.nextInt();

            if(num >= 0) {
                isNum = true;
            }
        }

        System.out.println("El número ingresado es: " + num);

    }
}
