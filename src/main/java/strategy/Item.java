package strategy;

/**
 * Created by Ivan_Surus on 4/6/2017.
 */
public class Item {
    private String upcCode;
    private int price;
    public Item(String upc, int cost){
        this.upcCode=upc;
        this.price=cost;
    }
    public String getUpcCode() {
        return upcCode;
    }
    public int getPrice() {
        return price;
    }
}