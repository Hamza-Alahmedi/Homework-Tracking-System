 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package deneytakipsistemi;

import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.JFrame;

/**
 *
 * @author Hamza
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
        initComponents();
        setIconImage();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        teacher_loginbtn = new javax.swing.JLabel();
        student_loginbtn = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(1, 175, 175));

        jLabel1.setFont(new java.awt.Font("STFangsong", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("DENEY TAKIP SİSTEMİ");

        teacher_loginbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        teacher_loginbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttons/button_teacher-login.png"))); // NOI18N
        teacher_loginbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                teacher_loginbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                teacher_loginbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                teacher_loginbtnMouseExited(evt);
            }
        });

        student_loginbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        student_loginbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttons/button_student-login.png"))); // NOI18N
        student_loginbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                student_loginbtnMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                student_loginbtnMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                student_loginbtnMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("___________________________");
        jLabel3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\hamza\\Downloads\\tinywow_08fad5a977d659269405aaad3171c101_10289100 (2).png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(student_loginbtn)
                            .addComponent(teacher_loginbtn)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(teacher_loginbtn)
                .addGap(28, 28, 28)
                .addComponent(student_loginbtn)
                .addGap(18, 18, 18)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void teacher_loginbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teacher_loginbtnMouseEntered
        // TODO add your handling code here:
        teacher_loginbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttons/button_teacher-login_clicked.png")));
    }//GEN-LAST:event_teacher_loginbtnMouseEntered

    private void teacher_loginbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teacher_loginbtnMouseExited
        // TODO add your handling code here:
        teacher_loginbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttons/button_teacher-login.png")));

    }//GEN-LAST:event_teacher_loginbtnMouseExited

    private void student_loginbtnMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_student_loginbtnMouseEntered
        // TODO add your handling code here:
         student_loginbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttons/button_student-login_clicked.png")));

    }//GEN-LAST:event_student_loginbtnMouseEntered

    private void student_loginbtnMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_student_loginbtnMouseExited
        // TODO add your handling code here:
       student_loginbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/buttons/button_student-login.png")));

    }//GEN-LAST:event_student_loginbtnMouseExited

    private void teacher_loginbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_teacher_loginbtnMouseClicked
        this.dispose();
        Teacher_login Tlog = new Teacher_login();
        Tlog.setVisible(true);
    }//GEN-LAST:event_teacher_loginbtnMouseClicked

    private void student_loginbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_student_loginbtnMouseClicked
        this.dispose();
        StudentLogin Slog = new StudentLogin();
        Slog.setVisible(true);
    }//GEN-LAST:event_student_loginbtnMouseClicked

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel student_loginbtn;
    private javax.swing.JLabel teacher_loginbtn;
    // End of variables declaration//GEN-END:variables

    private void setIconImage() {
       setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icons/Frame_icon.png")));
        

        
    }
}
