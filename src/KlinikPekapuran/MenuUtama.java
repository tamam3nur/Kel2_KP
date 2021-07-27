/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KlinikPekapuran;
import java.sql.*;
import javax.swing.JFrame;

/**
 *
 * @author Nur
 */
public class MenuUtama extends javax.swing.JFrame {
    private final Connection Conn = new Koneksi().Connect();
    private InformasiUmum Informasi;
    
    Login Login;
    Fasilitas Fasilitas;  
    Pendaftaran Pendaftaran;
    
    PoliUmum PoliUmum;
    PoliGigi PoliGigi;
    Bidan Bidan;
    
    Biaya Biaya;
    
    Laporan_DataPasien Laporan_DataPasien;
    Laporan_DataKeuangan Laporan_DataKeuangan;
    
    
    
    private void initForm(){
        Login = new Login();
        Informasi = new InformasiUmum();
        Fasilitas = new Fasilitas();           
        Pendaftaran = new Pendaftaran();
        
        PoliUmum = new PoliUmum();
        PoliGigi= new PoliGigi();
        Bidan = new Bidan();
        
        Biaya = new Biaya();
        
        Laporan_DataPasien = new Laporan_DataPasien();
        Laporan_DataKeuangan = new Laporan_DataKeuangan();
        
    }

    /**
     * Creates new form MenuUtama
     */
    public MenuUtama() {
        initComponents();
        initForm();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jScrollPane1 = new javax.swing.JScrollPane();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        DataInduk = new javax.swing.JMenu();
        InformasiUmum = new javax.swing.JMenuItem();
        menuFasilitas = new javax.swing.JMenuItem();
        menuPendaftaran = new javax.swing.JMenuItem();
        Pelayanan = new javax.swing.JMenu();
        menuPoliUmum = new javax.swing.JMenuItem();
        menuPoliGigi = new javax.swing.JMenuItem();
        menuBidan = new javax.swing.JMenuItem();
        MenuBiaya = new javax.swing.JMenu();
        Laporan2 = new javax.swing.JMenu();
        DataPasien = new javax.swing.JMenuItem();
        DataKeuangan = new javax.swing.JMenuItem();
        DataPasien1 = new javax.swing.JMenuItem();
        DataPasien2 = new javax.swing.JMenuItem();
        DataPasien3 = new javax.swing.JMenuItem();
        Kelura = new javax.swing.JMenu();

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar2.add(jMenu2);

        jMenu3.setText("File");
        jMenuBar3.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar3.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Main Menu");
        setBackground(new java.awt.Color(0, 153, 51));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFocusTraversalPolicyProvider(true);
        setIconImages(null);

        jDesktopPane1.setBackground(new java.awt.Color(153, 153, 153));
        jDesktopPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jDesktopPane1.setForeground(new java.awt.Color(0, 204, 0));
        jDesktopPane1.setToolTipText("KLINIK PEKAPURAN");
        jDesktopPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jDesktopPane1.setFont(new java.awt.Font("Agency FB", 1, 48)); // NOI18N

        jLabel1.setFont(new java.awt.Font("BankGothic Md BT", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sistem Pelayanan Antrian ");

        jLabel2.setFont(new java.awt.Font("BankGothic Md BT", 3, 20)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Kelompok 2");

        jLabel3.setFont(new java.awt.Font("BankGothic Md BT", 3, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Klinik Pekapuran");

        jLabel4.setFont(new java.awt.Font("BankGothic Md BT", 3, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/KlinikGede.png"))); // NOI18N

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1001, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1001, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(112, 112, 112))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel2))
                    .addGroup(jDesktopPane1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(646, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jDesktopPane1);

        jMenuBar1.setBackground(new java.awt.Color(204, 255, 102));

        DataInduk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home.png"))); // NOI18N
        DataInduk.setText("Beranda");
        DataInduk.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        DataInduk.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        DataInduk.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        DataInduk.setIconTextGap(10);
        DataInduk.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        DataInduk.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        InformasiUmum.setBackground(new java.awt.Color(0, 102, 102));
        InformasiUmum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/list.png"))); // NOI18N
        InformasiUmum.setText("Informasi Umum");
        InformasiUmum.setHideActionText(true);
        InformasiUmum.setIconTextGap(5);
        InformasiUmum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InformasiUmumActionPerformed(evt);
            }
        });
        DataInduk.add(InformasiUmum);

        menuFasilitas.setBackground(new java.awt.Color(0, 102, 102));
        menuFasilitas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/list.png"))); // NOI18N
        menuFasilitas.setText("Fasilitas");
        menuFasilitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFasilitasActionPerformed(evt);
            }
        });
        DataInduk.add(menuFasilitas);

