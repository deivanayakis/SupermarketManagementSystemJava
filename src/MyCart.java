
import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author HP
 */
public class MyCart extends javax.swing.JFrame {

    /**
     * Creates new form MyCart
     */
    String last="",name="";
    static String i="";
    float tot=0f,pr=0f,quan=0f,tot1=0f;
    public MyCart() {
        initComponents();
        jPanel2.setBackground(new Color(255,255,255,100));
        String set="<html><u><b>CHANGE</u></b></html>";
        jLabel13.setText(set);
        jTextField1.setEditable(false);
        try
        {
              Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarketdb","root","");
              Statement stmt=con.createStatement();
              ResultSet rs = stmt.executeQuery("SELECT * FROM currentuser");
              while(rs.next())
              {
                  last=rs.getString(1);
              }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        try
        {
              Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarketdb","root","");
              Statement stmt=con.createStatement();
              ResultSet rs = stmt.executeQuery("SELECT * FROM customer");
              while(rs.next())
              {
                  if(rs.getString(8).equals(last))
                  {
                      name=rs.getString(1);
                  }
              }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        try
        {
              Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarketdb","root","");
              Statement stmt=con.createStatement();
              ResultSet rs = stmt.executeQuery("SELECT * FROM mycart");
              DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
              while(rs.next())
              {
                  if(rs.getString(1).equals(last))
                  {
                      String n=rs.getString(2);
                      String q=rs.getString(3);
                      String p=rs.getString(4);
                      Statement stmt1=con.createStatement();
                      ResultSet rs1 =stmt1.executeQuery("SELECT * FROM shop");
                      while(rs1.next())
                      {
                         if(n.equals(rs1.getString(2)))
                          {
                              i=rs1.getString(1);
                              break;
                          } 
                      }
                      pr = Float.parseFloat(p);
                      quan = Float.parseFloat(q);
                      tot = pr*quan;
                      String t_p=String.valueOf(tot);
                      String[] row ={i,n,q,p,t_p};
                      model.addRow(row);
                  }
              }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(153, 0, 153));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("THE KROGER'S MART");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 460, 66));

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTable1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRODUCT ID", "PRODUCT NAME", "QUANTITY", "PRICE", "TOTAL PRICE"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
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
        jTable1.setOpaque(false);
        jTable1.setShowHorizontalLines(true);
        jTable1.setShowVerticalLines(true);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("MY CART ITEMS");
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/240_F_24002005_RqNW1XxPQZ3AMpomoWVCihbH8PGWPxdh.jpg"))); // NOI18N
        jLabel4.setText("ADD NOW");
        jLabel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel4MousePressed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screenshot (356)1.png"))); // NOI18N
        jLabel2.setText("MY ORDERS");
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("-------");
        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabel6.setOpaque(true);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 153));
        jLabel8.setText("TOTAL PRICE");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabel8.setOpaque(true);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 153));
        jLabel9.setText("NAME");
        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabel9.setOpaque(true);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 153));
        jLabel10.setText("QUANTITY");
        jLabel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabel10.setOpaque(true);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 153));
        jLabel11.setText("-------");
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabel11.setOpaque(true);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screenshot (370)1.png"))); // NOI18N
        jLabel12.setText("CLEAR");
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel12MousePressed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("CHANGE");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel13MousePressed(evt);
            }
        });

        jTextField1.setForeground(new java.awt.Color(0, 0, 153));
        jTextField1.setText("-------");
        jTextField1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jTextField1.setOpaque(true);
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(51, 0, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("BUY NOW");
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGap(71, 71, 71)
                            .addComponent(jLabel12)
                            .addGap(34, 34, 34)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                            .addGap(46, 46, 46)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(53, 53, 53)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                            .addComponent(jTextField1))
                                        .addGap(52, 52, 52)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1)
                                    .addGap(18, 18, 18)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(321, 321, 321)
                        .addComponent(jLabel13)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextField1))
                .addGap(9, 9, 9)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 720, 560));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back1.png"))); // NOI18N
        jLabel5.setText("GO BACK");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 30, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/MYCART.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 1320, 670));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>                        

    private void jLabel4MousePressed(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
        String p="",id="",q="",n="";
        n=jLabel6.getText();
        String tot=jLabel11.getText();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        try
        {
              Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarketdb","root","");
              Statement stmt=con.createStatement();
              ResultSet rs =stmt.executeQuery("SELECT * FROM shop");
              while(rs.next())
              {
                  if(n.equals(rs.getString(2)))
                  {
                      id=rs.getString(1);
                      p=rs.getString(4);
                      q=rs.getString(3);
                      float qt = Float.parseFloat(q);
                      float cq = Float.parseFloat(jTextField1.getText());
                      float tq = qt-cq;
                       if(tq>=0.0)
                       {
                            String q1 = "insert into buynow values('" +last+"','"+id+"','"+n+"','"+jTextField1.getText()+"','"+p+"','"+tot+"')";
                            String q2 = "DELETE FROM `mycart` WHERE Username='"+last+"' && Quantity='"+jTextField1.getText()+"'&& pname='"+jLabel6.getText()+"' && Price='"+p+"'";
                            stmt.executeUpdate(q1);
                            stmt.executeUpdate(q2);
                       }
                       else
                       {
                           JOptionPane.showMessageDialog(null,"Sorry! Product not Available!!"); 
                       }
                  } 
              }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Added!!");
        } 
        model.setRowCount(0);
        try
        {
              Class.forName("com.mysql.cj.jdbc.Driver");
              Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarketdb","root","");
              Statement stmt=con.createStatement();
              ResultSet rs = stmt.executeQuery("SELECT * FROM mycart");
              while(rs.next())
              {
                  if(rs.getString(1).equals(last))
                  {
                      n=rs.getString(2);
                      q=rs.getString(3);
                      p=rs.getString(4);
                      Statement stmt1=con.createStatement();
                      ResultSet rs1 =stmt1.executeQuery("SELECT * FROM shop");
                      while(rs1.next())
                      {
                         if(n.equals(rs1.getString(2)))
                          {
                              i=rs1.getString(1);
                              break;
                          } 
                      }
                      pr = Float.parseFloat(p);
                      quan = Float.parseFloat(q);
                      tot1 = pr*quan;
                      String t_p=String.valueOf(tot1);
                      String[] row ={i,n,q,p,t_p};
                      model.addRow(row);
                  }
              }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }                                    

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
         MyOrders m = new MyOrders();
        m.show();
        dispose();
    }                                    

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
        DefaultTableModel m = (DefaultTableModel)jTable1.getModel();
        int s=jTable1.getSelectedRow();
        jLabel6.setText((m.getValueAt(s,1).toString()));
        jTextField1.setText((m.getValueAt(s,2).toString()));
        jLabel11.setText((m.getValueAt(s,4).toString()));
    }                                    

    private void jLabel13MousePressed(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
        try
        {
              Class.forName("com.mysql.cj.jdbc.Driver");
              Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarketdb","root","");
              Statement stmt=con.createStatement();
              String q1 = "UPDATE mycart set Quantity = '" +jTextField1.getText()+"' WHERE Username='" + last+ "' && pname='"+jLabel6.getText()+"'  ";
              stmt.executeUpdate(q1);
              DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
              model.setRowCount(0);
              try
              {
              Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarketdb","root","");
              Statement stmt1=con1.createStatement();
              ResultSet rs1 = stmt1.executeQuery("SELECT * FROM mycart");
              DefaultTableModel model1 = (DefaultTableModel) jTable1.getModel();
              BuyNow b = new BuyNow();
              DefaultTableModel model2 = (DefaultTableModel) b.jTable1.getModel();
              while(rs1.next())
              {
                  if(rs1.getString(1).equals(last))
                  {
                      String n=rs1.getString(2);
                      String q=rs1.getString(3);
                      String p=rs1.getString(4);
                      Statement stmt2=con1.createStatement();
                      ResultSet rs2 =stmt2.executeQuery("SELECT * FROM shop");
                      while(rs2.next())
                      {
                         if(n.equals(rs2.getString(2)))
                          {
                              i=rs2.getString(1);
                              break;
                          } 
                      }
                      float pr = Float.parseFloat(p);
                      float quan = Float.parseFloat(q);
                      float tot = pr*quan;
                      String t_p=String.valueOf(tot);
                      String[] row ={i,n,q,p,t_p};
                      model1.addRow(row);
                      model2.addRow(row);
                  }
              }
              
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Products Quantity Updated Successfully!!");
        }
        }
        catch(Exception e)
        {
        }
    }                                     

    private void jLabel12MousePressed(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
        try
        {
              Class.forName("com.mysql.cj.jdbc.Driver");
              Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarketdb","root","");
              Statement stmt=con.createStatement();
              String q2 = "DELETE FROM `mycart` WHERE Username='"+last+"' && Quantity='"+jTextField1.getText()+"'&& pname='"+jLabel6.getText()+"'";
              stmt.executeUpdate(q2);
              DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
              model.removeRow(jTable1.getSelectedRow());
              
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }                                     

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {
        jTextField1.setEditable(true);
    } 
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        BuyNow b = new BuyNow();
        b.show();
        dispose();
    }                                        

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {                                   
        // TODO add your handling code here:
        UserForm u=new UserForm();
        u.show();
        dispose();
        u.jLabel1.setText(name);
    }                                  

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
            java.util.logging.Logger.getLogger(MyCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyCart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyCart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration                   
}