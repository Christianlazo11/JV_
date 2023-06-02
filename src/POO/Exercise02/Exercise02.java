package POO.Exercise02;

import java.util.Scanner;

public class Exercise02 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String nombre, sexo;
        int edad;
        double altura, peso;

        System.out.println("Ingrese su nombre: ");
        nombre = s.nextLine();

        System.out.println("Ingrese su sexo: ");
        sexo = s.nextLine();

        System.out.println("Ingrese su edad: ");
        edad = s.nextInt();

        System.out.println("Ingrese su peso: ");
        peso = s.nextDouble();

        System.out.println("Ingrese su altura en cm: ");
        altura = s.nextDouble();

        Persona persona01 = new Persona(nombre, edad, sexo);
        Persona persona02 = new Persona(nombre, sexo, edad, peso, altura);
        Persona persona03 = new Persona();

        pesoIdeal(persona01);
        mayorDeEdad(persona01);
        persona01.comprobarSexo(sexo);
        System.out.println("------------------------------------------------");

        pesoIdeal(persona02);
        mayorDeEdad(persona02);
        persona02.comprobarSexo(sexo);
        System.out.println("------------------------------------------------");

        pesoIdeal(persona03);
        mayorDeEdad(persona03);
        persona03.comprobarSexo(sexo);

        System.out.println();

        System.out.println(persona01);
        System.out.println(persona02);
        System.out.println(persona03);

    }

    public static void mayorDeEdad(Persona data) {
        if(data.esMayorDeEdad()) {
            System.out.println(data.getNombre() + " Si es mayor de edad!!!");
        } else {
            System.out.println(data.getNombre() + " No es mayor de edad!!!");
        }
    }

    public static void pesoIdeal(Persona data){
        int val_data = data.calcularIMC();
        if(val_data == -1) {
            System.out.println(data.getNombre() + " Esta por debajo de su peso ideal!!!");
        } else if (val_data == 0) {
            System.out.println(data.getNombre() + " Esta en su peso ideal!!!");
        } else if (val_data == 1) {
            System.out.println(data.getNombre() + " Esta por encima de su peso ideal!!!");
        } else {
            System.out.println("Valor no disponible!!!");
        }
    }
}
