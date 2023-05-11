package Basic;

import java.util.Scanner;

public class ex_21 {
    public static void main(String[] args) {
        /*21) Convertir una frase a mayúsculas o minúsculas, que daremos opción a que el usuario lo pida y
        mostraremos el resultado por pantalla.*/

        Scanner s = new Scanner(System.in);

        String frase, resultado;
        int opción;

        System.out.println("Ingrese una frase: ");
        frase = s.nextLine();

        System.out.println("Elige una opción para transformar la frase ");
        System.out.println("1 => Mayúsculas");
        System.out.println("2 => Minúsculas");

        opción = s.nextInt();

        if(opción == 1) {
            resultado = frase.toUpperCase();
        } else if (opción == 2) {
            resultado = frase.toLowerCase();
        } else {
            resultado = "Opción inválida";
        }

        System.out.println("El resultado de la operación es: " + resultado);
    }
}
