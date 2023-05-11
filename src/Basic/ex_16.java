package Basic;

public class ex_16 {
    public static void main(String[] args) {
        /*16) Recorre el String del ejercicio 22 y transforma cada carácter a su código ASCII. Muestralos en linea recta,
        separados por un espacio entre cada carácter.*/


        String cadena = "La lluvia en Sevilla es una maravilla";

        for(int i = 0; i < cadena.length(); i++) {
            System.out.print((int)cadena.charAt(i) + " | ");
        }
    }
}