        menuPendaftaran.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/list.png"))); // NOI18N
        menuPendaftaran.setText("Pendaftaran");
        menuPendaftaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPendaftaranActionPerformed(evt);
            }
        });
        DataInduk.add(menuPendaftaran);

        jMenuBar1.add(DataInduk);

        Pelayanan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/layanan2.png"))); // NOI18N
        Pelayanan.setText("Pelayanan");
        Pelayanan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Pelayanan.setIconTextGap(8);
        Pelayanan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        menuPoliUmum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pilihan.png"))); // NOI18N
        menuPoliUmum.setText("Poli Umum");
        menuPoliUmum.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        menuPoliUmum.setIconTextGap(5);
        menuPoliUmum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPoliUmumActionPerformed(evt);
            }
        });
        Pelayanan.add(menuPoliUmum);

        menuPoliGigi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pilihan.png"))); // NOI18N
        menuPoliGigi.setText("Poli Gigi");
        menuPoliGigi.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        menuPoliGigi.setIconTextGap(1);
        menuPoliGigi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPoliGigiActionPerformed(evt);
            }
        });
        Pelayanan.add(menuPoliGigi);

        menuBidan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pilihan.png"))); // NOI18N
        menuBidan.setText("Bidan");
        menuBidan.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        menuBidan.setIconTextGap(1);
        menuBidan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuBidanActionPerformed(evt);
            }
        });
        Pelayanan.add(menuBidan);

        jMenuBar1.add(Pelayanan);

        MenuBiaya.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/biaya.png"))); // NOI18N
        MenuBiaya.setText("Informasi Biaya");
        MenuBiaya.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        MenuBiaya.setIconTextGap(8);
        MenuBiaya.setPreferredSize(new java.awt.Dimension(100, 54));
        MenuBiaya.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        MenuBiaya.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuBiayaMouseClicked(evt);
            }
        });
        MenuBiaya.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuBiayaActionPerformed(evt);
            }
        });
        jMenuBar1.add(MenuBiaya);

        Laporan2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/laporan.png"))); // NOI18N
        Laporan2.setText("  Laporan");
        Laporan2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Laporan2.setIconTextGap(8);
        Laporan2.setPreferredSize(new java.awt.Dimension(65, 54));
        Laporan2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        DataPasien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/report.png"))); // NOI18N
        DataPasien.setText("Data Pasien Poli Umum");
        DataPasien.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        DataPasien.setIconTextGap(1);
        DataPasien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataPasienActionPerformed(evt);
            }
        });
        Laporan2.add(DataPasien);

        DataKeuangan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/report.png"))); // NOI18N
        DataKeuangan.setText("Data Pasien Poli Gigi");
        DataKeuangan.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        DataKeuangan.setIconTextGap(1);
        DataKeuangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataKeuanganActionPerformed(evt);
            }
        });
        Laporan2.add(DataKeuangan);

        DataPasien1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/report.png"))); // NOI18N
        DataPasien1.setText("Data Pasien Bidan");
        DataPasien1.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        DataPasien1.setIconTextGap(1);
        DataPasien1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataPasien1ActionPerformed(evt);
            }
        });
        Laporan2.add(DataPasien1);

        DataPasien2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/report.png"))); // NOI18N
        DataPasien2.setText("Data Obat");
        DataPasien2.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        DataPasien2.setIconTextGap(1);
        DataPasien2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataPasien2ActionPerformed(evt);
            }
        });
        Laporan2.add(DataPasien2);

        DataPasien3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/report.png"))); // NOI18N
        DataPasien3.setText("Data Karyawan");
        DataPasien3.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        DataPasien3.setIconTextGap(1);
        DataPasien3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataPasien3ActionPerformed(evt);
            }
        });
        Laporan2.add(DataPasien3);

        jMenuBar1.add(Laporan2);

        Kelura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/out.png"))); // NOI18N
        Kelura.setText("Keluar");
        Kelura.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Kelura.setIconTextGap(8);
        Kelura.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Kelura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KeluraMouseClicked(evt);
            }
        });
        jMenuBar1.add(Kelura);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 581, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuFasilitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFasilitasActionPerformed
    if(!Fasilitas.isVisible()){
        jDesktopPane1.add(Fasilitas);
        Fasilitas.show();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        Informasi.dispose();
        Pendaftaran.dispose();
        PoliUmum.dispose();
        PoliGigi.dispose();
        Bidan.dispose();
        Biaya.dispose();
        Laporan_DataPasien.dispose();
        Laporan_DataKeuangan.dispose();
        }
    }//GEN-LAST:event_menuFasilitasActionPerformed

    private void MenuBiayaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuBiayaActionPerformed
    if(!Biaya.isVisible()){
        jDesktopPane1.add(Biaya);
        Biaya.show();
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        Informasi.dispose();
        Pendaftaran.dispose();
        PoliUmum.dispose();
        PoliGigi.dispose();
        Bidan.dispose();
        Fasilitas.dispose();
        Laporan_DataPasien.dispose();
        Laporan_DataKeuangan.dispose();
        }
    }//GEN-LAST:event_MenuBiayaActionPerformed

    private void InformasiUmumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InformasiUmumActionPerformed
    if(!Informasi.isVisible()){
        jDesktopPane1.add(Informasi);
        Informasi.show();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
       
        Fasilitas.dispose();
        Pendaftaran.dispose();
        PoliUmum.dispose();
        PoliGigi.dispose();
        Bidan.dispose();
        Biaya.dispose();
        Laporan_DataPasien.dispose();
        Laporan_DataKeuangan.dispose();           
        }
    }//GEN-LAST:event_InformasiUmumActionPerformed

    private void menuPendaftaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPendaftaranActionPerformed
        if(!Pendaftaran.isVisible()){
            jDesktopPane1.add(Pendaftaran);
            Pendaftaran.show();
            setExtendedState(JFrame.MAXIMIZED_BOTH);

            Informasi.dispose();
            PoliUmum.dispose();
            PoliGigi.dispose();
            Bidan.dispose();
            Fasilitas.dispose();
            Laporan_DataPasien.dispose();
            Laporan_DataKeuangan.dispose();           
            Biaya.dispose();
        }
    }//GEN-LAST:event_menuPendaftaranActionPerformed

    private void menuPoliUmumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPoliUmumActionPerformed
    if(!PoliUmum.isVisible()){
            jDesktopPane1.add(PoliUmum);
            PoliUmum.show();
                    setExtendedState(JFrame.MAXIMIZED_BOTH);

            
            Informasi.dispose();
            Pendaftaran.dispose();
            PoliGigi.dispose();
            Bidan.dispose();
            Biaya.dispose();    
            Fasilitas.dispose();
            Laporan_DataPasien.dispose();
            Laporan_DataKeuangan.dispose();           

        }
    }//GEN-LAST:event_menuPoliUmumActionPerformed

    private void menuPoliGigiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPoliGigiActionPerformed
        if(!PoliGigi.isVisible()){
            jDesktopPane1.add(PoliGigi);
            PoliGigi.show();
                    setExtendedState(JFrame.MAXIMIZED_BOTH);

            
            Informasi.dispose();
            Pendaftaran.dispose();
            Fasilitas.dispose();
            PoliUmum.dispose();
            Bidan.dispose();
            Laporan_DataPasien.dispose();
            Laporan_DataKeuangan.dispose();           
            Biaya.dispose();
        }
    }//GEN-LAST:event_menuPoliGigiActionPerformed

    private void menuBidanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuBidanActionPerformed
       if(!Bidan.isVisible()){
            jDesktopPane1.add(Bidan);
            Bidan.show();
            setExtendedState(JFrame.MAXIMIZED_BOTH);
            
            Informasi.dispose();
            Pendaftaran.dispose();
            Fasilitas.dispose();
            PoliUmum.dispose();
            PoliGigi.dispose();
            Laporan_DataPasien.dispose();
            Laporan_DataKeuangan.dispose();           
            Biaya.dispose();
        }
    }//GEN-LAST:event_menuBidanActionPerformed

    private void DataPasienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataPasienActionPerformed
        if(!Laporan_DataPasien.isVisible()){
            jDesktopPane1.add(Laporan_DataPasien);
            Laporan_DataPasien.show();
            
            Informasi.dispose();
            Pendaftaran.dispose();
            Fasilitas.dispose();
            PoliUmum.dispose();
            PoliGigi.dispose();
            Bidan.dispose();
            Laporan_DataKeuangan.dispose();           
            Biaya.dispose();
        }
    }//GEN-LAST:event_DataPasienActionPerformed

    private void DataKeuanganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataKeuanganActionPerformed
        if(!Laporan_DataKeuangan.isVisible()){
            jDesktopPane1.add(Laporan_DataKeuangan);
            Laporan_DataKeuangan.show();
            
            Informasi.dispose();
            Pendaftaran.dispose();
            Fasilitas.dispose();
            PoliUmum.dispose();
            PoliGigi.dispose();
            Bidan.dispose();
            Laporan_DataPasien.dispose();           
            Biaya.dispose();
        }
    }//GEN-LAST:event_DataKeuanganActionPerformed

    private void MenuBiayaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuBiayaMouseClicked
        if(!Biaya.isVisible()){
        jDesktopPane1.add(Biaya);
        Biaya.show();
        setExtendedState(JFrame.MAXIMIZED_BOTH);

        Informasi.dispose();
        Pendaftaran.dispose();
        PoliUmum.dispose();
        PoliGigi.dispose();
        Bidan.dispose();
        Fasilitas.dispose();
        Laporan_DataPasien.dispose();
        Laporan_DataKeuangan.dispose();
        }
    }//GEN-LAST:event_MenuBiayaMouseClicked

    private void KeluraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KeluraMouseClicked
        // TODO add your handling code here:
        Login out = new Login();
        out.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_KeluraMouseClicked

    private void DataPasien1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataPasien1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DataPasien1ActionPerformed

    private void DataPasien2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataPasien2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DataPasien2ActionPerformed

    private void DataPasien3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataPasien3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DataPasien3ActionPerformed

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
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu DataInduk;
    private javax.swing.JMenuItem DataKeuangan;
    private javax.swing.JMenuItem DataPasien;
    private javax.swing.JMenuItem DataPasien1;
    private javax.swing.JMenuItem DataPasien2;
    private javax.swing.JMenuItem DataPasien3;
    private javax.swing.JMenuItem InformasiUmum;
    private javax.swing.JMenu Kelura;
    private javax.swing.JMenu Laporan2;
    private javax.swing.JMenu MenuBiaya;
    private javax.swing.JMenu Pelayanan;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem menuBidan;
    private javax.swing.JMenuItem menuFasilitas;
    private javax.swing.JMenuItem menuPendaftaran;
    private javax.swing.JMenuItem menuPoliGigi;
    private javax.swing.JMenuItem menuPoliUmum;
    // End of variables declaration//GEN-END:variables
}
