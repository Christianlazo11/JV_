package POO.Exercise02;

import java.util.Random;

public class Persona {

    private String nombre = "";
    private String sexo = "H";
    private int edad = 0, DNI;
    private double peso = 0, altura = 0;

    public Persona() {
        generaDNI();
    }

    public Persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        generaDNI();
    }

    public Persona(String nombre, String sexo, int edad, double peso, double altura) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        generaDNI();
    }

    public int calcularIMC() {
        double resultado = this.peso / Math.pow(this.altura, 2);

        if(resultado < 20) {
            return -1;
        } else if (resultado >= 20 && resultado <= 25) {
            return 0;
        } else if (resultado > 25) {
            return 1;
        } else {
            return 5;
        }
    }

    public boolean esMayorDeEdad() {
        if(this.edad >= 18) return true;
        return false;
    }

    public void comprobarSexo(String sexo) {
        if(this.sexo.equalsIgnoreCase(sexo)) {
            System.out.println("Sexo correcto!!!");
        } else {
            System.out.println("Sexo incorrecto!!!");
        }
    }

    public void generaDNI() {
        Random r = new Random();

        int DNI_Ge = r.nextInt(90000000) + 10000000;
        this.DNI = DNI_Ge;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", sexo='" + sexo + '\'' +
                ", edad=" + edad +
                ", DNI=" + DNI +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDNI() {
        return DNI;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
