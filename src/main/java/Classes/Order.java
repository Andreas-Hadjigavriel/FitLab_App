
package Classes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private String customerName;
    private String itemListName;
    private String customerEmail;
    private List<Product> itemList;
    private Integer quantityPerItam;
    private Double cost;
    private Date OrderDate;
    
    
  
    public Order(String customerName, String itemListName, String customerEmail, Integer quantityPerItam, Double cost, Date OrderDate  ){
        this.customerName = customerName;
        this.itemListName = itemListName;
        this.customerEmail = customerEmail;
        this.itemList = new ArrayList<Product>();
        this.quantityPerItam = quantityPerItam;
        this.cost = cost;
        this.OrderDate = OrderDate;

    }    
    
    public static double showtotal(){
       
        
        double total = 0;
        
        return total;
    }

    

    }        
    
 

