package POO.Exercise03;

public class Password {

    private int longitud = 8;
    private String contraseña;
    final String words = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

    public Password(){}

    public Password(int longitud) {
        this.longitud = longitud;
        generatePassword();
    }

    public void generatePassword() {
        String newPassword = "";
        for(int i = 0; i < this.longitud; i++) {
            int num = (int) Math.floor(Math.random() * words.length());
            newPassword += this.words.charAt(num);
        }

        this.contraseña = newPassword;
    }

    public boolean esFuerte() {
        int mayus = 0;
        int minus = 0;
        int num = 0;

        for(int i = 0; i < this.contraseña.length(); i++) {
            char temp = this.contraseña.charAt(i);
            if(Character.isUpperCase(temp)) {
                mayus ++;
            } else if (Character.isLowerCase(temp)) {
                minus ++;
            } else if (Character.isDigit(temp)) {
                num ++;
            }
        }

        if(mayus >= 2 && minus >= 1 && num >= 5) {
            return true;
        }

        return false;

    }


    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getContraseña() {
        return contraseña;
    }

}
