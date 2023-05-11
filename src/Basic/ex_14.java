package Basic;

import java.util.Arrays;

public class ex_14 {
    public static void main(String[] args) {
        /*14) Muestra los números primos entre 1 y 100.*/

    boolean[] esPrimo = new boolean[101];
    Arrays.fill(esPrimo, true);
    esPrimo[0] = false;
    esPrimo[1] = false;

    for(int i = 2; i <= 100; i++) {

        if(esPrimo[i]) {
            System.out.println(i);

            for(int j = i * 2; j <= 100; j += i) {
                esPrimo[j] = false;
            }
        }
    }

    }
}
