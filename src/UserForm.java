
import java.awt.Color;
import java.awt.Image;
import java.awt.MouseInfo;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class UserForm extends javax.swing.JFrame {

    /**
     * Creates new form UserForm
     */
    public UserForm() {
        initComponents();
        jPanel2.setVisible(false);
        jLabel6.setVisible(false);
        jLabel5.setBackground(new Color(0,0,102,100));
        jLabel10.setBackground(new Color(0,0,102,100));
        jLabel4.setBackground(new Color(0,0,102,100));
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        c1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jPopupMenu2.setBackground(new java.awt.Color(51, 153, 255));
        jPopupMenu2.setFont(new java.awt.Font("Modern No. 20", 1, 18)); // NOI18N
        jPopupMenu2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 0, 153), 2));
        jPopupMenu2.setPopupSize(new java.awt.Dimension(350, 280));

        jMenuItem3.setFont(new java.awt.Font("Rockwell", 1, 16)); // NOI18N
        jMenuItem3.setForeground(new java.awt.Color(255, 0, 51));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/viewicon.png"))); // NOI18N
        jMenuItem3.setText(" VIEW DETAILS");
        jMenuItem3.setPreferredSize(new java.awt.Dimension(175, 70));
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jPopupMenu2.add(jMenuItem3);

        jMenuItem2.setFont(new java.awt.Font("Rockwell", 1, 16)); // NOI18N
        jMenuItem2.setForeground(new java.awt.Color(255, 0, 51));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mycart1.png"))); // NOI18N
        jMenuItem2.setText(" MY CART");
        jMenuItem2.setPreferredSize(new java.awt.Dimension(175, 70));
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu2.add(jMenuItem2);

        jMenuItem1.setFont(new java.awt.Font("Rockwell", 1, 16)); // NOI18N
        jMenuItem1.setForeground(new java.awt.Color(255, 0, 51));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/feed.png"))); // NOI18N
        jMenuItem1.setText(" FEEDBACK");
        jMenuItem1.setPreferredSize(new java.awt.Dimension(175, 70));
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu2.add(jMenuItem1);

        jMenuItem5.setFont(new java.awt.Font("Rockwell", 1, 16)); // NOI18N
        jMenuItem5.setForeground(new java.awt.Color(255, 0, 51));
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/seere.jpg"))); // NOI18N
        jMenuItem5.setText(" SEE REPLY");
        jMenuItem5.setPreferredSize(new java.awt.Dimension(175, 70));
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jPopupMenu2.add(jMenuItem5);

        jMenuItem4.setFont(new java.awt.Font("Rockwell", 1, 16)); // NOI18N
        jMenuItem4.setForeground(new java.awt.Color(255, 0, 51));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logout.jpg"))); // NOI18N
        jMenuItem4.setText("  LOGOUT");
        jMenuItem4.setPreferredSize(new java.awt.Dimension(175, 70));
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jPopupMenu2.add(jMenuItem4);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("User Form");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(51, 153, 255));
        jLabel1.setFont(new java.awt.Font("Lucida Bright", 1, 23)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("UserName");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 70, 360, 40));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 42)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("KROGER'S MART");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        c1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/groceries.png"))); // NOI18N
        jPanel2.add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, -1, -1));

        jLabel4.setBackground(new java.awt.Color(51, 0, 153));
        jLabel4.setFont(new java.awt.Font("Ebrima", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Click Category Image");
        jLabel4.setOpaque(true);
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 40, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/stationery-items-1657023154-6431445.jpg"))); // NOI18N
        jLabel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 2));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel11MousePressed(evt);
            }
        });
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, -1, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screenshot (246).png"))); // NOI18N
        jLabel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 2));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel13MousePressed(evt);
            }
        });
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, -1, -1));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/2022-12-04 (2).png"))); // NOI18N
        jLabel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 2));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel14MousePressed(evt);
            }
        });
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 120, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vegg1.jpg"))); // NOI18N
        jLabel15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 2));
        jLabel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel15MousePressed(evt);
            }
        });
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/istockphoto-487770577-612x612.jpg"))); // NOI18N
        jLabel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 2));
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel16MousePressed(evt);
            }
        });
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 340, -1, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/2022-12-04 (3).png"))); // NOI18N
        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 2));
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel17MousePressed(evt);
            }
        });
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, -1, -1));

        jLabel18.setBackground(new java.awt.Color(0, 0, 102));
        jLabel18.setFont(new java.awt.Font("Eras Bold ITC", 1, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Vegetables");
        jLabel18.setOpaque(true);
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, -1, -1));

        jLabel19.setBackground(new java.awt.Color(0, 0, 102));
        jLabel19.setFont(new java.awt.Font("Eras Bold ITC", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Stationeries");
        jLabel19.setOpaque(true);
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 180, -1, -1));

        jLabel20.setBackground(new java.awt.Color(0, 0, 102));
        jLabel20.setFont(new java.awt.Font("Eras Bold ITC", 1, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Fruits");
        jLabel20.setOpaque(true);
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 180, -1, -1));

        jLabel21.setBackground(new java.awt.Color(0, 0, 102));
        jLabel21.setFont(new java.awt.Font("Eras Bold ITC", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Snacks");
        jLabel21.setOpaque(true);
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, -1, -1));

        jLabel22.setBackground(new java.awt.Color(0, 0, 102));
        jLabel22.setFont(new java.awt.Font("Eras Bold ITC", 1, 24)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Grains");
        jLabel22.setOpaque(true);
        jPanel2.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 390, -1, -1));

        jLabel23.setBackground(new java.awt.Color(0, 0, 102));
        jLabel23.setFont(new java.awt.Font("Eras Bold ITC", 1, 24)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Cosmetics");
        jLabel23.setOpaque(true);
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 400, -1, -1));

        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/category.jpg"))); // NOI18N
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 1330, 620));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1330, 620));

        jButton1.setBackground(new java.awt.Color(0, 0, 51));
        jButton1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add-to-cart.png"))); // NOI18N
        jButton1.setText("Shop Now");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 470, 190, -1));

        jLabel6.setBackground(new java.awt.Color(51, 0, 102));
        jLabel6.setFont(new java.awt.Font("Rockwell", 1, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/download (5).jpg"))); // NOI18N
        jLabel6.setText("GO BACK");
        jLabel6.setOpaque(true);
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel6MousePressed(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 20, -1, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/09999.png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 70, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/4321.jpg"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 130, 100));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/shop-cart-icon.png"))); // NOI18N
        jLabel12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 102), 3));
        jLabel12.setOpaque(true);
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, -1, 80));

        jLabel5.setBackground(new java.awt.Color(0, 0, 102));
        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 42)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Buy Delicious, Fresh and Gourmet");
        jLabel5.setOpaque(true);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, 760, -1));

        jLabel10.setBackground(new java.awt.Color(0, 0, 102));
        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 42)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Groceries");
        jLabel10.setOpaque(true);
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/3.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1330, 700));

        jLabel9.setBackground(new java.awt.Color(0, 0, 153));
        jLabel9.setOpaque(true);
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1330, 120));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1327, 920));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        ViewDetails v = new ViewDetails();
        v.show();
        dispose();
        v.name.setText(jLabel1.getText());
        try
        {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarketdb","root","");
                    Statement stmt=con.createStatement();
                    ResultSet rs = stmt.executeQuery("SELECT * FROM customer");
                    while(rs.next())
                    {
                           if(rs.getString(1).equals(jLabel1.getText()))
                           {
                               v.age.setText(rs.getString(2));
                               v.gender.setText(rs.getString(3));
                               v.aadhar.setText(rs.getString(4));
                               v.mobile.setText(rs.getString(6));
                               v.address.setText(rs.getString(5));
                               v.mail.setText(rs.getString(7));
                               String filename = rs.getString(12);
                               if("0".equals(filename))
                               {
                                   
                                   Image img = new ImageIcon(this.getClass().getResource("/profile.jpg")).getImage();
                                   v.photo.setIcon(new ImageIcon(img));
                               }
                               else if(filename!="0")
                               {
                                   ImageIcon icon = new ImageIcon(filename);
                                   Image image=icon.getImage().getScaledInstance(v.photo.getWidth(),v.photo.getHeight(),Image.SCALE_SMOOTH);
                                   v.photo.setIcon(icon);
                               }
                           }
                    }
        }
        catch(Exception e)
                {   
                    System.out.println(e);
                }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        int x =MouseInfo.getPointerInfo().getLocation().x;
        int y =MouseInfo.getPointerInfo().getLocation().y;
        jPopupMenu2.show(this,x,y);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(null,"THANK YOU!");
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarketdb","root","");
            Statement stmt = con.createStatement();
            String q2 = "DELETE FROM `currentuser` WHERE 1";
            stmt.executeUpdate(q2);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        Home h = new Home();
        h.show();
        dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        jPanel2.setVisible(true);
        jLabel6.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel6MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MousePressed
        // TODO add your handling code here:
        jPanel2.setVisible(false);
        jPanel1.setVisible(true);
        jLabel6.setVisible(false);
    }//GEN-LAST:event_jLabel6MousePressed

    private void jLabel15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel15MousePressed
        // TODO add your handling code here:
        Vegetables v=new Vegetables();
        v.show();
        dispose();
    }//GEN-LAST:event_jLabel15MousePressed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        FeedBack f =new  FeedBack();
        f.show();
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jLabel11MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MousePressed
        // TODO add your handling code here:
        Stationery s = new Stationery();
        s.show();
        dispose();
    }//GEN-LAST:event_jLabel11MousePressed

    private void jLabel14MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MousePressed
        // TODO add your handling code here:
        Fruits f =new Fruits();
        f.show();
        dispose();
    }//GEN-LAST:event_jLabel14MousePressed

    private void jLabel17MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MousePressed
        // TODO add your handling code here:
        Snacks s = new Snacks();
        s.show();
        dispose();
    }//GEN-LAST:event_jLabel17MousePressed

    private void jLabel13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MousePressed
        // TODO add your handling code here:
        Grains g =new Grains();
        g.show();
        dispose();
    }//GEN-LAST:event_jLabel13MousePressed

    private void jLabel16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MousePressed
        // TODO add your handling code here:
        Cosmetics c =new Cosmetics();
        c.show();
        dispose();
    }//GEN-LAST:event_jLabel16MousePressed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        SeeReply s = new SeeReply();
        String uname="";
        try
        {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarketdb","root","");
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM customer");
            while(rs.next())
            {
                if(rs.getString(1).equals(jLabel1.getText()))
                {
                    uname=rs.getString(8);
                    break;
                }
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        try
                {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarketdb","root","");
                    Statement stmt=con.createStatement();
                    ResultSet rs = stmt.executeQuery("SELECT * FROM customer");
                    while(rs.next())
                    {
                        if(rs.getString(8).equals(uname))
                        {
                                if(rs.getString(16).equals("0"))
                                {
                                    JOptionPane.showMessageDialog(null,"You didn't receive any Reply from Admin!!");
                                    break;
                                }
                                s.jTextArea1.setText(rs.getString(16));
                                s.jTextArea1.setEditable(false);
                                s.show();
                                String q1 = "UPDATE customer set Reply = '" +0+ "' WHERE Name = '" +jLabel1.getText()+ "'";
                                stmt.executeUpdate(q1);
                                break;
                        }
                    }
            
                }
                catch(Exception e)
                {
                 System.out.println(e);   
                }
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        MyCart mc = new MyCart();
        mc.show();
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(UserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel c1;
    private javax.swing.JButton jButton1;
    public javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JPanel jPanel2;
    private javax.swing.JPopupMenu jPopupMenu2;
    // End of variables declaration//GEN-END:variables
}
