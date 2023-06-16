package POO.Exercise04;

public class Exercise04 {

    public static void main(String[] args) {

        double sum_electrodomestico = 0;
        double sum_lavadora = 0;
        double sum_television = 0;

        double sum_total[] = {sum_electrodomestico, sum_lavadora, sum_television};

        Electrodomestico data[] = new Electrodomestico[10];

        ingresoDeDatos(data);

        for(int i = 0; i < data.length; i++) {
            double result = data[i].precioFinal();
            System.out.println(data[i].getPrecio() + " => "+ result);
        }

        sumData(sum_total, data);

        System.out.println("Suma de Electrodomesticos: $ " + sum_total[0]);
        System.out.println("Suma de lavadoras: $ " + sum_total[1]);
        System.out.println("Suma de Televisores: $ " + sum_total[2]);
    }

    private static void ingresoDeDatos(Electrodomestico[] e) {
        e[0] = new Electrodomestico();
        e[1] = new Lavadora(100, 55, 50);
        e[2] = new Television(50, true);
        e[3] = new Electrodomestico();
        e[4] = new Lavadora(100, 55, 50);
        e[5] = new Television(50, true);
        e[6] = new Electrodomestico();
        e[7] = new Lavadora(100, 55, 50);
        e[8] = new Television(50, true);
        e[9] = new Television(50, true);
    }


    private static void sumData(double data[], Electrodomestico[] e) {

        for(int i = 0; i < e.length; i++) {
            if(e[i] instanceof Electrodomestico) {
                data[0]+= e[i].precioFinal();
            }
            if(e[i] instanceof Lavadora) {
                data[1]+= e[i].precioFinal();
            }
            if(e[i] instanceof Television) {
                data[2]+= e[i].precioFinal();
            }
        }

    }
}
