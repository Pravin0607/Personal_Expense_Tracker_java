/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pet.utility;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author wick
 */
public class Validation 
{
    
 public static boolean validateEmail(String email) 
 {
        // Email validation using regex
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static boolean validateInput(String inp) 
    {
        // Input validation (non-empty, non-space)
        return inp != null && !inp.trim().isEmpty();
    }

    public static boolean validateInteger(String str) 
    {
        // Integer validation
        try 
        {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) 
        {
            return false;
        }
    }
    
    public static void registrationAddButtonValidation(JTextField fname,JTextField lname,JTextField email,JTextField username,JPasswordField password,JPasswordField password1,JButton addbutton)
    {
      String fn=fname.getText();
      String ln=lname.getText();
      String em=email.getText();
      String uname=username.getText();
      String pass1=new String(password.getPassword());
      String pass2=new String(password1.getPassword());
      
      boolean namevalidate=(validateInput(fn) && validateInput(ln) && 
                            validateInput(em) && validateInput(uname) && 
                            validateInput(pass1) && validateInput(pass2));
      
      boolean emailvalidate=validateEmail(em);
      boolean passvalidate=pass1.equals(pass2);
      
      addbutton.setEnabled(namevalidate && emailvalidate && passvalidate && User.checkUserName(uname));
    }
    
}
