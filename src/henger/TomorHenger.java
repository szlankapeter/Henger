package henger;

public class TomorHenger extends Henger {
    
    private double fajSuly;

    public TomorHenger(double fajSuly, double sugar, double magassag) {
        super(sugar, magassag);
        this.fajSuly = fajSuly;
    }

    public TomorHenger(double sugar, double magassag) {
        this(1, sugar, magassag);
    }

    public double getFajSuly() {
        return fajSuly;
    }
    
    public double suly(){
        return terfogat() * this.fajSuly;
    }

    @Override
    public String toString() {
        return super.toString() + "TomorHenger{" + "fajSuly=" + fajSuly + '}';
    }
    
    
    
    
    
}
