package Basic;

public class ex_07 {
    public static void main(String[] args) {
        /*7) Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3. Utiliza el bucle que desees.*/
        System.out.println("For");
        for(int i = 1; i <= 100; i++) {
            if(i % 2 == 0 && i % 3 == 0){
                System.out.print(i + "|");
            }
        }
        System.out.println();
        System.out.println("While");

        int cont = 1;

        while(cont != 101) {

            if(cont % 2 == 0 && cont % 3 == 0) {
                System.out.print(cont + "|");
            }
            cont++;
        }
        System.out.println();
        System.out.println("Do While");

        cont = 1;

        do {
            if(cont % 2 == 0 && cont % 3 == 0) {
                System.out.print(cont + "|");
            }
            cont++;
        }while(cont != 101);
    }
}
