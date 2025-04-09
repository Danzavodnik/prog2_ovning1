package se.su.ovning1;

public class LongPlay extends Recording{
    public LongPlay(String name, String artist, int year, int condition, double price){
        super(name, artist, year, condition, price);
    }

    public String getType(){
        return "LP";
    }

    @Override
    public double getPrice(){
        return getPrice() * getCondition() + ((2025 - getYear()) * 5.0);
    }
}
