
package Classes;

import java.util.List;


public class Premium_Customer extends Customer {
    private Integer points;
    private Integer discount;
    private List<Product> favouritePr;
    private List<Offers> offer; 

    public Premium_Customer(String name, String surname, String email, String password, String member) {
        super(name, surname, email, password, member);
    }
     
    public void calculatePoints(){
        
    }
    
    public Integer getPoints(){
        return points;
    }
    
    public void setOffer(){
        
    }
    
    public Integer getDiscount(){
        
        return discount;
    }
    
    public void savePoints(){
        
      
    }
    
    
    
}
