
package com.pet.frames;
import com.pet.utility.*;
import personal.expense.tracker.PersonalExpenseTracker;
import java.awt.Point;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.*;

public class Dashboard extends javax.swing.JFrame {


    public Dashboard() {
        initComponents();
    }
   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tabsCategory = new javax.swing.JTabbedPane();
        jPanelHome = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lbltotalYear = new javax.swing.JLabel();
        lbltotalMonth = new javax.swing.JLabel();
        lbltotaltoday = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        lbltotal = new javax.swing.JLabel();
        jPanelExpenses = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldExpenseAmount = new javax.swing.JTextField();
        jComboBoxExpenseCategory = new javax.swing.JComboBox<>();
        jButtonExpenseAdd = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jTextFieldExpenseDescription = new javax.swing.JTextField();
        jDateChooserExpenseDate = new com.toedter.calendar.JDateChooser();
        expenseAddErrorLabel = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableExpense = new javax.swing.JTable();
        jPanelCtegory = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldCategory = new javax.swing.JTextField();
        jButtonAddCategory = new javax.swing.JButton();
        jLabelCategoryErrror = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCategory = new javax.swing.JTable();
        jSeparator2 = new javax.swing.JSeparator();
        jPanelReports = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableDatewiseExpense = new javax.swing.JTable();
        jButtonDaywiseReportGenerate = new javax.swing.JButton();
        jDateChooserDaywiseDate = new com.toedter.calendar.JDateChooser();
        jLabel31 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableMonthwiseReport = new javax.swing.JTable();
        jLabel28 = new javax.swing.JLabel();
        jButtonMonthwiseReportGenerate = new javax.swing.JButton();
        jLabel29 = new javax.swing.JLabel();
        jMonthChooserMonthwise = new com.toedter.calendar.JMonthChooser();
        jYearChooserMonthWise = new com.toedter.calendar.JYearChooser();
        jPanel7 = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jButtonYearwiseReportGenerate = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableYearwiseReport = new javax.swing.JTable();
        jYearChooserYearwise = new com.toedter.calendar.JYearChooser();
        jPanelProfile = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jTextField4Fname = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField5lname = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jTextField6email = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jPasswordField1passwordold = new javax.swing.JPasswordField();
        jButtonUpdateProfile = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jTextField4Username = new javax.swing.JTextField();
        jPasswordField1passwordnew = new javax.swing.JPasswordField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19UsernameError = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        headerPanel.setBackground(new java.awt.Color(153, 255, 153));

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 20)); // NOI18N
        jLabel1.setText("Personal Expense Tracker");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap(129, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(146, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        tabsCategory.setBackground(new java.awt.Color(153, 255, 204));
        tabsCategory.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tabsCategoryStateChanged(evt);
            }
        });

        jPanelHome.setBackground(new java.awt.Color(204, 204, 255));

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel2.setText("Home");

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 14)); // NOI18N
        jLabel3.setText("Hello! "+PersonalExpenseTracker.fname +" Welcome to the Personal Expense Tracker.");

        jLabel19.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel19.setText("Money Spent This Year : ");

        jLabel20.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel20.setText("Money Spent This Month :");

        jLabel21.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel21.setText("Money Spent Today :");

        lbltotalYear.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lbltotalYear.setForeground(new java.awt.Color(204, 0, 51));
        lbltotalYear.setText(Long.toString(Report.totalMoneySpentThisYear())+" Rs");

        lbltotalMonth.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lbltotalMonth.setForeground(new java.awt.Color(204, 0, 51));
        lbltotalMonth.setText(Double.toString(Report.totalMoneySpentThisMonth())+" Rs");

        lbltotaltoday.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lbltotaltoday.setForeground(new java.awt.Color(204, 0, 51));
        lbltotaltoday.setText(Double.toString(Report.totalMoneySpentToday())+" Rs");

        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel22.setText("Total Money Spent : ");

        lbltotal.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        lbltotal.setForeground(new java.awt.Color(204, 0, 51));
        lbltotal.setText(Long.toString(Report.totalMoneySpent())+" Rs");

        javax.swing.GroupLayout jPanelHomeLayout = new javax.swing.GroupLayout(jPanelHome);
        jPanelHome.setLayout(jPanelHomeLayout);
        jPanelHomeLayout.setHorizontalGroup(
            jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHomeLayout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addGroup(jPanelHomeLayout.createSequentialGroup()
                        .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel19)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel22))
                        .addGap(36, 36, 36)
                        .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbltotaltoday, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lbltotalMonth, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbltotalYear, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 154, Short.MAX_VALUE)))))
                .addContainerGap(580, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHomeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHomeLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(572, 572, 572))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelHomeLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(544, 544, 544))))
        );
        jPanelHomeLayout.setVerticalGroup(
            jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelHomeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(49, 49, 49)
                .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(lbltotal))
                .addGap(18, 18, 18)
                .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(lbltotalYear))
                .addGap(29, 29, 29)
                .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(lbltotalMonth))
                .addGap(31, 31, 31)
                .addGroup(jPanelHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(lbltotaltoday))
                .addGap(75, 75, 75)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(229, Short.MAX_VALUE))
        );

        tabsCategory.addTab("Home", jPanelHome);

        jPanelExpenses.setBackground(new java.awt.Color(204, 204, 255));

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel4.setText("Expense");

        jLabel8.setText("Enter Amount");

        jLabel9.setText("Select Category");

        jLabel10.setText("Date");

        jTextFieldExpenseAmount.setToolTipText("Enter Amount");

        jComboBoxExpenseCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();

        // Assuming you have a method getAllCategories in your Category class
        Object catdata[][] = Category.getAllCategories();

        if (catdata != null) {
            for (Object[] row : catdata) {
                comboBoxModel.addElement((String) row[1]); // Assuming the first column contains strings
            }
        }

        jComboBoxExpenseCategory.setModel(comboBoxModel);
        jComboBoxExpenseCategory.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBoxExpenseCategoryPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jComboBoxExpenseCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxExpenseCategoryActionPerformed(evt);
            }
        });

        jButtonExpenseAdd.setText("Add");
        jButtonExpenseAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExpenseAddActionPerformed(evt);
            }
        });

        jLabel11.setText("Description");

        jTextFieldExpenseDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldExpenseDescriptionActionPerformed(evt);
            }
        });

        expenseAddErrorLabel.setForeground(new java.awt.Color(255, 51, 51));
        expenseAddErrorLabel.setText("  ");

        jLabel26.setBackground(new java.awt.Color(153, 153, 255));
        jLabel26.setForeground(new java.awt.Color(255, 51, 102));
        jLabel26.setText("Note : Click on Expense Row to modify the Expenses");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jTextFieldExpenseAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(89, 89, 89)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxExpenseCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jDateChooserExpenseDate, javax.swing.GroupLayout.DEFAULT_SIZE, 294, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jTextFieldExpenseDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButtonExpenseAdd)
                        .addGap(15, 15, 15))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(expenseAddErrorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldExpenseDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldExpenseAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBoxExpenseCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButtonExpenseAdd))
                            .addComponent(jDateChooserExpenseDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(expenseAddErrorLabel)
                    .addComponent(jLabel26))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setMinimumSize(new java.awt.Dimension(50, 20));

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        jTableExpense.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTableExpense.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Amount", "Category", "Date", "Description"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Double.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        //loading data
        DefaultTableModel dmExpense=(DefaultTableModel)jTableExpense.getModel();
        Object[][] dataExpense = Expense.getAllExpenses();

        // Check if data is not null
        if (dataExpense != null) {
            // Iterate through the rows and add them to the DefaultTableModel
            for (Object[] row : dataExpense) {
                dmExpense.addRow(row);
            }
        } else {
            // Handle the case when data is null or empty
            System.out.println("No data retrieved from the database.");
        }
        jTableExpense.setRowHeight(30);
        jTableExpense.setShowHorizontalLines(true);
        jTableExpense.setShowVerticalLines(true);
        jTableExpense.getTableHeader().setReorderingAllowed(false);
        jTableExpense.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableExpenseMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableExpense);
        if (jTableExpense.getColumnModel().getColumnCount() > 0) {
            jTableExpense.getColumnModel().getColumn(0).setResizable(false);
            jTableExpense.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTableExpense.getColumnModel().getColumn(1).setResizable(false);
            jTableExpense.getColumnModel().getColumn(1).setPreferredWidth(50);
            jTableExpense.getColumnModel().getColumn(2).setResizable(false);
            jTableExpense.getColumnModel().getColumn(3).setResizable(false);
        }

        javax.swing.GroupLayout jPanelExpensesLayout = new javax.swing.GroupLayout(jPanelExpenses);
        jPanelExpenses.setLayout(jPanelExpensesLayout);
        jPanelExpensesLayout.setHorizontalGroup(
            jPanelExpensesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelExpensesLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanelExpensesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1188, Short.MAX_VALUE))
                .addGap(28, 28, 28))
        );
        jPanelExpensesLayout.setVerticalGroup(
            jPanelExpensesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelExpensesLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE))
        );

        tabsCategory.addTab("Expense", jPanelExpenses);

        jPanelCtegory.setBackground(new java.awt.Color(204, 204, 255));

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel5.setText("Category");

        jLabel14.setText("Enter Category");

        jTextFieldCategory.setToolTipText("Enter Amount");
        jTextFieldCategory.getDocument().addDocumentListener(new DocumentListener(){

            public void check()
            {
                String category=jTextFieldCategory.getText();
                if(category.isEmpty() || category==null || category.equals(" "))
                {
                    jButtonAddCategory.setEnabled(false);
                    jLabelCategoryErrror.setText("Enter Category");
                }
                else
                {
                    if(Category.checkCategory(category))
                    {
                        jButtonAddCategory.setEnabled(false);
                        jLabelCategoryErrror.setText("Category Already Available");
                        //                 jLabelCategoryErrror.setForeground(Color.RED);
                    }
                    else
                    {
                        jButtonAddCategory.setEnabled(true);
                        jLabelCategoryErrror.setText("Category Available");
                        //                 jLabelCategoryErrror.setForeground(Color.GREEN);
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

        jButtonAddCategory.setText("Add Category");
        jButtonAddCategory.setEnabled(false);
        jButtonAddCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAddCategoryMouseClicked(evt);
            }
        });
        jButtonAddCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddCategoryActionPerformed(evt);
            }
        });

        jLabelCategoryErrror.setText(" ");

        jLabel30.setForeground(new java.awt.Color(255, 51, 102));
        jLabel30.setText("Note : Click on Expense Row to modify the Category");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabelCategoryErrror, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldCategory, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(jButtonAddCategory))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(198, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAddCategory))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelCategoryErrror)
                    .addComponent(jLabel30))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jTableCategory.setModel(
            new DefaultTableModel()
        );
        DefaultTableModel dm=(DefaultTableModel)jTableCategory.getModel();
        dm.addColumn("Category id");
        dm.addColumn("Category Name");

        // Assuming getAllCategories() returns Object[][] data
        Object[][] data = Category.getAllCategories();

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

        jTableCategory.addMouseListener(new java.awt.event.MouseAdapter(){
            public void mouseClicked(java.awt.event.MouseEvent evt)
            {

                Point point = evt.getPoint();
                // Get the row index based on the clicked point
                int row = jTableCategory.rowAtPoint(point);
                // Get the value from the first cell of the clicked row
                // check if they have not clicked on the header row
                if (row != -1)
                {
                    int id =(int) jTableCategory.getValueAt(row, 0);
                    String cat = (String) jTableCategory.getValueAt(row, 1);
                    System.out.println("Value in the first cell of clicked row: " + id);

                    new CategoryModificationDialog(null,true,id,cat,(DefaultTableModel)jTableCategory.getModel()).show();

                }

            }
        }
    );
    jScrollPane2.setViewportView(jTableCategory);

    javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
    jPanel5.setLayout(jPanel5Layout);
    jPanel5Layout.setHorizontalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1028, Short.MAX_VALUE)
    );
    jPanel5Layout.setVerticalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
            .addContainerGap())
    );

    jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

    javax.swing.GroupLayout jPanelCtegoryLayout = new javax.swing.GroupLayout(jPanelCtegory);
    jPanelCtegory.setLayout(jPanelCtegoryLayout);
    jPanelCtegoryLayout.setHorizontalGroup(
        jPanelCtegoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanelCtegoryLayout.createSequentialGroup()
            .addContainerGap(104, Short.MAX_VALUE)
            .addGroup(jPanelCtegoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jLabel5)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jSeparator2))
            .addContainerGap(105, Short.MAX_VALUE))
    );
    jPanelCtegoryLayout.setVerticalGroup(
        jPanelCtegoryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanelCtegoryLayout.createSequentialGroup()
            .addGap(18, 18, 18)
            .addComponent(jLabel5)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(13, 13, 13)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
    );

    tabsCategory.addTab("Categories", jPanelCtegory);

    jPanelReports.setBackground(new java.awt.Color(204, 204, 255));

    jLabel6.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
    jLabel6.setText("Reports");

    jTabbedPane1.setBackground(new java.awt.Color(204, 153, 255));

    jLabel23.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
    jLabel23.setText("Todays Report");

    jTableDatewiseExpense.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {

        },
        new String [] {
            "Category Name", "Money Spent (Rs)"
        }
    ));
    jScrollPane5.setViewportView(jTableDatewiseExpense);

    jButtonDaywiseReportGenerate.setText("Update Report");
    jButtonDaywiseReportGenerate.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonDaywiseReportGenerateActionPerformed(evt);
        }
    });

    //Calendar today = Calendar.getInstance();
    Date today=new Date();
    jDateChooserDaywiseDate.setDate(today);

    jLabel31.setText("Select a date :");

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane5))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(547, 547, 547)
                    .addComponent(jLabel23)
                    .addGap(0, 574, Short.MAX_VALUE)))
            .addContainerGap())
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addGap(0, 0, Short.MAX_VALUE)
            .addComponent(jLabel31, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(jDateChooserDaywiseDate, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addComponent(jButtonDaywiseReportGenerate)
            .addGap(458, 458, 458))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel23)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jButtonDaywiseReportGenerate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jDateChooserDaywiseDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap())
    );

    jTabbedPane1.addTab("Daywise", jPanel1);

    jLabel24.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
    jLabel24.setText("Monthly Report");

    jTableMonthwiseReport.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {

        },
        new String [] {
            "Category Name", "Money Spent (Rs)"
        }
    ));
    jScrollPane4.setViewportView(jTableMonthwiseReport);

    jLabel28.setText("Year :");

    jButtonMonthwiseReportGenerate.setText("Generate Report");
    jButtonMonthwiseReportGenerate.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonMonthwiseReportGenerateActionPerformed(evt);
        }
    });

    jLabel29.setText("Month :");

    javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
    jPanel8.setLayout(jPanel8Layout);
    jPanel8Layout.setHorizontalGroup(
        jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel8Layout.createSequentialGroup()
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane4)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel24)
                    .addGap(0, 0, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                    .addContainerGap(317, Short.MAX_VALUE)
                    .addComponent(jLabel29)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jMonthChooserMonthwise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jLabel28)
                    .addGap(18, 18, 18)
                    .addComponent(jYearChooserMonthWise, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(41, 41, 41)
                    .addComponent(jButtonMonthwiseReportGenerate)
                    .addGap(346, 346, 346)))
            .addContainerGap())
    );
    jPanel8Layout.setVerticalGroup(
        jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel8Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel24)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel8Layout.createSequentialGroup()
                    .addComponent(jButtonMonthwiseReportGenerate)
                    .addGap(0, 0, Short.MAX_VALUE))
                .addComponent(jMonthChooserMonthwise, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addComponent(jYearChooserMonthWise, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel29, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE))
    );

    jTabbedPane1.addTab("Monthwise", jPanel8);

    jLabel25.setFont(new java.awt.Font("Liberation Sans", 1, 15)); // NOI18N
    jLabel25.setText("Yearly Report");

    jLabel27.setText("Year:");

    jButtonYearwiseReportGenerate.setText("Generate Report");
    jButtonYearwiseReportGenerate.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonYearwiseReportGenerateActionPerformed(evt);
        }
    });

    jTableYearwiseReport.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {

        },
        new String [] {
            "Category", "Money Spent (Rs)"
        }
    ) {
        boolean[] canEdit = new boolean [] {
            true, false
        };

        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
        }
    });
    jScrollPane3.setViewportView(jTableYearwiseReport);

    javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
    jPanel7.setLayout(jPanel7Layout);
    jPanel7Layout.setHorizontalGroup(
        jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel7Layout.createSequentialGroup()
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(471, 471, 471)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel25)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(jYearChooserYearwise, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonYearwiseReportGenerate)
                    .addGap(433, 433, 433)))
            .addContainerGap())
    );
    jPanel7Layout.setVerticalGroup(
        jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel7Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel25)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jButtonYearwiseReportGenerate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jYearChooserYearwise, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel27, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 459, Short.MAX_VALUE)
            .addContainerGap())
    );

    jTabbedPane1.addTab("Yearwise", jPanel7);

    javax.swing.GroupLayout jPanelReportsLayout = new javax.swing.GroupLayout(jPanelReports);
    jPanelReports.setLayout(jPanelReportsLayout);
    jPanelReportsLayout.setHorizontalGroup(
        jPanelReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelReportsLayout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel6)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGroup(jPanelReportsLayout.createSequentialGroup()
            .addComponent(jTabbedPane1)
            .addContainerGap())
    );
    jPanelReportsLayout.setVerticalGroup(
        jPanelReportsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanelReportsLayout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel6)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jTabbedPane1)
            .addContainerGap())
    );

    tabsCategory.addTab("Reports", jPanelReports);

    jPanelProfile.setBackground(new java.awt.Color(204, 204, 255));

    jLabel7.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
    jLabel7.setText("Profile");

    jLabel12.setText("First Name :");

    jTextField4Fname.setText(PersonalExpenseTracker.fname);
    jTextField4Fname.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jTextField4FnameActionPerformed(evt);
        }
    });

    jLabel13.setText("Last Name :");

    jTextField5lname.setText(PersonalExpenseTracker.lname);
    jTextField5lname.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jTextField5lnameActionPerformed(evt);
        }
    });

    jLabel15.setText("Email :");

    jTextField6email.setText(PersonalExpenseTracker.email);

    jLabel16.setText("Old Password :");

    jPasswordField1passwordold.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jPasswordField1passwordoldActionPerformed(evt);
        }
    });

    jButtonUpdateProfile.setText("Update");
    jButtonUpdateProfile.setEnabled(false);
    jButtonUpdateProfile.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButtonUpdateProfileActionPerformed(evt);
        }
    });

    jLabel17.setText("Uesrname :");

    jTextField4Username.setText(PersonalExpenseTracker.username);
    jTextField4Username.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jTextField4UsernameActionPerformed(evt);
        }
    });
    jTextField4Username.getDocument().addDocumentListener(new DocumentListener()
        {

            public void check()
            {
                String username = jTextField4Username.getText().trim();
                if(!username.isEmpty())
                {
                    if(jTextField4Username.getText().equals(PersonalExpenseTracker.username))
                    {
                        jLabel19UsernameError.setText("Present username");
                        jButtonUpdateProfile.setEnabled(true);
                    }
                    else
                    {
                        if(User.checkUserName(jTextField4Username.getText()))
                        {
                            jLabel19UsernameError.setText("username unavailable");
                            jButtonUpdateProfile.setEnabled(false);
                        }
                        else
                        {
                            jLabel19UsernameError.setText("username available");
                            jButtonUpdateProfile.setEnabled(true);
                        }

                    }
                }
                else
                {
                    jLabel19UsernameError.setText("empty spaces are not allowed");
                    jButtonUpdateProfile.setEnabled(false);
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

        jPasswordField1passwordnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordField1passwordnewActionPerformed(evt);
            }
        });

        jLabel18.setText("New Password :");

        jLabel19UsernameError.setText(" ");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField6email, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jTextField4Username, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13)
                                    .addComponent(jTextField5lname, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19UsernameError, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jPasswordField1passwordnew, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(574, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField4Fname, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(jLabel18)
                            .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel6Layout.createSequentialGroup()
                                    .addComponent(jLabel16)
                                    .addGap(126, 126, 126))
                                .addComponent(jPasswordField1passwordold, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(jButtonUpdateProfile)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField4Fname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5lname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jTextField4Username, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel19UsernameError))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jTextField6email, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordField1passwordold, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordField1passwordnew, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButtonUpdateProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout jPanelProfileLayout = new javax.swing.GroupLayout(jPanelProfile);
        jPanelProfile.setLayout(jPanelProfileLayout);
        jPanelProfileLayout.setHorizontalGroup(
            jPanelProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProfileLayout.createSequentialGroup()
                .addContainerGap(82, Short.MAX_VALUE)
                .addGroup(jPanelProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanelProfileLayout.setVerticalGroup(
            jPanelProfileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelProfileLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabsCategory.addTab("Profile", jPanelProfile);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(tabsCategory))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabsCategory)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabsCategoryStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tabsCategoryStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_tabsCategoryStateChanged

    private void jButtonExpenseAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExpenseAddActionPerformed
        // TODO add your handling code here:
        double amount=0;
        Date date=jDateChooserExpenseDate.getDate();
        String desc=jTextFieldExpenseDescription.getText();        
        String category="";
        String formattedDate="";
        Object selectedValue = jComboBoxExpenseCategory.getSelectedItem();

        if (selectedValue != null && jComboBoxExpenseCategory.getItemCount()>0) 
        {
           category=selectedValue.toString();          
        }
        else
        {
            new AlertPopupDanger(null,"Select a Category or add");
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
            amount=Double.parseDouble(jTextFieldExpenseAmount.getText());
            
             // Successfully parsed as an integer
        } catch (NumberFormatException e) {
            new AlertPopupDanger(null,"Enete a valid number");
            return;
        }

        System.out.println(formattedDate+"  "+category+" "+amount+" "+desc);

        if(Expense.addExpense(PersonalExpenseTracker.userId, amount, category, formattedDate, desc,(DefaultTableModel)jTableExpense.getModel()))
        {
             new AlertPopupSuccess(null, "Expense Added");
        }
       else
        {
             new AlertPopupDanger(null, "Failed to add Expense");
        }        
    }//GEN-LAST:event_jButtonExpenseAddActionPerformed

    private void jTextFieldExpenseDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldExpenseDescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldExpenseDescriptionActionPerformed

    private void jButtonAddCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddCategoryActionPerformed
    
        // TODO add your handling code here:
        if(Category.addCategory(jTextFieldCategory.getText()))
       {
         new AlertPopupSuccess(null, "Category Added Succesfully");
         DefaultTableModel dm=(DefaultTableModel)jTableCategory.getModel();
        dm.setRowCount(0);
        
        // Notify the table that a new row has been added
                Object[][] data = Category.getAllCategories();

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
       }
       else
       {
           new AlertPopupDanger(null, "Failed to add Category");
       }
    }//GEN-LAST:event_jButtonAddCategoryActionPerformed

    private void jPasswordField1passwordoldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1passwordoldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1passwordoldActionPerformed

    private void jButtonUpdateProfileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateProfileActionPerformed
        // TODO add your handling code here
     String fname=jTextField4Fname.getText();
     String lname=jTextField5lname.getText();
     String email=jTextField6email.getText();
     String username=jTextField4Username.getText();
     String newpassword=new String(jPasswordField1passwordnew.getPassword());
     String oldpassword=new String(jPasswordField1passwordold.getPassword());
        if(User.updateUser(fname, lname, email, username, newpassword,oldpassword))
        {
            new AlertPopupSuccess(null, "Profile Updated");
        }
        else
        {
            new AlertPopupDanger(null, "Failed to update Profile");
        }
    }//GEN-LAST:event_jButtonUpdateProfileActionPerformed

    private void jTableExpenseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableExpenseMouseClicked
