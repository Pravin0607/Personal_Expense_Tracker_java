/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pet.utility;
import java.sql.*;
import personal.expense.tracker.PersonalExpenseTracker;
/**
 *
 * @author wick
 */
public class Report {
    public static long totalMoneySpent() {
        Connection conn = DBConnection.getConnection();
        try {
            String query = "SELECT SUM(amount) FROM Expense where user_id="+PersonalExpenseTracker.userId+";";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                return rs.getLong(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
    
public static double totalMoneySpentToday() {
        Connection conn = DBConnection.getConnection();
        try {
            String query = "SELECT SUM(amount) FROM Expense WHERE DATE(date) = CURRENT_DATE and user_id="+PersonalExpenseTracker.userId+";";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                return rs.getDouble(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }

public static double totalMoneySpentThisMonth() {
    Connection conn = DBConnection.getConnection();
    try {
        // Use the MONTH function to filter by the current month
        String query = "SELECT SUM(amount) FROM Expense WHERE MONTH(date) = MONTH(CURRENT_DATE) and user_id="+PersonalExpenseTracker.userId+";";
        PreparedStatement ps = conn.prepareStatement(query);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            return rs.getDouble(1);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return 0;
}


 public static long totalMoneySpentThisYear() {
        Connection conn = DBConnection.getConnection();
        try {
            String query = "SELECT SUM(amount) FROM Expense WHERE YEAR(CURRENT_DATE) and user_id = "+PersonalExpenseTracker.userId+";";
            PreparedStatement ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                return rs.getLong(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
 
 
 

    public static void todayCategorywise()
    {
        
    }
    
        public static void monthlyCategorywise()
    {
        
    }
        
    public static void yearlycategorywise()
    {
        
    }
    
}
