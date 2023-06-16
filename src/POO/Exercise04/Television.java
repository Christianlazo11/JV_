package POO.Exercise04;

public class Television extends Electrodomestico {

    private static final int resolución_base = 20;
    private static final boolean sintonizador_base = false;

    private int resolución;
    private boolean sintonizador;

    public Television(){
        super(precio_base, peso_base, color_base, consumo_base);
        this.resolución = this.resolución_base;
        this.sintonizador = this.sintonizador_base;
    };

    public Television(double precio, int peso) {
        super(precio, peso);
        this.resolución = this.resolución_base;
        this.sintonizador = this.sintonizador_base;
    }

    public Television(int resolución, boolean sintonizador) {
        super(precio_base, peso_base, color_base, consumo_base);
        this.resolución = resolución;
        this.sintonizador = sintonizador;
    }

    public double precioFinal() {
        double result = super.precioFinal();

        if(this.resolución > 40 && this.sintonizador) {
            result *= 1.5;
        } else if (this.resolución > 40) {
            result += 50;
        }

        return result;
    }

    public int getResolución() {
        return resolución;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }
}
