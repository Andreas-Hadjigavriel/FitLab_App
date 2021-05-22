
package Classes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Integer productListID;
    private String customerName;
    private String itemListName;
    private String customerEmail;
    private List<Product> itemList;
    private Integer quantityPerItam;
    private Double cost;
    private Date OrderDate;
    
    public void setID(Integer product_id){
        productListID = product_id;
    }
    
    public void setProductName(String product_name){
        itemListName = product_name;
    }
    
    public void setQuantity(Integer quntity){
        quantityPerItam = quntity;
    }
    
    public void setPrice(Double product_cost){  
        cost = product_cost;
    }
}
    public Order(String customerName, String itemListName, String customerEmail, Integer quantityPerItam, Double cost, Date OrderDate  ){
        this.customerName = customerName;
        this.itemListName = itemListName;
        this.customerEmail = customerEmail;
        this.itemList = new ArrayList<Product>();
        this.quantityPerItam = quantityPerItam;
        this.cost = cost;
        this.OrderDate = OrderDate;

    }    

    

    }        
    
 

