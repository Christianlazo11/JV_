package Basic;

public class ex_01 {
    public static void main(String[] args) {
         /*1) Declara dos variables numéricas (con el valor que desees), muestra por consola la suma, resta, multiplicación,
        división y módulo (resto de la división)*/

        int val01 = 16;
        int val02 = 15;

        System.out.println("Suma: " + (val01 + val02));
        System.out.println("Resta: " + (val01 - val02));
        System.out.println("Multiplicación: " + (val01 * val02));
        System.out.println("División: " +  (double)val01 / (double) val02);
        System.out.println("Módulo: " + (val01 % val02));

    }
}
