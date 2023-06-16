package POO.Exercise04;

public class Lavadora extends Electrodomestico{

    private final static int carga_base = 5;
    private int carga;

    public Lavadora() {
        super(precio_base, peso_base, color_base, consumo_base);
        this.carga = this.carga_base;
    }

    public Lavadora(double precio, int peso, int carga) {
        super(precio, peso, color_base, consumo_base);
        this.carga = carga;
    }

    public Lavadora(int carga, double precio, int peso, String color, String consumo){
        super(precio, peso, color, consumo);
        this.carga = carga;
    }

    @Override
    public double precioFinal() {
        double result = super.precioFinal();

        if(carga > 30) {
            result += 50;
        }

        return result;
    }

    public int getCarga() {
        return carga;
    }

}
