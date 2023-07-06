package POO.Basic.Ex02;

public class Propulsor {

    private int potencia;
    private String nombre;

    public Propulsor(){}

    public Propulsor(int potencia, String nombre) {
        this.potencia = potencia;
        this.nombre =  nombre;
    }

    public void encender() {
        System.out.println("Encendiendo propulsor...");
    }

    public void apagar(){
        System.out.println("Apagando propulsor...");
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Propulsor{" +
                "potencia=" + potencia +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
