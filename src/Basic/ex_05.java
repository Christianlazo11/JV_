package Basic;

public class ex_05 {
    public static void main(String[] args) {
        /*5) Muestra los números del 1 al 100 (ambos incluidos). Usa un bucle  Do while.*/

        int data = 1;

        do {
            if(data == 51) {
                System.out.println();
            }
            System.out.print(data + "|");
            data++;
        }while(data != 101);
    }
}
