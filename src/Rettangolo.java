public class Rettangolo extends Forma {
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
    public double getAltezza() {
        return altezza;
    }
    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }
    private double base;
    private double altezza;

    public Rettangolo(double base, double altezza){
        this.altezza=altezza;
        this.base=base;
    }
    @Override
    public double calcolaArea() {
        return base * altezza;
    }
}
