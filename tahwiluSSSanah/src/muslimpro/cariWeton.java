/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muslimpro;

import javax.swing.JFrame;

/**
 *
 * @author Sayyed
 */
public class cariWeton extends javax.swing.JFrame{

    public cariWeton() {
         initComponents();
         this.setLocationRelativeTo(null); //AGAR FRAME KETIKA DI-RUN BERADA DI TENGAH LAYAR
         jLabel2.setVisible(false);
         jLabel3.setVisible(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        exitPage = new javax.swing.JLabel();
        minimizePage = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusTraversalPolicyProvider(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Montserrat Black", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Menu Utama");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, -1, -1));

        jLabel5.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Hi, Maximilian von Habsburg");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, -1, -1));

        jLabel3.setBackground(new java.awt.Color(114, 18, 22));
        jLabel3.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("jLabel3");
        jLabel3.setOpaque(true);
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, 240, 40));

        jLabel1.setBackground(new java.awt.Color(0, 102, 0));
        jLabel1.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cari");
        jLabel1.setOpaque(true);
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 70, 20));

        jLabel2.setFont(new java.awt.Font("Montserrat SemiBold", 0, 12)); // NOI18N
        jLabel2.setText("bertepatan dengan hari");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 314, 300, 20));

        jTextField1.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(51, 51, 51));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Tahun");
        jTextField1.setBorder(null);
        jTextField1.setOpaque(false);
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 70, 30));

        jTextField2.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(51, 51, 51));
        jTextField2.setText("Tanggal");
        jTextField2.setBorder(null);
        jTextField2.setOpaque(false);
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 70, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"}));
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jComboBox1MouseEntered(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 150, 30));

        exitPage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitPage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitPageMouseClicked(evt);
            }
        });
        getContentPane().add(exitPage, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 0, 20, 30));

        minimizePage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimizePage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizePageMouseClicked(evt);
            }
        });
        getContentPane().add(minimizePage, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, 40, 30));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/muslimpro/tahwilulWeton.jpg"))); // NOI18N
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
       
    }//GEN-LAST:event_backgroundMouseEntered

    private void exitPageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitPageMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitPageMouseClicked

    private void minimizePageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizePageMouseClicked
        // TODO add your handling code here:
         this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizePageMouseClicked

    private void jComboBox1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseEntered
         
    }//GEN-LAST:event_jComboBox1MouseEntered

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        jLabel2.setVisible(true);
        jLabel3.setVisible(true);
        
     
        int tanggal = Integer.parseInt(jTextField2.getText());
       
        String bulan = jComboBox1.getSelectedItem().toString();
        int tahun = Integer.parseInt(jTextField1.getText());
        System.out.println(tanggal + bulan + tahun);
        
        hitungWeton cari = new hitungWeton(tanggal, bulan,tahun);
        cari.tahwil();
        
        String neptu = Integer.toString(cari.getNeptu());
        jLabel3.setText(cari.getWeton());
        jLabel2.setText("Angka Neptu Weton adalah "+neptu);
        
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        dashboard masuk = new dashboard();
        masuk.sapaNama.setText(jLabel5.getText());
        masuk.show();
        this.dispose();
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(cariWeton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cariWeton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cariWeton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cariWeton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cariWeton().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel background;
    public javax.swing.JLabel exitPage;
    public javax.swing.JComboBox<String> jComboBox1;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    public javax.swing.JLabel jLabel5;
    public javax.swing.JTextField jTextField1;
    public javax.swing.JTextField jTextField2;
    public javax.swing.JLabel minimizePage;
    // End of variables declaration//GEN-END:variables
}
