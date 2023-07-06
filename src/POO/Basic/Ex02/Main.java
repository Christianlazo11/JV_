package POO.Basic.Ex02;

public class Main {
    public static void main(String[] args) {

        Propulsor prop01 = new Propulsor(1000, "Tesla");
        Propulsor prop02 = new Propulsor(3000, "Nass");
        Propulsor prop03 = new Propulsor(5000, "CPs");
        Cohete cohe01 =  new Cohete();

        prop01.encender();
        prop01.apagar();

        cohe01.agregarPropulsor(prop01);
        cohe01.agregarPropulsor(prop02);
        cohe01.agregarPropulsor(prop03);

        cohe01.verPropulsores();

        cohe01.eliminarPropulsor(prop02);
        cohe01.verPropulsores();

    }
}
