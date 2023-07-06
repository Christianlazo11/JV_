package POO.Basic.Ex01;

public class Main {

    public static void main(String[] args) {

        Cohete cohete01 = new CoheteCarga(1500, 180);

        cohete01.encenderMotor();
        cohete01.apagarMotor();

        Cohete cohete02 = new CoheteSatelite(2500, 320);

        cohete02.encenderMotor();
        cohete02.apagarMotor();

    }
}
