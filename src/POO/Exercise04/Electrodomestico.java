package POO.Exercise04;

public class Electrodomestico {


    private final char[] consumo_energetico = {'a', 'b', 'c', 'd','e', 'f'};
    private final String colores[] = {"blanco", "negro", "rojo", "azul", "gris"};
    protected final static double precio_base = 100;
    protected final static String color_base = "blanco";
    protected final static String consumo_base = "f";
    protected final static int peso_base = 5;

    private double precio;
    private String color, consumo;
    private int peso;

    public Electrodomestico(){
        this(precio_base, peso_base, color_base, consumo_base );
    }

    public Electrodomestico(double precio, int peso) {
        this.precio = precio;
        this.peso =peso;
        this.color = this.color_base;
        this.consumo = this.consumo_base;
    }

    public Electrodomestico(double precio, int peso, String color, String consumo) {
        this.precio = precio;
        this.peso =peso;
        comprobarConsumoEnergetico(consumo.charAt(0));
        comprobarColor(color);
    }

    public void comprobarConsumoEnergetico(char letra) {
        boolean isLetra = false;

        for(int i = 0; i < this.consumo_energetico.length; i++) {
            if(letra == consumo_energetico[i]) {
                isLetra = true;
                break;
            }
        }

        if(!isLetra) {
            this.consumo = this.consumo_base;
        } else {
            this.consumo = letra +" ";
        }
    }

    public void comprobarColor(String color) {
        boolean isColor = false;

        for(int i = 0; i < this.colores.length; i++) {
            if(color.equals(this.colores[i])) {
                isColor = true;
                break;
            }
        }

        if(!isColor) {
            this.color = this.color_base;
        } else {
            this.color = color;
        }
    }

    public double precioFinal() {
        int aumentoConsumo = obtenerAumentoConsumo(this.consumo);
        int aumentoPeso = obtenerAumentoTamano();

        return (this.precio + aumentoConsumo + aumentoPeso);
    }

    public int obtenerAumentoConsumo(String consumo) {
        switch (consumo.toUpperCase()) {
            case "A":
                return 100;
            case "B":
                return 80;
            case "C":
                return 60;
            case "D":
                return 50;
            case "E":
                return 30;
            case "F":
                return 10;
            default: return 0;
        }
    }

    public int obtenerAumentoTamano() {
        if(this.peso >= 0 && this.peso <= 19) {
            return 10;
        } else if (this.peso >= 20 && this.peso <= 49) {
            return 50;
        } else if (this.peso >= 50 && this.peso <= 79) {
            return 80;
        } else {
            return 100;
        }
    }

    public char[] getConsumo_energetico() {
        return consumo_energetico;
    }

    public String[] getColores() {
        return colores;
    }

    public double getPrecio() {
        return precio;
    }

    public String getColor() {
        return color;
    }

    public String getConsumo() {
        return consumo;
    }

    public int getPeso() {
        return peso;
    }
}
