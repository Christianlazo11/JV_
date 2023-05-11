package Basic;

import java.util.Scanner;

public class ex_10 {
    public static void main(String[] args) {
        /*10) Escribe una aplicación con un String que contenga una contraseña cualquiera. Después se te pedirá que
         introduzcas la contraseña, con 3 intentos. Cuando aciertes ya no pedirá mas la contraseña y mostrara un
         mensaje diciendo «Enhorabuena». Piensa bien en la condición de salida (3 intentos y si acierta sale, aunque
         le queden intentos).*/

        String password = "H0l@Mund○";
        Scanner s = new Scanner(System.in);
        boolean isPass = false;
        int cont = 0;

        while(!isPass && cont < 3) {
            System.out.println("Ingresa tu contraseña: ");
            String data_input = s.nextLine();
            if(password.equals(data_input)) {
                isPass = true;
            } else {
                cont++;
            }
        }

        if(cont == 3 && !isPass) {
            System.out.println("Número de intentos fallidos superado, intentalo más tarde :)");
        } else {
            System.out.println("Contraseña correcta, Bienvenid@!!!");
        }



    }
}
