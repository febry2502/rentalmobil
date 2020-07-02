/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Database.koneksi;
import Model.Mobil;
import Model.Penyewa;
import Model.Tran;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author ACER
 */
public class Transaksi {
    koneksi kon;
    ArrayList<Penyewa> arrPenyewa;
    ArrayList<Mobil> arrMobil;
    ArrayList<Tran> arrTrans;
    
     public Transaksi() throws SQLException {

        this.kon = new koneksi();
        this.arrMobil = new ArrayList<>();
        this.arrPenyewa = new ArrayList<>();
        this.arrTrans = new ArrayList<>();
     }
     
     public ArrayList<Penyewa> getDataPenyewa() throws SQLException {
        this.arrPenyewa.clear();
        ResultSet rs = this.kon.getData("select * from penyewa_07085");
        while (rs.next()) {

            Penyewa penyewa = new Penyewa();
            penyewa.setId_penyewa(rs.getInt("Id_penyewa"));
            penyewa.setNama_penyewa(rs.getString("Nama_penyewa"));
            penyewa.setAlamat(rs.getString("Alamat"));
            penyewa.setNo_ktp(rs.getString("No_ktp"));
            penyewa.setNo_hp(rs.getInt("No_hp"));
            
            this.arrPenyewa.add(penyewa);
        }
        return this.arrPenyewa;
    }
     public ArrayList<Mobil> getDatamobil() throws SQLException {
         
         this.arrMobil.clear();

        ResultSet rs = this.kon.getData("select * from mobil_07085");

        while (rs.next()) {

            Mobil mobil = new Mobil();
            mobil.setId_mobil(rs.getInt("Id_mobil"));
            mobil.setMerk(rs.getString("Merk"));
            mobil.setJenis(rs.getString("Jenis"));
            mobil.setNopol(rs.getString("Nopol"));
            mobil.setKondisi(rs.getString("Kondisi"));
            mobil.setHarga(rs.getInt("Harga"));

            this.arrMobil.add(mobil);
        }

        return this.arrMobil;
     }
      public ArrayList<Tran> getDataTransaksi() throws SQLException {
         this.arrTrans.clear();
         ResultSet rs = this.kon.getData("SELECT * FROM PENYEWA_07085 JOIN MOBIL_07085 ON PENYEWA_07085.ID_PENYEWA = MOBIL_07085.ID_MOBIL JOIN TRANSAKSI_07085 ON MOBIL_07085.ID_MOBIL = TRANSAKSI_07085.ID_ORDER");
         while (rs.next()) {
            Penyewa penyewa = new Penyewa();
            penyewa.setId_penyewa(rs.getInt("Id_penyewa"));
            penyewa.setNama_penyewa(rs.getString("Nama_penyewa"));
            penyewa.setAlamat(rs.getString("Alamat"));
            penyewa.setNo_ktp(rs.getString("No_ktp"));
            penyewa.setNo_hp(rs.getInt("No_hp"));
            
            Mobil mobil = new Mobil();
            mobil.setId_mobil(rs.getInt("Id_mobil"));
            mobil.setMerk(rs.getString("Merk"));
            mobil.setJenis(rs.getString("Jenis"));
            mobil.setNopol(rs.getString("Nopol"));
            mobil.setKondisi(rs.getString("Kondisi"));
            mobil.setHarga(rs.getInt("Harga"));
           
            Tran transa = new Tran();
            transa.setId_order(rs.getInt("Id_order"));
            transa.setPenyewa(penyewa);
            transa.setMobil(mobil);
            transa.setTanggal_sewa(rs.getDate("Tanggal_sewa"));
            transa.setTanggal_kembali(rs.getDate("Tanggal_kembali"));
            transa.setHarga(rs.getInt("Harga"));
            transa.setTotal_bayar(rs.getInt("Total_bayar"));
            
            this.arrTrans.add(transa);         
         }
         return this.arrTrans;
      }
      
      public void deleteT(Integer i) throws SQLException {
          this.kon.ManipulasiData("DELETE FROM TRANSAKSI_07085 WHERE ID_ORDER ="+ i);
          this.kon.ManipulasiData("DELETE FROM PENYEWA_07085 WHERE ID_PENYEWA ="+i);
      }
 
      public void updatetr(Integer j) throws SQLException {
        
            this.kon.ManipulasiData("UPDATE TRANSAKSI_07085 WHERE ID_ORDER=" + j);
    }

              
      public void insertTransaksi(Tran tran) {
          try {
          String DateTransaksi = new SimpleDateFormat("dd/MM/yyyy").format(tran.getTanggal_sewa());
          String dateTransaksi = new SimpleDateFormat("dd/MM/yyyy").format(tran.getTanggal_kembali());
          this.kon.ManipulasiData("INSERT INTO febry_07085.TRANSAKSI_07085("+"'"+tran.getId_order().toString()+"',TO_DATE('" + DateTransaksi + "','dd/mm/yyyy'), TO_DATE('" + dateTransaksi + "','dd/mm/yyyy'), '" +tran.getTotal_bayar().toString() + "'," +tran.getHarga().toString() +")");
            } catch (Exception ex) {
            System.out.println(ex);
        }
    }
      public void insertPenyewa(Penyewa py){
          try {
              this.kon.ManipulasiData("INSERT INTO PENYEWA_07085 VALUES("+"'"+py.getId_penyewa().toString()+"','"+py.getNama_penyewa() + "','" +py.getAlamat()+ "','"+py.getNo_ktp()+ "','"+py.getNo_hp().toString()+"')");
                      
          }catch (Exception ex ){
            System.out.println(ex);
        }
      }
      public void insertMobil(Mobil mobil){
          try {
              this.kon.ManipulasiData("INSERT INTO MOBIL_07085 VALUES("+"'"+mobil.getId_mobil().toString()+"','"+mobil.getMerk()+ "','" +mobil.getJenis()+ "','"+mobil.getNopol()+ "','"+mobil.getKondisi()+ "','"+mobil.getHarga().toString()+"')");
                      
          }catch (Exception ex ){
            System.out.println(ex);
        }
      }


}