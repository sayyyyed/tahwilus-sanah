/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muslimpro;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sayyed
 */
public class adminPage extends  javax.swing.JFrame  {
    login melbu = new login ();
    /**
     * Creates new form login
     */
    public adminPage() {
        initComponents(); 
        this.setLocationRelativeTo(null);
        
        // MEMBUAT TABEL DAN KOLOMNYA
        DefaultTableModel tabel1 = new DefaultTableModel();
        tabel1.addColumn("Depan");
        tabel1.addColumn("Belakang");
        tabel1.addColumn("Lengkap");
        tabel1.addColumn("Email");
        tabel1.addColumn("ID");
        jTable1.setModel(tabel1);
        
        DefaultTableModel tabel2 = new DefaultTableModel();
        tabel2.addColumn("Aktivitas");
        tabel2.addColumn("Email");
        tabel2.addColumn("Nama");
        tabel2.addColumn("Waktu");
        jTable2.setModel(tabel2);
        
        DefaultTableModel tabel3 = new DefaultTableModel();
        tabel3.addColumn("Email");
        tabel3.addColumn("Laporan");
        tabel3.addColumn("Waktu");
        jTable3.setModel(tabel3);
        
        //MENAMPILKAN DATA DARI DATABASE KE TABEL
        try{
        String sql = "SELECT * FROM perloginan";
        java.sql.Connection conn = (Connection)koneksi.koneksiDB();
        java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
       
        ResultSet rs1=pstm.executeQuery(sql);
            while (rs1.next())
               {tabel1.addRow(new Object []{
               rs1.getString("depan"),
               rs1.getString("belakang"),
               rs1.getString("lengkap"),
               rs1.getString("email"),
               rs1.getString("id")
               });
            }
           
     pstm.execute();
     }catch (HeadlessException | SQLException e){
         JOptionPane.showMessageDialog(this, e.getMessage());
         System.out.println("gagal konek");}
       
    
    try{
        String sql = "SELECT * FROM histori";
        java.sql.Connection conn = (Connection)koneksi.koneksiDB();
        java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
       
        ResultSet rs1=pstm.executeQuery(sql);
            while (rs1.next())
               {tabel2.addRow(new Object []{
               rs1.getString("aktivitas"),
               rs1.getString("email"),
               rs1.getString("nama_lengkap"),
               rs1.getString("waktu")
               });
            }
           
     pstm.execute();
     }catch (HeadlessException | SQLException e){
         JOptionPane.showMessageDialog(this, e.getMessage());
         System.out.println("gagal konek");}
       
      try{
        String sql = "SELECT * FROM feedback";
        java.sql.Connection conn = (Connection)koneksi.koneksiDB();
        java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
       
        ResultSet rs1=pstm.executeQuery(sql);
            while (rs1.next())
               {tabel3.addRow(new Object []{
               rs1.getString("email"),
               rs1.getString("laporan"),
               rs1.getString("waktu")
               });
            }
           
     pstm.execute();
     }catch (HeadlessException | SQLException e){
         JOptionPane.showMessageDialog(this, e.getMessage());
         System.out.println("gagal konek");}
//    
    }
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welkam1 = new javax.swing.JLabel();
        hoover1 = new javax.swing.JLabel();
        exitPage = new javax.swing.JLabel();
        minimizePage = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        akun = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        histori = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        feedback = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setFocusTraversalPolicyProvider(true);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(welkam1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 60, 30));

        hoover1.setBackground(new java.awt.Color(255, 255, 255));
        hoover1.setFont(new java.awt.Font("Montserrat Medium", 0, 12)); // NOI18N
        hoover1.setForeground(new java.awt.Color(255, 255, 255));
        hoover1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        hoover1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        hoover1.setOpaque(true);
        getContentPane().add(hoover1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 60, 10));

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

        akun.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Depan", "Belakang", "Lengkap", "Email", "ID"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        akun.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 250));

        jTabbedPane1.addTab("Daftar Akun", akun);

        histori.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Aktivitas", "Email", "Nama", "Waktu"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);

        histori.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 250));

        jTabbedPane1.addTab("Aktivitas", histori);

        feedback.setLayout(new java.awt.BorderLayout());

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Email", "Laporan", "Waktu"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable3);

        feedback.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        jTabbedPane1.addTab("Feedback", feedback);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 340, 270));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/muslimpro/punyaAdmin.jpg"))); // NOI18N
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
        
         hoover1.setVisible(false);
        
    }//GEN-LAST:event_backgroundMouseEntered

    private void exitPageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitPageMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_exitPageMouseClicked

    private void minimizePageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizePageMouseClicked
        // TODO add your handling code here:
         this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_minimizePageMouseClicked

    private void welkam1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_welkam1MouseEntered
      
        hoover1.setVisible(true);
        
    }//GEN-LAST:event_welkam1MouseEntered

    private void welkam1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_welkam1MouseClicked
        login back = new login();
        back.show();
        this.dispose();
      
    }//GEN-LAST:event_welkam1MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        System.out.println("a");    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(adminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel akun;
    public javax.swing.JLabel background;
    public javax.swing.JLabel exitPage;
    public javax.swing.JPanel feedback;
    public javax.swing.JPanel histori;
    public javax.swing.JLabel hoover1;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JTable jTable1;
    public javax.swing.JTable jTable2;
    public javax.swing.JTable jTable3;
    public javax.swing.JLabel minimizePage;
    public javax.swing.JLabel welkam1;
    // End of variables declaration//GEN-END:variables
}