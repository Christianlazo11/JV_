package POO.Exercise03;

import java.util.Scanner;

public class Exercise03 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int longitud = 0;

        while(longitud <= 0) {
            System.out.println("Ingrese la longitud del Array de Contraseñas: ");
            longitud = s.nextInt();
        }

        Password[] data = new Password[longitud];
        boolean[] esFuerte = new boolean[longitud];

        for(int i = 0; i < data.length; i++) {

            int length = 0;
            while(length <= 0) {
                System.out.println("Indique la longitud para la contraseña # " + (i + 1));
                length = s.nextInt();
            }

            data[i] = new Password(length);
            esFuerte[i] = data[i].esFuerte();
        }

        for(int i = 0; i < data.length; i++) {
            System.out.println(data[i].getContraseña() + " => " + esFuerte[i]);
        }


    }
}