//        handling the row click event on table.
        Point point = evt.getPoint();
       // Get the row index based on the clicked point
        int row = jTableExpense.rowAtPoint(point);
       // Get the value from the first cell of the clicked row
       // check if they have not clicked on the header row
        if (row != -1) 
        {
          int eid =(int) jTableExpense.getValueAt(row, 0);
          double amount=(double) jTableExpense.getValueAt(row, 1);
          
          String cat=(String)jTableExpense.getValueAt(row, 2);
        
          java.sql.Date dateSql = (java.sql.Date) jTableExpense.getValueAt(row, 3);
          SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
          String date = dateFormat.format(dateSql);
          
            System.out.println(date);       
        
        String desc=(String)jTableExpense.getValueAt(row, 4);
          
          
          System.out.println("Value in the first cell of clicked row: " + eid);
          
          new ExpenseModificationDialog(null,true,eid,amount,cat,date,desc,(DefaultTableModel)jTableExpense.getModel());
          
        }
    }//GEN-LAST:event_jTableExpenseMouseClicked

    private void jButtonAddCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAddCategoryMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAddCategoryMouseClicked

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void jTextField4FnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4FnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4FnameActionPerformed

    private void jTextField5lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5lnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5lnameActionPerformed

    private void jTextField4UsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4UsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4UsernameActionPerformed

    private void jPasswordField1passwordnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordField1passwordnewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPasswordField1passwordnewActionPerformed

    private void jComboBoxExpenseCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxExpenseCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxExpenseCategoryActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        lbltotaltoday.setText(Double.toString(Report.totalMoneySpentToday()));
        
        lbltotalYear.setText(Long.toString(Report.totalMoneySpentThisYear()));
        
        
        lbltotal.setText(Long.toString(Report.totalMoneySpent()));
        
        lbltotalMonth.setText(Double.toString(Report.totalMoneySpentThisMonth()));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonMonthwiseReportGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMonthwiseReportGenerateActionPerformed
        // TODO add your handling code here:
        
        int month=jMonthChooserMonthwise.getMonth();
        int year=jYearChooserMonthWise.getYear();
        DefaultTableModel dm=(DefaultTableModel) jTableMonthwiseReport.getModel();
        dm.setRowCount(0);
        Object [][] dataMonthwise=Report.monthwiseReport(month,year);

        if (dataMonthwise != null) {
                    // Iterate through the rows and add them to the DefaultTableModel
                    for (Object[] row : dataMonthwise) {
                        dm.addRow(row);
                    }
                } else {
                    // Handle the case when data is null or empty
                    System.out.println("No data available");
                    new AlertPopupDanger(null, "No data Availabele");
                }
        
        
    }//GEN-LAST:event_jButtonMonthwiseReportGenerateActionPerformed

    private void jComboBoxExpenseCategoryPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBoxExpenseCategoryPopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();

