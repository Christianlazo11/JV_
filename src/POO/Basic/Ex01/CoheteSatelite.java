package POO.Basic.Ex01;

public class CoheteSatelite extends Cohete{

    public CoheteSatelite() {
        super();
    }

    public CoheteSatelite(double altura, double velocidad) {
        super(altura,velocidad);
    }

    @Override
    public void encenderMotor() {
        System.out.println("Encendiendo motor de satélite.....");
    }

    @Override
    public void apagarMotor() {
        System.out.println("Apagando moto de sátelite.....");
    }
}
