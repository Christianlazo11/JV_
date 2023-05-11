package Basic;

import java.util.ArrayList;


public class ex_23 {
    public static void main(String[] args) {
        /*23) Dada una frase, separarlo en palabras.*/
        /*Forma corta*/
        String frase = "Las maravillas del mundo en solo cinco minutos";
        String resultado[] = frase.split(" ");

        System.out.println("Resultado:");
        for(int i = 0; i < resultado.length; i++) {
            System.out.println(resultado[i]);
        }

        /*Forma Larga*/
        System.out.println("-------------------------------------------------");
        int min = 0;
        frase = frase.trim();
        ArrayList<String> data = new ArrayList<>();

        for(int i = 0; i < frase.length(); i++) {
            if(frase.charAt(i) == ' ' || i == frase.length() - 1) {
                if(i == frase.length() - 1) {
                    data.add(frase.substring(min, i + 1));
                } else {
                    data.add(frase.substring(min, i));
                }

                min = i + 1;
            }
        }

        for(int i = 0; i < data.size(); i++) {
            System.out.println(data.get(i));
        }


    }
}
