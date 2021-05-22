package main.java;

import Classes.Product;
import main.java.Main_Class;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Edit_Store extends javax.swing.JFrame {

    public Edit_Store() {
        initComponents();  
        show_products();
    }
    
    public ArrayList<Product> products(){
        String query = "Select * from products";
    ArrayList<Product> products = new ArrayList<>();
    try{
         Statement stm = MyConnection.getConnection().createStatement();
          ResultSet rs = stm.executeQuery(query); 
          Product product; 
          while(rs.next()){
              product = new Product(rs.getInt("productid"),rs.getString("ProductName"),rs.getInt("Quantity"),rs.getInt("cost"));
              products.add(product);
                }
        }
         catch(Exception e){
        JOptionPane.showMessageDialog(null,e);
    }
    return products;
}

    public void show_products(){
        ArrayList<Product> list = products();
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        log_out1 = new javax.swing.JButton();
        backToAdmin = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        addPR = new javax.swing.JButton();
        updatePR = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ProductName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Price = new javax.swing.JTextField();
        Quantity = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        removePR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Edit Store");
        jLabel10.setToolTipText("");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 338, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 427, Short.MAX_VALUE)
        );

        log_out1.setBackground(new java.awt.Color(255, 51, 51));
        log_out1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        log_out1.setForeground(new java.awt.Color(255, 255, 255));
        log_out1.setText("Logout");
        log_out1.setBorderPainted(false);
        log_out1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log_out1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(126, 126, 126)
                .addComponent(log_out1))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(log_out1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        backToAdmin.setBackground(new java.awt.Color(0, 153, 204));
        backToAdmin.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backToAdmin.setForeground(new java.awt.Color(255, 255, 255));
        backToAdmin.setText("Back");
        backToAdmin.setBorderPainted(false);
        backToAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToAdminActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Product Name", "Quantity", "Price"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        addPR.setBackground(new java.awt.Color(0, 153, 102));
        addPR.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addPR.setForeground(new java.awt.Color(255, 255, 255));
        addPR.setText("Add Product");
        addPR.setBorderPainted(false);
        addPR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addPRActionPerformed(evt);
            }
        });

        updatePR.setBackground(new java.awt.Color(0, 204, 204));
        updatePR.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        updatePR.setForeground(new java.awt.Color(255, 255, 255));
        updatePR.setText("Update Product");
        updatePR.setBorderPainted(false);
        updatePR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatePRActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Product Name:");

        ProductName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductNameActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Quantity:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Price:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ID");

        removePR.setBackground(new java.awt.Color(204, 0, 0));
        removePR.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        removePR.setForeground(new java.awt.Color(255, 255, 255));
        removePR.setText("Remove Product");
        removePR.setBorderPainted(false);
        removePR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removePRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addComponent(backToAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(addPR, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(removePR, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(updatePR, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addPR, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(removePR, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatePR, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(backToAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void log_out1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_out1ActionPerformed
        Main_Class mc= new  Main_Class();
        mc.setVisible(true);
        mc.pack();
        mc.setLocationRelativeTo(null);
        mc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_log_out1ActionPerformed

    private void backToAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToAdminActionPerformed
        Administrator ad = new  Administrator();
        ad.setVisible(true);
        ad.pack();
        ad.setLocationRelativeTo(null);
        ad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_backToAdminActionPerformed

    private void removePRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removePRActionPerformed
      
       int Id  = Integer.parseInt(ID.getText());
       String productname = ProductName.getText();
       int quantity = Integer.parseInt(Quantity.getText());
       float price = Float.parseFloat(Price.getText());
       String  p_name = null;
       PreparedStatement ps;
       String query = "SELECT ProductName FROM products where ProductName=?";
       String query1 = "DELETE FROM products  where ProductName ='"+productname+"'";
        
         
         
         try{
            ps = MyConnection.getConnection().prepareStatement(query);
            ps.setString(1, productname);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                 p_name = rs.getString("ProductName");   
                }
            System.out.println(p_name);
            
            if(productname.equals(p_name)){
                ps = MyConnection.getConnection().prepareStatement(query1);
                ps.execute(query1);
                JOptionPane.showMessageDialog(null, "Product delete Successfully");
                 MyConnection.getConnection().close(); 
            }else
            {JOptionPane.showMessageDialog(null,"Product doesnt exist already");
            }    
         }catch (SQLException e){e.printStackTrace();}  

       
    }//GEN-LAST:event_removePRActionPerformed

    private void addPRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addPRActionPerformed
       int Id  = Integer.parseInt(ID.getText());
       String productname = ProductName.getText();
       int quantity = Integer.parseInt(Quantity.getText());
       double price = Double.parseDouble(Price.getText());
        String  p_name = null;
       
        PreparedStatement ps,t;
        String query1 = "SELECT ProductName FROM products where ProductName=?";
        
       
         
         try{
            ps = MyConnection.getConnection().prepareStatement(query1);
            ps.setString(1, productname);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                 p_name = rs.getString("ProductName");   
                }
            
             if(!productname.equals(p_name)){
                 String query = "INSERT INTO products (ProductName,cost,quantity)Values(?,?,?)";
                 t = MyConnection.getConnection().prepareStatement(query);
                 t.setString(1, productname);
                 t.setDouble(2, price);
                 t.setInt(3, quantity);
                
                 int count = t.executeUpdate();
                 if(count > 0)
                {
                    JOptionPane.showMessageDialog(null, "Product Add Successfully");
                }
                 MyConnection.getConnection().close(); 
            }else{
                JOptionPane.showMessageDialog(null,"Product exist already");
                }    
         }catch (SQLException e){e.printStackTrace();}  
       
       
        
    }//GEN-LAST:event_addPRActionPerformed

    private void updatePRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatePRActionPerformed
       int Id  = Integer.parseInt(ID.getText());
       String productname = ProductName.getText();
       int quantity = Integer.parseInt(Quantity.getText());
       double price = Double.parseDouble(Price.getText());
       
        PreparedStatement ps,t;
        String query1 = "SELECT ProductName FROM products where ProductName=?";
        
         String  p_name = null;
         
         try{
            ps = MyConnection.getConnection().prepareStatement(query1);
            ps.setString(1, productname);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                 p_name = rs.getString("ProductName");   
                }
            
             if(productname.equals(p_name)){
                 query1 = "UPDATE products SET ProductName =?, cost=? ,Quantity=? where productid=? ";
                 t = MyConnection.getConnection().prepareStatement(query1);
                 t.setString(1, p_name);
                 t.setDouble(2, price);
                 t.setInt(3, quantity );
                 t.setInt(4, Id);
                 int count = t.executeUpdate();
                 if(count > 0)
                {
                    JOptionPane.showMessageDialog(null, "Product values change Successfully");
                }
                 MyConnection.getConnection().close(); 
            }else{
                JOptionPane.showMessageDialog(null,"Products doesnt exist");
                }    
         }catch (SQLException e){e.printStackTrace();}  
       
        
    }//GEN-LAST:event_updatePRActionPerformed

    private void ProductNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductNameActionPerformed

    public static void main(String args[]) {
 
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Edit_Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Edit_Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Edit_Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Edit_Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Edit_Store().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ID;
    private javax.swing.JTextField Price;
    private javax.swing.JTextField ProductName;
    private javax.swing.JTextField Quantity;
    private javax.swing.JButton addPR;
    private javax.swing.JButton backToAdmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTable1;
    private javax.swing.JButton log_out1;
    private javax.swing.JButton removePR;
    private javax.swing.JButton updatePR;
    // End of variables declaration//GEN-END:variables
}
