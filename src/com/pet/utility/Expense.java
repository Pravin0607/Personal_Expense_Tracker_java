/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pet.utility;
import com.pet.frames.AlertPopupDanger;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import personal.expense.tracker.PersonalExpenseTracker;
/**
 *
 * @author wick
 */


public class Expense {

    public static Object[][] getAllExpenses() {
        Connection conn = DBConnection.getConnection();
        Object[][] data = null;

        try {
             // Use JOIN to get category_name from the Category table
        String query = "SELECT Expense.expense_id, Expense.amount, Category.category_name, Expense.date, Expense.description " +
                       "FROM Expense " +
                       "INNER JOIN Category ON Expense.category_id = Category.category_id " +
                       "WHERE Expense.user_id=? ORDER BY Expense.date DESC";

            PreparedStatement ps = conn.prepareStatement(query);
            
            ps.setInt(1, PersonalExpenseTracker.userId);

            ResultSet resultSet = ps.executeQuery();

            // Get the number of columns in the result set
            int columnCount = resultSet.getMetaData().getColumnCount();

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
        } catch (SQLException e) {
            e.printStackTrace();
            new AlertPopupDanger(null,"Databse Connection failed");
            // Handle the exception
        } 

        return data;
    }
    

    public static boolean addExpense(int userId, double amount, String category, String date, String description,DefaultTableModel dm) {
        Connection conn = DBConnection.getConnection();

        try {
            PreparedStatement ps = conn.prepareStatement("INSERT INTO Expense (user_id, amount, category_id, date, description) VALUES (?, ?, ?, ?, ?)");
            ps.setInt(1, userId);
            ps.setDouble(2, amount);
            // Assuming you have a method getCategoryIDByName in your code
            ps.setInt(3, Category.getCategoryIDByName(category));
            ps.setString(4, date);
            ps.setString(5, description);
            if(ps.executeUpdate() > 0)
            {
                dm.setRowCount(0);
                
                Object[][] data = Expense.getAllExpenses();
                        // Check if data is not null
                        if (data != null) {
                            // Iterate through the rows and add them to the DefaultTableModel
                            for (Object[] row : data) {
                                dm.addRow(row);
                            }
                        } else {
                            // Handle the case when data is null or empty
                            System.out.println("No data retrieved from the database.");
                        }
                return true;
            }
            else
            {
                return false;
            }
            
        } catch (SQLException e) {
           new AlertPopupDanger(null,"Database Connection Faliled");
            // Handle the exception
        } 
        return false;
    }
    
//Expense.updateExpense(eid, amount, category, formattedDate, desc,dm)    
    public static boolean updateExpense(int eid,double amount,String category,String date,String desc,DefaultTableModel dm)
    {
        Connection conn=DBConnection.getConnection();
        try{
   PreparedStatement ps = conn.prepareCall("UPDATE Expense SET amount=?, category_id=?, date=?, description=? WHERE expense_id=?");

        // Set the parameter values
        ps.setDouble(1, amount);
        ps.setInt(2, Category.getCategoryIDByName(category)); // You need to implement getCategoryIDByName
        ps.setString(3, date);
        ps.setString(4, desc);
        ps.setInt(5, eid);

        // Execute the update
        int rowsAffected = ps.executeUpdate();

        if (rowsAffected > 0) {
            // Successfully updated, now refresh the table model

                            dm.setRowCount(0);
                
                Object[][] data = Expense.getAllExpenses();
                        // Check if data is not null
                        if (data != null) {
                            // Iterate through the rows and add them to the DefaultTableModel
                            for (Object[] row : data) {
                                dm.addRow(row);
                            }
                        } else {
                            // Handle the case when data is null or empty
                            System.out.println("No data retrieved from the database.");
                        }
            
            return true;
        } else {
            // Update failed
            return false;
        }
        }catch(Exception e)
        {
            
        }
        return false;
    }
    
    public static boolean deleteExpense(int eid,DefaultTableModel dm)
    {
        Connection conn=DBConnection.getConnection();
        try{
             PreparedStatement ps=conn.prepareCall("delete from Expense Where expense_id=?");
             ps.setInt(1, eid);
             
             if(ps.executeUpdate()> 0)
             {
                                 dm.setRowCount(0);
                Object[][] data = Expense.getAllExpenses();
                        // Check if data is not null
                        if (data != null) {
                            // Iterate through the rows and add them to the DefaultTableModel
                            for (Object[] row : data) {
                                dm.addRow(row);
                            }
                        } else {
                            // Handle the case when data is null or empty
                            System.out.println("No data retrieved from the database.");
                        }
                   
                   return true;                 
             }
             else
             {
                 return false;
             }
        }catch(Exception e)
        {
            new AlertPopupDanger(null, "Database Connection Failed");
        }
       return false;
    }    
    

}
