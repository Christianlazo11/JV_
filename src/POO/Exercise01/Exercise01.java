package POO.Exercise01;

public class Exercise01 {

    public static void main(String[] args) {

        Cuenta data01 = new Cuenta("Carlos", 125.6);

        data01.Ingresar(200);
        System.out.println(data01);

        data01.retirar(250);
        System.out.println(data01);
    }
}
