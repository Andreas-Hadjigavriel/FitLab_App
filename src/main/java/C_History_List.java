package main.java;

import Classes.Admin;
import Classes.Customer;
import Classes.Orders_History;
import Classes.Product;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import main.java.Main_Class;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class C_History_List extends javax.swing.JFrame {

    public C_History_List() {
        initComponents();
        combobox();
    }
    int i=1;
    
    
    private void combobox(){
       
        String Email =  Customer.getEmail();
        PreparedStatement ps;
     String query = "Select orderid from orders where customeremail='"+Email+"'";
    try{ 
            ps = MyConnection.getConnection().prepareStatement(query);
            ResultSet rs = ps.executeQuery(query);
            while(rs.next()){
               String id = String.valueOf(i);  
               orderid.addItem(id);
               i=i+1;
                 
                }
              
            
            
        MyConnection.getConnection().close();
    }     
            catch (SQLException e){e.printStackTrace();} 
    
    }
    
    
    // insert data from orders_history to table 
    
    
     public ArrayList<Product> orders(){
        String   order = orderid.getSelectedItem().toString();
        System.out.print(order);
        String query = "Select * from orderdetail where orderid='"+order+"'";
    ArrayList<Product> products = new ArrayList<>();
    try{
         Statement stm = MyConnection.getConnection().createStatement();
          ResultSet rs = stm.executeQuery(query); 
          Product product; 
          while(rs.next()){
              product = new Product(rs.getInt("orderid"),rs.getString("Name"),rs.getInt("quantity"),rs.getDouble("cost"));
              products.add(product);
                }
        }
         catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
    }
    return products;
}

    public void show_orders(){
        ArrayList<Product> list = orders();
        DefaultTableModel model = (DefaultTableModel)historyTable.getModel();
        Object[] row = new Object[4];
        for(int i=0;i<list.size();i++){
            row[0] = list.get(i).getid();
            row[1] = list.get(i).getproductname();
            row[2] = list.get(i).getquantity();
            row[3] = list.get(i).getprice();
            model.addRow(row);
        }
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        log_out = new javax.swing.JButton();
        backToOrder = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        historyTable = new javax.swing.JTable();
        exportPDF = new javax.swing.JButton();
        sendToEmail = new javax.swing.JButton();
        orderid = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("History Order's List");
        jLabel10.setToolTipText("");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 388, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 338, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 427, Short.MAX_VALUE)
        );

        log_out.setBackground(new java.awt.Color(255, 51, 51));
        log_out.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        log_out.setForeground(new java.awt.Color(255, 255, 255));
        log_out.setText("Logout");
        log_out.setBorderPainted(false);
        log_out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log_outActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(59, 59, 59)
                .addComponent(log_out))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(log_out, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        backToOrder.setBackground(new java.awt.Color(0, 153, 204));
        backToOrder.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backToOrder.setForeground(new java.awt.Color(255, 255, 255));
        backToOrder.setText("Back");
        backToOrder.setBorderPainted(false);
        backToOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToOrderActionPerformed(evt);
            }
        });

        historyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Product Name", "Quantity", "Price"
            }
        ));
        jScrollPane1.setViewportView(historyTable);

        exportPDF.setBackground(new java.awt.Color(204, 153, 0));
        exportPDF.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        exportPDF.setForeground(new java.awt.Color(255, 255, 255));
        exportPDF.setText("Export to PDF");
        exportPDF.setBorderPainted(false);
        exportPDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exportPDFActionPerformed(evt);
            }
        });

        sendToEmail.setBackground(new java.awt.Color(204, 153, 0));
        sendToEmail.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        sendToEmail.setForeground(new java.awt.Color(255, 255, 255));
        sendToEmail.setText("Send to Email");
        sendToEmail.setBorderPainted(false);
        sendToEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendToEmailActionPerformed(evt);
            }
        });

        orderid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderidActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(backToOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(exportPDF)
                .addGap(18, 18, 18)
                .addComponent(sendToEmail)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(orderid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backToOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exportPDF, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sendToEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void log_outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_outActionPerformed
        Main_Class mc= new  Main_Class();
        mc.setVisible(true);
        mc.pack();
        mc.setLocationRelativeTo(null);
        mc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_log_outActionPerformed

    private void backToOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToOrderActionPerformed
        String Email =  Customer.getEmail();
        
        if(Email.equals("andreas@gmail.com")){
            Free_C_Store fcs = new  Free_C_Store();
            fcs.setVisible(true);
            fcs.pack();
            fcs.setLocationRelativeTo(null);
            fcs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        }else{
            Premium_Customer pc = new  Premium_Customer();
            pc.setVisible(true);
            pc.pack();
            pc.setLocationRelativeTo(null);
            pc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        }
        
    }//GEN-LAST:event_backToOrderActionPerformed

    private void exportPDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exportPDFActionPerformed
        String path = "";
        JFileChooser j = new JFileChooser();
        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int x = j.showSaveDialog(this);
        
        if(x==JFileChooser.APPROVE_OPTION){
            
            path = j.getSelectedFile().getPath();
        }
        
        
        Document doc =  new Document();
        
        try {
            PdfWriter.getInstance(doc, new FileOutputStream(path+"Order_list"));
            doc.open();
            
            PdfPTable tb1 = new PdfPTable(4);
            
            tb1.addCell("id");
            tb1.addCell("Productname");
            tb1.addCell("Quantity");
            tb1.addCell("Price");
            
            for(int i=0; i <historyTable.getRowCount();i++){
                String id = historyTable.getValueAt(i, 0).toString();
                String name= historyTable.getValueAt(i, 1).toString();
                String Quantity= historyTable.getValueAt(i, 2).toString();
                String Price = historyTable.getValueAt(i, 3).toString();
            
                tb1.addCell(id);
                tb1.addCell(name);
                tb1.addCell(Quantity);
                tb1.addCell(Price);      
            }
            
            doc.add(tb1);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(C_History_List.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(C_History_List.class.getName()).log(Level.SEVERE, null, ex);
        }
        doc.close();
        
       
    }//GEN-LAST:event_exportPDFActionPerformed

    private void sendToEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendToEmailActionPerformed

        
        String Emailto =  Customer.getEmail();
        String Email = "mixalis97@outlook.com.gr";
        System.out.println(Emailto);
        String password = "99112823mn";
        String Subject = "Analytic Order ";
        String Text = "";
        

        String DATA =  Orders_History.SendEmail(Email, password, Emailto, Subject, Text);
        System.out.println(DATA);
        
        if(DATA.equals("true")){
             JOptionPane.showMessageDialog(this,"Email Send Successfull");
         }
        else{
             JOptionPane.showMessageDialog(this,"Email Send failed");
        }
        
    }//GEN-LAST:event_sendToEmailActionPerformed

    private void orderidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderidActionPerformed

         historyTable.setModel(new  DefaultTableModel(null,new String[]{"orderid","Name","quantity","cost"}));
         show_orders();
    }//GEN-LAST:event_orderidActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(C_History_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(C_History_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(C_History_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(C_History_List.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new C_History_List().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backToOrder;
    private javax.swing.JButton exportPDF;
    private javax.swing.JTable historyTable;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton log_out;
    private javax.swing.JComboBox<String> orderid;
    private javax.swing.JButton sendToEmail;
    // End of variables declaration//GEN-END:variables
}
