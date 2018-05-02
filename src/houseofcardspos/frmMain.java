/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package houseofcardspos;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.math.BigDecimal;
import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
//import java.time.Instant;
import java.util.ArrayList;
//import java.util.Calendar;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zacha
 */
public class frmMain extends javax.swing.JFrame {

    /**
     * Creates new form frmMain
     */
    public frmMain() {
        initComponents();
    }
    public frmMain(Connection c, String u){
        initComponents();
        connection = c;
        user = u;
        lblUsername.setText(u);
    }
    public frmMain(Connection c, String u,frmLogin f){
        initComponents();
        connection = c;
        user = u;
        lblUsername.setText(u);
        frmLogin = f;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCompletionAndTotal = new javax.swing.JPanel();
        lblSubtotal = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblTax = new javax.swing.JLabel();
        btnCompleteSale = new javax.swing.JButton();
        SplitPaneMain = new javax.swing.JSplitPane();
        SplitPaneProductsSaleItems = new javax.swing.JSplitPane();
        pnlSaleItems = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstSaleItems = new javax.swing.JList<>();
        btnRemove = new javax.swing.JButton();
        pnlProducts = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        lstProducts = new javax.swing.JList<>();
        pnlItemInfo = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescription = new javax.swing.JTextArea();
        txtSelectedItemPrice = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtItemID = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtQuantity = new javax.swing.JTextField();
        pnlLogout = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        mnuMainMenuBar = new javax.swing.JMenuBar();
        mnuFile = new javax.swing.JMenu();
        mnuFileCancelSale = new javax.swing.JMenuItem();
        mnuFileCompleteSale = new javax.swing.JMenuItem();
        mnuFileClose = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("House of Cards Point of Sale");
        setMinimumSize(new java.awt.Dimension(520, 360));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lblSubtotal.setText("$0");

        jLabel5.setText("Subtotal:");

        jLabel8.setText("Tax:");

        jLabel9.setText("Total:");

        lblTotal.setText("$0");

        lblTax.setText("$0");

        btnCompleteSale.setText("Complete Sale");
        btnCompleteSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleteSaleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCompletionAndTotalLayout = new javax.swing.GroupLayout(pnlCompletionAndTotal);
        pnlCompletionAndTotal.setLayout(pnlCompletionAndTotalLayout);
        pnlCompletionAndTotalLayout.setHorizontalGroup(
            pnlCompletionAndTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCompletionAndTotalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCompletionAndTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCompleteSale)
                    .addGroup(pnlCompletionAndTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(pnlCompletionAndTotalLayout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lblSubtotal))
                        .addGroup(pnlCompletionAndTotalLayout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTax))
                        .addGroup(pnlCompletionAndTotalLayout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblTotal))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlCompletionAndTotalLayout.setVerticalGroup(
            pnlCompletionAndTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCompletionAndTotalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCompleteSale)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCompletionAndTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblSubtotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCompletionAndTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblTax))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCompletionAndTotalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lblTotal))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        SplitPaneProductsSaleItems.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        pnlSaleItems.setPreferredSize(new java.awt.Dimension(280, 250));

        jLabel1.setText("Sale Items:");

        lstSaleItems.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(lstSaleItems);

        btnRemove.setText("Remove Item");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlSaleItemsLayout = new javax.swing.GroupLayout(pnlSaleItems);
        pnlSaleItems.setLayout(pnlSaleItemsLayout);
        pnlSaleItemsLayout.setHorizontalGroup(
            pnlSaleItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(pnlSaleItemsLayout.createSequentialGroup()
                .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlSaleItemsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlSaleItemsLayout.setVerticalGroup(
            pnlSaleItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSaleItemsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRemove))
        );

        SplitPaneProductsSaleItems.setRightComponent(pnlSaleItems);

        pnlProducts.setPreferredSize(new java.awt.Dimension(280, 250));

        jLabel2.setText("Products:");

        btnAdd.setText("Add Item");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        lstProducts.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstProducts.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                lstProductsKeyPressed(evt);
            }
        });
        lstProducts.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstProductsValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(lstProducts);

        javax.swing.GroupLayout pnlProductsLayout = new javax.swing.GroupLayout(pnlProducts);
        pnlProducts.setLayout(pnlProductsLayout);
        pnlProductsLayout.setHorizontalGroup(
            pnlProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(pnlProductsLayout.createSequentialGroup()
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(pnlProductsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlProductsLayout.setVerticalGroup(
            pnlProductsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProductsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAdd))
        );

        SplitPaneProductsSaleItems.setLeftComponent(pnlProducts);

        SplitPaneMain.setRightComponent(SplitPaneProductsSaleItems);

        jLabel7.setText("Item Description:");

        txtDescription.setEditable(false);
        txtDescription.setColumns(20);
        txtDescription.setLineWrap(true);
        txtDescription.setRows(5);
        txtDescription.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txtDescription);

        txtSelectedItemPrice.setEditable(false);
        txtSelectedItemPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSelectedItemPriceActionPerformed(evt);
            }
        });

        jLabel6.setText("Selected Item ID:");

        jLabel4.setText("Selected Item Price:");

        jLabel10.setText("Quantity:");

        txtQuantity.setEditable(false);

        javax.swing.GroupLayout pnlItemInfoLayout = new javax.swing.GroupLayout(pnlItemInfo);
        pnlItemInfo.setLayout(pnlItemInfoLayout);
        pnlItemInfoLayout.setHorizontalGroup(
            pnlItemInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlItemInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlItemInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel4)
                    .addGroup(pnlItemInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtItemID, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                    .addComponent(jLabel10)
                    .addGroup(pnlItemInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtQuantity, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtSelectedItemPrice, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlItemInfoLayout.setVerticalGroup(
            pnlItemInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlItemInfoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(2, 2, 2)
                .addComponent(txtItemID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSelectedItemPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                .addContainerGap())
        );

        SplitPaneMain.setTopComponent(pnlItemInfo);

        jLabel3.setText("Logged in as:");

        btnLogout.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        btnLogout.setText("Logout");
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlLogoutLayout = new javax.swing.GroupLayout(pnlLogout);
        pnlLogout.setLayout(pnlLogoutLayout);
        pnlLogoutLayout.setHorizontalGroup(
            pnlLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogoutLayout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlLogoutLayout.setVerticalGroup(
            pnlLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogoutLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLogoutLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnlLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addComponent(lblUsername, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        mnuFile.setMnemonic('f');
        mnuFile.setText("File");

        mnuFileCancelSale.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnuFileCancelSale.setMnemonic('c');
        mnuFileCancelSale.setText("Cancel Sale");
        mnuFileCancelSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFileCancelSaleActionPerformed(evt);
            }
        });
        mnuFile.add(mnuFileCancelSale);

        mnuFileCompleteSale.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        mnuFileCompleteSale.setMnemonic('s');
        mnuFileCompleteSale.setText("Complete Sale");
        mnuFileCompleteSale.setToolTipText("");
        mnuFileCompleteSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFileCompleteSaleActionPerformed(evt);
            }
        });
        mnuFile.add(mnuFileCompleteSale);

        mnuFileClose.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.SHIFT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        mnuFileClose.setMnemonic('p');
        mnuFileClose.setText("Close Program");
        mnuFileClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuFileCloseActionPerformed(evt);
            }
        });
        mnuFile.add(mnuFileClose);

        mnuMainMenuBar.add(mnuFile);

        setJMenuBar(mnuMainMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SplitPaneMain, javax.swing.GroupLayout.DEFAULT_SIZE, 777, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlCompletionAndTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pnlLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(SplitPaneMain)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pnlCompletionAndTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(pnlLogout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            // TODO add your handling code here:
            refreshProductsList();
            lstProducts.setModel(buildListModel(ProductsArray));
            
            subtotal = 0.00f;            
        } catch (SQLException ex) {
            System.err.println(ex);
        }
        
    }//GEN-LAST:event_formWindowOpened

    private void refreshProductsList() throws SQLException{
        PreparedStatement ps = connection.prepareStatement("select * from houseofcards.products");
        ResultSet rs = ps.executeQuery();

        ProductsArray = buildProducts(rs);
    }
    
    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        frmLogin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed
    
    private void updateSelectedInfo(){
        PreparedStatement ps;
        ResultSet rs;
        int pid = -1;
        for (Product p: ProductsArray){
            if(p.getProductName().equals(lstProducts.getSelectedValue())){
                pid = p.getProductID();
            }
        }
        try {            
            ps = connection.prepareStatement("SELECT * FROM houseofcards.products WHERE PK_ProductID = "+pid);
            rs = ps.executeQuery();
            while (rs.next()){
                txtDescription.setText(rs.getString("ProductDescription"));
                txtSelectedItemPrice.setText(rs.getString("Price"));
                txtItemID.setText(rs.getString("PK_ProductID"));   
                txtQuantity.setText(rs.getString("InventoryQuantity"));
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
    }
    
    private void lstProductsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstProductsValueChanged
        // TODO add your handling code here:
       // if (!evt.getValueIsAdjusting()){return;}
        updateSelectedInfo();

        String selectedProductName = lstProducts.getSelectedValue();
        //txtItemID.setText("");
        //txtSelectedItemPrice.setText("");
        //System.out.println(selectedProductName);
    
    }//GEN-LAST:event_lstProductsValueChanged
    
    
    
    private void txtSelectedItemPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSelectedItemPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSelectedItemPriceActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        int quantityToAdd = 1;
        try{ quantityToAdd = Integer.parseInt(JOptionPane.showInputDialog(this,"How many are you adding","1"));
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"An error occured! Error message says:\n"+e);
            return;
        }        
        if (lstProducts.getSelectedIndex() == -1){JOptionPane.showMessageDialog(this,"You need to have something selected to add it!");return;}
        updateNeeded = true;
        //If there is more than zero of the selected product in DB inventory
        if((ProductsArray.get(lstProducts.getSelectedIndex()).getInventoryQuantity()>0)&&(quantityToAdd <= ProductsArray.get(lstProducts.getSelectedIndex()).getInventoryQuantity())){
            //If the difference between the inventory in the DB and cart is greater than 0
            for(SaleItem si : SaleItems) {
                if(ProductsArray.get(lstProducts.getSelectedIndex()).getProductID()==si.getProductID()){
                    if ((/*si.getInventoryQuantity()+*/si.getQuantity())>0){
                        //They already have it in their cart and they are free to increment the value of that
                        si.setQuantity(si.getQuantity()+quantityToAdd);
                        si.setInventoryQuantity(si.getInventoryQuantity()-quantityToAdd);
                        lstSaleItems.setModel(buildSalesListModel(SaleItems));
                        subtotal+=ProductsArray.get(lstProducts.getSelectedIndex()).getPrice().floatValue();
                        lblSubtotal.setText(String.format("%.2f",subtotal));
                        lblTax.setText(String.format("%.2f",tax()));
                        lblTotal.setText(String.format("%.2f",total()));
                        updateNeeded = false;
                        //System.out.println("is an existing sale item; increment its inventory value");                        
                    }else{
                        JOptionPane.showMessageDialog(this,"You got the last of that item!");
                    }
                }
            }
            if (SaleItems.isEmpty()||updateNeeded){
                
                SaleItems.add(new SaleItem(quantityToAdd,ProductsArray.get(lstProducts.getSelectedIndex())));
                lstSaleItems.setModel(buildSalesListModel(SaleItems));
                System.out.println("product needed addition to sale items");
                subtotal = 0f;
                for (SaleItem s : SaleItems){
                    subtotal += s.getQuantity()*s.getPrice().doubleValue();
                }
                lblSubtotal.setText(String.format("%.2f",subtotal));
                lblTax.setText(String.format("%.2f",tax()));
                lblTotal.setText(String.format("%.2f",total()));
            }
            //System.out.println("more than 0 in database inventory!");
        }else{
            JOptionPane.showMessageDialog(this, "We don't have enough inventory to fulfill your request!");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void lstProductsKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lstProductsKeyPressed
        // TODO add your handling code here:      
    }//GEN-LAST:event_lstProductsKeyPressed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
        int quantityToRemove = 1;
        try{
            quantityToRemove = Integer.parseInt(JOptionPane.showInputDialog(this,"How many are you removing","1"));
        }catch(Exception e){
            JOptionPane.showMessageDialog(this,"An error occured! Error message says:\n"+e);
            return;
        }  
        if (lstSaleItems.getSelectedIndex() == -1){
            JOptionPane.showMessageDialog(this,"You need to have something selected to remove it!");
            return;
        }
        int selIndex = lstSaleItems.getSelectedIndex();
    	if ((SaleItems.get(selIndex).getQuantity()>1)&&(quantityToRemove <= SaleItems.get(selIndex).getQuantity())) {
            SaleItems.get(selIndex).setInventoryQuantity(SaleItems.get(lstSaleItems.getSelectedIndex()).getQuantity()+quantityToRemove);
            SaleItems.get(selIndex).setQuantity(SaleItems.get(lstSaleItems.getSelectedIndex()).getQuantity()-quantityToRemove);                
            updateSelectedInfo();
    	}else {
            //SaleItems.get(selIndex).setInventoryQuantity(SaleItems.get(lstSaleItems.getSelectedIndex()).getQuantity()+SaleItems.get(lstSaleItems.getSelectedIndex()).getInventoryQuantity());
            //SaleItems.get(selIndex).setQuantity(0);                
            SaleItems.remove(selIndex);
    	}
    	lstSaleItems.setModel(buildSalesListModel(SaleItems));
        subtotal = 0f;
        for (SaleItem s : SaleItems){
            subtotal += s.getQuantity()*s.getPrice().doubleValue();
        }
        lblSubtotal.setText(String.format("%.2f",subtotal));    
        lblTax.setText(String.format("%.2f",tax()));
        lblTotal.setText(String.format("%.2f",total()));
        lstSaleItems.setSelectedIndex(selIndex);
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void clearSale(){
        SaleItems.clear();
        lstSaleItems.setModel(buildSalesListModel(SaleItems));
        clearTotals();
    }
    
    private void btnCompleteSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompleteSaleActionPerformed
        // TODO add your handling code here:
        if (SaleItems.isEmpty()){
            JOptionPane.showMessageDialog(this, "There are no items for your sale!");
            return;
        }
        Sales.add(new Sale(SaleItems,BigDecimal.valueOf(total()),df.format(new Date())));
        Sale curSale = Sales.get(Sales.size()-1);
        ArrayList<PreparedStatement> psList = new ArrayList<>();
        int saleId;
        try{              
            connection.prepareStatement("INSERT INTO houseofcards.sale (DateTime, FK_UserID, SaleTotal) VALUES ('"+curSale.getDate()+"',7,"+curSale.getSaleTotal()+")").execute();
           //now we need to set the saleId by querying to find that sale we just made and grabbing its ID
            saleId = getSaleIdBySale(curSale);                     
            for (SaleItem si : SaleItems){
                psList.add(connection.prepareStatement("INSERT INTO houseofcards.saleitems (FK_SaleID, FK_ProductID, Quantity) VALUES ("+saleId+","+si.getProductID()+","+si.getQuantity()+")"));
                psList.add(connection.prepareStatement("UPDATE houseofcards.products SET InventoryQuantity= "+si.getInventoryQuantity()+" WHERE PK_ProductID = "+si.getProductID()));
            }
            //execute all those PreparedStatements
            psList.forEach((ps1)->{try{ps1.execute();}catch(Exception e){System.err.println(e);}});            
            clearSale();            
            updateSelectedInfo();
            JOptionPane.showMessageDialog(this,"Sale sucessfully added with ID: "+saleId);
            }catch(Exception e){
            System.err.println(e);
        }
    }//GEN-LAST:event_btnCompleteSaleActionPerformed

    private void mnuFileCompleteSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFileCompleteSaleActionPerformed
        // TODO add your handling code here:
        btnCompleteSaleActionPerformed(evt);
    }//GEN-LAST:event_mnuFileCompleteSaleActionPerformed

    private void mnuFileCancelSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFileCancelSaleActionPerformed
        // TODO add your handling code here:
        clearSale();
        clearTotals();
    }//GEN-LAST:event_mnuFileCancelSaleActionPerformed

    private void mnuFileCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuFileCloseActionPerformed
        // TODO add your handling code here:
        if(JOptionPane.showConfirmDialog(this,"Are you sure you want to exit?")==0){
        System.exit(0);
        }
    }//GEN-LAST:event_mnuFileCloseActionPerformed
    
    private void clearTotals(){
        lblTax.setText("0.00");
        lblTotal.setText("0.00");
        lblSubtotal.setText("0.00");
    }
        
    private int getSaleIdBySale(Sale s) throws SQLException{
        int id;
        PreparedStatement giveMeId = connection.prepareStatement("SELECT * FROM houseofcards.sale WHERE DateTime = '"+s.getDate()+"'");
        ResultSet rs = giveMeId.executeQuery();
        rs.next();
        id = Integer.parseInt(rs.getString("PK_SaleID"));
        return id;
    }
    
    public static DefaultListModel buildListModel(ArrayList<Product> arr){
        DefaultListModel<String> dlm = new DefaultListModel<>();
        arr.forEach((p) -> dlm.addElement(p.getProductName()+""));
        return dlm;
    }
    
    public static DefaultListModel buildSalesListModel(ArrayList<SaleItem> arr){
        DefaultListModel<String> dlm = new DefaultListModel<>();
        arr.forEach((s) -> dlm.addElement(s.getProductName()+" x"+s.getQuantity()));
        return dlm;
    }
    
    public static ArrayList<Product> buildProducts(ResultSet rs) throws SQLException{
        ArrayList<Product> arr = new ArrayList<>();
        Product p;
        while(rs.next()){
            p = new Product();
            try { 
                p.setInventoryQuantity(Integer.parseInt(rs.getString("InventoryQuantity")));                
            }catch(Exception ex){
                System.err.println(ex);
            }
            try{
                p.setPrice(new BigDecimal(rs.getString("Price")));
            }catch(Exception ex){
                System.err.println(ex);
            }
            try{
                p.setProductDescription(rs.getString("ProductDescription"));
            }catch(Exception ex){
                System.err.println(ex);
            }
            try {
                p.setProductID(Integer.parseInt(rs.getString("PK_ProductID")));
            }catch(Exception ex){
                System.err.println(ex);
            }
            try {
                p.setProductName(rs.getString("ProductName"));
            }catch(Exception ex){
                System.err.println(ex);
            }
            arr.add(p);
        }
        return arr;
    }
    
    public static DefaultTableModel buildTableModel(ResultSet rs) throws SQLException {

    ResultSetMetaData metaData = rs.getMetaData();

    // names of columns
    Vector<String> columnNames = new Vector<String>();
    int columnCount = metaData.getColumnCount();
    for (int column = 1; column <= columnCount; column++) {
        columnNames.add(metaData.getColumnName(column));
    }

    // data of the table
    Vector<Vector<Object>> data = new Vector<Vector<Object>>();
    while (rs.next()) {
        Vector<Object> vector = new Vector<Object>();
        for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
            vector.add(rs.getObject(columnIndex));
        }
        data.add(vector);
    }

    return new DefaultTableModel(data, columnNames);

}
       
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmMain mainForm = new frmMain();
                mainForm.addWindowListener( new WindowListener() {
                public void windowIconified( WindowEvent e ) {}
                public void windowDeiconified( WindowEvent e ) {}
                public void windowDeactivated( WindowEvent e ) {}
                public void windowClosed( WindowEvent e ) {    
                    System.exit( 0 ); 
                    try {
                        connection.close();
                    } catch (SQLException ex) {
                        System.err.println(ex);
                    }
                }
                public void windowClosing( WindowEvent e ) { 
                    System.exit( 0 ); 
                    try {
                        connection.close();
                    } catch (SQLException ex) {
                        System.err.println(ex);
                    }
                }
                public void windowOpened( WindowEvent e ) {}
                public void windowActivated( WindowEvent e ) {}
            });
                mainForm.setVisible(true);
            }
        });
    }
    
    private double tax(){
        return subtotal*.0675;
    }
    
    private double total(){
        return subtotal+tax();
    }
    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private boolean updateNeeded;
    private float subtotal;
    private ArrayList<Sale> Sales = new ArrayList<>();
    private ArrayList<SaleItem> SaleItems = new ArrayList<>();
    private ArrayList<Product> ProductsArray = new ArrayList<>();
    private static Connection connection;
    private String user;
    private frmLogin frmLogin;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSplitPane SplitPaneMain;
    private javax.swing.JSplitPane SplitPaneProductsSaleItems;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCompleteSale;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnRemove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblSubtotal;
    private javax.swing.JLabel lblTax;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JList<String> lstProducts;
    private javax.swing.JList<String> lstSaleItems;
    private javax.swing.JMenu mnuFile;
    private javax.swing.JMenuItem mnuFileCancelSale;
    private javax.swing.JMenuItem mnuFileClose;
    private javax.swing.JMenuItem mnuFileCompleteSale;
    private javax.swing.JMenuBar mnuMainMenuBar;
    private javax.swing.JPanel pnlCompletionAndTotal;
    private javax.swing.JPanel pnlItemInfo;
    private javax.swing.JPanel pnlLogout;
    private javax.swing.JPanel pnlProducts;
    private javax.swing.JPanel pnlSaleItems;
    private javax.swing.JTextArea txtDescription;
    private javax.swing.JTextField txtItemID;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtSelectedItemPrice;
    // End of variables declaration//GEN-END:variables
}
