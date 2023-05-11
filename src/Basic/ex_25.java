package Basic;

import java.util.Scanner;

public class ex_25 {
    public static void main(String[] args) {
        /*25) Modifica el anterior enum para indicar que es día laborable directamente (usar toString).*/

        Scanner s = new Scanner(System.in);

        System.out.println("Ingresa un día de la semana: ");
        String dayData = s.nextLine();

        Days_week data = Days_week.valueOf(dayData.toUpperCase());

        System.out.println(data);
    }
}
