/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.*;
import javax.swing.JOptionPane;

/**
 *
 * @author lucaszhang
 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    private DeliveryPackage delPackage; 
    private Boolean validate = false;
    private Boolean validateProduct = false;
    
    public CreateJPanel() {
        initComponents();
    }
    
    CreateJPanel(DeliveryPackage delPackage) {
        initComponents();
        // logic to take information from the user and store it in the delivery package
        
        this.delPackage = delPackage;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        packageId = new javax.swing.JTextField();
        packageWeight = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        productId = new javax.swing.JTextField();
        productName1 = new javax.swing.JTextField();
        productPrice1 = new javax.swing.JTextField();
        customerName1 = new javax.swing.JTextField();
        customerId1 = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnSaveProduct = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 204));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                formFocusLost(evt);
            }
        });
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("package Id");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        packageId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                packageIdFocusLost(evt);
            }
        });
        packageId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                packageIdActionPerformed(evt);
            }
        });
        add(packageId, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 103, -1));

        packageWeight.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                packageWeightFocusLost(evt);
            }
        });
        packageWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                packageWeightActionPerformed(evt);
            }
        });
        add(packageWeight, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 100, -1));

        jLabel2.setText("weight");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, 20));

        jLabel3.setText("product id");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        jLabel4.setText("product name");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 430, -1, -1));

        jLabel5.setText("customer name");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, -1, -1));

        jLabel6.setText("customer Id");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, -1, -1));

        jLabel7.setText("price");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, -1, -1));

        productId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                productIdFocusLost(evt);
            }
        });
        add(productId, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 100, -1));

        productName1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                productName1FocusLost(evt);
            }
        });
        productName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productName1ActionPerformed(evt);
            }
        });
        add(productName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, 100, -1));

        productPrice1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                productPrice1FocusLost(evt);
            }
        });
        add(productPrice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 500, 100, -1));

        customerName1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                customerName1FocusLost(evt);
            }
        });
        customerName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerName1ActionPerformed(evt);
            }
        });
        add(customerName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 110, -1));

        customerId1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                customerId1FocusLost(evt);
            }
        });
        customerId1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerId1ActionPerformed(evt);
            }
        });
        add(customerId1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 110, -1));

        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, -1, -1));

        btnSaveProduct.setText("SAVE PRODUCT");
        btnSaveProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveProductActionPerformed(evt);
            }
        });
        add(btnSaveProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 480, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void packageIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_packageIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_packageIdActionPerformed

    private void packageWeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_packageWeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_packageWeightActionPerformed

    private void productName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productName1ActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        if(validate) {
            JOptionPane.showMessageDialog(null, "Pleae fill all fields");
        } else {
            JOptionPane.showMessageDialog(null, "Saved!");
        }
        String ID = packageId.getText();
        String weight = packageWeight.getText();
        String customerName = customerName1.getText();
        String customerID = customerId1.getText();
        
        this.delPackage.setPackageId(Integer.valueOf(ID));
        this.delPackage.setPackageWeight(Double.valueOf(weight));
        
        Customer customer = this.delPackage.getCustomer();
        customer.setCustomerId(Integer.valueOf(customerID));
        customer.setFullName(customerName);
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnSaveProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveProductActionPerformed
        // TODO add your handling code here:
        String productID = productId.getText();
        String productName = productName1.getText();
        String productPrice = productPrice1.getText();
        
        if(validateProduct) {
            JOptionPane.showMessageDialog(null, "Pleae fill all fields");
        } else {
            JOptionPane.showMessageDialog(null, "Added Product");
        }
        Product product = this.delPackage.createProduct(Integer.valueOf(productID), productName, Double.valueOf(productPrice));
    }//GEN-LAST:event_btnSaveProductActionPerformed

    private void formFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusLost

    }//GEN-LAST:event_formFocusLost

    private void customerId1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerId1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerId1ActionPerformed

    private void customerName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerName1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_customerName1ActionPerformed

    private void packageIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_packageIdFocusLost
        // TODO add your handling code here:
        System.out.println(packageId.getText() + " -- the package ID");
        String ID = packageId.getText();
        
        if(ID.isEmpty()){
            this.validate = true;
        } else {
            this.validate = false;
        }
    }//GEN-LAST:event_packageIdFocusLost

    private void packageWeightFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_packageWeightFocusLost
        // TODO add your handling code here:
        System.out.println(packageWeight.getText() + " -- the package weight");
        String weight = packageWeight.getText();
        
        if(weight.isEmpty()){
            this.validate = true;
        } else {
            this.validate = false;
        }
    }//GEN-LAST:event_packageWeightFocusLost

    private void customerName1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_customerName1FocusLost
        // TODO add your handling code here:
        System.out.println(customerName1.getText() + " -- the customer name");
        String customerName = customerName1.getText();
        
        if(customerName.isEmpty()){
            this.validate = true;
        } else {
            this.validate = false;
        }
    }//GEN-LAST:event_customerName1FocusLost

    private void customerId1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_customerId1FocusLost
        // TODO add your handling code here:
        System.out.println(customerId1.getText() + " -- the customer ID");
        String customerId = customerId1.getText();
        
        if(customerId.isEmpty()){
            this.validate = true;
        } else {
            this.validate = false;
        }
    }//GEN-LAST:event_customerId1FocusLost

    private void productIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_productIdFocusLost
        // TODO add your handling code here:
        System.out.println(productId.getText() + " -- the product ID");
        String productID = productId.getText();
        
        if(productID.isEmpty()){
            this.validateProduct = true;
        } else {
            this.validateProduct = false;
        }
    }//GEN-LAST:event_productIdFocusLost

    private void productName1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_productName1FocusLost
        // TODO add your handling code here:
        System.out.println(productName1.getText() + " -- the product name");
        String productName = productName1.getText();
        
        if(productName.isEmpty()){
            this.validateProduct = true;
        } else {
            this.validateProduct = false;
        }
    }//GEN-LAST:event_productName1FocusLost

    private void productPrice1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_productPrice1FocusLost
        // TODO add your handling code here:
        System.out.println(productPrice1.getText() + " -- the product Price");
        String price = productPrice1.getText();
        
        if(price.isEmpty()){
            this.validateProduct = true;
        } else {
            this.validateProduct = false;
        }
    }//GEN-LAST:event_productPrice1FocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSaveProduct;
    private javax.swing.JTextField customerId1;
    private javax.swing.JTextField customerName1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField packageId;
    private javax.swing.JTextField packageWeight;
    private javax.swing.JTextField productId;
    private javax.swing.JTextField productName1;
    private javax.swing.JTextField productPrice1;
    // End of variables declaration//GEN-END:variables
}