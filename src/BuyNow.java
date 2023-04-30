
import java.awt.Color;
import java.awt.Color;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
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
public class BuyNow extends javax.swing.JFrame {

    /**
     * Creates new form BuyNow
     */
    String last="";
    LocalDate currentDate = LocalDate.now();
    String date=String.valueOf(currentDate);
    LocalTime currenttime = LocalTime.now();
    String time=String.valueOf(currenttime);
    public BuyNow() {
        initComponents();
        jPanel6.setBackground(new Color(255,255,255,100));
        jPanel7.setBackground(new Color(255,255,255,100));
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
                if(rs.getString(8).equals(last))
                {
                            jTextField1.setText(rs.getString(1));
                            jTextArea1.setText(rs.getString(5));
                            jTextField2.setText(rs.getString(6));
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
              ResultSet rs = stmt.executeQuery("SELECT * FROM buynow");
              DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
              while(rs.next())
              {
                  
                  if(rs.getString(1).equals(last))
                  {
                      String id=rs.getString(2);
                      
                      String n=rs.getString(3);
                      
                      String q=rs.getString(4);
                      
                      String p=rs.getString(5);
                      
                      String tot=rs.getString(6);
                      
                      String[] row ={id,n,q,p,tot};
                      
                      model.addRow(row);
                      
                  }
              }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
         try
        {
              String tot="";
              float t=0f;
              Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarketdb","root","");
              Statement stmt=con.createStatement();
              DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
              for(int i=0;i<model.getRowCount();i++)
              {  
                  String tem=String.valueOf(model.getValueAt(i,4));
                  float temp=Float.parseFloat(tem);
                  t=t+temp;
              }
              tot=String.valueOf(t);
              jLabel13.setText(tot);
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
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NEXT = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        CONFIRM = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        BILL = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 153));
        jPanel2.setOpaque(false);

        jTabbedPane1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 179, 226));
        jPanel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 204, 204));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextArea1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea1);

        jTextField1.setText("jTextField1");
        jTextField1.setOpaque(true);
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTextField1MousePressed(evt);
            }
        });

        jTextField2.setText("jTextField2");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("MOBILE NUMBER");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("ADDRESS");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("NAME");

        NEXT.setBackground(new java.awt.Color(255, 255, 255));
        NEXT.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        NEXT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/next1.png"))); // NOI18N
        NEXT.setText("NEXT");
        NEXT.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        NEXT.setOpaque(true);
        NEXT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NEXTMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(176, 176, 176)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField2))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(74, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(NEXT, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(253, 253, 253))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(NEXT)
                .addGap(41, 41, 41))
        );

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 690, 430));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screenshot (370)1.png"))); // NOI18N
        jLabel5.setText("CANCEL");
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel5MousePressed(evt);
            }
        });
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/CONFIRM DETAILS1.jpg"))); // NOI18N
        jLabel15.setText("jLabel15");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, -4, 510, 470));

        jTabbedPane1.addTab("CONFIRM DETAILS", jPanel3);

        jPanel4.setBackground(new java.awt.Color(255, 179, 226));
        jPanel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(255, 204, 204));

        jTable1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRODUCT ID", "PRODUCT NAME", "QUANTITY", "PRICE", "TOTAL PRICE"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setShowHorizontalLines(true);
        jTable1.setShowVerticalLines(true);
        jScrollPane2.setViewportView(jTable1);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel12.setText("NET PRICE:");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel13.setText("-------");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );

        jPanel4.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        CONFIRM.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        CONFIRM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/TICK.jpg"))); // NOI18N
        CONFIRM.setText("CONFIRM");
        CONFIRM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        CONFIRM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CONFIRMMousePressed(evt);
            }
        });
        jPanel4.add(CONFIRM, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 20, -1, 40));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screenshot (370)1.png"))); // NOI18N
        jLabel8.setText("CANCEL");
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel8MousePressed(evt);
            }
        });
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(736, 20, 165, 40));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BUY.jpg"))); // NOI18N
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, 490, 470));

        jTabbedPane1.addTab("CONFIRM ORDER", jPanel4);

        jPanel5.setOpaque(false);
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 0));
        jLabel7.setText("GENERATE");
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, -1, 30));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 0));
        jLabel6.setText("BILL");
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 70, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 102, 0));
        jLabel10.setText("HERE TO ");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 210, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 102, 0));
        jLabel11.setText("CLICK");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 170, -1, 30));

        BILL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/BILL.jpg"))); // NOI18N
        BILL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BILLMousePressed(evt);
            }
        });
        jPanel5.add(BILL, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1090, 470));

        jTabbedPane1.addTab("BILL ", jPanel5);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(104, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 80, -1, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 44)); // NOI18N
        jLabel1.setText("THE KROGER'S MART");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 521, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Screenshot (346)1.png"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1320, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 666, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void jTextField1MousePressed(java.awt.event.MouseEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void jTextArea1MousePressed(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void BILLMousePressed(java.awt.event.MouseEvent evt) {                                  
        // TODO add your handling code here:
        String path="";
        JFileChooser j=new JFileChooser();
        j.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        int x=j.showSaveDialog(this);
        if(x==JFileChooser.APPROVE_OPTION)
        {
            path=j.getSelectedFile().getPath();
        }
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        Document doc = new Document();
        try
        {
           PdfWriter writer=PdfWriter.getInstance(doc,new FileOutputStream(path+".pdf"));
           doc.open();
           String imageUrl = "C:\\Users\\DELL\\Documents\\NetBeansProjects\\SupermarketInfo\\src\\Screenshot 2022-12-18 000415.png";
           Image img = Image.getInstance(imageUrl);
           img.setAbsolutePosition(160,750);
           String imageUrl1 = "C:\\Users\\DELL\\Documents\\NetBeansProjects\\SupermarketInfo\\src\\4321.jpg";
           Image img1 = Image.getInstance(imageUrl1);
           img1.setAbsolutePosition(40,725);
           String imageUrl2 = "C:\\Users\\DELL\\Documents\\NetBeansProjects\\SupermarketInfo\\src\\Screenshot 2022-12-18 002107.png";
           Image img2 = Image.getInstance(imageUrl2);
           img2.setAbsolutePosition(40,670);
           String imageUrl3 = "C:\\Users\\DELL\\Documents\\NetBeansProjects\\SupermarketInfo\\src\\Screenshot 2022-12-18 003212.png";
           Image img3 = Image.getInstance(imageUrl3);
           img3.setAbsolutePosition(40,630);
           String imageUrl4 = "C:\\Users\\DELL\\Documents\\NetBeansProjects\\SupermarketInfo\\src\\Screenshot 2022-12-18 004559.png";
           Image img4 = Image.getInstance(imageUrl4);
           img4.setAbsolutePosition(40,520);
           String imageUrl5 = "C:\\Users\\DELL\\Documents\\NetBeansProjects\\SupermarketInfo\\src\\Screenshot 2022-12-18 004537.png";
           Image img5 = Image.getInstance(imageUrl5);
           img5.setAbsolutePosition(300,630);
           String imageUrl6 = "C:\\Users\\DELL\\Documents\\NetBeansProjects\\SupermarketInfo\\src\\Screenshot 2022-12-18 004559.png";
           Image img6 = Image.getInstance(imageUrl6);
           img6.setAbsolutePosition(300,520);
           PdfContentByte canvas = writer.getDirectContent();
           Phrase phrase = new Phrase(jTextField1.getText());
           String s1=jTextArea1.getText();
           String data1[]=s1.split(",");
           ColumnText.showTextAligned(canvas, Element.ALIGN_TOP,phrase,310,600, 0);
           Phrase phrase1 = new Phrase(data1[0]);
           ColumnText.showTextAligned(canvas, Element.ALIGN_TOP,phrase1,310,585, 0);
           Phrase phrase2 = new Phrase(data1[1]);
           ColumnText.showTextAligned(canvas, Element.ALIGN_TOP,phrase2,310,570, 0);
           Phrase phrase3 = new Phrase(data1[2]);
           ColumnText.showTextAligned(canvas, Element.ALIGN_TOP,phrase3,310,555, 0);
           Phrase phrase4 = new Phrase(jTextField2.getText());
           ColumnText.showTextAligned(canvas, Element.ALIGN_TOP,phrase4,310,540, 0);
           Phrase phrase5 = new Phrase("11/21,Baker Street,near Hyosung Showroom,");
           ColumnText.showTextAligned(canvas, Element.ALIGN_TOP,phrase5,50,600, 0);
           Phrase phrase6 = new Phrase("Atlanta");
           ColumnText.showTextAligned(canvas, Element.ALIGN_TOP,phrase6,50,580, 0);
           Phrase phrase7 = new Phrase("kroger_mart@gmail.com");
           ColumnText.showTextAligned(canvas, Element.ALIGN_TOP,phrase7,50,560, 0);
           Phrase phrase8 = new Phrase("1800-2121-0000");
           ColumnText.showTextAligned(canvas, Element.ALIGN_TOP,phrase8,50,540, 0);
           String d1[]=date.split("-");
           String t1[]=time.split(":");
           String date1=t1[0]+":"+t1[1]+" ,"+d1[2]+"/"+d1[1]+"/"+d1[0];
           Phrase phrase9 = new Phrase(date1);
           ColumnText.showTextAligned(canvas, Element.ALIGN_TOP,phrase9,420,675, 0);
           doc.add(img);
           doc.add(img1);
           doc.add(img2);
           doc.add(img3);
           doc.add(img4);
           doc.add(img5);
           doc.add(img6);
           PdfPTable tbl=new PdfPTable(4);
           tbl.addCell("Name");
           tbl.addCell("Quantity");
           tbl.addCell("Price");
           tbl.addCell("Total Price");
           float np=0f;
            for(int i=0;i<model.getRowCount();i++)
            {
                String n=model.getValueAt(i,1).toString();
                String q=model.getValueAt(i,2).toString();
                String p=model.getValueAt(i,3).toString();
                String tp=model.getValueAt(i,4).toString();
                tbl.addCell(n);
                tbl.addCell(q);
                tbl.addCell(p);
                tbl.addCell(tp);
                Float a = Float.parseFloat(tp);
                np=np+a;
            }
            tbl.addCell("");
            tbl.addCell("");
            tbl.addCell("");
            tbl.addCell("");
            String NP=String.valueOf(np);
            tbl.addCell("");
            tbl.addCell("");
            tbl.addCell("Gross Price");
            tbl.addCell(NP);
            tbl.addCell("");
            tbl.addCell("");
            tbl.addCell("Tax");
            Random r = new Random();
            float id=r.nextFloat(1,50);
            float gp=np+id;
            String ID=String.format("%.2f",id);
            tbl.addCell(ID);
            tbl.addCell("");
            tbl.addCell("");
            tbl.addCell("Delivery Charge");
            tbl.addCell("NIL");
            tbl.addCell("");
            tbl.addCell("");
            tbl.addCell("NET PRICE");
            String GP=String.format("%.2f",gp);
            tbl.addCell(GP);
            doc.add(new Paragraph("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"));
            doc.add(tbl);
            doc.add(new Paragraph("\n\n\n                                                                THANK YOU!"));
            doc.close();
            JOptionPane.showMessageDialog(null,"YOUR ORDER WILL BE DELIVERED QUICKLY!!");
            dispose();
            new MyCart().show();
        }   
        catch(Exception e)
        {
            System.out.println(e);
        }
    }                                 

    private void NEXTMousePressed(java.awt.event.MouseEvent evt) {                                  
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(1);
    }                                 

    private void CONFIRMMousePressed(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
        int x=JOptionPane.showConfirmDialog(this,"Are you sure?","Confirm",JOptionPane.YES_NO_OPTION);
        int y=0;
        try{
            if(x==0)
            {
                try
                {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarketdb","root","");
                    Statement stmt = con.createStatement();
                    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                    for(int i=0;i<model.getRowCount();i++)
                    {
                        String id=(String)model.getValueAt(i,0);
                        String name=(String)model.getValueAt(i,1);
                        String quantity=(String)model.getValueAt(i,2);
                        String price=(String)model.getValueAt(i,3);
                        String qt="";
                        String q1 = "insert into history values('" +last+"','"+id+"','"+name+"','"+quantity+"','"+price+"','"+date+"')";
                        Statement stmt1=con.createStatement();
                        ResultSet rs = stmt1.executeQuery("SELECT * FROM shop");
                        while(rs.next())
                        {
                            if(rs.getString(2).equals(name)) 
                            {
                                qt=rs.getString(3);
                            }
                        }
                        float q = Float.parseFloat(quantity);
                        float cq = Float.parseFloat(qt);
                        float tq = cq-q;
                        if(tq>=0.0)
                        {
                            y=1;
                            String tq1=String.valueOf(tq);
                            String q3 = "UPDATE shop set Quantity = '" + tq+ "' WHERE ID = '" +id + "'";
                            stmt.executeUpdate(q1);
                            stmt.executeUpdate(q3);
                        }
                    }
                    if(y==1)
                    {
                       
                    JOptionPane.showMessageDialog(null,"CONFIRMED!!");
                    String q2 = "DELETE FROM `buynow` WHERE 1";
                    stmt.executeUpdate(q2);
                    }
                }
        catch(Exception e)
        {
            System.out.println(e);
        }
                jTabbedPane1.setSelectedIndex(2);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }                                    

    private void jLabel8MousePressed(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
        try
        {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarketdb","root","");
            Statement stmt=con.createStatement();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            for(int i=0;i<model.getRowCount();i++)
            {
                String n=model.getValueAt(i,1).toString();
                String q=model.getValueAt(i,2).toString();
                String p=model.getValueAt(i,3).toString();
                String q1 = "insert into mycart values('" +last+"','"+n+"','"+q+"','"+p+"')";
                stmt.executeUpdate(q1);
		    String q2 = "DELETE FROM `buynow` WHERE 1";
		    stmt.executeUpdate(q2);
            }
            MyCart c=new MyCart();
            c.show();
            dispose();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
         
    }

    private void jLabel5MousePressed(java.awt.event.MouseEvent evt) {                                     
        // TODO add your handling code here:
        try
        {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/supermarketdb","root","");
            Statement stmt=con.createStatement();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            for(int i=0;i<model.getRowCount();i++)
            {
                String n=model.getValueAt(i,1).toString();
                String q=model.getValueAt(i,2).toString();
                String p=model.getValueAt(i,3).toString();
                String q1 = "insert into mycart values('" +last+"','"+n+"','"+q+"','"+p+"')";
                stmt.executeUpdate(q1);
		    String q2 = "DELETE FROM `buynow` WHERE 1";
		    stmt.executeUpdate(q2);
            }
            MyCart c=new MyCart();
            c.show();
            dispose();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
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
            java.util.logging.Logger.getLogger(BuyNow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuyNow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuyNow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuyNow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuyNow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel BILL;
    private javax.swing.JLabel CONFIRM;
    private javax.swing.JLabel NEXT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    public javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration                   
}
