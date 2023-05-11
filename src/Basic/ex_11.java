package Basic;

import java.util.Scanner;

public class ex_11 {
    public static void main(String[] args) {
        /*11) Crea una aplicación que nos pida un día de la semana y que nos diga si es un dia laboral o no.
        Usa un switch para ello.*/

        Scanner s = new Scanner(System.in);


        System.out.println("Ingrese un día de la semana: ");
        String day_week = s.nextLine();

        switch (day_week.toUpperCase()) {
            case "LUNES":
            case "MARTES":
            case "MIERCOLES":
            case "JUEVES":
            case "VIERNES":
                System.out.println("Es día Laboral xD");
                break;
            case "SABADO":
            case "DOMINGO":
                System.out.println("El día es para descansar XDDDD");
                break;
            default:
                System.out.println("El día ingresado no existe!!!");
                break;
        }

    }
}
