/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.khamals.reports.menu.sales;

import com.khamals.reports.enums.ReportType;
import com.khamals.reports.menu.stock.ItemEnquiryRep;
import com.khamals.reports.tables.TestDeHSSFXSSF;
import Database.DatabaseHelper;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Date;
import java.util.Formatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;

/**
 * This is the Class used to retrieve the information pertaining to the History
 * of sales of a particular set of items from the User's store. The above class
 * covers a broad range, from timing parameters to doo::
 */
/**
 *
 * @author MINGO LAWRENCE
 */
public class SummarySalesReport extends javax.swing.JDialog {

    String queryIdentifier, sheetName;
    DatabaseHelper help = new DatabaseHelper();

    /**
     * Creates new form PluralItemsRep
     *
     * @param parent
     * @param modal
     * @throws java.sql.SQLException
     */
    public SummarySalesReport(java.awt.Frame parent, boolean modal) throws SQLException {
        super(parent, modal);
        initComponents();
        try {

            String query = "SELECT PRODUCT_NAME FROM SALES_DETAILED "
                    + "ORDER BY PRODUCT_NAME ASC";
            help.setQuery(query);
            for (int i = 0; i < help.numberOfRows; i++) {
                for (int j = 0; j < help.getColumnCount(); j++) {

                    itemCodeName.addItem(help.getValueAt(i, j));
                    itemCodeName1.addItem(help.getValueAt(i, j));
                }
                System.out.println("\n");
            }
        } catch (SQLException | IllegalStateException ex) {
            Logger.getLogger(ItemEnquiryRep.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        this.setLocationRelativeTo(null);
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
        itemCodeName = new javax.swing.JComboBox();
        goButton = new javax.swing.JButton();
        itemCodeName1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        dateChooserCombo1 = new datechooser.beans.DateChooserCombo();
        dateChooserCombo2 = new datechooser.beans.DateChooserCombo();
        jLabel6 = new javax.swing.JLabel();
        refineSearchComboBox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(50, 0, 50));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));

        itemCodeName.setBackground(new java.awt.Color(51, 51, 130));
        itemCodeName.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        itemCodeName.setModel(new javax.swing.DefaultComboBoxModel(new String[] { }));

