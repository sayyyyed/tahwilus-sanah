/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muslimpro;

import java.sql.Connection;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Sayyed
 */
public class dashboard extends  javax.swing.JFrame  {
    private String campur;

    public String getCampur() {
        return campur;
    }

    public void setCampur(String campur) {
        this.campur = campur;
    }
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    login melbu = new login ();
    /**
     * Creates new form login
     */
    public dashboard() {
        initComponents();
         
         this.setLocationRelativeTo(null);//AGAR FRAME KETIKA DI-RUN BERADA DI TENGAH LAYAR
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        hitungUmur = new javax.swing.JLabel();
        welkam1 = new javax.swing.JLabel();
        hitungWeton = new javax.swing.JLabel();
        pranataMangsa = new javax.swing.JLabel();
        tahwilSanah = new javax.swing.JLabel();
        sapaNama = new javax.swing.JLabel();
        welkam = new javax.swing.JLabel();
        hoover1 = new javax.swing.JLabel();
        exitPage = new javax.swing.JLabel();
        minimizePage = new javax.swing.JLabel();
        hoover2 = new javax.swing.JLabel();
        fidbek = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusTraversalPolicyProvider(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        hitungUmur.setBackground(new java.awt.Color(255, 255, 255));
        hitungUmur.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        hitungUmur.setForeground(new java.awt.Color(255, 255, 255));
        hitungUmur.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hitungUmur.setText("HITUNG UMUR");
        hitungUmur.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        hitungUmur.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hitungUmurMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hitungUmurMouseEntered(evt);
            }
        });
        getContentPane().add(hitungUmur, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 340, 190, 30));

        welkam1.setBackground(new java.awt.Color(26, 26, 26));
        welkam1.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        welkam1.setForeground(new java.awt.Color(255, 255, 255));
        welkam1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welkam1.setText("Log Out");
        welkam1.setOpaque(true);
        welkam1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                welkam1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                welkam1MouseEntered(evt);
            }
        });
        getContentPane().add(welkam1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 60, 30));

        hitungWeton.setBackground(new java.awt.Color(255, 255, 255));
        hitungWeton.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        hitungWeton.setForeground(new java.awt.Color(255, 255, 255));
        hitungWeton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hitungWeton.setText("CARI WETON");
        hitungWeton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        hitungWeton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hitungWetonMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hitungWetonMouseEntered(evt);
            }
        });
        getContentPane().add(hitungWeton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 190, 30));

        pranataMangsa.setBackground(new java.awt.Color(255, 255, 255));
        pranataMangsa.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        pranataMangsa.setForeground(new java.awt.Color(255, 255, 255));
        pranataMangsa.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pranataMangsa.setText("PRANOTO MONGSO");
        pranataMangsa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        pranataMangsa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pranataMangsaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pranataMangsaMouseEntered(evt);
            }
        });
        getContentPane().add(pranataMangsa, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 190, 30));

        tahwilSanah.setBackground(new java.awt.Color(255, 255, 255));
        tahwilSanah.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        tahwilSanah.setForeground(new java.awt.Color(255, 255, 255));
        tahwilSanah.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tahwilSanah.setText("TAHWILUS SANAH");
        tahwilSanah.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        tahwilSanah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tahwilSanahMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tahwilSanahMouseEntered(evt);
            }
        });
        getContentPane().add(tahwilSanah, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 190, 30));

        sapaNama.setFont(new java.awt.Font("Montserrat Black", 0, 18)); // NOI18N
        sapaNama.setForeground(new java.awt.Color(255, 255, 255));
        sapaNama.setText("Hi, Mikail Mikkelsen");
        getContentPane().add(sapaNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 300, 30));

        welkam.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        welkam.setForeground(new java.awt.Color(255, 255, 255));
        welkam.setText("Selamat Datang,");
        getContentPane().add(welkam, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 130, 30));

        hoover1.setBackground(new java.awt.Color(255, 255, 255));
        hoover1.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        hoover1.setForeground(new java.awt.Color(255, 255, 255));
        hoover1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hoover1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        hoover1.setOpaque(true);
        getContentPane().add(hoover1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 420, 60, 10));

        exitPage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitPage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitPageMouseClicked(evt);
            }
        });
        getContentPane().add(exitPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 20, 30));

        minimizePage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimizePage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizePageMouseClicked(evt);
            }
        });
        getContentPane().add(minimizePage, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 40, 30));

        hoover2.setBackground(new java.awt.Color(255, 255, 255));
        hoover2.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        hoover2.setForeground(new java.awt.Color(255, 255, 255));
        hoover2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hoover2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        hoover2.setOpaque(true);
        getContentPane().add(hoover2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, 70, 10));

        fidbek.setBackground(new java.awt.Color(26, 26, 26));
        fidbek.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        fidbek.setForeground(new java.awt.Color(255, 255, 255));
        fidbek.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fidbek.setText("Feedback");
        fidbek.setOpaque(true);
        fidbek.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fidbekMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fidbekMouseEntered(evt);
            }
        });
        getContentPane().add(fidbek, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 390, 70, 30));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/muslimpro/dashboard.jpg"))); // NOI18N
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

    private void backgroundMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backgroundMouseEntered
         tahwilSanah.setForeground(new java.awt.Color(255, 255, 255));tahwilSanah.setBackground(new java.awt.Color(26, 26, 26));
         pranataMangsa.setForeground(new java.awt.Color(255, 255, 255));pranataMangsa.setBackground(new java.awt.Color(26, 26, 26));
         hitungWeton.setForeground(new java.awt.Color(255, 255, 255));hitungWeton.setBackground(new java.awt.Color(26, 26, 26));
         hitungUmur.setForeground(new java.awt.Color(255, 255, 255));hitungUmur.setBackground(new java.awt.Color(26, 26, 26));
         hoover1.setVisible(false);
         hoover2.setVisible(false);
    }//GEN-LAST:event_backgroundMouseEntered

    private void exitPageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitPageMouseClicked
        // TODO add your handling code here:
        System.exit(0);//KELUAR DARI FRAME, BUILD SUCCESSFUL
    }//GEN-LAST:event_exitPageMouseClicked

    private void minimizePageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizePageMouseClicked
        // TODO add your handling code here:
         this.setState(JFrame.ICONIFIED);//UNTUK MINIMIZE FRAME
    }//GEN-LAST:event_minimizePageMouseClicked

    private void tahwilSanahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tahwilSanahMouseClicked
        masehiTahwil masuk = new masehiTahwil();
        masuk.jLabel5.setText(sapaNama.getText());
        masuk.show();//MASUK KE TAHWILUS SANAH
        this.dispose();//FRAME PADA SAAT INI DIHILANGKAN        
    }//GEN-LAST:event_tahwilSanahMouseClicked

    private void pranataMangsaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pranataMangsaMouseClicked
        pranotoMongso masuk = new pranotoMongso();
        masuk.show();
        masuk.jLabel5.setText(sapaNama.getText());
        this.dispose();     
    }//GEN-LAST:event_pranataMangsaMouseClicked

    private void hitungWetonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hitungWetonMouseClicked
        cariWeton masuk = new cariWeton();
        masuk.jLabel5.setText(sapaNama.getText());
        masuk.show();
        this.dispose(); 
    }//GEN-LAST:event_hitungWetonMouseClicked

    private void welkam1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_welkam1MouseEntered
      
        hoover1.setVisible(true);
    }//GEN-LAST:event_welkam1MouseEntered

    private void tahwilSanahMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tahwilSanahMouseEntered
        tahwilSanah.setBackground(new java.awt.Color(255, 255, 255));
        tahwilSanah.setForeground(new java.awt.Color(26, 26, 26));
        tahwilSanah.setOpaque(true);
    }//GEN-LAST:event_tahwilSanahMouseEntered

    private void pranataMangsaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pranataMangsaMouseEntered
        pranataMangsa.setBackground(new java.awt.Color(255, 255, 255));
        pranataMangsa.setForeground(new java.awt.Color(26, 26, 26));
        pranataMangsa.setOpaque(true);
    }//GEN-LAST:event_pranataMangsaMouseEntered

    private void hitungWetonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hitungWetonMouseEntered
         hitungWeton.setBackground(new java.awt.Color(255, 255, 255));
        hitungWeton.setForeground(new java.awt.Color(26, 26, 26));
         hitungWeton.setOpaque(true);
    }//GEN-LAST:event_hitungWetonMouseEntered

    private void welkam1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_welkam1MouseClicked
      try {
          //MEMASUKKAN AKTIVITAS KE TABEL HISTORI PADA DATABASE
          String aktivitas = "LOG OUT";
                     DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                     Date date = new Date();
                     String sqlregister = "INSERT INTO `histori`(`aktivitas`,  `email`, `nama_lengkap`,`waktu` ) "
                            + "VALUES ('"+aktivitas+"','"+getEmail()+"','"+getCampur()+"','"+date+"')";
                    
                    java.sql.Connection con = (Connection)koneksi.koneksiDB();
                    java.sql.PreparedStatement pstm = con.prepareStatement(sqlregister);
                    pstm.execute();
                    System.out.println("BERHASIL SIGN");
                   melbu.show();
                   this.dispose();
                    
                
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.toString()) ;
            }
      
      
    }//GEN-LAST:event_welkam1MouseClicked

    private void hitungUmurMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hitungUmurMouseClicked
        itungUmur masuk = new itungUmur();
        masuk.jLabel5.setText(sapaNama.getText());
        masuk.show();
        this.dispose(); 
    }//GEN-LAST:event_hitungUmurMouseClicked

    private void hitungUmurMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hitungUmurMouseEntered
        hitungUmur.setBackground(new java.awt.Color(255, 255, 255));
        hitungUmur.setForeground(new java.awt.Color(26, 26, 26));
        hitungUmur.setOpaque(true);
    }//GEN-LAST:event_hitungUmurMouseEntered

    private void fidbekMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fidbekMouseClicked
         String m = JOptionPane.showInputDialog("Kritik dan sarannya :)");
         if (m != null){
         try {
          //MEMASUKKAN FEEDBACK KE TABEL FEEDBACK DI DATABASE
                     DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                     Date date = new Date();
                     String sqlregister = "INSERT INTO `feedback`(`email`,`laporan`,`waktu` ) "
                            + "VALUES ('"+getEmail()+"','"+m+"','"+date+"')";
                    
                    java.sql.Connection con = (Connection)koneksi.koneksiDB();
                    java.sql.PreparedStatement pstm = con.prepareStatement(sqlregister);
                    pstm.execute();
                    System.out.println("BERHASIL LAPOR");
                   
                    JOptionPane.showMessageDialog(null,"Terimakasih atas feedbacknya :) ") ;
                
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, e.toString()) ;
            }}
      
    }//GEN-LAST:event_fidbekMouseClicked

    private void fidbekMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fidbekMouseEntered
        hoover2.setVisible(true);
    }//GEN-LAST:event_fidbekMouseEntered

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
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel background;
    public javax.swing.JLabel exitPage;
    public javax.swing.JLabel fidbek;
    public javax.swing.JLabel hitungUmur;
    public javax.swing.JLabel hitungWeton;
    public javax.swing.JLabel hoover1;
    public javax.swing.JLabel hoover2;
    public javax.swing.JLabel minimizePage;
    public javax.swing.JLabel pranataMangsa;
    public javax.swing.JLabel sapaNama;
    public javax.swing.JLabel tahwilSanah;
    public javax.swing.JLabel welkam;
    public javax.swing.JLabel welkam1;
    // End of variables declaration//GEN-END:variables
}
