package POO.Exercise01;

public class Cuenta {

    private String titular;
    private double cantidad;

    public Cuenta(){
    }

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public void Ingresar(double valor) {
        if(valor > 0) {
            this.cantidad += valor;
            System.out.println("Se ingreso: " + valor);
        }
    }

    public void retirar(double valor) {
        this.cantidad -= valor;
        if(this.cantidad < 0) {
            this.cantidad = 0;
        }

        System.out.println("Se retiro: " + valor);
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "titular='" + this.titular + '\'' +
                ", cantidad=" + this.cantidad +
                '}';
    }
}
