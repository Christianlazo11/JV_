package Basic;

import java.util.Scanner;

public class ex_22 {
    public static void main(String[] args) {
        /*22) Dada una cadena, extraer la cuarta y quinta letra usando el método substring.*/

        Scanner s = new Scanner(System.in);
        String cadena = "", resultado;
        boolean isValid = false;

        while (!isValid) {
            System.out.println("Ingresa una frase: ");
            cadena = s.nextLine();

            if(cadena.length() >= 5) {
                isValid = true;
            }
        }



        resultado = cadena.substring(3,5);

        System.out.println("La cuarta y quinta letra de la frase: " + resultado);

    }
}
