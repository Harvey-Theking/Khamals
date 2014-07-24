/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ordersAndMeasurements;

import java.awt.Image;
import java.awt.Toolkit;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Database.DatabaseHelper;
/**
 *
 * @author Klexy
 */
public class ViewMeasurement extends javax.swing.JFrame {

    DatabaseHelper db;
    String name;
    int SESSION_USER = 1;
    /**
     * Creates new form NewMeasurement
     */
    public ViewMeasurement() throws SQLException {
        Image icon = Toolkit.getDefaultToolkit().getImage("images/khamals.png");
	this.setIconImage(icon);
        initComponents();  
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        db = new DatabaseHelper();
        loadCustomerNames();
        makeFieldsUneditable();
    }
    
    /**
     *
     * @param key
     * @throws SQLException
     */
    public ViewMeasurement(String key, String value) throws SQLException {
        initComponents();  
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setLocationRelativeTo(null);
        db = new DatabaseHelper();
        loadCustomerNames();
        //To set the selected index, i will start from the frist value and trytin different elements to 
        //the selected value untill i get to the needed one. The one whose value matches
        for(int i=0; i < this.customerCmBox.getItemCount(); i++){
            ComboItem item = (ComboItem) this.customerCmBox.getItemAt(i);
            if(value.equalsIgnoreCase(item.getValue())){
                this.customerCmBox.setSelectedIndex(i);
            }
        }
        makeFieldsUneditable();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    public void loadOldMeasurements(){
        ComboItem customer = (ComboItem) this.customerCmBox.getSelectedItem();
        System.out.println("Trying to load values");
        String query;
        if(customer!=null)
        {
        query = "select burst, waist, hips, sleeve, back, arm, chest, length, band from measurements where"
                + " customer_id = " + customer.getValue().toString();
         try{
             db.setQuery(query);
             
                this.burstTxtFld.setText(db.getValueAt(0, 0).toString());
                this.waistTxtFld.setText(db.getValueAt(0, 1).toString());
                this.hipsTxtFld.setText(db.getValueAt(0, 2).toString());
                this.sleeveTxtFld.setText(db.getValueAt(0, 3).toString());
                this.backTxtFld.setText(db.getValueAt(0, 4).toString());
                this.armTxtFld.setText(db.getValueAt(0, 5).toString());
                this.chestTxtFld.setText(db.getValueAt(0, 6).toString());
                this.lengthTxtFld.setText(db.getValueAt(0, 7).toString());
                this.bandTxtFld.setText(db.getValueAt(0, 8).toString());
            
         } catch (SQLException ex) {
                    Logger.getLogger(NewMeasurement.class.getName()).log(Level.SEVERE, null, ex);
            }        
    }
    }
    //small function to make all the entry fields uneditable so they servel more like labels
    //using this instead of labels so to make us of the background
    public void makeFieldsUneditable(){
        this.burstTxtFld.setEditable(false);
        this.waistTxtFld.setEditable(false);
        this.hipsTxtFld.setEditable(false);
        this.sleeveTxtFld.setEditable(false);
        this.backTxtFld.setEditable(false);
        this.armTxtFld.setEditable(false);
        this.chestTxtFld.setEditable(false);
        this.lengthTxtFld.setEditable(false);
        this.bandTxtFld.setEditable(false);
    }
    
    
    public void loadCustomerNames() throws SQLException{
        //slighly different from that of other classes because we only want to load 
        //customers who already have measurements recorded in the database
        String queryString = "select first_name, last_name, id from customers, measurements where "
                + "customers.id = measurements.customer_id";
        db.setQuery(queryString);
        for(int i=0; i<db.numberOfRows; i++){
            
            String firstName;
            firstName = db.getValueAt(i, 0).toString();
            String lastName;
            lastName = db.getValueAt(i, 1).toString();
            String customer_id;
            customer_id = db.getValueAt(i, 2).toString();
            name = firstName + " " + lastName;
            System.out.printf("%s %s\n", firstName, lastName);   
            this.customerCmBox.addItem(new ComboItem(name, customer_id));
        }      
        System.out.println("Finished loading customers");
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        burstTxtFld = new javax.swing.JTextField();
        waistTxtFld = new javax.swing.JTextField();
        hipsTxtFld = new javax.swing.JTextField();
        sleeveTxtFld = new javax.swing.JTextField();
        backTxtFld = new javax.swing.JTextField();
        armTxtFld = new javax.swing.JTextField();
        chestTxtFld = new javax.swing.JTextField();
        lengthTxtFld = new javax.swing.JTextField();
        bandTxtFld = new javax.swing.JTextField();
        closeBtn = new javax.swing.JButton();
        customerCmBox = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Vani", 3, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Customer Name:");

        jLabel3.setFont(new java.awt.Font("Vani", 3, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Burst:");

        jLabel4.setFont(new java.awt.Font("Vani", 3, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Waist:");

        jLabel5.setFont(new java.awt.Font("Vani", 3, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Hips:");

        jLabel6.setFont(new java.awt.Font("Vani", 3, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sleeve:");

        jLabel7.setFont(new java.awt.Font("Vani", 3, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Back:");

        jLabel8.setFont(new java.awt.Font("Vani", 3, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Arm:");

        jLabel9.setFont(new java.awt.Font("Vani", 3, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Chest:");

        jLabel10.setFont(new java.awt.Font("Vani", 3, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Length:");

        jLabel11.setFont(new java.awt.Font("Vani", 3, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Band:");

        burstTxtFld.setToolTipText("");

        waistTxtFld.setToolTipText("");

        hipsTxtFld.setToolTipText("");

        sleeveTxtFld.setToolTipText("");

        backTxtFld.setToolTipText("");

        armTxtFld.setToolTipText("");

        chestTxtFld.setToolTipText("");

        lengthTxtFld.setToolTipText("");

        bandTxtFld.setToolTipText("");
        bandTxtFld.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bandTxtFldActionPerformed(evt);
            }
        });

        closeBtn.setFont(new java.awt.Font("Vani", 3, 12)); // NOI18N
        closeBtn.setText("Close");
        closeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeBtnActionPerformed(evt);
            }
        });

        customerCmBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                customerCmBoxItemStateChanged(evt);
            }
        });
        customerCmBox.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerCmBoxMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                customerCmBoxMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                customerCmBoxMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                customerCmBoxMousePressed(evt);
            }
        });
        customerCmBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerCmBoxActionPerformed(evt);
            }
        });
        customerCmBox.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                customerCmBoxPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(burstTxtFld)
                    .addComponent(waistTxtFld)
                    .addComponent(hipsTxtFld)
                    .addComponent(sleeveTxtFld)
                    .addComponent(backTxtFld)
                    .addComponent(armTxtFld)
                    .addComponent(chestTxtFld)
                    .addComponent(lengthTxtFld)
                    .addComponent(bandTxtFld)
                    .addComponent(customerCmBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(50, 50, 50))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(193, Short.MAX_VALUE)
                .addComponent(closeBtn)
                .addGap(176, 176, 176))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(customerCmBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(burstTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(waistTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hipsTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sleeveTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(armTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chestTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lengthTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bandTxtFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addComponent(closeBtn)
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(burstTxtFld, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(waistTxtFld, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(hipsTxtFld, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(sleeveTxtFld, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(backTxtFld, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(armTxtFld, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(chestTxtFld, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(lengthTxtFld, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(bandTxtFld, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(closeBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(customerCmBox, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jDesktopPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bandTxtFldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bandTxtFldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bandTxtFldActionPerformed

    private void closeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeBtnActionPerformed
       this.dispose();
    }//GEN-LAST:event_closeBtnActionPerformed

    private void customerCmBoxPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_customerCmBoxPropertyChange
        //this.loadOldMeasurements();
        if(this.isActive()){
            this.loadOldMeasurements();
        }
    }//GEN-LAST:event_customerCmBoxPropertyChange

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        this.loadOldMeasurements();
        
    }//GEN-LAST:event_formWindowOpened

    private void customerCmBoxMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerCmBoxMousePressed
        //this.loadOldMeasurements();
    }//GEN-LAST:event_customerCmBoxMousePressed

    private void customerCmBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_customerCmBoxItemStateChanged
        //this.loadOldMeasurements();
    }//GEN-LAST:event_customerCmBoxItemStateChanged

    private void customerCmBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerCmBoxActionPerformed
        if(this.isVisible())
        this.loadOldMeasurements();
    }//GEN-LAST:event_customerCmBoxActionPerformed

    private void customerCmBoxMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerCmBoxMouseClicked
        //this.loadOldMeasurements();
    }//GEN-LAST:event_customerCmBoxMouseClicked

    private void customerCmBoxMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerCmBoxMouseExited
        //this.loadOldMeasurements();
    }//GEN-LAST:event_customerCmBoxMouseExited

    private void customerCmBoxMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerCmBoxMouseEntered
        //this.loadOldMeasurements();
    }//GEN-LAST:event_customerCmBoxMouseEntered

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
            java.util.logging.Logger.getLogger(ViewMeasurement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewMeasurement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewMeasurement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewMeasurement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ViewMeasurement().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(ViewMeasurement.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField armTxtFld;
    private javax.swing.JTextField backTxtFld;
    private javax.swing.JTextField bandTxtFld;
    private javax.swing.JTextField burstTxtFld;
    private javax.swing.JTextField chestTxtFld;
    private javax.swing.JButton closeBtn;
    private javax.swing.JComboBox customerCmBox;
    private javax.swing.JTextField hipsTxtFld;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField lengthTxtFld;
    private javax.swing.JTextField sleeveTxtFld;
    private javax.swing.JTextField waistTxtFld;
    // End of variables declaration//GEN-END:variables
}
