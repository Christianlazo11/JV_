package POO.Basic.Ex01;

public class CoheteCarga extends Cohete{

    public CoheteCarga(){
        super();
    }

    public CoheteCarga(double altura, double velocidad) {
        super(altura, velocidad);
    }

    @Override
    public void encenderMotor() {
        System.out.println("Encendiendo cohete de carga....");
    }

    @Override
    public void apagarMotor() {
        System.out.println("Apagando cohete de carga....");
    }
}
