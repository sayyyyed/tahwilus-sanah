/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muslimpro;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Sayyed
 */
public class login extends javax.swing.JFrame{

    
      String campur;
      String id;
      String aktivitas = "LOGIN";
     
     public String getCampur() {
        return campur;
    }
    /**
     * Creates new form login
     */
    public login(String campur, String id) {
         this.campur = campur;
         this.id = id;
         initComponents();
         jTextField1.setText(campur);
         this.setLocationRelativeTo(null);
    }
    public login() {
         initComponents();
         jLabel1.setVisible(false);  
         this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        exitPage = new javax.swing.JLabel();
        checkPass = new javax.swing.JLabel();
        minimizePage = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusTraversalPolicyProvider(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        exitPage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitPage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitPageMouseClicked(evt);
            }
        });
        getContentPane().add(exitPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 20, 30));

        checkPass.setBackground(new java.awt.Color(153, 0, 0));
        checkPass.setFont(new java.awt.Font("Montserrat ExtraBold", 0, 14)); // NOI18N
        checkPass.setForeground(new java.awt.Color(255, 255, 255));
        checkPass.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        checkPass.setText("MASUK");
        checkPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkPassMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                checkPassMouseEntered(evt);
            }
        });
        getContentPane().add(checkPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 130, 30));

        minimizePage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimizePage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizePageMouseClicked(evt);
            }
        });
        getContentPane().add(minimizePage, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 40, 30));

        jLabel2.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Klik jika belum ada id !");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 430, 180, -1));

        jTextField1.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(204, 204, 204));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Masukkan id anda !");
        jTextField1.setBorder(null);
        jTextField1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField1MouseClicked(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 190, 30));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ID yang anda masukkan salah !");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 294, -1, 20));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/muslimpro/login bg.jpg"))); // NOI18N
        background.setText("jLabel1");
        background.setPreferredSize(new java.awt.Dimension(450, 500));
        background.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                backgroundMouseEntered(evt);
            }
        });
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
//       jLabel2.setFont(new java.awt.Font("Montserrat Black", 0, 14));
        jLabel2.setFont(new java.awt.Font("Montserrat", java.awt.Font.BOLD, 14));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void backgroundMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundMouseEntered
         jLabel2.setFont(new java.awt.Font("Montserrat", java.awt.Font.PLAIN, 14));
         checkPass.setBackground(new java.awt.Color(113, 15, 19));
         checkPass.setForeground(new java.awt.Color(255, 255, 255));
         checkPass.setOpaque(false);
    }//GEN-LAST:event_backgroundMouseEntered

    private void exitPageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitPageMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitPageMouseClicked

    private void minimizePageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizePageMouseClicked
        // TODO add your handling code here:
         this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizePageMouseClicked

    private void checkPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkPassMouseClicked
        checkPass.setForeground(new java.awt.Color(113, 15, 19));
        checkPass.setBackground(new java.awt.Color(255, 255, 255));
        checkPass.setOpaque(true);
        System.out.println(jTextField1.getText());
       
          
       String sqlcek = "SELECT * FROM perloginan WHERE id = + '"+jTextField1.getText() + "'";
                 
        try {
            Connection conn = koneksi.koneksiDB();
            Statement st = conn.createStatement();
            ResultSet res = st.executeQuery(sqlcek);
            if (res.next()) {
                if (jTextField1.getText().equals(res.getString("id"))) {
                    try {
                        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                        Date date = new Date();

                        signUpPage ea = new signUpPage();
                        String sqlregister = "INSERT INTO `histori`(`aktivitas`,  `email`, `nama_lengkap`,`waktu` ) "
                                + "VALUES ('"+aktivitas+"','"+res.getString("email")+"','"+res.getString("lengkap")+"','"+date+"')";

                        java.sql.Connection con = (Connection)koneksi.koneksiDB();
                        java.sql.PreparedStatement pstm = con.prepareStatement(sqlregister);
                        pstm.execute();
                         System.out.println("BERHASIL LOGIN");
                    
                
                    } catch (Exception e) {
                        e.printStackTrace();
                        JOptionPane.showMessageDialog(null, e.toString()) ;
                    }
                    
                dashboard melbu = new dashboard ();
                melbu.setEmail(res.getString("email"));
                melbu.setCampur(res.getString("lengkap"));
                System.out.println(jTextField1.getText());
                melbu.sapaNama.setText("Hi, "+ res.getString("lengkap"));
                melbu.show();
                this.dispose();
                    
                }
            }
                  else if ("ADMIN123".equals(jTextField1.getText())) {
                   adminPage xy = new adminPage();
                   xy.show();
                   this.dispose();
                        } 
            else {
                conn.prepareStatement(sqlcek);
                res = st.executeQuery(sqlcek);
                jLabel1.setVisible(true);
            }
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e);
        }
                
                
                 
               
     
             
        
        
        
    }//GEN-LAST:event_checkPassMouseClicked

    private void checkPassMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkPassMouseEntered
        checkPass.setForeground(new java.awt.Color(113, 15, 19));
        checkPass.setBackground(new java.awt.Color(255, 255, 255));
        checkPass.setOpaque(true);
        
    }//GEN-LAST:event_checkPassMouseEntered

    private void jTextField1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField1MouseClicked
        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField1.setText("");
        jLabel1.setVisible(false);  
    }//GEN-LAST:event_jTextField1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
       signUpPage masuk = new signUpPage();
       masuk.show();
       this.dispose();
    }//GEN-LAST:event_jLabel2MouseClicked

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
    public javax.swing.JLabel background;
    public javax.swing.JLabel checkPass;
    public javax.swing.JLabel exitPage;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JLabel minimizePage;
    // End of variables declaration//GEN-END:variables
}
