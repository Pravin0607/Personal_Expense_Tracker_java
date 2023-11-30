/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.pet.frames;

import com.pet.utility.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import personal.expense.tracker.PersonalExpenseTracker;

/**
 *
 * @author wick
 */
public class ExpenseModificationDialog extends javax.swing.JDialog {
    
    public int eid;
    public double amount;
    String category,desc,date;
    DefaultTableModel dm;    

    /**
     * Creates new form ExpenseModificationDialog
     */
    public ExpenseModificationDialog(java.awt.Frame parent, boolean modal,int id,double amount,String category,String date,String desc,DefaultTableModel dm) {
        super(parent, modal);
        this.eid=id;
        this.amount=amount;
        this.category=category;
        this.desc=desc;
        this.date=date;
        this.dm=dm;
        this.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
        initComponents();
        this.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldModAmount = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldModDescription = new javax.swing.JTextField();
        jDateChooserModDate = new com.toedter.calendar.JDateChooser();
        jButton1UpdateExpense = new javax.swing.JButton();
        jButton2DeleteExpense = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jComboBoxModCategory = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setForeground(new java.awt.Color(51, 0, 0));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel1.setText("Expense Modification");

        jLabel4.setText("Amount");

        jLabel5.setText("Date");

        jTextFieldModAmount.setText(Double.toString(this.amount));

        jLabel6.setText("Description");

        jTextFieldModDescription.setText(this.desc);

        jButton1UpdateExpense.setText("Update");
        jButton1UpdateExpense.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1UpdateExpenseActionPerformed(evt);
            }
        });

        jButton2DeleteExpense.setBackground(new java.awt.Color(255, 102, 102));
        jButton2DeleteExpense.setText("Delete");
        jButton2DeleteExpense.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2DeleteExpenseActionPerformed(evt);
            }
        });

        jButton3.setText("Cancel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setText("Category ");

        jComboBoxModCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();

        // Assuming you have a method getAllCategories in your Category class
        Object catdata[][] = Category.getAllCategories();

        if (catdata != null) {
            for (Object[] row : catdata) {
                comboBoxModel.addElement((String) row[1]); // Assuming the first column contains strings
            }
        }

        jComboBoxModCategory.setModel(comboBoxModel);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1UpdateExpense)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                        .addComponent(jButton2DeleteExpense)
                        .addGap(122, 122, 122)
                        .addComponent(jButton3))
                    .addComponent(jTextFieldModDescription)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4)
                            .addComponent(jTextFieldModAmount, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(jLabel2)
                            .addComponent(jComboBoxModCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jDateChooserModDate, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(73, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldModAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jDateChooserModDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxModCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldModDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1UpdateExpense)
                    .addComponent(jButton2DeleteExpense)
                    .addComponent(jButton3))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1UpdateExpenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1UpdateExpenseActionPerformed
        // TODO Updating Expense
        
        double amount=0;
        Date date=jDateChooserModDate.getDate();
        String desc=jTextFieldModDescription.getText();        
        String category="";
        String formattedDate="";
        Object selectedValue = jComboBoxModCategory.getSelectedItem();

        if (selectedValue != null ) 
        {
           category=selectedValue.toString();          
        }
        else
        {
            new AlertPopupDanger(null,"Select a Category");
            return;
        }

        if(date==null)
        {
            new AlertPopupDanger(null, "Select a date");
             return;
        }
        else
        {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            formattedDate = dateFormat.format(date);
        }
        
        try {
            // Attempt to parse the string as an integer
            amount=Double.parseDouble(jTextFieldModAmount.getText());
            
             // Successfully parsed as an integer
        } catch (NumberFormatException e) {
            new AlertPopupDanger(null,"Enete a valid number");
            return;
        }
        System.out.println(this.eid+" "+amount+" "+category+" "+formattedDate+" "+desc); 
        
        

        if(Expense.updateExpense(this.eid, amount, category, formattedDate, desc,dm))
        {
             new AlertPopupSuccess(null, "Expense Updated");
             this.setVisible(false);
        }
       else
        {
             new AlertPopupDanger(null, "Failed to Update Expense");
        }        
        
        
      
        
        
        
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButton1UpdateExpenseActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.hide();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2DeleteExpenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2DeleteExpenseActionPerformed
        // TODO add your handling code here:
        if(Expense.deleteExpense(this.eid, this.dm))
        {
            new AlertPopupSuccess(null,"Expense Deleted" );
        }
        else
        {
            new AlertPopupDanger(null, "Failed to Delete Expense");
        }
            this.setVisible(false);        
    }//GEN-LAST:event_jButton2DeleteExpenseActionPerformed

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
            java.util.logging.Logger.getLogger(ExpenseModificationDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ExpenseModificationDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ExpenseModificationDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ExpenseModificationDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
//
//        /* Create and display the dialog */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                ExpenseModificationDialog dialog = new ExpenseModificationDialog(new javax.swing.JFrame(), true);
//                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//                    @Override
//                    public void windowClosing(java.awt.event.WindowEvent e) {
//                        System.exit(0);
//                    }
//                });
//                dialog.setVisible(true);
//            }
//        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1UpdateExpense;
    private javax.swing.JButton jButton2DeleteExpense;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBoxModCategory;
    private com.toedter.calendar.JDateChooser jDateChooserModDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField jTextFieldModAmount;
    private javax.swing.JTextField jTextFieldModDescription;
    // End of variables declaration//GEN-END:variables
}
