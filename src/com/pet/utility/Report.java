/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pet.utility;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
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
        // Use the MONTH and YEAR functions to filter by the current month and year
        String query = "SELECT SUM(amount) FROM Expense WHERE MONTH(date) = MONTH(CURRENT_DATE) AND YEAR(date) = YEAR(CURRENT_DATE) AND user_id = ?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setInt(1, PersonalExpenseTracker.userId);
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
        // Use the YEAR function to filter by the current year
        String query = "SELECT SUM(amount) FROM Expense WHERE YEAR(date) = YEAR(CURRENT_DATE) AND user_id = ?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setInt(1, PersonalExpenseTracker.userId);
        ResultSet rs = ps.executeQuery();
        
        if (rs.next()) {
            return rs.getLong(1);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return 0;
}
 
 
 
    
 
//    datewise data

    public static Object[][] getDatewiseReport(String date) {

        

        Connection conn = DBConnection.getConnection();
        List<Object[]> resultData = new ArrayList<>();

        String query = "SELECT c.category_name, COALESCE(SUM(e.amount), 0) AS total_amount " +
               "FROM Category c " +
               "LEFT JOIN Expense e ON c.category_id = e.category_id AND e.user_id = ? AND e.date = ? " +
               "WHERE c.user_id = ? " +
               "GROUP BY c.category_name " +
               "ORDER BY total_amount DESC";
        
        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, PersonalExpenseTracker.userId);
            ps.setString(2, date);
            ps.setInt(3, PersonalExpenseTracker.userId);

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    String category = rs.getString(1);
                    double amount = rs.getDouble(2);
                    resultData.add(new Object[]{category, amount});
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return resultData.toArray(new Object[0][]);
    }
    
//    monthwise data
    
    public static Object[][] monthwiseReport(int month, int year) {
    Connection conn = DBConnection.getConnection();
    List<Object[]> resultData = new ArrayList<>();

    try {
        // Create a date range for the entire month
SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
java.util.Date startDate = dateFormat.parse(year + "-" + (month + 1) + "-01");
Date endDate = new Date(startDate.getTime());
endDate.setMonth(endDate.getMonth() + 1);
endDate.setDate(endDate.getDate() - 1);

// Use java.sql.Timestamp for setting parameters
Timestamp startDateSql = new Timestamp(startDate.getTime());
Timestamp endDateSql = new Timestamp(endDate.getTime());


        // Query to get category-wise expenses within the specified date range
//        String query = "SELECT c.category_name, SUM(e.amount) " +
//                       "FROM Category c " +
//                       "LEFT JOIN Expense e ON c.category_id = e.category_id " +
//                       "WHERE e.date BETWEEN ? AND ? " +
//                       "GROUP BY c.category_name";
//
//        PreparedStatement ps = conn.prepareStatement(query);
//        ps.setDate(1, new java.sql.Date(startDate.getTime()));
//        ps.setDate(2, new java.sql.Date(endDate.getTime()));

String query = "SELECT c.category_name, COALESCE(SUM(e.amount), 0) AS total_amount " +
               "FROM Category c " +
               "LEFT JOIN Expense e ON c.category_id = e.category_id AND e.date BETWEEN ? AND ? AND e.user_id = ? " +
               "WHERE c.user_id = ? " +
               "GROUP BY c.category_name " +
               "ORDER BY total_amount DESC";

PreparedStatement ps = conn.prepareStatement(query);
ps.setTimestamp(1, startDateSql);
ps.setTimestamp(2, endDateSql);
ps.setInt(3, PersonalExpenseTracker.userId);
ps.setInt(4, PersonalExpenseTracker.userId);

        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            String categoryName = rs.getString(1);
            double amount = rs.getDouble(2);

            // Add data to the result list
            Object[] rowData = {categoryName, amount};
            resultData.add(rowData);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }

    // Convert the list to a 2D array for return
    return resultData.toArray(new Object[0][]);
}
    
    
//    yearwise data
    
    public static Object[][] yearwiseReport(int year) {
    Connection conn = DBConnection.getConnection();
    try {
        // Create date range for the entire year
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date startDate=null;
        try{
         startDate = dateFormat.parse(year + "-01-01");            
        }catch(ParseException ps)
        {
            System.out.println("parse exception occured");
        }

        Date endDate = new Date(startDate.getTime());
        endDate.setYear(endDate.getYear() + 1);
        endDate.setDate(endDate.getDate() - 1);

        // Use java.sql.Timestamp for setting parameters
        Timestamp startDateSql = new Timestamp(startDate.getTime());
        Timestamp endDateSql = new Timestamp(endDate.getTime());

        // Query to get category-wise expenses within the specified date range for the user
String query = "SELECT c.category_name, COALESCE(SUM(e.amount), 0) AS total_amount " +
               "FROM Category c " +
               "LEFT JOIN Expense e ON c.category_id = e.category_id AND e.date BETWEEN ? AND ? AND e.user_id = ? " +
               "WHERE c.user_id = ? " +
               "GROUP BY c.category_name " +
               "ORDER BY total_amount DESC";

        PreparedStatement ps = conn.prepareStatement(query);
ps.setTimestamp(1, startDateSql);
ps.setTimestamp(2, endDateSql);
ps.setInt(3, PersonalExpenseTracker.userId);
ps.setInt(4, PersonalExpenseTracker.userId);

        ResultSet rs = ps.executeQuery();
        List<Object[]> resultData = new ArrayList<>();

        while (rs.next()) {
            String category = rs.getString(1);
            double amount = rs.getDouble(2);
            resultData.add(new Object[]{category, amount});
        }

        return resultData.toArray(new Object[0][]);

    } catch (SQLException  e) {
        e.printStackTrace();
    }
    return null;
}

    
    
}
    
   
