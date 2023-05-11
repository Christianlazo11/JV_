package Basic;

import java.util.Scanner;

public class ex_20 {
    public static void main(String[] args) {
        /*20) Pedir al usuario que nos escriba frases de forma infinita hasta que insertemos una cadena vacia. Mostrar
        la cadena resultante*/
        Scanner s = new Scanner(System.in);
        String input_data = "_";
        String total_data = "";

        while(!input_data.equals("")) {
            System.out.println("Ingrese una frase: ");
            input_data = s.nextLine();

            total_data += input_data;
        }

        System.out.println("La suma de las frases ingresadas es: " + total_data);
    }
}
