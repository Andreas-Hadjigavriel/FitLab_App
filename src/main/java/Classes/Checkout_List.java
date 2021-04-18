
package Classes;

import java.util.ArrayList;
import java.util.List;


public class Checkout_List {
    private String itemListName;
    private Double price;
    private Integer Quantity;
    
    public Checkout_List(String itemListName, Double price, Integer Quantity){
        this.itemListName = itemListName;
        this.price = price;
        this.Quantity = Quantity;
    }
}
