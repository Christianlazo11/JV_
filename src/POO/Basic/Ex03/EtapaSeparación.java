package POO.Basic.Ex03;

public class EtapaSeparación extends Etapa{

    public EtapaSeparación(){
        super();
    }
    @Override
    public void encenderEtapa() {
        System.out.println("Etapa separación encendida!!!");
    }

    @Override
    public void apagarEtapa() {
        System.out.println("Etapa separación apagada!!!");
    }
}
