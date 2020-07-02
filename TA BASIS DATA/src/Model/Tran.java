/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.Date;

//import java.sql.Date;


/**
 *
 * @author ACER
 */
public class Tran {
    private Integer Id_order;
    private Penyewa penyewa;
    private Mobil mobil;
    private Date Tanggal_sewa;
    private Date Tanggal_kembali;
    private Integer Harga;
    private Integer Total_bayar;

    public Integer getId_order() {
        return Id_order;
    }

    public void setId_order(Integer Id_order) {
        this.Id_order = Id_order;
    }

    public Penyewa getPenyewa() {
        return penyewa;
    }

    public void setPenyewa(Penyewa penyewa) {
        this.penyewa = penyewa;
    }

    public Mobil getMobil() {
        return mobil;
    }

    public void setMobil(Mobil mobil) {
        this.mobil = mobil;
    }

    public Date getTanggal_sewa() {
        return Tanggal_sewa;
    }

    public void setTanggal_sewa(Date Tanggal_sewa) {
        this.Tanggal_sewa = Tanggal_sewa;
    }

    public Date getTanggal_kembali() {
        return Tanggal_kembali;
    }

    public void setTanggal_kembali(Date Tanggal_kembali) {
        this.Tanggal_kembali = Tanggal_kembali;
    }

    public Integer getHarga() {
        return Harga;
    }

    public void setHarga(Integer Harga) {
        this.Harga = Harga;
    }

    public Integer getTotal_bayar() {
        return Total_bayar;
    }

    public void setTotal_bayar(Integer Total_bayar) {
        this.Total_bayar = Total_bayar;
    }

}