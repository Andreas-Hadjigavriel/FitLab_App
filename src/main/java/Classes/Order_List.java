package Classes;

import java.util.List;
import java.util.ArrayList;

public class Order_List {
    private List<Product> itemList;
    private Boolean listValidation;
    public double totalcost;

    
    
    public void  Order_List(double Totalcost){
       
        this.totalcost= +this.totalcost+ Totalcost;
    }
    
    public void new_list(){
        Product name = null;
        itemList.add(name);
        Product quantity = null;
        itemList.add(quantity);
        Product price = null;
        itemList.add(price);
    }
    
    public List<Product> get_list(){     
        return itemList;
    }
    
    public Boolean validateList(){
        Integer everythingIsOK = 0;
        
        if (everythingIsOK == 1){
            listValidation = true;
        } else {
            listValidation = false;
        }
        
        return listValidation;
    }
    
    public static double productcost(double price,int quantity){
        double cost=0;
        
        cost= quantity*price;
        
        return cost;
    
    }
    
     public  double totalcost(){return this.totalcost; }
    
}
