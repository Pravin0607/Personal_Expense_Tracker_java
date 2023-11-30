
package com.pet.frames;

import personal.expense.tracker.PersonalExpenseTracker;
import com.pet.utility.*;
import java.awt.Color;
import javax.swing.event.*;
import javax.swing.*;

import javax.swing.*;

public class Register extends javax.swing.JFrame {


    public Register() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldFname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldLname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButtonCreateAccount = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPasswordFieldPassword = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldUsername = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jPasswordFieldConfirmPass = new javax.swing.JPasswordField();
        jLabelUsernameError = new javax.swing.JLabel();
        jLabelEmailError = new javax.swing.JLabel();
        jLabelEmailError1 = new javax.swing.JLabel();
        jLabelPasswordError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        jLabel1.setText("Registration Form");

        jLabel2.setText("First Name :");

        jTextFieldFname.setPreferredSize(new java.awt.Dimension(64, 30));
        jTextFieldFname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFnameActionPerformed(evt);
            }
        });
        jTextFieldFname.getDocument().addDocumentListener(new DocumentListener() {

            public void insertUpdate(DocumentEvent e)
            {
                Validation.registrationAddButtonValidation(jTextFieldFname, jTextFieldLname, jTextFieldEmail, jTextFieldUsername, jPasswordFieldPassword, jPasswordFieldConfirmPass, jButtonCreateAccount);
            }

            public void removeUpdate(DocumentEvent e)
            {
                Validation.registrationAddButtonValidation(jTextFieldFname, jTextFieldLname, jTextFieldEmail, jTextFieldUsername, jPasswordFieldPassword, jPasswordFieldConfirmPass, jButtonCreateAccount);
            }

            public void changedUpdate(DocumentEvent e) {
                // This method is not used for plain text documents
            }

        });

        jLabel3.setText("Last Name :");

        jTextFieldLname.setPreferredSize(new java.awt.Dimension(64, 30));
        jTextFieldLname.getDocument().addDocumentListener(new DocumentListener() {

            public void insertUpdate(DocumentEvent e)
            {
                Validation.registrationAddButtonValidation(jTextFieldFname, jTextFieldLname, jTextFieldEmail, jTextFieldUsername, jPasswordFieldPassword, jPasswordFieldConfirmPass, jButtonCreateAccount);
            }

            public void removeUpdate(DocumentEvent e)
            {
                Validation.registrationAddButtonValidation(jTextFieldFname, jTextFieldLname, jTextFieldEmail, jTextFieldUsername, jPasswordFieldPassword, jPasswordFieldConfirmPass, jButtonCreateAccount);
            }

            public void changedUpdate(DocumentEvent e) {
                // This method is not used for plain text documents
            }

        });

        jLabel4.setText("Email :");

        jTextFieldEmail.setPreferredSize(new java.awt.Dimension(64, 30));
        jTextFieldEmail.getDocument().addDocumentListener(new DocumentListener() {

            public  void check()
            {
                if(Validation.validateEmail(jTextFieldEmail.getText()))
                {
                    jLabelEmailError1.setText("valid Email");
                }
                else
                {
                    jLabelEmailError1.setText("invalid Email");
                }
            }
            public void insertUpdate(DocumentEvent e)
            {
                Validation.registrationAddButtonValidation(jTextFieldFname, jTextFieldLname, jTextFieldEmail, jTextFieldUsername, jPasswordFieldPassword, jPasswordFieldConfirmPass, jButtonCreateAccount);
                check();
            }

            public void removeUpdate(DocumentEvent e)
            {
                Validation.registrationAddButtonValidation(jTextFieldFname, jTextFieldLname, jTextFieldEmail, jTextFieldUsername, jPasswordFieldPassword, jPasswordFieldConfirmPass, jButtonCreateAccount);
                check();
            }

            public void changedUpdate(DocumentEvent e) {
                // This method is not used for plain text documents
            }

        });

        jLabel5.setText("Password :");

        jButtonCreateAccount.setBackground(new java.awt.Color(153, 255, 153));
        jButtonCreateAccount.setText("Create Account");
        jButtonCreateAccount.setEnabled(false);
        jButtonCreateAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCreateAccountActionPerformed(evt);
            }
        });

        jButton2.setText("Back");
        jButton2.setPreferredSize(new java.awt.Dimension(131, 40));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPasswordFieldPassword.setPreferredSize(new java.awt.Dimension(64, 30));
        jPasswordFieldPassword.getDocument().addDocumentListener(new DocumentListener() {

            public void checkpass()
            {
                String pass1=new String(jPasswordFieldPassword.getPassword());
                String pass2=new String(jPasswordFieldConfirmPass.getPassword());
                if(pass1.equals(pass2))
                {
                    jLabelPasswordError.setText("password matches");
                }
                else
                {
                    jLabelPasswordError.setText("password didn't match");
                }
            }
            public void insertUpdate(DocumentEvent e)
            {
                Validation.registrationAddButtonValidation(jTextFieldFname, jTextFieldLname, jTextFieldEmail, jTextFieldUsername, jPasswordFieldPassword, jPasswordFieldConfirmPass, jButtonCreateAccount);
                checkpass();
            }

            public void removeUpdate(DocumentEvent e)
            {
                Validation.registrationAddButtonValidation(jTextFieldFname, jTextFieldLname, jTextFieldEmail, jTextFieldUsername, jPasswordFieldPassword, jPasswordFieldConfirmPass, jButtonCreateAccount);
                checkpass();
            }

            public void changedUpdate(DocumentEvent e) {
                // This method is not used for plain text documents
            }

        });

        jLabel6.setText("User Name :");

        jTextFieldUsername.setPreferredSize(new java.awt.Dimension(64, 30));
        jTextFieldUsername.getDocument().addDocumentListener(new DocumentListener()
            {

                public void check()
                {
                    if(!jTextFieldUsername.getText().equals(" "))
                    {
                        if(User.checkUserName(jTextFieldUsername.getText()))
                        {
                            //                         jLabelUsernameError.setForeground(Color.RED);
                            jLabelUsernameError.setText("username unavailable");
                            //                         jButtonCreateAccount.setEnabled(false);
                            Validation.registrationAddButtonValidation(jTextFieldFname, jTextFieldLname, jTextFieldEmail, jTextFieldUsername, jPasswordFieldPassword, jPasswordFieldConfirmPass, jButtonCreateAccount);
                        }
                        else
                        {
                            //                         jLabelUsernameError.setForeground(Color.GREEN);
                            jLabelUsernameError.setText("username available");
                            //                         jButtonCreateAccount.setEnabled(true);
                            Validation.registrationAddButtonValidation(jTextFieldFname, jTextFieldLname, jTextFieldEmail, jTextFieldUsername, jPasswordFieldPassword, jPasswordFieldConfirmPass, jButtonCreateAccount);
                        }
                    }
                }

                public void insertUpdate(DocumentEvent e)
                {
                    check();
                }

                public void removeUpdate(DocumentEvent e)
                {
                    check();
                }

                public void changedUpdate(DocumentEvent e) {
                    // This method is not used for plain text documents
                }
            });

            jLabel7.setText("Confirm Password :");

            jPasswordFieldConfirmPass.setPreferredSize(new java.awt.Dimension(64, 30));

            jLabelUsernameError.setForeground(new java.awt.Color(255, 0, 51));
            jLabelUsernameError.setText(" ");

            jLabelEmailError.setText(" ");

            jLabelEmailError1.setForeground(new java.awt.Color(255, 0, 51));
            jLabelEmailError1.setText(" ");

            jLabelPasswordError.setForeground(new java.awt.Color(255, 0, 51));
            jLabelPasswordError.setText(" ");

            javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
            jPanel3.setLayout(jPanel3Layout);
            jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(150, 150, 150)
                    .addComponent(jButtonCreateAccount)
                    .addGap(31, 31, 31)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(151, Short.MAX_VALUE))
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabelPasswordError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextFieldFname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                        .addComponent(jPasswordFieldPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabelEmailError1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabelEmailError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jTextFieldEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(92, 92, 92)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabelUsernameError, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel3)
                        .addComponent(jLabel6)
                        .addComponent(jTextFieldLname, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                        .addComponent(jTextFieldUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPasswordFieldConfirmPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addComponent(jTextFieldLname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(37, 37, 37)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel6))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jTextFieldUsername, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabelUsernameError)
                                .addGap(8, 8, 8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabelEmailError)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabelEmailError1)
                            .addGap(18, 18, 18)))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPasswordFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jPasswordFieldConfirmPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabelPasswordError)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonCreateAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(31, 31, 31))
            );

            jPasswordFieldConfirmPass.getDocument().addDocumentListener(new DocumentListener() {
                public void checkpass()
                {
                    String pass1=new String(jPasswordFieldPassword.getPassword());
                    String pass2=new String(jPasswordFieldConfirmPass.getPassword());
                    if(pass1.equals(pass2))
                    {
                        jLabelPasswordError.setText("password matches");
                    }
                    else
                    {
                        jLabelPasswordError.setText("password didn't match");
                    }
                }
                public void insertUpdate(DocumentEvent e)
                {
                    Validation.registrationAddButtonValidation(jTextFieldFname, jTextFieldLname, jTextFieldEmail, jTextFieldUsername, jPasswordFieldPassword, jPasswordFieldConfirmPass, jButtonCreateAccount);
                    checkpass();
                }

                public void removeUpdate(DocumentEvent e)
                {
                    Validation.registrationAddButtonValidation(jTextFieldFname, jTextFieldLname, jTextFieldEmail, jTextFieldUsername, jPasswordFieldPassword, jPasswordFieldConfirmPass, jButtonCreateAccount);
                    checkpass();
                }

                public void changedUpdate(DocumentEvent e) {
                    // This method is not used for plain text documents
                }

            });

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap(91, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(194, 194, 194)
                            .addComponent(jLabel1)))
                    .addContainerGap(91, Short.MAX_VALUE))
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(25, 25, 25)
                    .addComponent(jLabel1)
                    .addGap(18, 18, 18)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(62, Short.MAX_VALUE))
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

    private void jTextFieldFnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFnameActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //        back button
        this.setVisible(false);
        PersonalExpenseTracker.mainFrame.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButtonCreateAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCreateAccountActionPerformed
        // TODO add your handling code here: 
        String fname=jTextFieldFname.getText();
        String lname=jTextFieldLname.getText();
        String email=jTextFieldEmail.getText();
        String uname=jTextFieldUsername.getText();
        char[] password=jPasswordFieldPassword.getPassword();
        char[] cnfPassword=jPasswordFieldConfirmPass.getPassword();
        
        String pass1=new String(password);
        String pass2=new String(cnfPassword);
        if(pass1.equals(pass2))
        { 
            System.out.println("user registered");
            User.registerUser(fname, lname, email,uname , pass1);
            User.setVariables(uname);
//             opening the dashboard for user
                this.setVisible(false);
               java.awt.EventQueue.invokeLater(new Runnable(){
                   public void run()
                   {
                       new Dashboard().setVisible(true);
                   }
               });                           
            
        }
        else
        {
            new AlertPopupDanger(this, "Password didn't match.");            
        }        
    }//GEN-LAST:event_jButtonCreateAccountActionPerformed

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
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonCreateAccount;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelEmailError;
    private javax.swing.JLabel jLabelEmailError1;
    private javax.swing.JLabel jLabelPasswordError;
    private javax.swing.JLabel jLabelUsernameError;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordFieldConfirmPass;
    private javax.swing.JPasswordField jPasswordFieldPassword;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldFname;
    private javax.swing.JTextField jTextFieldLname;
    private javax.swing.JTextField jTextFieldUsername;
    // End of variables declaration//GEN-END:variables

}
