package Basic;

public enum Days_week {
    LUNES(true),
    MARTES(true),
    MIERCOLES(true),
    JUEVES(true),
    VIERNES(true),
    SABADO(false),
    DOMINGO(false);

    private boolean isWeek;
    Days_week (boolean isWeek) {
        this.isWeek =  isWeek;
    }

    @Override
    public String toString() {
        if(isWeek) {
            return "EL día " + this.name() + " SI es día laboral";
        }

        return "El día " + this.name() + " No es día laboral";
    }
}
