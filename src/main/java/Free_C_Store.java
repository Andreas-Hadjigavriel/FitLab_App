

import javax.swing.JFrame;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Free_C_Store extends javax.swing.JFrame {

    public Free_C_Store() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        log_out = new javax.swing.JButton();
        backToCustomerMenu = new javax.swing.JButton();
        historyList = new javax.swing.JButton();
        submitOrder = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        productprice = new javax.swing.JTextField();
        productquantity = new javax.swing.JTextField();
        productname = new javax.swing.JTextField();
        productid = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        jPanel4.setBackground(new java.awt.Color(0, 153, 153));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("FitLab Store");
        jLabel10.setToolTipText("");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 454, Short.MAX_VALUE)
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
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(146, 146, 146)
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
                    .addComponent(log_out, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        backToCustomerMenu.setBackground(new java.awt.Color(0, 153, 204));
        backToCustomerMenu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        backToCustomerMenu.setForeground(new java.awt.Color(255, 255, 255));
        backToCustomerMenu.setText("Back");
        backToCustomerMenu.setBorderPainted(false);
        backToCustomerMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToCustomerMenuActionPerformed(evt);
            }
        });

        historyList.setBackground(new java.awt.Color(204, 51, 0));
        historyList.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        historyList.setForeground(new java.awt.Color(255, 255, 255));
        historyList.setText("History List");
        historyList.setBorderPainted(false);
        historyList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                historyListMouseClicked(evt);
            }
        });
        historyList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyListActionPerformed(evt);
            }
        });

        submitOrder.setBackground(new java.awt.Color(0, 0, 204));
        submitOrder.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        submitOrder.setForeground(new java.awt.Color(255, 255, 255));
        submitOrder.setText("Submit");
        submitOrder.setBorderPainted(false);
        submitOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitOrderActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Product Name", "Quantity", "Price"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ID");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Product Name:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Quantity:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Price:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(backToCustomerMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(historyList, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(submitOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(88, 88, 88))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(productname, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productprice, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productquantity, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productid, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(productid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(productname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(productquantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(productprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(submitOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(historyList, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backToCustomerMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void backToCustomerMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToCustomerMenuActionPerformed
        Free_Customer fc = new  Free_Customer();
        fc.setVisible(true);
        fc.pack();
        fc.setLocationRelativeTo(null);
        fc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();  
        
    }//GEN-LAST:event_backToCustomerMenuActionPerformed

    private void submitOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitOrderActionPerformed
        
        // fill the fields and submit to validate the data
        Integer productID = Integer.parseInt(productid.getText());
        String productName = productname.getText();
        Integer productQuantity = Integer.parseInt(productquantity.getText());
        Double productPrice = Double.parseDouble(productprice.getText());
        
        Integer correctProductID = null;
        String correctProductName = null;
        Integer correctProductQuantity = null;
        Double correctProductPrice = null;
       
        try{
            String myDriver ="com.mysql.jdbc.Driver";
            String myurl ="jdbc:mysql://localhost:3306/fitlab_application?zeroDateTimeBehavior=convertToNull";
             try {
                 Class.forName(myDriver);
             } catch (ClassNotFoundException ex) {
                 Logger.getLogger(Main_Class.class.getName()).log(Level.SEVERE, null, ex);
             }
              try (Connection conn = DriverManager.getConnection(myurl,"root","")) {

                  String query  = "SELECT productID, productName, productQuantity, productPrice FROM products";           

                  PreparedStatement stmt = conn.prepareStatement(query);
                  ResultSet results = stmt.executeQuery();

                  while(results.next()){                    
                      correctProductID = results.getInt("productID");
                      correctProductName = results.getString("productName");
                      correctProductQuantity = results.getInt("productQuantity");
                      correctProductPrice = results.getDouble("productPrice");
                  }   
 
              conn.close();     
         }
         } catch(SQLException e){System.out.println(e); }
        if (productid.getText().equals("") || productname.getText().equals("") || productquantity.getText().equals("") || productprice.getText().equals("") ){
            // if any of these fields left blank then show error message
            JOptionPane.showMessageDialog(this, "Please Enter All Required Data!");
        }
        else if(productID.equals(correctProductID) && productName.equals(correctProductName) && productQuantity.equals(correctProductQuantity) && productPrice.equals(correctProductPrice)){
            // check if the fields is typping correctly and product is available
            Free_C_Checkout_List fccl = new  Free_C_Checkout_List();
            fccl.setVisible(true);
            fccl.pack();
            fccl.setLocationRelativeTo(null);
            fccl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();           
         }
          
    }//GEN-LAST:event_submitOrderActionPerformed

    private void historyListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyListActionPerformed
        
        Integer histCounter = null;
        try{
          String myDriver ="com.mysql.jdbc.Driver";
          String myurl ="jdbc:mysql://localhost:3306/fitlab_application?zeroDateTimeBehavior=convertToNull";
           try {
               Class.forName(myDriver);
           } catch (ClassNotFoundException ex) {
               Logger.getLogger(Main_Class.class.getName()).log(Level.SEVERE, null, ex);
           }
            try (Connection conn = DriverManager.getConnection(myurl,"root","")) {
                
                String query  = "SELECT count(*) as historyCount, customerName, itemListName, itemList, buyListDate, downloadPDF FROM Orders_History";
                
                PreparedStatement st = conn.prepareStatement(query);
                ResultSet rs = st.executeQuery();
                             
                while(rs.next()){
                    histCounter = rs.getInt("historyCount");              
                }   

                conn.close();     
            }
        } catch(SQLException e){System.out.println(e); }
        // check if history list is empty
        if(histCounter > 0){
            // display history list screen
            C_History_List chl = new  C_History_List();
            chl.setVisible(true);
            chl.pack();
            chl.setLocationRelativeTo(null);
            chl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.dispose();
        }
        
       
    }//GEN-LAST:event_historyListActionPerformed

    
    
    
    
    private void historyListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_historyListMouseClicked
        
    }//GEN-LAST:event_historyListMouseClicked

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Free_C_Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Free_C_Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Free_C_Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Free_C_Store.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Free_C_Store().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backToCustomerMenu;
    private javax.swing.JButton historyList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton log_out;
    private javax.swing.JTextField productid;
    private javax.swing.JTextField productname;
    private javax.swing.JTextField productprice;
    private javax.swing.JTextField productquantity;
    private javax.swing.JButton submitOrder;
    // End of variables declaration//GEN-END:variables
}
