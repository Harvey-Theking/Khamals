/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.khamals.reports.menu.sales;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.khamals.reports.enums.SortEnumByCategory;
import com.khamals.reports.menu.stock.ItemEnquiryRep;
import Database.DatabaseHelper;
import com.khamals.reports.tables.TestDeHSSFXSSF;
import java.io.IOException;

import java.util.Date;
import java.util.Formatter;

/**
 *
 * @author MINGO LAWRENCE
 */
public class SalesByType extends javax.swing.JDialog {

    String queryIdentifier, sheetName;
    DatabaseHelper help = new DatabaseHelper();
    /**
     * Creates new form SalesByType
     * @param parent
     * @param modal
     * @throws java.sql.SQLException
     */
    public SalesByType(java.awt.Frame parent, boolean modal) throws SQLException{
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        try {
            /**
             * As soon as the Mouse Pointer enters the un-obscured portion of the
             * Object's geometry, I would  query the database and retrieve a
             * valid list of all the codes for the various items in the warehouse!
             * PRETTY  SMART HUH!!!
             */
            String query = "SELECT DISTINCT CATEGORY FROM PRODUCT";
            help.setQuery(query);
            for (int i = 0; i < help.numberOfRows; i++) {
                for (int j = 0; j < help.getColumnCount(); j++) {
                    
                    itemCodeName.addItem(help.getValueAt(i, j));
                }
                System.out.println("\n");
            }
        } catch (SQLException | IllegalStateException ex) {
            Logger.getLogger(ItemEnquiryRep.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        itemCodeName = new javax.swing.JComboBox();
        searchButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        refineSearchComboBox = new javax.swing.JComboBox<>();
        dateChooserCombo1 = new datechooser.beans.DateChooserCombo();
        dateChooserCombo2 = new datechooser.beans.DateChooserCombo();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(51, 0, 51));

        jPanel1.setBackground(new java.awt.Color(48, 10, 60));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(100, 100, 100), 1, true));
        jPanel1.setForeground(new java.awt.Color(100, 100, 100));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Product  Category:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Start  Date:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("End  Date:");

        itemCodeName.setBackground(new java.awt.Color(51, 51, 120));
        itemCodeName.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        itemCodeName.setForeground(new java.awt.Color(255, 255, 255));
        itemCodeName.setModel(new javax.swing.DefaultComboBoxModel(new String[] { }));

        searchButton.setBackground(new java.awt.Color(51, 51, 120));
        searchButton.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Refine Search By:");

        refineSearchComboBox.setBackground(new java.awt.Color(50, 50, 120));
        refineSearchComboBox.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        refineSearchComboBox.setModel(new javax.swing.DefaultComboBoxModel(SortEnumByCategory.values()));

