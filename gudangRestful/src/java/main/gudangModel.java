/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Date;

/**
 *
 * @author krisn
 */
public class gudangModel {
    private int id;
    private String nama;
    private String harga;
    private String jumlah;
    private String tgl_masuk;
//    private Date tgl_masuk;

    public gudangModel() {
    }
    
    
    
//    public gudangModel(int id, String nama, String harga, String jumlah, Date tgl_masuk) {
//        this.id = id;
//        this.nama = nama;
//        this.harga = harga;
//        this.jumlah = jumlah;
//        this.tgl_masuk = tgl_masuk;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public String getNama() {
//        return nama;
//    }
//
//    public String getHarga() {
//        return harga;
//    }
//
//    public String getJumlah() {
//        return jumlah;
//    }
//
//    public Date getTgl_masuk() {
//        return tgl_masuk;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public void setNama(String nama) {
//        this.nama = nama;
//    }
//
//    public void setHarga(String harga) {
//        this.harga = harga;
//    }
//
//    public void setJumlah(String jumlah) {
//        this.jumlah = jumlah;
//    }
//
//    public void setTgl_masuk(Date tgl_masuk) {
//        this.tgl_masuk = tgl_masuk;
//    }

    public gudangModel(int id, String nama, String harga, String jumlah, String tgl_masuk) {
        this.id = id;
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
        this.tgl_masuk = tgl_masuk;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getJumlah() {
        return jumlah;
    }

    public void setJumlah(String jumlah) {
        this.jumlah = jumlah;
    }

    public String getTgl_masuk() {
        return tgl_masuk;
    }

    public void setTgl_masuk(String tgl_masuk) {
        this.tgl_masuk = tgl_masuk;
    }
    
    
    
}
