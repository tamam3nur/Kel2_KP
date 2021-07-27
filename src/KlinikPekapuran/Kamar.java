/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KlinikPekapuran;

import java.sql.*;

import javax.swing.table.*;


/**
 *
 * @author Nur
 */
public class Kamar extends javax.swing.JInternalFrame {
    public final Connection Conn = new Koneksi().Connect();
    private DefaultTableModel tablemode;
    
    public void noTable(){
        int Baris = tablemode.getRowCount();
        for (int a=0; a<Baris; a++){
            String nomor=String.valueOf(a+1);
            tablemode.setValueAt (nomor+".",a, 0);
        }
    }
    
    public void lebarKolom(){
        TableColumn kolom;
        tabelKamar.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        kolom = tabelKamar.getColumnModel().getColumn(0);
        kolom.setPreferredWidth(50);
        kolom = tabelKamar.getColumnModel().getColumn(1);
        kolom.setPreferredWidth(100);
        kolom = tabelKamar.getColumnModel().getColumn(2);
        kolom.setPreferredWidth(200);
        kolom = tabelKamar.getColumnModel().getColumn(3);
        kolom.setPreferredWidth(150);
        kolom = tabelKamar.getColumnModel().getColumn(4);
        kolom.setPreferredWidth(300);        
    }
    
    public void dataTable(){
        Object[] Baris = {"No.","No.Id Dokter","Nama Dokter", "Spesialisasi", "Jadwal Praktek"};
        tablemode = new DefaultTableModel(null, Baris);
        tabelKamar.setModel(tablemode);
        String sql ="select * from dokter order by nama_dokter asc";
        try {
            java.sql.Statement stat = Conn.createStatement();
            ResultSet hasil = stat.executeQuery(sql);
            while (hasil.next()){
                String id_dokter = hasil.getString("id_dokter");
                String nama_dokter = hasil.getString("nama_dokter");
                String spesialisasi_dokter = hasil.getString("spesialisasi_dokter");
                String jadwal_dokter = hasil.getString("jadwal_dokter");
                String[] data = {"", id_dokter, nama_dokter, spesialisasi_dokter, jadwal_dokter};
                tablemode.addRow(data);
                noTable();
                lebarKolom();
            }
        }catch (Exception e){}
    }
 
    /**
     * Creates new form Dokter
     */
    public Kamar() {
        initComponents();
        dataTable();
        lebarKolom();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tabelKamar = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setClosable(true);
        setForeground(java.awt.Color.darkGray);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setAutoscrolls(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setInheritsPopupMenu(true);

        tabelKamar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tabelKamar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "null"
            }
        ));
        tabelKamar.setColumnSelectionAllowed(true);
        tabelKamar.setIntercellSpacing(new java.awt.Dimension(5, 5));
        tabelKamar.setRowHeight(30);
        jScrollPane1.setViewportView(tabelKamar);

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Kamar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel4)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 734, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelKamar;
    // End of variables declaration//GEN-END:variables
}
