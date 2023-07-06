package POO.Basic.Ex03;

public class Main {

    public static void main(String[] args) {

        Etapa etapadespeque = new EtapaDespegue();
        Etapa etapaseparacion = new EtapaSeparación();

        etapadespeque.encenderEtapa();
        etapadespeque.apagarEtapa();

        System.out.println("---------------------------------");

        etapaseparacion.encenderEtapa();
        etapaseparacion.apagarEtapa();
    }
}
