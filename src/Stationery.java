    import java.sql.*;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Lakshmi Supathra K
 */
public class Stationery extends javax.swing.JFrame {

    /**
     * Creates new form Stationary
     */
    String last="";
    public Stationery() {
        initComponents();
        try
        {
              Class.forName("com.mysql.cj.jdbc.Driver");
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
            
        }
        try
        {
              Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarketdb","root","");
              Statement stmt=con.createStatement();
              ResultSet rs = stmt.executeQuery("SELECT * FROM shop");
              while(rs.next())
              {
                  if(rs.getString(2).equals(c1.getText()))
                  {
                      l1.setText(rs.getString(4));
                  }
                  else if(rs.getString(2).equals(c2.getText()))
                  {
                      l2.setText(rs.getString(4));
                  }
                  else if(rs.getString(2).equals(c3.getText()))
                  {
                      l3.setText(rs.getString(4));
                  }
                  else if(rs.getString(2).equals(c4.getText()))
                  {
                      l4.setText(rs.getString(4));
                  }
                  else if(rs.getString(2).equals(c5.getText()))
                  {
                      l5.setText(rs.getString(4));
                  }
              }
        }
        catch(Exception e)
        {
            
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

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        c1 = new javax.swing.JCheckBox();
        c2 = new javax.swing.JCheckBox();
        c3 = new javax.swing.JCheckBox();
        c4 = new javax.swing.JCheckBox();
        c5 = new javax.swing.JCheckBox();
        p1 = new javax.swing.JLabel();
        p2 = new javax.swing.JLabel();
        p3 = new javax.swing.JLabel();
        p4 = new javax.swing.JLabel();
        p5 = new javax.swing.JLabel();
        p6 = new javax.swing.JLabel();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        cb1 = new javax.swing.JComboBox<>();
        cb2 = new javax.swing.JComboBox<>();
        cb3 = new javax.swing.JComboBox<>();
        cb4 = new javax.swing.JComboBox<>();
        cb5 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Elephant", 1, 48)); // NOI18N
        jLabel1.setText("Name");
        jLabel1.setOpaque(true);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 90, -1, -1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Elephant", 1, 48)); // NOI18N
        jLabel4.setText("Id");
        jLabel4.setOpaque(true);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 90, 70, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Elephant", 1, 48)); // NOI18N
        jLabel3.setText("Price (Rs.)");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 90, -1, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Elephant", 1, 48)); // NOI18N
        jLabel5.setOpaque(true);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 90, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Elephant", 1, 48)); // NOI18N
        jLabel2.setText("Quantity (pkt)");
        jLabel2.setOpaque(true);
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 90, -1, -1));

