
package Classes;


public class Offers {

 
    private String itemListName;
    private Double discount;
    private Double Cost;
    public Offers(String itemListName, Double discount,Double cost){
        this.itemListName = itemListName;
        this.discount = discount;
        this.Cost = cost;
    }
    
      public static double  NewCost(int discount,Double cost){
        double newCost;
        
        newCost = cost - cost*(discount/100);
        return newCost;
    }
}
