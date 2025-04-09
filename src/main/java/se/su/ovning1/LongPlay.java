package se.su.ovning1;

public class LongPlay extends Recording{
    public LongPlay(String name, String artist, int year, int condition, double price){
        super(name, artist, year, condition, price);
    }

    public String getType(){
        return "LP";
    }

    public double getPrice(){
        return (price * condition + (2025 - year) * 5.0);
    }
}