        c1.setBackground(new java.awt.Color(255, 255, 255));
        c1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        c1.setText("Ball Pen");
        c1.setOpaque(true);
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });
        getContentPane().add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, -1, 20));

        c2.setBackground(new java.awt.Color(255, 255, 255));
        c2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        c2.setText("Gel Pen");
        c2.setOpaque(true);
        c2.setPreferredSize(new java.awt.Dimension(55, 22));
        c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c2ActionPerformed(evt);
            }
        });
        getContentPane().add(c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 110, -1));

        c3.setBackground(new java.awt.Color(255, 255, 255));
        c3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        c3.setText("Pencil Box");
        c3.setOpaque(true);
        c3.setPreferredSize(new java.awt.Dimension(55, 22));
        c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c3ActionPerformed(evt);
            }
        });
        getContentPane().add(c3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 140, -1));

        c4.setBackground(new java.awt.Color(255, 255, 255));
        c4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        c4.setText("A4 Paper");
        c4.setOpaque(true);
        c4.setPreferredSize(new java.awt.Dimension(55, 22));
        c4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c4ActionPerformed(evt);
            }
        });
        getContentPane().add(c4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 120, -1));

        c5.setBackground(new java.awt.Color(255, 255, 255));
        c5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        c5.setText("Pouch");
        c5.setOpaque(true);
        c5.setPreferredSize(new java.awt.Dimension(55, 22));
        c5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c5ActionPerformed(evt);
            }
        });
        getContentPane().add(c5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 90, -1));

        p1.setBackground(new java.awt.Color(255, 255, 255));
        p1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        p1.setText("301");
        p1.setOpaque(true);
        getContentPane().add(p1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 170, 40, 20));

        p2.setBackground(new java.awt.Color(255, 255, 255));
        p2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        p2.setText("302");
        p2.setOpaque(true);
        getContentPane().add(p2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 40, 20));

        p3.setBackground(new java.awt.Color(255, 255, 255));
        p3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        p3.setText("202");
        p3.setOpaque(true);
        getContentPane().add(p3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, 40, 20));

        p4.setBackground(new java.awt.Color(255, 255, 255));
        p4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        p4.setText("303");
        p4.setOpaque(true);
        getContentPane().add(p4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 250, 40, 20));

        p5.setBackground(new java.awt.Color(255, 255, 255));
        p5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        p5.setText("304");
        p5.setOpaque(true);
        getContentPane().add(p5, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 40, 20));

        p6.setBackground(new java.awt.Color(255, 255, 255));
        p6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        p6.setText("305");
        p6.setOpaque(true);
        getContentPane().add(p6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, 40, 20));

        l1.setBackground(new java.awt.Color(255, 255, 255));
        l1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        l1.setText("40.00");
        l1.setOpaque(true);
        getContentPane().add(l1, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 170, 60, 20));

        l2.setBackground(new java.awt.Color(255, 255, 255));
        l2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        l2.setText("40.00");
        l2.setOpaque(true);
        getContentPane().add(l2, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 210, 60, 20));

        l3.setBackground(new java.awt.Color(255, 255, 255));
        l3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        l3.setText("15.00");
        l3.setOpaque(true);
        getContentPane().add(l3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 250, 60, 20));

        l4.setBackground(new java.awt.Color(255, 255, 255));
        l4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        l4.setText("30.00");
        l4.setOpaque(true);
        getContentPane().add(l4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 290, 60, 20));

        l5.setBackground(new java.awt.Color(255, 255, 255));
        l5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        l5.setText("60.00");
        l5.setOpaque(true);
        getContentPane().add(l5, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 330, 60, 20));

        cb1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cb1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "1", "2", "3", "4", "5" }));
        cb1.setOpaque(true);
        getContentPane().add(cb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 170, -1, -1));

        cb2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cb2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "1", "2", "3", "4", "5" }));
        cb2.setOpaque(true);
        getContentPane().add(cb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 210, -1, -1));

        cb3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cb3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "1", "2", "3", "4", "5" }));
        cb3.setOpaque(true);
        cb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb3ActionPerformed(evt);
            }
        });
        getContentPane().add(cb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 250, -1, -1));

        cb4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cb4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "1", "2", "3", "4", "5" }));
        cb4.setOpaque(true);
        cb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb4ActionPerformed(evt);
            }
        });
        getContentPane().add(cb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 290, -1, -1));

        cb5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        cb5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "1", "2", "3", "4", "5" }));
        cb5.setOpaque(true);
        cb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb5ActionPerformed(evt);
            }
        });
        getContentPane().add(cb5, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 330, -1, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/car_optimized.jpg"))); // NOI18N
        jButton2.setText("Add to Cart");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 490, -1, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home_optimized.jpg"))); // NOI18N
        jButton1.setText("Go Back");
        jButton1.setVerifyInputWhenFocusTarget(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 490, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sta.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>                        

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {                                  

    }                                  

    private void c2ActionPerformed(java.awt.event.ActionEvent evt) {                                  
       
    }                                  

    private void c3ActionPerformed(java.awt.event.ActionEvent evt) {                                  
        // TODO add your handling code here:
    }                                  

    private void c4ActionPerformed(java.awt.event.ActionEvent evt) {                                  
        // TODO add your handling code here:
    }                                  

    private void c5ActionPerformed(java.awt.event.ActionEvent evt) {                                  
        // TODO add your handling code here:
    }                                  

    private void cb3ActionPerformed(java.awt.event.ActionEvent evt) {                                    
       
    }                                  

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        String a="",b="",g="",o="",p="",quantity="";
        int i=0,j=0;
        try
        {
            if(c1.isSelected())
            {
                j=2;
                a="Ball Pen";
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarketdb","root","");
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM shop");
                while(rs.next())
                {
                    if(rs.getString(2).equals(a))
                    {
                        quantity=rs.getString(3);
                        break;
                    }
                    
                }
                float q = Float.parseFloat(quantity);
                if((String)cb1.getSelectedItem()=="")
                {
                    i=1;
                    JOptionPane.showMessageDialog(null,"Choose Quantity!!");
                }
                else if(q<=0)
                {
                    i=3;
                    JOptionPane.showMessageDialog(null,"Sorry Ball Pen is not available now!!");
                }
                else
                {
                    String q1 = "insert into mycart values('" +last+"','"+a+"','"+(String)cb1.getSelectedItem()+"','"+l1.getText()+"')";
                    stmt.executeUpdate(q1);
                }
            }
            if(c2.isSelected())
            {
                j=2;
                b="Gel Pen";
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarketdb","root","");
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM shop");
                while(rs.next())
                {
                    if(rs.getString(2).equals(b))
                    {
                        quantity=rs.getString(3);
                        break;
                    }
                    
                }
                float q = Float.parseFloat(quantity);
                if((String)cb2.getSelectedItem()=="")
                {
                    i=1;
                    JOptionPane.showMessageDialog(null,"Choose Quantity!!");
                }
                else if(q<=0)
                {
                    i=3;
                    JOptionPane.showMessageDialog(null,"Sorry Gel Pen is not available now!!");
                }
                else
                {
                    String q1 = "insert into mycart values('" +last+"','"+b+"','"+(String)cb2.getSelectedItem()+"','"+l2.getText()+"')";
                    stmt.executeUpdate(q1);
                }
            }
            if(c3.isSelected())
            {
                j=2;
                g="Pencil Box";
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarketdb","root","");
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM shop");
                while(rs.next())
                {
                    if(rs.getString(2).equals(g))
                    {
                        quantity=rs.getString(3);
                        break;
                    }
                    
                }
                float q = Float.parseFloat(quantity);
                if((String)cb3.getSelectedItem()=="")
                {
                    i=1;
                    JOptionPane.showMessageDialog(null,"Choose Quantity!!");
                }
                else if(q<=0)
                {
                    i=3;
                    JOptionPane.showMessageDialog(null,"Sorry Pencil Box is not available now!!");
                }
                else
                {
                    String q1 = "insert into mycart values('" +last+"','"+g+"','"+(String)cb3.getSelectedItem()+"','"+l3.getText()+"')";
                    stmt.executeUpdate(q1);
                }
            }
            if(c4.isSelected())
            {
                j=2;
                o="A4 Paper";
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarketdb","root","");
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM shop");
                while(rs.next())
                {
                    if(rs.getString(2).equals(o))
                    {
                        quantity=rs.getString(3);
                        break;
                    }
                    
                }
                float q = Float.parseFloat(quantity);
                if((String)cb4.getSelectedItem()=="")
                {
                    i=1;
                    JOptionPane.showMessageDialog(null,"Choose Quantity!!");
                }
                else if(q<=0)
                {
                    i=3;
                    JOptionPane.showMessageDialog(null,"Sorry A4 Paper not available now!!");
                }
                else
                {
                    String q1 = "insert into mycart values('" +last+"','"+o+"','"+(String)cb4.getSelectedItem()+"','"+l4.getText()+"')";
                    stmt.executeUpdate(q1);
                }
            }
            if(c5.isSelected())
            {
                j=2;
                p="Pouch";
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarketdb","root","");
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM shop");
                while(rs.next())
                {
                    if(rs.getString(2).equals(p))
                    {
                        quantity=rs.getString(3);
                        break;
                    }
                    
                }
                float q = Float.parseFloat(quantity);
                if((String)cb5.getSelectedItem()=="")
                {
                    i=1;
                    JOptionPane.showMessageDialog(null,"Choose Quantity!!");
                }
                else if(q<=0)
                {
                    i=3;
                    JOptionPane.showMessageDialog(null,"Sorry Pouch is not available now!!");
                }
                else
                {
                    String q1 = "insert into mycart values('" +last+"','"+p+"','"+(String)cb5.getSelectedItem()+"','"+l5.getText()+"')";
                    stmt.executeUpdate(q1);
                }
            }
            if(j!=2 && i!=1)
                JOptionPane.showMessageDialog(null,"No items is choosed!!");
            else if(j==2 && i==3)
                JOptionPane.showMessageDialog(null,"Other products are added successfully!!");
            else if(i!=1 && j==2)
                JOptionPane.showMessageDialog(null,"Added Successfully!!");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        UserForm u = new UserForm();
        try
        {
              Class.forName("com.mysql.cj.jdbc.Driver");
              Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarketdb","root","");
              Statement stmt=con.createStatement();
              ResultSet rs = stmt.executeQuery("SELECT * FROM customer");
              while(rs.next())
              {
                  if(rs.getString(8).equals(last))
                  {
                      String name=rs.getString(1);
                      u.show();
                      u.jLabel1.setText(name);
                      u.jPanel2.setVisible(true);
                      u.jLabel6.setVisible(true);
                      dispose();
                      break;
                  }
              }
        }
        catch(Exception e)
        {
            
        }
    }                                        

    private void cb4ActionPerformed(java.awt.event.ActionEvent evt) {                                    
       
    }                                  

    private void cb5ActionPerformed(java.awt.event.ActionEvent evt) {                                    
       
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
            java.util.logging.Logger.getLogger(Stationery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Stationery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Stationery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Stationery.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Stationery().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                    
    private javax.swing.JCheckBox c1;
    private javax.swing.JCheckBox c2;
    private javax.swing.JCheckBox c3;
    private javax.swing.JCheckBox c4;
    private javax.swing.JCheckBox c5;
    private javax.swing.JComboBox<String> cb1;
    private javax.swing.JComboBox<String> cb2;
    private javax.swing.JComboBox<String> cb3;
    private javax.swing.JComboBox<String> cb4;
    private javax.swing.JComboBox<String> cb5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel p1;
    private javax.swing.JLabel p2;
    private javax.swing.JLabel p3;
    private javax.swing.JLabel p4;
    private javax.swing.JLabel p5;
    private javax.swing.JLabel p6;
    // End of variables declaration                  
}