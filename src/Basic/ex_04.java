package Basic;

public class ex_04 {
    public static void main(String[] args) {
        /*5) Muestra los números del 1 al 100 (ambos incluidos). Usa un bucle while.*/

        int data = 1;

        while(data != 101) {
            if(data == 51) {
                System.out.println();
            }
            System.out.print(data + "|");
            data++;
        }
    }
}
