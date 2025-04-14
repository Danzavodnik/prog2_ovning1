package se.su.ovning1;

public abstract class Item implements Priceable{
    protected Item(String name){
        this.name = name;
    }

    private final String name;

    public String getName(){
        return name;
    }
}
