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
public class Penyewa {
    private Integer Id_penyewa;
    private String Nama_penyewa;
    private String Alamat;
    private String No_ktp;
    private Integer No_hp;

    public Integer getId_penyewa() {
        return Id_penyewa;
    }

    public void setId_penyewa(Integer Id_penyewa) {
        this.Id_penyewa = Id_penyewa;
    }

    public String getNama_penyewa() {
        return Nama_penyewa;
    }

    public void setNama_penyewa(String Nama_penyewa) {
        this.Nama_penyewa = Nama_penyewa;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }

    public String getNo_ktp() {
        return No_ktp;
    }

    public void setNo_ktp(String No_ktp) {
        this.No_ktp = No_ktp;
    }

    public Integer getNo_hp() {
        return No_hp;
    }

    public void setNo_hp(Integer No_hp) {
        this.No_hp = No_hp;
    }

    
    
}
