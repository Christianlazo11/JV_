package Basic;

public class ex_27 {
    public static void main(String[] args) throws InterruptedException {
        /*27) Realiza un reloj digital que muestre la hora sin parar.
        Debe esperar un segundo real para darle mas realismo.*/

        int horas = 23;
        int minutos = 59;
        int segundos = 55;

        while(true) {

            if(horas < 10) {
                System.out.print("0");
            }
            System.out.print(horas + ":");
            if(minutos < 10) {
                System.out.print("0");
            }
            System.out.print(minutos + ":");
            if(segundos < 10) {
                System.out.print("0");
            }
            System.out.print(segundos);

            segundos++;

            if(segundos == 60) {
                segundos = 0;
                minutos++;
                if(minutos == 60) {
                    minutos = 0;
                    horas ++;
                    if (horas == 24) {
                        horas = 0;
                    }
                }
            }

            Thread.sleep(1000);
            System.out.println();
        }
    }
}
