package POO.Basic.Ex04;

public class SistemaNavegacion {

    private String coordenadas;

    public SistemaNavegacion(){}

    public SistemaNavegacion(String coordenadas) {
        this.coordenadas =  coordenadas;
    }

    public void establecerUbicacion(String data){
        System.out.println(data);
    };

    public void calcularUbicacion(String data) {
        System.out.println(data);
    }

    public String getCoordenadas() {
        return coordenadas;
    }

    public void setCoordenadas(String coordenadas) {
        this.coordenadas = coordenadas;
    }
}
