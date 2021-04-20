
package Classes;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
//rr
public class Orders_History {
    private String customerName;
    private String itemListName;
    private String customerEmail;
    private List<Product> itemList;
    private Date buyListDate;
    private File donwloadPDF;
    
    public Orders_History (String customerName,String itemListName, String customerEmail, Date buyListDate, File donwloadPDF ){
        this.customerName = customerName;
        this.itemListName = itemListName;
        this.customerEmail = customerEmail;
        this.buyListDate = buyListDate;
        this.donwloadPDF = donwloadPDF;
        
        this.itemList = new ArrayList<Product>();
    }
}
