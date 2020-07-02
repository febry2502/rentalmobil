/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import controller.Transaksi;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import Model.Mobil;
import Model.Penyewa;
import Model.Tran;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
//import java.util.Date;
import java.text.SimpleDateFormat;
import java.sql.*;
import javax.swing.DefaultComboBoxModel;
/**
 *
 * @author ACER
 */
public class transaksiview extends javax.swing.JFrame {
    Transaksi transaksi;
    private int Idp,Idm,Hrg,Idt,Ttb,Nhp;
    private String Np,Alm,Mrk,jns,Npl,Knd, Nktp;
    private Date Tgls,Tglk;

    public transaksiview() throws SQLException {
        initComponents();
         this.transaksi = new Transaksi();
         this.showComboBoxMb();
         this.showTableTT();
         this.showTableTP();
         this.showTableMobil();
    }
    public void showHargaTotal() {
        this.txt_Total_bayar.setText(this.txt_Total_bayar.toString());
    }
    
    public void showComboBoxMb() throws SQLException {
    DefaultComboBoxModel mm = new DefaultComboBoxModel();
        for (Mobil mobil : this.transaksi.getDatamobil()) {
            mm.addElement(mobil.getMerk());   
        }
        this.cb_merk.setModel(mm);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cb_merk = new javax.swing.JComboBox<>();
        txt_namapenyewa = new javax.swing.JTextField();
        txt_alamat = new javax.swing.JTextField();
        txt_noktp = new javax.swing.JTextField();
        txt_nohp = new javax.swing.JTextField();
        txt_jenis = new javax.swing.JTextField();
        txt_nopol = new javax.swing.JTextField();
        txt_kondisi = new javax.swing.JTextField();
        txt_Harga = new javax.swing.JTextField();
        txt_Tanggal_sewa = new javax.swing.JTextField();
        txt_Tanggal_kembali = new javax.swing.JTextField();
        txt_Total_bayar = new javax.swing.JTextField();
        jsimpan = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        txt_idpenyewa = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txt_Id_order = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_transaksi = new javax.swing.JTable();
        txt_idmobil = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        struk = new javax.swing.JTextArea();
        print = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jbp_insert = new java.awt.Button();
        button2 = new java.awt.Button();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_penyewa = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbl_mobil = new javax.swing.JTable();
        jLabel19 = new javax.swing.JLabel();
        txt_harga = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 51, 204));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registrasi Penyewa");

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nama Penyewa");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Alamat");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("No_KTP");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("No_HP");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Transaksi");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Merk Mobil");

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Id_mobil");

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Jenis mobil");

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Nopol");

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Kondisi");

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Harga Sewa");

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel13.setText("Tanggal Sewa");

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel14.setText("Tanggal kembali");

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Total bayar");

        cb_merk.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb_merk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_merkActionPerformed(evt);
            }
        });

        txt_namapenyewa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_namapenyewaActionPerformed(evt);
            }
        });

        txt_alamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_alamatActionPerformed(evt);
            }
        });

        txt_noktp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_noktpActionPerformed(evt);
            }
        });

        txt_nohp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nohpActionPerformed(evt);
            }
        });

        txt_jenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_jenisActionPerformed(evt);
            }
        });

        txt_nopol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nopolActionPerformed(evt);
            }
        });

        txt_kondisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kondisiActionPerformed(evt);
            }
        });

        txt_Harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_HargaActionPerformed(evt);
            }
        });

        txt_Tanggal_sewa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Tanggal_sewaActionPerformed(evt);
            }
        });

        txt_Tanggal_kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Tanggal_kembaliActionPerformed(evt);
            }
        });

        txt_Total_bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Total_bayarActionPerformed(evt);
            }
        });

        jsimpan.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jsimpan.setText("SAVE");
        jsimpan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jsimpanMouseClicked(evt);
            }
        });
        jsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jsimpanActionPerformed(evt);
            }
        });

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Id_penyewa");

        txt_idpenyewa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idpenyewaActionPerformed(evt);
            }
        });

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Id_Order");

        txt_Id_order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Id_orderActionPerformed(evt);
            }
        });

        tb_transaksi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_ORDER", "ID_PENYEWA", "ID_MOBIL", "HARGA_SEWA", "TGL_SEWA", "TGL_KEMBALI", "TOTAL_BAYAR"
            }
        ));
        jScrollPane1.setViewportView(tb_transaksi);

        txt_idmobil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idmobilActionPerformed(evt);
            }
        });

        struk.setColumns(20);
        struk.setRows(5);
        jScrollPane2.setViewportView(struk);

        print.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        print.setText("PRINT");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });

        delete.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        delete.setText("DELETE");
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Arial Black", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Mobil");

        jbp_insert.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbp_insert.setLabel("TAMBAH");
        jbp_insert.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbp_insertMouseClicked(evt);
            }
        });
        jbp_insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbp_insertActionPerformed(evt);
            }
        });

        button2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        button2.setLabel("TAMBAH");
        button2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                button2MouseClicked(evt);
            }
        });
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });

        tbl_penyewa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane3.setViewportView(tbl_penyewa);

        tbl_mobil.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        jScrollPane4.setViewportView(tbl_mobil);

        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Harga");

        txt_harga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_hargaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addGap(65, 65, 65))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jbp_insert, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel16)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addGap(55, 55, 55)
                                            .addComponent(txt_noktp, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel2)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(txt_namapenyewa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txt_idpenyewa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txt_alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addGap(60, 60, 60)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txt_nohp, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(57, 57, 57)
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_Id_order, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel12)
                                                    .addComponent(jLabel13))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txt_Tanggal_sewa, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txt_Harga, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                    .addGap(21, 21, 21)
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                            .addComponent(jLabel15)
                                                            .addGap(18, 18, 18)
                                                            .addComponent(txt_Tanggal_kembali, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(txt_Total_bayar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jLabel14)
                                                    .addGap(139, 139, 139))))))
                                .addGap(24, 24, 24))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(delete)
                            .addComponent(jsimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(print, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(29, 29, 29)
                                .addComponent(txt_idmobil, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(19, 19, 19)
                                .addComponent(cb_merk, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel19))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_harga, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_kondisi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_nopol, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_jenis, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(txt_idpenyewa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txt_namapenyewa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txt_alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txt_noktp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txt_nohp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(jbp_insert, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cb_merk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_idmobil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_jenis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_nopol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_kondisi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel19)
                                    .addComponent(txt_harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(txt_Id_order, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txt_Harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Tanggal_sewa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_Tanggal_kembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15)
                            .addComponent(txt_Total_bayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jsimpan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delete))
                    .addComponent(print)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jsimpanActionPerformed
           
            Idt = Integer.parseInt(txt_Id_order.getText());
            Tgls = Date.valueOf(txt_Tanggal_sewa.getText());
            Tglk = Date.valueOf(txt_Tanggal_kembali.getText());
            Ttb = Integer.parseInt(txt_Total_bayar.getText());
            Hrg = Integer.parseInt(txt_Harga.getText());
        
        Tran trans = new Tran();
        try {
            trans.setId_order(Idt);
            trans.setTanggal_sewa(Tgls);
            trans.setTanggal_kembali(Tglk);
            trans.setTotal_bayar(Ttb);
            trans.setHarga(Hrg);
            this.transaksi.insertTransaksi(trans);
            this.showTableTT();
            kosong();
        }catch (SQLException err){
            System.out.println(err);
        } 
    
    }//GEN-LAST:event_jsimpanActionPerformed

    private void txt_idpenyewaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idpenyewaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txt_idpenyewaActionPerformed

    private void txt_namapenyewaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_namapenyewaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_namapenyewaActionPerformed

    private void txt_alamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_alamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_alamatActionPerformed

    private void txt_noktpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_noktpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_noktpActionPerformed

    private void txt_nohpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nohpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nohpActionPerformed

    private void cb_merkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_merkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_merkActionPerformed

    private void txt_jenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_jenisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_jenisActionPerformed

    private void txt_nopolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nopolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nopolActionPerformed

    private void txt_kondisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_kondisiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_kondisiActionPerformed

    private void txt_Id_orderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Id_orderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Id_orderActionPerformed

    private void txt_HargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_HargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_HargaActionPerformed

    private void txt_Tanggal_sewaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Tanggal_sewaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Tanggal_sewaActionPerformed

    private void txt_Tanggal_kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Tanggal_kembaliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Tanggal_kembaliActionPerformed

    private void txt_Total_bayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Total_bayarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Total_bayarActionPerformed

    private void jsimpanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jsimpanMouseClicked
        // TODO add your handling code here:

        DefaultTableModel dataModel = (DefaultTableModel) tb_transaksi.getModel();
        List list = new ArrayList<>();
        tb_transaksi.setAutoCreateColumnsFromModel(true);
        list.add(txt_Id_order.getText());
        list.add(txt_Tanggal_sewa.getText());
        list.add(txt_Tanggal_kembali.getText());
        list.add(txt_Total_bayar.getText());
        list.add(txt_Harga.getText());       
        dataModel.addRow(list.toArray());
 
    }//GEN-LAST:event_jsimpanMouseClicked

    private void txt_idmobilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idmobilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idmobilActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
       try {
        Tran transa = this.transaksi.getDataTransaksi().get(this.tb_transaksi.getSelectedRow());
        String Teks = ("-------- STRUK PENYEWAAN MOBIL --------" + "\n"
                + " "+"\n"
                + "             CV.PRABOWO BERSAUDARA TRANS CABE (XPDC CAP BEDIL) "+"\n"
                +"                          # INDONESIA CEPAT "+"\n"
                +""+"\n"
                + "ID_ORDER :"+ transa.getId_order().toString() +"\n"
                + " "+"\n"
                + "ID_PENYEWA       : " + transa.getPenyewa().getId_penyewa().toString()+ "\n"
                + "NAMA PENYEWA     : " + transa.getPenyewa().getNama_penyewa()+ "\n"
                + "ALAMAT           : " + transa.getPenyewa().getAlamat()+ "\n"
                + "NO KTP           : " + transa.getPenyewa().getNo_ktp() + "\n"
                + "NO_HP            : " + transa.getPenyewa().getNo_hp().toString()+ "\n"
                + "-----------------------------------------"+"  \n"
                + "MERK             : " + transa.getMobil().getMerk()+ "\n"
                + "ID_MOBIL         : " + transa.getMobil().getId_mobil().toString() + "\n"
                + "JENIS            : " + transa.getMobil().getJenis()+ "\n"
                + "NOPOL            : " + transa.getMobil().getNopol()+ "\n"
                + "KONDISI          : " + transa.getMobil().getKondisi()+ "\n"
                + "-----------------------------------------"+"  \n"
                + "HARGA SEWA       : " + transa.getHarga().toString()+ "\n"
                + "TANGGAL SEWA     : " + transa.getTanggal_sewa().toString()+ "\n"
                + "TANGGAL KEMBALI  : " + transa.getTanggal_kembali().toString()+ "\n"
                + "TOTAL BAYAR      : " + transa.getTotal_bayar().toString() +"\n"
                + " "+"\n"
                + " "+"\n"
                + "     Terima Kasih Telah Menggunakan Jasa Kami"+"\n"
                + "       Kepuasan Anda adalah Tujuan Kami"+"\n"
                + "     "
                +"note : Struk Ini adalah bukti pembayaran yang sah"+"\n"
                );
        this.struk.setText(Teks);
                } catch (SQLException ex) {
                  System.out.println(ex);
                }
    }//GEN-LAST:event_printActionPerformed
    private void kosong(){
        txt_idpenyewa.setText("");
        txt_namapenyewa.setText("");
        txt_alamat.setText("");
        txt_noktp.setText("");
        txt_nohp.setText("");
        
        txt_idmobil.setText("");
        txt_jenis.setText("");
        txt_nopol.setText("");
        txt_kondisi.setText("");
        txt_Harga.setText("");
        
        txt_Id_order.setText("");
        txt_Tanggal_sewa.setText("");
        txt_Tanggal_kembali.setText("");
        txt_Harga.setText("");
        txt_Total_bayar.setText("");
    }
    
    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        DefaultTableModel Model = (DefaultTableModel) tb_transaksi.getModel();
            int i = tb_transaksi.getSelectedRow();
            Integer per = Integer.parseInt(Model.getValueAt(i, 0).toString());
            try {
                this.transaksi.deleteT(per);
                this.showTableTT();
            } catch (SQLException ex){
              Logger.getLogger(transaksiview.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_deleteActionPerformed

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        // TODO add your handling code here:
        DefaultTableModel dataModel = (DefaultTableModel) tb_transaksi.getModel();
            int a = tb_transaksi.getSelectedRow();
            if(a >= 0){
                dataModel.removeRow(a); 
                txt_Id_order.setText("");
                txt_idpenyewa.setText("");
                txt_idmobil.setText("");
                txt_Harga.setText("");
                txt_Tanggal_sewa.setText("");
                txt_Tanggal_kembali.setText("");
                txt_Total_bayar.setText("");
                struk.setText("");
            }
            else{
                System.out.println("Delete Error");
            }
                      
    }//GEN-LAST:event_deleteMouseClicked

    private void jbp_insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbp_insertActionPerformed
        Idp = Integer.parseInt(txt_idpenyewa.getText());
        Np = txt_namapenyewa.getText();
        Alm = txt_alamat.getText();
        Nktp = txt_noktp.getText();
        Nhp = Integer.parseInt(txt_nohp.getText());
        
        Penyewa pny = new Penyewa();
        try {
            pny.setId_penyewa(Idp);
            pny.setNama_penyewa(Np);
            pny.setAlamat(Alm);
            pny.setNo_ktp(Nktp);
            pny.setNo_hp(Nhp);
            
            this.transaksi.insertPenyewa(pny);
            this.showTableTP();
            kosong();
        }catch (SQLException err){
            System.out.println(err);
        }       
    }//GEN-LAST:event_jbp_insertActionPerformed

    private void jbp_insertMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbp_insertMouseClicked
 DefaultTableModel dataModel = (DefaultTableModel) tbl_penyewa.getModel();
        List list = new ArrayList<>();
        tbl_penyewa.setAutoCreateColumnsFromModel(true);
        list.add(txt_idpenyewa.getText());
        list.add(txt_namapenyewa.getText());
        list.add(txt_alamat.getText());
        list.add(txt_noktp.getText());
        list.add(txt_nohp.getText());
        
        dataModel.addRow(list.toArray());        // TODO add your handling code here:

    }//GEN-LAST:event_jbp_insertMouseClicked

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
        
        Mobil m = new Mobil();
        try {
            m.setId_mobil(Integer.parseInt(txt_idmobil.getText()));
            m.setMerk((String) cb_merk.getSelectedItem());
            m.setJenis(txt_jenis.getText());
            m.setNopol(txt_nopol.getText());
            m.setKondisi(txt_kondisi.getText());
            m.setHarga(Integer.parseInt(txt_harga.getText()));
            
            this.transaksi.insertMobil(m);
            this.showTableMobil();
            kosong();
        }catch (SQLException err){
            System.out.println(err);
        }       
        
    }//GEN-LAST:event_button2ActionPerformed

    private void txt_hargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_hargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_hargaActionPerformed

    private void button2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_button2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_button2MouseClicked
    private void showTableMobil() throws SQLException{
        DefaultTableModel tpt = new DefaultTableModel(new String[]
        {"ID_MOBIL","MERK","JENIS","NOPOL", "KONDISI","HARGA"
    }, 0);
    tpt.setRowCount(0);
    
        for (Mobil m : this.transaksi.getDatamobil()) {
            tpt.addRow(new String[]{
                m.getId_mobil().toString(),
                m.getMerk(),
                m.getJenis(),
                m.getNopol(),
                m.getKondisi(),
                m.getHarga().toString()
                
            });
            
        }
        
        this.tbl_mobil.setModel(tpt);
    }
    private void showTableTP() throws SQLException{
        DefaultTableModel tpt = new DefaultTableModel(new String[]{"ID_PENYEWA","NAMA_PENYEWA","ALAMAT","NO_KTP", 
        "NO_HP"
    }, 0);
    tpt.setRowCount(0);
    
        for (Penyewa tp : this.transaksi.getDataPenyewa()) {
            tpt.addRow(new String[]{
                tp.getId_penyewa().toString(), 
                tp.getNama_penyewa() , 
                tp.getAlamat() ,
                tp.getNo_ktp() , 
                tp.getNo_hp().toString()
            });
            
        }
        
        this.tbl_penyewa.setModel(tpt);
    }
    private void showTableTT() throws SQLException {
    DefaultTableModel tt = new DefaultTableModel(new String[]{"ID_PENYEWA","ID_MOBIL","ID_ORDER","TANGGAL_SEWA", 
        "TANGGAL_KEMBALI","TOTAL_BAYAR","HARGA"
    }, 0);
    tt.setRowCount(0);
    
        for (Tran ts : this.transaksi.getDataTransaksi()) {
            tt.addRow(new String[]{
                ts.getPenyewa().getId_penyewa().toString(), 
                ts.getMobil().getId_mobil().toString() , 
                ts.getId_order().toString(),
                ts.getTanggal_sewa().toString() , 
                ts.getTanggal_kembali().toString() ,
                ts.getTotal_bayar().toString(),
                ts.getHarga().toString()
            });
            
        }
        
        this.tb_transaksi.setModel(tt);
    
    } 

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new transaksiview().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(transaksiview.class.getName()).log(Level.SEVERE, null, ex);
                }
                }
                
            });
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button2;
    private javax.swing.JComboBox<String> cb_merk;
    private javax.swing.JButton delete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private java.awt.Button jbp_insert;
    private javax.swing.JButton jsimpan;
    private javax.swing.JButton print;
    private javax.swing.JTextArea struk;
    private javax.swing.JTable tb_transaksi;
    private javax.swing.JTable tbl_mobil;
    private javax.swing.JTable tbl_penyewa;
    private javax.swing.JTextField txt_Harga;
    private javax.swing.JTextField txt_Id_order;
    private javax.swing.JTextField txt_Tanggal_kembali;
    private javax.swing.JTextField txt_Tanggal_sewa;
    private javax.swing.JTextField txt_Total_bayar;
    private javax.swing.JTextField txt_alamat;
    private javax.swing.JTextField txt_harga;
    private javax.swing.JTextField txt_idmobil;
    public javax.swing.JTextField txt_idpenyewa;
    private javax.swing.JTextField txt_jenis;
    private javax.swing.JTextField txt_kondisi;
    public javax.swing.JTextField txt_namapenyewa;
    private javax.swing.JTextField txt_nohp;
    private javax.swing.JTextField txt_noktp;
    private javax.swing.JTextField txt_nopol;
    // End of variables declaration//GEN-END:variables
}
