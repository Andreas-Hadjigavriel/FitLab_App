
package Classes;


public class Offers {

 
    private String itemListName;
    private int discount;
    private Double Cost;
    public Offers(String itemListName, int discount,Double cost){
        this.itemListName = itemListName;
        this.discount = discount;
        this.Cost = cost;
    }
    
      public static double  setOfferToPrem(int discount,Double cost){
        double newCost;
        
        newCost = cost - cost*(discount/100);
        return newCost;
    }
}