// Assuming you have a method getAllCategories in your Category class
Object catdata[][] = Category.getAllCategories();

if (catdata != null) {
    for (Object[] row : catdata) {
        comboBoxModel.addElement((String) row[1]); // Assuming the first column contains strings
    }
}

jComboBoxExpenseCategory.setModel(comboBoxModel);

        System.out.println("categories updated");        
        
    }//GEN-LAST:event_jComboBoxExpenseCategoryPopupMenuWillBecomeInvisible

    private void jButtonDaywiseReportGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDaywiseReportGenerateActionPerformed
        // TODO add your handling code here:
       DefaultTableModel dm=(DefaultTableModel) jTableDatewiseExpense.getModel();
       dm.setRowCount(0);
       Date date=jDateChooserDaywiseDate.getDate();
            String formattedDate="";
            if(date!=null)
               {
                    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                   formattedDate = dateFormat.format(date);                   
               }

       Object [][] datewiseData=Report.getDatewiseReport(formattedDate);
       if (datewiseData != null) {
    // Iterate through the rows and add them to the DefaultTableModel
                for (Object[] row : datewiseData) {
                    dm.addRow(row);
                }
            } else {
                // Handle the case when data is null or empty
                new AlertPopupDanger(null, "no data available");
            }
       
        
    }//GEN-LAST:event_jButtonDaywiseReportGenerateActionPerformed

    private void jButtonYearwiseReportGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonYearwiseReportGenerateActionPerformed
        // TODO add your handling code here:
        
        int year=jYearChooserYearwise.getYear();
       DefaultTableModel dm=(DefaultTableModel) jTableYearwiseReport.getModel();
        dm.setRowCount(0);
        
               Object [][] yearwiseData=Report.yearwiseReport(year);
           if (yearwiseData != null) {
   
               // Iterate through the rows and add them to the DefaultTableModel
                for (Object[] row : yearwiseData) {
                    dm.addRow(row);
                }
            } else {
                // Handle the case when data is null or empty
                new AlertPopupDanger(null, "no data available");
            }
        
        
        
    }//GEN-LAST:event_jButtonYearwiseReportGenerateActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel expenseAddErrorLabel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAddCategory;
    private javax.swing.JButton jButtonDaywiseReportGenerate;
    private javax.swing.JButton jButtonExpenseAdd;
    private javax.swing.JButton jButtonMonthwiseReportGenerate;
    private javax.swing.JButton jButtonUpdateProfile;
    private javax.swing.JButton jButtonYearwiseReportGenerate;
    private javax.swing.JComboBox<String> jComboBoxExpenseCategory;
    private com.toedter.calendar.JDateChooser jDateChooserDaywiseDate;
    private com.toedter.calendar.JDateChooser jDateChooserExpenseDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel19UsernameError;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCategoryErrror;
    private com.toedter.calendar.JMonthChooser jMonthChooserMonthwise;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanelCtegory;
    private javax.swing.JPanel jPanelExpenses;
    private javax.swing.JPanel jPanelHome;
    private javax.swing.JPanel jPanelProfile;
    private javax.swing.JPanel jPanelReports;
    private javax.swing.JPasswordField jPasswordField1passwordnew;
    private javax.swing.JPasswordField jPasswordField1passwordold;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableCategory;
    private javax.swing.JTable jTableDatewiseExpense;
    private javax.swing.JTable jTableExpense;
    private javax.swing.JTable jTableMonthwiseReport;
    private javax.swing.JTable jTableYearwiseReport;
    private javax.swing.JTextField jTextField4Fname;
    private javax.swing.JTextField jTextField4Username;
    private javax.swing.JTextField jTextField5lname;
    private javax.swing.JTextField jTextField6email;
    private javax.swing.JTextField jTextFieldCategory;
    private javax.swing.JTextField jTextFieldExpenseAmount;
    private javax.swing.JTextField jTextFieldExpenseDescription;
    private com.toedter.calendar.JYearChooser jYearChooserMonthWise;
    private com.toedter.calendar.JYearChooser jYearChooserYearwise;
    private javax.swing.JLabel lbltotal;
    private javax.swing.JLabel lbltotalMonth;
    private javax.swing.JLabel lbltotalYear;
    private javax.swing.JLabel lbltotaltoday;
    private javax.swing.JTabbedPane tabsCategory;
    // End of variables declaration//GEN-END:variables
}
