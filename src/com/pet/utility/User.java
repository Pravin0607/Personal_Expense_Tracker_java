
package com.pet.utility;

import com.pet.frames.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import personal.expense.tracker.PersonalExpenseTracker;


/**
 *
 * @author wick
 */
public class User 
{


   
    public static void registerUser(String fname,String lname,String email,String username,String password)
    {
        Connection conn=DBConnection.getConnection();
        try{
        PreparedStatement ps=conn.prepareStatement("INSERT INTO User (first_name,last_name,email,password,username) VALUES (?,?,?,?,?);");
        ps.setString(1, fname);
        ps.setString(2, lname);
        ps.setString(3, email);
        ps.setString(4, password);
        ps.setString(5, username);
        
        if(ps.executeUpdate()>0)
        {
            new AlertPopupSuccess(null, "User Registered Succesfully you can login.");
        }
      else
        {
           
            new AlertPopupDanger(null,"Failed to register Register Again.");
        }
        }catch(Exception e)
        {
            new AlertPopupDanger(null,"Database Connection failed.");
            e.printStackTrace();
        }

    }

    public static void setVariables(String username)
    {
                Connection conn=DBConnection.getConnection();
        try
        {
            PreparedStatement ps=conn.prepareStatement("SELECT * FROM User WHERE username=?;");
            ps.setString(1, username);
            
            ResultSet rs=ps.executeQuery();
            
            if(rs.next())
            {
                PersonalExpenseTracker.username=username;
                PersonalExpenseTracker.userId=rs.getInt(1);
                PersonalExpenseTracker.fname=rs.getString(2);
                PersonalExpenseTracker.lname=rs.getString(3);
                PersonalExpenseTracker.email=rs.getString(4);
                System.out.println(username+" "+rs.getInt(1));
            }
            
                
        } catch(Exception e)
        {
            new AlertPopupDanger(null, "Database connection failed");
            e.printStackTrace();
         }        
    }
    
    public static boolean login(String username,String password)
    {
        Connection conn=DBConnection.getConnection();
        try
        {
            PreparedStatement ps=conn.prepareStatement("SELECT * FROM User WHERE username=? and password=? ;");
            ps.setString(1, username);
            ps.setString(2, password);
            
            ResultSet rs=ps.executeQuery();
            
            if(rs.next())
            {
                PersonalExpenseTracker.username=username;
                PersonalExpenseTracker.userId=rs.getInt(1);
                PersonalExpenseTracker.fname=rs.getString(2);
                PersonalExpenseTracker.lname=rs.getString(3);
                PersonalExpenseTracker.email=rs.getString(4);
                System.out.println(username+" "+rs.getInt(1));
                return true;
            }
            else
            {
               return false;                
            }
                
        } catch(Exception e)
        {
            new AlertPopupDanger(null, "Database connection failed");
            e.printStackTrace();
            return false;
        }
    }
   
//   checks username availability
   public static boolean checkUserName(String name)
   {
     Connection conn=DBConnection.getConnection();
     try{
        PreparedStatement ps=conn.prepareStatement("select username from User where username=?");
        ps.setString(1, name);
        ResultSet rs = ps.executeQuery();
        // If the result set has any rows, then the username already exists
        return rs.next();
     }catch(SQLException e)
     {
         e.printStackTrace();
     }
     return false;
   }

   
   public static boolean updateUser(String fname,String lname,String email,String username,String newpassword,String oldpassword)
   {
      Connection conn=DBConnection.getConnection();
      try{
          PreparedStatement ps=conn.prepareCall("update User set first_name=?,last_name=?,email=?,password=?,username=? where user_id=? and password=?");
           ps.setString(1, fname);
                      ps.setString(2,lname );
                                 ps.setString(3, email);
                                            ps.setString(4, newpassword);
                                            ps.setString(5, username);
                                                       ps.setInt(6,PersonalExpenseTracker.userId );
                                                       ps.setString(7, oldpassword);
                                                       
                                                        int rowsUpdated = ps.executeUpdate();
        // Check if any rows were updated
        PersonalExpenseTracker.username=username;
        PersonalExpenseTracker.fname=fname;
        PersonalExpenseTracker.lname=lname;
        PersonalExpenseTracker.email=email;
        
        
        
                                                       return rowsUpdated > 0;
                                                       
             }
               catch(Exception e)
          {   
                      new AlertPopupDanger(null, "Database connection failed");
          return false;
          }
   }
   
   
}
