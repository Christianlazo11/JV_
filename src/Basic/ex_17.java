package Basic;

import java.util.Scanner;

public class ex_17 {
    public static void main(String[] args) {
        /*25 Realizar la suma del 1 al numero que indiquemos, este debe ser mayor que 1.*/

        Scanner s = new Scanner(System.in);
        int num = 0;
        int sum = 0;

        while(num <= 1) {
            System.out.println("Ingresa un número: ");
            num = s.nextInt();
        }

        for(int i = 1; i <= num; i++) {
            sum += i;
        }

        System.out.println("La suma de los números desde 1 hasta " + num + " Es: " + sum);

    }
}
