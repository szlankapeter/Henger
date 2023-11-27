package henger;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class HengerProgram {

    private List<Henger> hengerek;
    
    
    public static void main(String[] args) {
        new HengerProgram();
    }
    
    public HengerProgram(){
        run();
    }
    
    public void run(){
        this.hengerek = lista();
        System.out.printf("A hengerek szama: %d\n", Henger.getHengerDb());
        System.out.printf("A hengerek atlag terfogata: %.2f\n", atalagTerfogat());
        System.out.printf("A hengerek sulya: %.2f\n", csovekSulya());    
    }
    
    public double atalagTerfogat(){
        double atlag = 0;
        for(Henger henger : hengerek){
            atlag += henger.terfogat();
        }
        atlag /= Henger.getHengerDb();
        return atlag;
    }
    
    public double csovekSulya(){
        double suly = 0;
        for (Henger henger : hengerek) {
            if(henger instanceof Cso){
                suly += ((Cso) henger).suly();
            }
        }
        
        return suly;
    }
    
    private List<Henger> lista(){
        List<Henger> hengerek = new ArrayList<>();
        hengerek.add(new Henger(2, 5));
        hengerek.add(new TomorHenger(3.2, 2, 4));
        hengerek.add(new Cso(4, 4, 7));
        hengerek.add(new Cso(4, 7, 8, 5));
        hengerek.add(new Henger(3, 15));
        return hengerek;
    }
    
    
    
}
