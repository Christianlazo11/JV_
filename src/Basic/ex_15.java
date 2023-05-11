package Basic;

public class ex_15 {
    public static void main(String[] args) {
        /*15) Del siguiente String «La lluvia en Sevilla es una maravilla» cuenta cuantas vocales hay en total
         (recorre el String con charAt).*/

        int cont = 0;
        String cadena = "La lluvia en Sevilla es una maravilla";
        String vocales[] = {"a","e","i","o","u"};

        for(int i = 0; i < cadena.length(); i++) {

            for(int j = 0; j < vocales.length; j++) {
                if(cadena.charAt(i) == vocales[j].charAt(0)){
                    cont++;
                    break;
                }
            }
        }

        System.out.println("La cadena de texto contiene " + cont + " Vocales");
    }
}
