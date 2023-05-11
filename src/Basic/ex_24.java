package Basic;

import java.util.Scanner;

public class ex_24 {
    public static void main(String[] args) {
        /*24) Crea un enum con los días de la semana, pide un día de la semana e indica si es laboral o no (en el main).*/

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese el día de la semana: ");
        String dayData = s.nextLine();

        Days_week data = Days_week.valueOf(dayData.toUpperCase());

        switch (data) {
            case LUNES:
            case MARTES:
            case MIERCOLES:
            case JUEVES:
            case VIERNES:
                System.out.println("El día " + data + " SI es laboral");
                break;
            case SABADO:
            case DOMINGO:
                System.out.println("El día " + data + " NO es laboral");
                break;
            default:
                System.out.println("El día " + data + " No existe!!!");
                break;
        }
        System.out.println(data);
    }
}
