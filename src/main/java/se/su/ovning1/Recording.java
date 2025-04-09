package se.su.ovning1;

abstract class Recording extends Item implements PriceableWithVAT25{

    private String artist;
    private int year;
    private int condition;
    private double price;

    public Recording(String name, String artist, int year, int condition, double price){
        super(name);
        this.artist = artist;
        this.year = year;
        this.condition = condition;
        this.price = price;
    }

    public String getArtist() {
        return artist;
    }

    public String getType;

    public int getCondition() {
        return condition;
    }

    @Override
    public double getPrice() {
        return price - (0.1 * condition);
    }

    


}
