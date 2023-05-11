package Basic;

import java.util.Scanner;

public class ex_19 {
    public static void main(String[] args) {
        /*19) Eliminar los espacios de una frase pasada por consola por el usuario.*/

        Scanner s = new Scanner(System.in);

        System.out.println("Ingresa una frase: ");
        String frase = s.nextLine();
        String frase02 = "";

        for(int i = 0; i < frase.length(); i++) {
            if(frase.charAt(i) != ' ' ) {
                frase02 += frase.charAt(i);
            }
        }

        System.out.println("La frase sin espacio es: " + frase02);

        System.out.println("Segunda Opción");

        String frase03 = frase.replaceAll(" ", "");
        System.out.println("Otra forma => " + frase03);
    }
}
