package se.su.ovning1;

abstract class Item implements Priceable{
    protected Item(String name){
        this.name = name;
    }

    private String name;

    public String getName(){
        return name;
    }
}
