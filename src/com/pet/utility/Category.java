package com.pet.utility;
import com.pet.frames.AlertPopupDanger;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import personal.expense.tracker.PersonalExpenseTracker;
import com.pet.frames.*;
import java.util.ArrayList;
import java.util.List;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author wick
 */
public class Category {

public static boolean checkCategory(String category)
{    
   Connection conn=DBConnection.getConnection();
   try
   {
       PreparedStatement ps=conn.prepareStatement("select * from Category where category_name=?;");
       ps.setString(1, category);
       ResultSet rs=ps.executeQuery();
       return rs.next();
   }catch(Exception e)
   {
       new AlertPopupDanger(null, "Database Connection failed");
   }
   return false;
 }

public static boolean addCategory(String category)
{
       Connection conn=DBConnection.getConnection();
   try
   {
       PreparedStatement ps=conn.prepareStatement("insert into Category (category_name,user_id) values (?,?);");
              
       ps.setString(1, category);
       ps.setInt(2, PersonalExpenseTracker.userId);

       return ps.executeUpdate()>0;        
       
   }catch(Exception e)
   {
       new AlertPopupDanger(null, "Database Connection failed");
   }
   return false;
}

public static Object [][] getAllCategories()
{
    Connection conn=DBConnection.getConnection();
    Object[][] data = null;
    try{
    PreparedStatement ps=conn.prepareStatement("select category_id, category_name from Category where user_id=?");
    ps.setInt(1, PersonalExpenseTracker.userId);
     ResultSet resultSet = ps.executeQuery();
            ResultSetMetaData metaData = resultSet.getMetaData();

            // Get the number of columns in the result set
            int columnCount = metaData.getColumnCount();

            // Initialize a List to hold the rows of data
            List<Object[]> rows = new ArrayList<>();

            // Process each row in the result set
            while (resultSet.next()) {
                // Create an array to hold the data for the current row
                Object[] row = new Object[columnCount];
                // Populate the array with column values
                for (int i = 1; i <= columnCount; i++) {
                    row[i - 1] = resultSet.getObject(i);
                }
                // Add the row to the list
                rows.add(row);
            }
            // Convert the List to a 2D array
            data = new Object[rows.size()][columnCount];
            data = rows.toArray(data);
    
    }catch(Exception e)
    {
        new AlertPopupDanger(null, "Database Connection failed");
    }
return data;
}

public static boolean updateCategory(int id ,String category)
{
   Connection conn=DBConnection.getConnection();
   try{
     PreparedStatement ps=conn.prepareCall("update Category set category_name=? where category_id=? ;");
     ps.setString(1, category);
     ps.setInt(2, id);
     
     return ps.executeUpdate()>0;
   }
   catch(Exception e)
   {
       new AlertPopupDanger(null, "Databse connection failed");
   }
   return false;
}

public static boolean deleteCategory(int id)
{
   Connection conn=DBConnection.getConnection();
   try{
     PreparedStatement ps=conn.prepareCall("delete from Category where category_id=? ");
     ps.setInt(1, id);
     
     return ps.executeUpdate()>0;
   }
   catch(Exception e)
   {
       new AlertPopupDanger(null, "Databse connection failed");
   }
   return false;
}


public static int getCategoryIDByName(String category)
{
    Connection conn=DBConnection.getConnection();
    int categoryId=-1;
    try{
        PreparedStatement ps=conn.prepareCall("select category_id from Category where category_name=? and user_id=?");
        ps.setString(1, category);
        ps.setInt(2, PersonalExpenseTracker.userId);
        
         ResultSet resultSet = ps.executeQuery();

        if (resultSet.next()) {
            categoryId = resultSet.getInt("category_id");
        }
        
    }catch(Exception e)
    {
        new AlertPopupDanger(null, "Databse Connection failed");
    }
    return categoryId;
}    

}
