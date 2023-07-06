package POO.Basic.Ex01;

public abstract class Cohete {
    private double altura;
    private double velocidad;

    public Cohete() {}
    public Cohete(double altura, double velocidad) {
        this.altura = altura;
        this.velocidad = velocidad;
    }

    public abstract void encenderMotor();

    public abstract void apagarMotor();

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
}
