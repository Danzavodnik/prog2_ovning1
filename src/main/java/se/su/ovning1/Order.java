package se.su.ovning1;

import java.util.ArrayList;

public class Order{

    private long orderNumber;
    private static long counter = 1;
    private ArrayList<Item> orderedItems;

    public Order(Item... items){
        this.orderNumber = counter++;
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
            total += item.getPrice() * (1 + item.getVAT() / 100);
        }
        return total;
    }

    private long getOrderNumber(){
        return orderNumber;
    }

    public String getReceipt(){
        StringBuilder receipt = new StringBuilder();

        receipt.append("Order No#").append(this.getOrderNumber()).append(" Summary:\n");

        for(Item item : orderedItems){
            

            if(item instanceof Book book){
                receipt.append("Bound: ").append(book.getBound());
            }

            if(item instanceof Recording recording){
                receipt.append(recording.getType())    
                    .append(": ").append(recording.getName()).append(" - ")
                    .append(recording.getArtist()).append(", Year: ")
                    .append(recording.getYear()).append(", Condition: ")
                    .append(recording.getCondition()).append(", Orignial price: ")
                    .append(recording.getOriginalPrice());
            }

            receipt.append("\n Price: ").append(item.getPrice()).append(" (").append(item.getPrice()).append(")")
            .append("\n VAT: ").append(item.getVAT()).append("%\n");
        }

        receipt.append("\nTotal value excl VAT: ").append(getTotalValue())
        .append("\nTotal value incl VAT: ").append(getTotalValuePlusVAT()).append("\n ---------------------------");

        return receipt.toString();
    }
}
