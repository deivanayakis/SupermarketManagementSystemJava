
import java.sql.*;
import java.awt.Color;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author HP
 */
public class QueryPage extends javax.swing.JFrame {

    /**
     * Creates new form QueryPage
     */
    public QueryPage() {
        initComponents();
        jLabel2.setBackground(new Color(255,255,255,100));
        jTextField1.setText("Enter Username");
        jTextField1.setEditable(false);
       //jTextField1.setBackground(new Color(255,255,255,100));
       jTextField2.setText("Enter mail id");
        jTextField2.setEditable(false);
       // jTextField2.setBackground(new Color(255,255,255,100));
       jTextArea2.setText("Type your message here...");
        jTextArea2.setEditable(false);
        jTextArea2.setBackground(new Color(255,255,255));
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
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        send = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField1MousePressed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, 250, 60));

        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField2MousePressed(evt);
            }
        });
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 250, 250, 60));

        send.setBackground(new java.awt.Color(51, 204, 255));
        send.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        send.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screenshot (309)1.png"))); // NOI18N
        send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendActionPerformed(evt);
            }
        });
        jPanel1.add(send, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 560, 150, 50));

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextArea2MousePressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTextArea2);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 330, 250, 190));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screenshot (280)1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-2, 0, 410, 710));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Leave a message here");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, -1, 35));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("WANT TO CONTACT US?");
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 314, 52));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back1.png"))); // NOI18N
        jLabel5.setText("GO BACK");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 30, -1, 44));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screenshot (303)1.png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, -4, 970, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void jTextField1MousePressed(java.awt.event.MouseEvent evt) {                                         
        // TODO add your handling code here:
        jTextField1.setEditable(true);
        jTextField1.setText("");
    }                                        

    private void jTextField2MousePressed(java.awt.event.MouseEvent evt) {                                         
        // TODO add your handling code here:
        jTextField2.setEditable(true);
        jTextField2.setText("");
    }                                        

    private void jTextArea2MousePressed(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
        jTextArea2.setEditable(true);
        jTextArea2.setText("");
    }                                       

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
        ContactUs cont=new ContactUs();
        cont.show();
        dispose();
    }                                    
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) { 
        
    }
    private void sendActionPerformed(java.awt.event.ActionEvent evt) {                                     
        // TODO add your handling code here:
        if(jTextField1.getText().trim().isEmpty() || jTextField1.getText().equals("Enter Username"))
        {
            JOptionPane.showMessageDialog(null,"Username Field is Empty!!");
        }
        else if(jTextArea2.getText().trim().isEmpty() || jTextArea2.getText().equals("Type your message here..."))
        {
            JOptionPane.showMessageDialog(null,"Please Enter your Query!!");
        }
        else{
            int i=0;
        try
                {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarketdb","root","");
                    Statement stmt=con.createStatement();
                    ResultSet rs = stmt.executeQuery("SELECT * FROM customer");
                    while(rs.next())
                    {
                        if(rs.getString(8).equals(jTextField1.getText()))
                        {
                                i=1;
                                String q1 = "UPDATE customer set Query = '" + jTextArea2.getText() + "' WHERE Username = '" +jTextField1.getText() + "'";
                                stmt.executeUpdate(q1);
                                JOptionPane.showMessageDialog(null,"Send Successfully!!");
                            
                        }
                    }
                    if (i==0)
                    {
                        JOptionPane.showMessageDialog(null,"User not Found!!");
                    }
            
                }
                catch(Exception e)
                {
                    
                }
        }
    }                                    

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(QueryPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QueryPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QueryPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QueryPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QueryPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton send;
    // End of variables declaration                   

    private void setEditable(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
