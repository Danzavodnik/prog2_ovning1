package se.su.ovning1;

public class Book extends Item implements PriceableWithVAT6{
    private double price;
    private boolean bound;
    private String author;

    public Book(String name, String author, boolean bound, double price){
        super(name);
        this.author = author;
        this.bound = bound;
        this.price = price;    
    }

    public String getType(){
        return "Book";
    }
        
    @Override
    public double getPrice(){
        if(bound){
            return price * 1.3 ;
        }

        return price;
    }
    
    public boolean getBound(){
            return bound;
    }

    public String getAuthor(){
            return author;
    }

    public String toString(){
        return "Name: "+ getName() + ", Author: " + getAuthor() + ", Bound: " + getBound();
    }
}
