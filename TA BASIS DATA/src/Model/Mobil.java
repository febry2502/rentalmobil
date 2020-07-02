/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author ACER
 */
public class Mobil {
    private Integer Id_mobil;
    private String Merk;
    private String Jenis;
    private String Nopol;
    private String Kondisi;
    private Integer Harga;

    public Integer getId_mobil() {
        return Id_mobil;
    }

    public void setId_mobil(Integer Id_mobil) {
        this.Id_mobil = Id_mobil;
    }

    public String getMerk() {
        return Merk;
    }

    public void setMerk(String Merk) {
        this.Merk = Merk;
    }

    public String getJenis() {
        return Jenis;
    }

    public void setJenis(String Jenis) {
        this.Jenis = Jenis;
    }

    public String getNopol() {
        return Nopol;
    }

    public void setNopol(String Nopol) {
        this.Nopol = Nopol;
    }

    public String getKondisi() {
        return Kondisi;
    }

    public void setKondisi(String Kondisi) {
        this.Kondisi = Kondisi;
    }

    public Integer getHarga() {
        return Harga;
    }

    public void setHarga(Integer Harga) {
        this.Harga = Harga;
    }
    
    
}
