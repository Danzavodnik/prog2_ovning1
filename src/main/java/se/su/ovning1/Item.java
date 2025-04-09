package se.su.ovning1;

abstract class Item implements Priceable{
    public Item(String name){

    }

    private String name;

    public String getName(){
        return name;
    }
}
