package henger;

public class Henger {

    private static int hengerDb;
    private double sugar, magassag;

    public Henger(double sugar, double magassag) {
        this.sugar = sugar;
        this.magassag = magassag;
        hengerDb++;
    }

    public double getSugar() {
        return sugar;
    }

    public double getMagassag() {
        return magassag;
    }

    public static int getHengerDb() {
        return hengerDb;
    }

    public double terfogat() {
        return Math.PI*sugar*sugar*magassag;
    }

    @Override
    public String toString() {
        return "";
    }

}
