package POO.Basic.Ex03;

public class EtapaDespegue extends Etapa{

    public EtapaDespegue(){
        super();
    }
    @Override
    public void encenderEtapa() {
        System.out.println("Erapa despegue encendida!!!");
    }

    @Override
    public void apagarEtapa() {
        System.out.println("Etapa despegue apagada!!!");
    }
}
