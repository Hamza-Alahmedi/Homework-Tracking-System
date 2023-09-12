/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package deneytakipsistemi;

import java.awt.CardLayout;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.lang.System.Logger;
import java.net.Inet4Address;
import java.util.logging.Level;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author Hamza
 */
public class student_Profil extends javax.swing.JFrame {
    byte[] photo=null;
    
    ImageIcon format=null;
    DefaultListModel model = new DefaultListModel();
    DefaultTableModel dtm = new DefaultTableModel();
    
    String path=null;
    String fileName;
    
    Connection con = null;
    ResultSet rs = null;
    PreparedStatement ps = null;
    
    
   
    

    CardLayout cardLayout;
    String[] title = {"EXPERIMENT NAME","FEEDBACK", "GRADE"};
    
    public student_Profil() {
        initComponents();
        con =  myConnection.myCon();
        setIconImage();
        System.out.println("a");

        cardLayout = (CardLayout) (pnlCards.getLayout());
        
        dtm.setColumnIdentifiers(title);
        
        
    }
    
    
        
        
    
  
    
    
    
    
    
    //function to resize Image to fit into the label
    public ImageIcon resizeImage(String imagePath, byte[] pic){
        ImageIcon myImage=null;
        if(imagePath !=null)
        {
            myImage =  new  ImageIcon(imagePath);
        }else
        {
            myImage = new ImageIcon(pic);
        }
        Image img= myImage.getImage();
        Image img2=img.getScaledInstance(photolbl.getHeight(), photolbl.getWidth(), Image.SCALE_SMOOTH);
        ImageIcon image=  new ImageIcon(img2);
        return image;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        savepop = new javax.swing.JMenuItem();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenu3 = new javax.swing.JMenu();
        addNewpop = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        pnlCards = new javax.swing.JPanel();
        pnlCard2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        MY_EXPTBL = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        pnlCard3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        searchtxt = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        equipmentList = new javax.swing.JList<>();
        jLabel17 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        pnlCard1 = new javax.swing.JPanel();
        photolbl = new javax.swing.JLabel();
        namelbl = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        savbtn = new javax.swing.JButton();
        txt2 = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        femaleR = new javax.swing.JRadioButton();
        maleR = new javax.swing.JRadioButton();
        jLabel13 = new javax.swing.JLabel();
        comboYear = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        txt4 = new javax.swing.JTextField();
        changephotobtn = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        savepop.setText("Save Change");
        savepop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                savepopMouseClicked(evt);
            }
        });
        jPopupMenu1.add(savepop);

        jMenu3.setText("New");

        addNewpop.setText("Add New Experiment");
        addNewpop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewpopActionPerformed(evt);
            }
        });
        jMenu3.add(addNewpop);

        jPopupMenu2.add(jMenu3);

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DENEY TAKIP SISTEMI");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jPanel1.setComponentPopupMenu(jPopupMenu2);
        jPanel1.setMaximumSize(new java.awt.Dimension(1200, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(1, 175, 175));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/menu (3).png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(167, 13, 51, 48));

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Yet R", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(1, 175, 175));
        jButton1.setText("ADD NEW EXPERIMENT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 190, 50));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Yet R", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(1, 175, 175));
        jButton2.setText("MY PROFILE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 190, 50));

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setFont(new java.awt.Font("Yet R", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(1, 175, 175));
        jButton3.setText("MY EXPERIMENTS");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 190, 50));

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Yet R", 0, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(1, 175, 175));
        jButton4.setText("VIEW OTHE EXPERIMENTS");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 190, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 230, 720));

        pnlCards.setComponentPopupMenu(jPopupMenu1);
        pnlCards.setOpaque(false);
        pnlCards.setLayout(new java.awt.CardLayout());

        pnlCard2.setBackground(new java.awt.Color(255, 153, 255));
        pnlCard2.setComponentPopupMenu(jPopupMenu2);
        pnlCard2.setOpaque(false);

        jLabel15.setFont(new java.awt.Font("Trebuchet MS", 2, 24)); // NOI18N
        jLabel15.setText("MY EXPERIMENTS");

        MY_EXPTBL.setBackground(new java.awt.Color(0, 153, 153));
        MY_EXPTBL.setForeground(new java.awt.Color(255, 255, 255));
        MY_EXPTBL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        jScrollPane1.setViewportView(MY_EXPTBL);

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setFont(new java.awt.Font("Yet R", 0, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(1, 175, 175));
        jButton6.setText("SHOW MY EXPERIMENTS");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCard2Layout = new javax.swing.GroupLayout(pnlCard2);
        pnlCard2.setLayout(pnlCard2Layout);
        pnlCard2Layout.setHorizontalGroup(
            pnlCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCard2Layout.createSequentialGroup()
                .addGroup(pnlCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCard2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCard2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(pnlCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 881, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        pnlCard2Layout.setVerticalGroup(
            pnlCard2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCard2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        pnlCards.add(pnlCard2, "pnlCard2");

        pnlCard3.setBackground(new java.awt.Color(204, 255, 51));
        pnlCard3.setComponentPopupMenu(jPopupMenu2);
        pnlCard3.setOpaque(false);

        jLabel16.setFont(new java.awt.Font("Verdana", 0, 20)); // NOI18N
        jLabel16.setText("ENTER EXPERIMETN NAME:");

        equipmentList.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        equipmentList.setToolTipText("");
        jScrollPane2.setViewportView(equipmentList);

        jLabel17.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("EQUIPMENTS TO BE USED");

        jButton5.setText("Search");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCard3Layout = new javax.swing.GroupLayout(pnlCard3);
        pnlCard3.setLayout(pnlCard3Layout);
        pnlCard3Layout.setHorizontalGroup(
            pnlCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCard3Layout.createSequentialGroup()
                .addGroup(pnlCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCard3Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(pnlCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlCard3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5)))
                .addContainerGap(199, Short.MAX_VALUE))
        );
        pnlCard3Layout.setVerticalGroup(
            pnlCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCard3Layout.createSequentialGroup()
                .addGroup(pnlCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCard3Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(pnlCard3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(searchtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCard3Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(103, 103, 103)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 397, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        pnlCards.add(pnlCard3, "pnlCard3");

        pnlCard1.setBackground(new java.awt.Color(204, 204, 255));
        pnlCard1.setComponentPopupMenu(jPopupMenu1);
        pnlCard1.setOpaque(false);

        photolbl.setBackground(new java.awt.Color(255, 255, 255));
        photolbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        photolbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user.png"))); // NOI18N
        photolbl.setOpaque(true);

        namelbl.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel9.setText("NAME- SURNAME");

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel8.setText("STUDENT NUMBER");

        txt1.setEditable(false);
        txt1.setBackground(new java.awt.Color(1, 175, 175));
        txt1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt1.setForeground(new java.awt.Color(255, 255, 255));
        txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel10.setText("E-main");

        savbtn.setText("save");
        savbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savbtnActionPerformed(evt);
            }
        });

        txt2.setEditable(false);
        txt2.setBackground(new java.awt.Color(1, 175, 175));
        txt2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt2.setForeground(new java.awt.Color(255, 255, 255));
        txt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt2ActionPerformed(evt);
            }
        });

        txt3.setEditable(false);
        txt3.setBackground(new java.awt.Color(1, 175, 175));
        txt3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt3.setForeground(new java.awt.Color(255, 255, 255));
        txt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt3ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel12.setText("GENDER");

        femaleR.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(femaleR);
        femaleR.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        femaleR.setText("FEMALE");
        femaleR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleRActionPerformed(evt);
            }
        });

        maleR.setBackground(new java.awt.Color(1, 175, 175));
        buttonGroup1.add(maleR);
        maleR.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        maleR.setText("MALE");

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel13.setText("YEAR");

        comboYear.setBackground(new java.awt.Color(0, 204, 204));
        comboYear.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        comboYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FIRST", "SECOND ", "THEIRD", "FOURTH" }));

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel14.setText("PHONE NUMBER");

        txt4.setEditable(false);
        txt4.setBackground(new java.awt.Color(1, 175, 175));
        txt4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txt4.setForeground(new java.awt.Color(255, 255, 255));
        txt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt4ActionPerformed(evt);
            }
        });

        changephotobtn.setBackground(new java.awt.Color(255, 255, 255));
        changephotobtn.setFont(new java.awt.Font("Yet R", 0, 12)); // NOI18N
        changephotobtn.setForeground(new java.awt.Color(1, 175, 175));
        changephotobtn.setText("change photo");
        changephotobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changephotobtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlCard1Layout = new javax.swing.GroupLayout(pnlCard1);
        pnlCard1.setLayout(pnlCard1Layout);
        pnlCard1Layout.setHorizontalGroup(
            pnlCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCard1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCard1Layout.createSequentialGroup()
                        .addGroup(pnlCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCard1Layout.createSequentialGroup()
                                .addGap(27, 380, Short.MAX_VALUE)
                                .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCard1Layout.createSequentialGroup()
                                .addGroup(pnlCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCard1Layout.createSequentialGroup()
                                        .addGroup(pnlCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlCard1Layout.createSequentialGroup()
                                                .addGroup(pnlCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel8)
                                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                        .addGap(88, 88, 88))
                                    .addGroup(pnlCard1Layout.createSequentialGroup()
                                        .addGroup(pnlCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(pnlCard1Layout.createSequentialGroup()
                                                .addGap(28, 28, 28)
                                                .addGroup(pnlCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel13)
                                                    .addComponent(jLabel12)
                                                    .addComponent(jLabel14)))
                                            .addGroup(pnlCard1Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(changephotobtn)
                                                .addGap(18, 18, 18)
                                                .addComponent(savbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(pnlCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnlCard1Layout.createSequentialGroup()
                                        .addComponent(femaleR)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(maleR))
                                    .addComponent(txt2)
                                    .addComponent(txt1)
                                    .addComponent(txt3)
                                    .addComponent(comboYear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(304, 304, 304))
                    .addGroup(pnlCard1Layout.createSequentialGroup()
                        .addComponent(photolbl, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(namelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        pnlCard1Layout.setVerticalGroup(
            pnlCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCard1Layout.createSequentialGroup()
                .addGroup(pnlCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlCard1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(namelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlCard1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(photolbl, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(changephotobtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(savbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(pnlCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCard1Layout.createSequentialGroup()
                        .addGroup(pnlCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(pnlCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(femaleR)
                            .addComponent(maleR)
                            .addComponent(jLabel12))
                        .addGap(33, 33, 33)
                        .addComponent(jLabel13))
                    .addComponent(comboYear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlCard1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(180, 180, 180))
        );

        pnlCards.add(pnlCard1, "pnlCard1");

        jPanel1.add(pnlCards, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 970, 720));

        jPanel4.setBackground(new java.awt.Color(1, 136, 123));

        jLabel3.setFont(new java.awt.Font("Stencil", 3, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("DENEY TAKIP SISTEM");
        jLabel3.setToolTipText("");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 26)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("STUDENT");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/physics.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(700, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 130));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/background.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 850));

        jMenu1.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setText("LOG OUT");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setText("CLOSE");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);
        jMenu1.add(jSeparator1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem3.setText("ADD NEW EX");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked

    }//GEN-LAST:event_jLabel2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        cardLayout.show(pnlCards, "pnlCard1");
        String st_id = txt2.getText();
        System.out.println(st_id);
        
        try {
            String qurary ="SELECT PHOTO FROM IMAGES WHERE STUDENT_ID="+st_id;
            ps=con.prepareStatement(qurary);
            rs=ps.executeQuery();
           
            byte[] imgData = null;
            
            if(rs.next()){
               Blob img = rs.getBlob("PHOTO");
                imgData  = img.getBytes(1, (int) img.length());
                BufferedImage bufImag = ImageIO.read(new ByteArrayInputStream(imgData));
                ImageIcon icon = new ImageIcon(bufImag);
                photolbl.setIcon(resizeImage(path, photo));
            }
            
        } catch (Exception e) {
            
            System.out.println(e);
        }
        
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        cardLayout.show(pnlCards, "pnlCard2");
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        cardLayout.show(pnlCards, "pnlCard3");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1ActionPerformed

    private void txt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt2ActionPerformed

    private void txt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt3ActionPerformed

    private void txt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt4ActionPerformed

    private void changephotobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changephotobtnActionPerformed
        JFileChooser file = new JFileChooser();
        file.setDialogTitle("Select Image");
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter("*.Images","jpg","gif","png");
        file.addChoosableFileFilter(filter);
        int result = file.showOpenDialog(null);
        if(result == JFileChooser.APPROVE_OPTION){
            File selectedfile=file.getSelectedFile();
            path=selectedfile.getAbsolutePath();
//             File f= file.getSelectedFile();
//             fileName=f.getAbsolutePath();
              photolbl.setIcon(resizeImage(path, photo));
              fileName=path;
              System.out.println(fileName);
        }
        
       
//        ImageIcon icon = new ImageIcon(fileName);
        
       
//        try {
//            File image = new File(fileName);
//            FileInputStream fis= new FileInputStream(image);
//            ByteArrayOutputStream bos = new ByteArrayOutputStream();
//            byte[] buf = new byte[1024];
//                for (int readNum; (readNum=fis.read(buf)) !=-1;)
//                {
//                    bos.write(buf, 0, readNum);
//                }
//                photo=bos.toByteArray();
//                photolbl.setIcon(resizeImage(fileName, buf));
//            
//        } catch (FileNotFoundException ex) {
//            java.util.logging.Logger.getLogger(student_Profil.class.getName()).log(Level.SEVERE, null, ex);
//            
//            
//           
//        } catch (IOException ex) {
//            java.util.logging.Logger.getLogger(student_Profil.class.getName()).log(Level.SEVERE, null, ex);
//        }

            
    }//GEN-LAST:event_changephotobtnActionPerformed
    
    
    
    
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Add_new_experment newEx = new Add_new_experment();
        newEx.setVisible(true);
        newEx.id=txt2.getText();
        newEx.testtxt.setText(txt2.getText());
        this.show(false);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void addNewpopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewpopActionPerformed
        Add_new_experment newEx = new Add_new_experment();
        newEx.setVisible(true);
        this.show(false);
    }//GEN-LAST:event_addNewpopActionPerformed

    private void femaleRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_femaleRActionPerformed

    private void savbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savbtnActionPerformed
         String  id = txt2.getText();
         try {
            String quary = "INSERT INTO IMAGES (PHOTO, STUDENT_ID)VALUES (?,?)";
            File file = new File(fileName);
            FileInputStream fis = new FileInputStream(file);
             try {
                 ps=con.prepareStatement(quary);
                 ps.setBinaryStream(1, fis, file.length());
                 ps.setString(2, id);
                 ps.executeUpdate();
                 JOptionPane.showMessageDialog(null, "Image has been saved");
                 
             } catch (HeadlessException | SQLException e) {
                 JOptionPane.showMessageDialog(null, e);
             }       
        } catch (FileNotFoundException e) {
                 JOptionPane.showMessageDialog(null, e);
        }
          



//         int id =  Integer.parseInt(txt2.getText());
//           System.out.println(id);
//        try {
//            String quary ="UPDATE STUDENTS SET PHOTO=? WHERE ID=?";
//            ps = con.prepareStatement(quary);
//            ps.setBytes(1, photo);
//            ps.setInt(2, id);
//            
//            
//            ps.execute();
//                JOptionPane.showMessageDialog(null, "Saved!");
//        } catch (SQLException ex) {
//            JOptionPane.showMessageDialog(null, ex);
//            
//        }
//        
//        
        
    }//GEN-LAST:event_savbtnActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        StudentLogin st = new StudentLogin();
        st.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        this.show(false);
        Add_new_experment nex =  new Add_new_experment();
        nex.setVisible(true);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        model.removeAllElements();
        equipmentList.setModel(model);
        String eName= searchtxt.getText();
        try {
            String quary  ="SELECT EQUIPMENT FROM EXPERIMENTS WHERE NAME =?";
            ps = con.prepareStatement(quary);
            ps.setString(1, eName);
            rs=ps.executeQuery();
            
            if(rs.next())
            {
                 String equip = rs.getString("EQUIPMENT");
                 model.addElement(equip);
            }
            equipmentList.setModel(model);
              
                
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void savepopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_savepopMouseClicked
       
    }//GEN-LAST:event_savepopMouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         int id=   Integer.parseInt(txt2.getText());
        try {
            String quary = "SELECT DISTINCT NAME,FEEDBACK,GRADE FROM EXPERIMENTS WHERE STUDENT_ID=?";
            System.out.println(id);
            ps= con.prepareStatement(quary);
            ps.setInt(1, id);
            rs= ps.executeQuery();
            
            while(rs.next()){
               
                String ENAME  = rs.getString("NAME");
                String feedback = rs.getString("FEEDBACK");
                double GRADE = rs.getDouble("GRADE");
                
                
                
               
                Object tableData[] = {ENAME,feedback,GRADE};
                dtm.addRow(tableData);
                MY_EXPTBL.setModel(dtm);
               
            
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(student_Profil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(student_Profil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(student_Profil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(student_Profil.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new student_Profil().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable MY_EXPTBL;
    private javax.swing.JMenuItem addNewpop;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton changephotobtn;
    public javax.swing.JComboBox<String> comboYear;
    private javax.swing.JList<String> equipmentList;
    public javax.swing.JRadioButton femaleR;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    public javax.swing.JRadioButton maleR;
    public javax.swing.JLabel namelbl;
    public javax.swing.JLabel photolbl;
    private javax.swing.JPanel pnlCard1;
    private javax.swing.JPanel pnlCard2;
    private javax.swing.JPanel pnlCard3;
    private javax.swing.JPanel pnlCards;
    private javax.swing.JButton savbtn;
    private javax.swing.JMenuItem savepop;
    private javax.swing.JTextField searchtxt;
    public javax.swing.JTextField txt1;
    public javax.swing.JTextField txt2;
    public javax.swing.JTextField txt3;
    public javax.swing.JTextField txt4;
    // End of variables declaration//GEN-END:variables
    private void setIconImage() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icons/Frame_icon.png")));

    }
}
