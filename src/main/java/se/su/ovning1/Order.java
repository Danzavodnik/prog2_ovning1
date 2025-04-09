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
            this.orderNumber = counter++;
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
            total += item.getPrice() * (1 + item.getVAT() / 100);
        }
        return total;
    }

    public String getReceipt(){
        StringBuilder receipt = new StringBuilder();


        receipt.append("Order No#").append(this.orderNumber).append(" Summary:\n");

        for(Item item : orderedItems){
            receipt.append(item.getName())
                .append("\n Price: ").append(item.getPrice())
                .append(" VAT:").append(item.getVAT()).append("%\n");
        }

        receipt.append("\nTotal value excl VAT: ").append(getTotalValue())
        .append("\nTotal value incl VAT: ").append(getTotalValuePlusVAT()).append("\n ---------------------------");

        return receipt.toString();
    }
}
