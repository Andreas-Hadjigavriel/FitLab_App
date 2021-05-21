package Classes;

import java.util.List;
import java.util.ArrayList;

public class Order_List {
    private List<Product> itemList;
    private Boolean listValidation;
    
    public Order_List(){
        this.itemList = new ArrayList<Product>();
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
        
        return listValidation;
    }
}
