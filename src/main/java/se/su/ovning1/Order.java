package se.su.ovning1;

import java.util.ArrayList;



public class Order{

    private long orderNumber;
    private long counter;
    private ArrayList<Item> orderedItems;

    public Order(Item... items){
        this.orderedItems = new ArrayList<>();
        
        for(Item item : items){
            this.orderedItems.add(item);
        }
    }

    public double getTotalValue(){
        double total = 0;
        for(Item item : orderedItems){
            total += item.getPrice();
        }
        return total;
    }

    public double getTotalValuePlusVAT(){
        double total = 0;
        for(Item item : orderedItems){
            total += item.getPrice() * (1 + item.getVAT());
        }
        return total;
    }

    public String getReceipt(){
        StringBuilder receipt = new StringBuilder();

        receipt.append("Order Summary:\n");


        for(Item item : orderedItems){
            receipt.append(item.getName())
                .append("Price: ").append(item.getPrice())
                .append("VAT:").append(item.getVAT().append("%\n"));
        }

        receipt.append("\nTotal value excl VAT: ").append(getTotalValue())
        .append("\nTotal value incl VAT: ").append(getTotalValuePlusVAT());

        return receipt.toString();
    }
}
