package Basic;

public enum Months {

    JANUARY(1,31),
    FEBRUARY(2,28),
    MARCH(3,31),
    APRIL(4,30),
    MAY(5,31),
    JUNE(6,30),
    JULY(7, 31),
    AUGUST(8,31),
    SEPTEMBER(9,30),
    OCTOBER(10,31),
    NOVEMBER(11,30),
    DECEMBER(12,31);

    private int order, days;
    Months (int order, int days) {
        this.order = order;
        this.days = days;
    }

    public int getOrder(){
        return this.order;
    }

    public int getDays() {
        return this.days;
    }

    @Override
    public String toString() {
        return "El mes de " + this.name() + " Tiene " + this.days + " Días y es el " + this.order+ " Mes del año";
    }
}
