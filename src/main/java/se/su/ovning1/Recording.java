package se.su.ovning1;

abstract class Recording extends Item implements PriceableWithVAT25{

    private String artist;
    private int year;
    private int condition;
    private double price;

    protected Recording(String name, String artist, int year, int condition, double price){
        super(name);
        this.artist = artist;
        this.year = year;
        this.condition = condition;
        this.price = price;
    }

    public String getArtist() {
        return artist;
    }

    public abstract String getType();

    public int getYear(){
        return year;
    }

    public int getCondition() {
        return condition;
    }

    @Override
    public String toString(){
        String stringToReturn = null;
        if(this instanceof CompactDisc compactDisc){
            stringToReturn = "CD { " + "Name: " + getName() + ", Artist: " + artist + ", Year: " + year + ", Condition: " + condition + ", Orignial price: " + getOriginalPrice() + ", price: " + getPrice() + ", Price + VAT: " + getPriceWithVAT();
        }
        if(this instanceof LongPlay longPlay){
            stringToReturn = "LP { " + "Name: " + getName() + ", Artist: " + artist + ", Year: " + year + ", Condition: " + condition + ", Orignial price: " + getOriginalPrice() + ", price: " + getPrice() + ", Price + VAT: " + getPriceWithVAT();
        }
        return stringToReturn;
    }

    @Override
    public double getPrice() {
        double newPrice = price * (0.1 * condition);
        return Math.max(newPrice, 10);
    }

    protected double getOriginalPrice(){
        return price;
    }


}
