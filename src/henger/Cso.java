package henger;

public class Cso extends TomorHenger {
    
    private double falvastagsag;

    public Cso(double falvastagsag, double fajSuly, double sugar, double magassag) {
        super(fajSuly, sugar, magassag);
        this.falvastagsag = falvastagsag;
    }

    public Cso(double falvastagsag, double sugar, double magassag) {
        super(sugar, magassag);
        this.falvastagsag = falvastagsag;
    }

    public double getFalvastagsag() {
        return falvastagsag;
    }

    public double terfogat() {
        return 0.0;
    }

    @Override
    public String toString() {
        return super.toString() + "Cso{" + "falvastagsag=" + falvastagsag + '}';
    }

    
    
    
    
}