        goButton.setBackground(new java.awt.Color(51, 51, 130));
        goButton.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        goButton.setText("SEARCH");
        goButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                goButtonActionPerformed(evt);
            }
        });

        itemCodeName1.setBackground(new java.awt.Color(51, 51, 130));
        itemCodeName1.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
        itemCodeName1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { }));
        itemCodeName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCodeName1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("To Item:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Start From Item:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("From Date:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("To  Date:");

        dateChooserCombo1.setCurrentView(new datechooser.view.appearance.AppearancesList("Bordered",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(222, 222, 222),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(222, 222, 222),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(222, 222, 222),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(222, 222, 222),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    dateChooserCombo1.setFieldFont(new java.awt.Font("Times New Roman", java.awt.Font.BOLD, 11));
    dateChooserCombo1.setLocale(new java.util.Locale("en", "GB", ""));

    dateChooserCombo2.setCurrentView(new datechooser.view.appearance.AppearancesList("Bordered",
        new datechooser.view.appearance.ViewAppearance("custom",
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                new java.awt.Color(222, 222, 222),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                new java.awt.Color(222, 222, 222),
                new java.awt.Color(0, 0, 255),
                true,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                new java.awt.Color(0, 0, 255),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                new java.awt.Color(128, 128, 128),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.LabelPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                new java.awt.Color(222, 222, 222),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.LabelPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Dialog", java.awt.Font.PLAIN, 11),
                new java.awt.Color(222, 222, 222),
                new java.awt.Color(255, 0, 0),
                false,
                false,
                new datechooser.view.appearance.swing.ButtonPainter()),
            (datechooser.view.BackRenderer)null,
            false,
            true)));
dateChooserCombo2.setFieldFont(new java.awt.Font("Times New Roman", java.awt.Font.BOLD, 11));
dateChooserCombo2.setLocale(new java.util.Locale("en", "GB", ""));

jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
jLabel6.setText("Type of Report:");

refineSearchComboBox.setBackground(new java.awt.Color(50, 50, 120));
refineSearchComboBox.setFont(new java.awt.Font("Times New Roman", 1, 11)); // NOI18N
refineSearchComboBox.setModel(new javax.swing.DefaultComboBoxModel(ReportType.values()));
refineSearchComboBox.addActionListener(new java.awt.event.ActionListener() {
    public void actionPerformed(java.awt.event.ActionEvent evt) {
        refineSearchComboBoxActionPerformed(evt);
    }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(145, 145, 145)
                    .addComponent(goButton))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGap(55, 55, 55)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(dateChooserCombo2, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(itemCodeName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(itemCodeName1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dateChooserCombo1, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(refineSearchComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)))))
            .addContainerGap(58, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(36, 36, 36)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(itemCodeName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(itemCodeName1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(dateChooserCombo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(18, 18, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(dateChooserCombo2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(refineSearchComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(23, 23, 23)
            .addComponent(goButton)
            .addGap(35, 35, 35))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void goButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_goButtonActionPerformed

        Formatter format = new Formatter();
        Formatter format1 = new Formatter();
        String startString = itemCodeName.getSelectedItem().toString();
        String startItem = (String) itemCodeName.getSelectedItem();
        String endString = itemCodeName1.getSelectedItem().toString();
        String refine = refineSearchComboBox.getSelectedItem().toString();

        Date startDate = dateChooserCombo1.getSelectedDate().getTime();
        String startDateString = format.format("%tF", startDate).toString();
        System.out.println(startDateString);
        Date endDate = dateChooserCombo2.getSelectedDate().getTime();
        String endDateString = format1.format("%tF", endDate).toString();

        if (null != refineSearchComboBox.getSelectedItem().toString()) {
            switch (refineSearchComboBox.getSelectedItem().toString()) {
                case "DETAILED":
                    String query = "SELECT SALES_GENERAL.TRANSACTION_ID, SALES_GENERAL.TRANSACTION_DATE, "
                            + "SALES_GENERAL.CUSTOMER_NAME, SALES_GENERAL.CASHIER_NAME, "
                            + "SALES_GENERAL.TOTAL_AMOUNT, SALES_GENERAL.DISCOUNT, SALES_GENERAL.TOTAL_AMOUNT_PAID, "
                            + "SALES_DETAILED.PRODUCT_NAME, SALES_DETAILED.PRODUCT_CODE, SALES_DETAILED.SELLING_PRICE, "
                            + "SALES_DETAILED.QUANTITY_AVAILABLE, SALES_DETAILED.QUANTITY_TO_BE_SOLD "
                            + "FROM SALES_GENERAL INNER JOIN SALES_DETAILED ON SALES_GENERAL.TRANSACTION_ID="
                            + "SALES_DETAILED.TRANSACTION_ID WHERE "
                            + "SALES_DETAILED.PRODUCT_NAME>='" + startItem + "' AND "
                            + "SALES_DETAILED.PRODUCT_NAME<='" + endString + "' AND "
                            + "SALES_GENERAL.TRANSACTION_DATE>='" + startDateString + "' AND "
                            + "SALES_GENERAL.TRANSACTION_DATE<='" + endDateString + "'"
                            + " ORDER BY SALES_GENERAL.TRANSACTION_ID";
                    queryIdentifier = "DETAILED TOTALS OF SALES";
                    sheetName = "DETAILS OF SALES";
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
                Logger.getLogger(SummarySalesReport.class.getName()).log(Level.SEVERE, null, ex);
            }

                    break;
                case "SUMMARY":
                    String query1 = "SELECT SALES_GENERAL.TRANSACTION_ID, SALES_GENERAL.TOTAL_AMOUNT_PAID, "
                            + "SALES_GENERAL.CUSTOMER_NAME, SALES_GENERAL.CASHIER_NAME, "
                            + "SALES_DETAILED.PRODUCT_CODE, SALES_DETAILED.PRODUCT_NAME, SALES_DETAILED.SELLING_PRICE "
                            + "FROM SALES_GENERAL INNER JOIN SALES_DETAILED ON SALES_GENERAL.TRANSACTION_ID="
                            + "SALES_DETAILED.TRANSACTION_ID WHERE "
                            + "SALES_DETAILED.PRODUCT_NAME>='" + startItem + "' AND "
                            + "SALES_DETAILED.PRODUCT_NAME<='" + endString + "' AND "
                            + "SALES_GENERAL.TRANSACTION_DATE>='" + startDateString + "' AND "
                            + "SALES_GENERAL.TRANSACTION_DATE<='" + endDateString + "'"
                            + " ORDER BY SALES_GENERAL.TRANSACTION_ID";
                    queryIdentifier = "SUMMARY TOTALS OF SALES";
                    sheetName = "SUMMARY OF SALES";
                    try {
                        System.out.println(query1);
                        help.setQuery(query1);
                        TestDeHSSFXSSF.createEXCELSheet(help, query1, sheetName, queryIdentifier);
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
                Logger.getLogger(SummarySalesReport.class.getName()).log(Level.SEVERE, null, ex);
            }

                    break;
            }
        }

    }//GEN-LAST:event_goButtonActionPerformed

    private void itemCodeName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCodeName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemCodeName1ActionPerformed

    private void refineSearchComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refineSearchComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_refineSearchComboBoxActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SummarySalesReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    SummarySalesReport dialog = new SummarySalesReport(new javax.swing.JFrame(), true);
                    dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                        @Override
                        public void windowClosing(java.awt.event.WindowEvent e) {
                            System.exit(0);
                        }
                    });
                    dialog.setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(SummarySalesReport.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserCombo dateChooserCombo1;
    private datechooser.beans.DateChooserCombo dateChooserCombo2;
    private javax.swing.JButton goButton;
    private javax.swing.JComboBox itemCodeName;
    private javax.swing.JComboBox itemCodeName1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox refineSearchComboBox;
    // End of variables declaration//GEN-END:variables
}