        dateChooserCombo1.setFormat(0);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(refineSearchComboBox, 0, 195, Short.MAX_VALUE)
                            .addComponent(dateChooserCombo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dateChooserCombo1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(itemCodeName, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(170, 170, 170)
                        .addComponent(searchButton)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(itemCodeName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dateChooserCombo1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(dateChooserCombo2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(refineSearchComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(62, 62, 62)
                .addComponent(searchButton)
                .addGap(64, 64, 64))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        Formatter format = new Formatter();
        Formatter format1 = new Formatter();
        
        String startString = itemCodeName.getSelectedItem().toString();
        String refine = refineSearchComboBox.getSelectedItem().toString();

        Date startDate = dateChooserCombo1.getSelectedDate().getTime();
        String startDateString = format.format("%tF", startDate).toString();
        Date endDate = dateChooserCombo2.getSelectedDate().getTime();
        String endDateString = format1.format("%tF", endDate).toString();

        if (null != refineSearchComboBox.getSelectedItem().toString()) {
            switch (refineSearchComboBox.getSelectedItem().toString()) {
                case "CUSTOMERS":
                    String query8 = "SELECT SALES_GENERAL.CUSTOMER_NAME, SALES_GENERAL.TRANSACTION_DATE, "
                            + "SALES_DETAILED.PRODUCT_NAME, SALES_DETAILED.SELLING_PRICE, "
                            + "SALES_DETAILED.QUANTITY_TO_BE_SOLD, SALES_GENERAL.TOTAL_AMOUNT_PAID "
                            + "FROM SALES_GENERAL INNER JOIN SALES_DETAILED ON SALES_GENERAL.TRANSACTION_ID="
                            + "SALES_DETAILED.TRANSACTION_ID WHERE "
                            + "SALES_GENERAL.TRANSACTION_DATE>='" + startDateString + "' AND "
                            + "SALES_GENERAL.TRANSACTION_DATE<='" + endDateString + "'"
                            + " ORDER BY SALES_DETAILED.QUANTITY_AVAILABLE";
                    queryIdentifier = "SALES DONE PER CUSTOMER";
                    sheetName = "SALES DONE BY QUANTITY OF SALES";
                    try {
                        System.out.println(query8);
                        help.setQuery(query8);
                        TestDeHSSFXSSF.createEXCELSheet(help, query8, sheetName, queryIdentifier);
                        format.format("%tF", startDate).close();
                        format1.format("%tF", endDate).close();
                        for (int i = 0; i < help.numberOfRows; i++) {
                            for (int j = 0; j < help.getColumnCount(); j++) {

                                System.out.printf("%s\t", help.getValueAt(i, j).toString());
                            }
                            System.out.println("\n");
                        }

                    } catch (SQLException | IllegalStateException ex) {
                        Logger.getLogger(ItemEnquiryRep.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                Logger.getLogger(SalesByType.class.getName()).log(Level.SEVERE, null, ex);
            }

                    break;
                    
                case "QUANTITY_AVAILABLE":
                    String query = "SELECT SALES_GENERAL.TRANSACTION_ID, SALES_GENERAL.TRANSACTION_DATE, "
                            + "SALES_GENERAL.CUSTOMER_NAME, SALES_GENERAL.CASHIER_NAME, "
                            + "SALES_GENERAL.TOTAL_AMOUNT, SALES_GENERAL.DISCOUNT, SALES_GENERAL.TOTAL_AMOUNT_PAID, "
                            + "SALES_DETAILED.PRODUCT_NAME, SALES_DETAILED.PRODUCT_CODE, SALES_DETAILED.SELLING_PRICE, "
                            + "SALES_DETAILED.QUANTITY_AVAILABLE, SALES_DETAILED.QUANTITY_TO_BE_SOLD "
                            + "FROM SALES_GENERAL INNER JOIN SALES_DETAILED ON SALES_GENERAL.TRANSACTION_ID="
                            + "SALES_DETAILED.TRANSACTION_ID WHERE "
                            + "SALES_GENERAL.TRANSACTION_DATE>='" + startDateString + "' AND "
                            + "SALES_GENERAL.TRANSACTION_DATE<='" + endDateString + "'"
                            + " ORDER BY SALES_DETAILED.QUANTITY_AVAILABLE";
                    queryIdentifier = "SALES BY QUANTITY";
                    sheetName = "SALES DONE BY QUANTITY OF SALES";
                    try {
                        System.out.println(query);
                        help.setQuery(query);
                        TestDeHSSFXSSF.createEXCELSheet(help, query, sheetName, queryIdentifier);
                        format.format("%tF", startDate).close();
                        format1.format("%tF", endDate).close();
                        for (int i = 0; i < help.numberOfRows; i++) {
                            for (int j = 0; j < help.getColumnCount(); j++) {

                                System.out.printf("%s\t", help.getValueAt(i, j).toString());
                            }
                            System.out.println("\n");
                        }

                    } catch (SQLException | IllegalStateException ex) {
                        Logger.getLogger(ItemEnquiryRep.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                Logger.getLogger(SalesByType.class.getName()).log(Level.SEVERE, null, ex);
            }

                    break;

            case "COST_PRICE":
                    String query2 = "SELECT SALES_GENERAL.TRANSACTION_DATE, SALES_GENERAL.CUSTOMER_NAME, "
                            + "SALES_GENERAL.TOTAL_AMOUNT, SALES_GENERAL.DISCOUNT, "
                            + "SALES_GENERAL.TOTAL_AMOUNT_PAID, SALES_GENERAL.CASHIER_NAME "
                            + "FROM SALES_GENERAL WHERE "
                            + "SALES_GENERAL.TRANSACTION_DATE>='" + startDateString + "' AND "
                            + "SALES_GENERAL.TRANSACTION_DATE<='" + endDateString + "'"
                            + " ORDER BY SALES_GENERAL.TOTAL_AMOUNT_PAID";
                    queryIdentifier = "SALES BY COST";
                    sheetName = "SALES DONE BY SHOPPING CART";
                    try {
                        System.out.println(query2);
                        help.setQuery(query2);
                        TestDeHSSFXSSF.createEXCELSheet(help, query2, sheetName, queryIdentifier);
                        format.format("%tF", startDate).close();
                        format1.format("%tF", endDate).close();
                        for (int i = 0; i < help.numberOfRows; i++) {
                            for (int j = 0; j < help.getColumnCount(); j++) {

                                System.out.printf("%s\t", help.getValueAt(i, j).toString());
                            }
                            System.out.println("\n");
                        }

                    } catch (SQLException | IllegalStateException ex) {
                        Logger.getLogger(ItemEnquiryRep.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                Logger.getLogger(SalesByType.class.getName()).log(Level.SEVERE, null, ex);
            }

                    break;

            case "LAST_SOLD_DATE":
                    String query5 = "SELECT SALES_GENERAL.TRANSACTION_DATE, "
                            + "SALES_GENERAL.CUSTOMER_NAME, SALES_DETAILED.PRODUCT_NAME, "
                            + "SALES_DETAILED.QUANTITY_TO_BE_SOLD, SALES_GENERAL.CASHIER_NAME, "
                            + "SALES_GENERAL.TOTAL_AMOUNT, SALES_GENERAL.DISCOUNT, SALES_GENERAL.TOTAL_AMOUNT_PAID "
                            + "FROM SALES_GENERAL INNER JOIN SALES_DETAILED ON SALES_GENERAL.TRANSACTION_ID="
                            + "SALES_DETAILED.TRANSACTION_ID WHERE "
                            + "SALES_GENERAL.TRANSACTION_DATE>='" + startDateString + "' AND "
                            + "SALES_GENERAL.TRANSACTION_DATE<='" + endDateString + "'"
                            + " ORDER BY SALES_GENERAL.TRANSACTION_DATE";
                    queryIdentifier = "SALES BY DATE SOLD";
                    sheetName = "SALES DONE BY DATE SOLD";
                    try {
                        System.out.println(query5);
                        help.setQuery(query5);
                        TestDeHSSFXSSF.createEXCELSheet(help, query5, sheetName, queryIdentifier);
                        format.format("%tF", startDate).close();
                        format1.format("%tF", endDate).close();
                        for (int i = 0; i < help.numberOfRows; i++) {
                            for (int j = 0; j < help.getColumnCount(); j++) {

                                System.out.printf("%s\t", help.getValueAt(i, j).toString());
                            }
                            System.out.println("\n");
                        }

                    } catch (SQLException | IllegalStateException ex) {
                        Logger.getLogger(ItemEnquiryRep.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                Logger.getLogger(SalesByType.class.getName()).log(Level.SEVERE, null, ex);
            }

                    break;
            case "LAST_QTY_SOLD":
                    String query6 = "SELECT SALES_GENERAL.TRANSACTION_DATE, "
                            + "SALES_DETAILED.QUANTITY_TO_BE_SOLD, SALES_DETAILED.PRODUCT_NAME, "
                            + "SALES_GENERAL.CUSTOMER_NAME, SALES_GENERAL.CASHIER_NAME "
                            + "FROM SALES_GENERAL INNER JOIN SALES_DETAILED ON SALES_GENERAL.TRANSACTION_ID="
                            + "SALES_DETAILED.TRANSACTION_ID WHERE "
                            + "SALES_GENERAL.TRANSACTION_DATE>='" + startDateString + "' AND "
                            + "SALES_GENERAL.TRANSACTION_DATE<='" + endDateString + "'"
                            + " ORDER BY SALES_DETAILED.QUANTITY_TO_BE_SOLD";
                    queryIdentifier = "SALES BY LAST QUANTITY SOLD";
                    sheetName = "SALES DONE BY LAST Q'TY SOLD";
                    try {
                        System.out.println(query6);
                        help.setQuery(query6);
                        TestDeHSSFXSSF.createEXCELSheet(help, query6, sheetName, queryIdentifier);
                        format.format("%tF", startDate).close();
                        format1.format("%tF", endDate).close();
                        for (int i = 0; i < help.numberOfRows; i++) {
                            for (int j = 0; j < help.getColumnCount(); j++) {

                                System.out.printf("%s\t", help.getValueAt(i, j).toString());
                            }
                            System.out.println("\n");
                        }

                    } catch (SQLException | IllegalStateException ex) {
                        Logger.getLogger(ItemEnquiryRep.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                Logger.getLogger(SalesByType.class.getName()).log(Level.SEVERE, null, ex);
            }

                    break;
            case "SELLING_PRICE":
                    String query7 = "SELECT SALES_GENERAL.TRANSACTION_ID, SALES_GENERAL.TRANSACTION_DATE, "
                            + "SALES_GENERAL.CUSTOMER_NAME, SALES_GENERAL.CASHIER_NAME, "
                            + "SALES_GENERAL.TOTAL_AMOUNT, SALES_GENERAL.DISCOUNT, SALES_GENERAL.TOTAL_AMOUNT_PAID, "
                            + "SALES_DETAILED.PRODUCT_NAME, SALES_DETAILED.PRODUCT_CODE, SALES_DETAILED.SELLING_PRICE, "
                            + "SALES_DETAILED.QUANTITY_AVAILABLE, SALES_DETAILED.QUANTITY_TO_BE_SOLD "
                            + "FROM SALES_GENERAL INNER JOIN SALES_DETAILED ON SALES_GENERAL.TRANSACTION_ID="
                            + "SALES_DETAILED.TRANSACTION_ID WHERE "
                            + "SALES_GENERAL.TRANSACTION_DATE>='" + startDateString + "' AND "
                            + "SALES_GENERAL.TRANSACTION_DATE<='" + endDateString + "'"
                            + " ORDER BY SALES_DETAILED.SELLING_PRICE";
                    queryIdentifier = "SALES BY SELLING PRICE";
                    sheetName = "SALES DONE BY SELLING PRICE";
                    try {
                        System.out.println(query7);
                        help.setQuery(query7);
                        TestDeHSSFXSSF.createEXCELSheet(help, query7, sheetName, queryIdentifier);
                        format.format("%tF", startDate).close();
                        format1.format("%tF", endDate).close();
                        for (int i = 0; i < help.numberOfRows; i++) {
                            for (int j = 0; j < help.getColumnCount(); j++) {

                                System.out.printf("%s\t", help.getValueAt(i, j).toString());
                            }
                            System.out.println("\n");
                        }

                    } catch (SQLException | IllegalStateException ex) {
                        Logger.getLogger(ItemEnquiryRep.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                Logger.getLogger(SalesByType.class.getName()).log(Level.SEVERE, null, ex);
            }

                    break;
            }
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(SalesByType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalesByType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalesByType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalesByType.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    SalesByType dialog = new SalesByType(new javax.swing.JFrame(), true);
                    dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                        @Override
                        public void windowClosing(java.awt.event.WindowEvent e) {
                            System.exit(0);
                        }
                    });
                    dialog.setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(SalesByType.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserCombo dateChooserCombo1;
    private datechooser.beans.DateChooserCombo dateChooserCombo2;
    private javax.swing.JComboBox itemCodeName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox refineSearchComboBox;
    private javax.swing.JButton searchButton;
    // End of variables declaration//GEN-END:variables
}