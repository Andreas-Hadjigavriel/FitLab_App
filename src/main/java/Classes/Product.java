
package Classes;

import java.util.ArrayList;
import java.util.List;


public class Product {
    private String productName;
    private String quantity;
    private String price;
    
    public Product(String productName, String quantity, String price){
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }
     
    public Boolean deleteProduct(Integer prid, String prName , Integer prQuantity, Double prPrice){
        
       return true;
    }
    
    public Boolean addProduct(Integer prid, String prName , Integer prQuantity, Double prPrice){
        
       return true;
    }
    
    public Boolean updateProduct(Integer prid, String prName , Integer prQuantity, Double prPrice){
        
       return true;
    }
    
}
