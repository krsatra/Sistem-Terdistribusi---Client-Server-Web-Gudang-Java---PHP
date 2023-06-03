///*
// * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
// * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
// */
//package main;
//
//import java.sql.Connection;
//import java.sql.Date;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//
///**
// *
// * @author krisn
// */
//public class koneksi {
//    Connection con;
//    
//    
//    
//    public koneksi(){
//        try {
//            String url = String.format("jdbc:mysql://localhost:3306/clientserver");
//            String uname = "root";
//            String pswd = "";
//            
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            con = DriverManager.getConnection(url,uname,pswd);
//        } catch (Exception e) {
//        }
//    }
//    
//    public gudangModel insertUser(gudangModel gudang){
//        //String insert = "insert into gudang (id" + ",nama,harga,jumlah,tgl_masuk)value(?,?,?,?,?)";
//        String insert = "INSERT INTO `gudang`( `Nama`, `Harga`, `Jumlah`, `Tgl_masuk`) values(?,?,?,?)";
//        
//        try {
//            PreparedStatement ps = con.prepareStatement(insert);
//            //ps.setInt(1, gudang.getId());
//            ps.setString(1, gudang.getNama());
//            ps.setString(2, gudang.getHarga());
//            ps.setString(3, gudang.getJumlah());
//            ps.setString(4, gudang.getTgl_masuk());
////            ps.setDate(5, new Date(gudang.getTgl_masuk().getTime()));
//            ps.execute();
//        } catch (Exception e) {
//            System.out.println(e + "data insert unsuccesss");
//        }
//        return gudang;
//    }
//    
//    public ArrayList<gudangModel> getUser() throws SQLException{
//        ArrayList<gudangModel> data = new ArrayList<gudangModel>();
//        
//        String select = "select * from gudang";
//        PreparedStatement ps = con.prepareStatement(select);
//        ResultSet rs = ps.executeQuery();
//        
//        while(rs.next()){
//            gudangModel model = new gudangModel();
//            model.setId(rs.getInt("id"));
//            model.setNama(rs.getString("nama"));
//            model.setHarga(rs.getNString("harga"));
//            model.setJumlah(rs.getString("jumlah"));
//            model.setTgl_masuk(rs.getString("tgl_masuk"));
//            
//            data.add(model);
//        }
//        return data;
//    }
//    
//    public ArrayList<gudangModel> getUserID(int id) throws SQLException{
//        ArrayList<gudangModel> data = new ArrayList<gudangModel>();
//        
//        String select = "select * from gudang where id=?";
//        PreparedStatement ps = con.prepareStatement(select);
//        ps.setInt(1,id);
//        ResultSet rs = ps.executeQuery();
//        
//        while(rs.next()){
//            gudangModel model = new gudangModel();
////            model.setId(rs.getInt("id"));
//            model.setNama(rs.getString("nama"));
//            model.setHarga(rs.getNString("harga"));
//            model.setJumlah(rs.getString("jumlah"));
//            model.setTgl_masuk(rs.getString("tgl_masuk"));
//            
//            data.add(model);
//        }
//        return data;
//    }
//    
//    public gudangModel updatetUser(gudangModel gudang){
//        //String insert = "update gudang set nama=?,"+ "harga=?,jumlah=?,tgl_masuk=? where id=?";
//        String insert = "UPDATE `gudang` SET `Nama`=?,`Harga`=?,`Jumlah`=?,`Tgl_masuk`=? WHERE ID = ?";
//        try {
//            PreparedStatement ps = con.prepareStatement(insert);
////            ps.setInt(1, gudang.getId());
//            ps.setString(1, gudang.getNama());
//            ps.setString(2, gudang.getHarga());
//            ps.setString(3, gudang.getJumlah());
//            ps.setInt(5, gudang.getId());
//            ps.setInt(5, gudang.getId());
//            ps.executeUpdate();
//        } catch (Exception e) {
//            System.out.println(e + "data update unsuccesss");
//        }
//        return gudang;
//    }
//    
////    public int deletetUser(int id){
////        String insert = "delete from gudang where id=?";
////        
////        try {
////            PreparedStatement ps = con.prepareStatement(insert);
//////            ps.setInt(1, gudang.getId());
////            ps.setInt(1,id);
////            ps.executeUpdate();
////        } catch (Exception e) {
////            System.out.println(e + "data update unsuccesss");
////        }
////        return id;
////    }
//    public int deletetUser(gudangModel Model){
//        String insert = "delete from gudang where id=?";
//        
//        try {
//            PreparedStatement ps = con.prepareStatement(insert);
////            ps.setInt(1, gudang.getId());
//            ps.setInt(1,Model.getId());
//            ps.executeUpdate();
//        } catch (Exception e) {
//            System.out.println(e + "data update unsuccesss");
//        }
//        return 1;
//    }
//}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import static com.sun.faces.config.WebConfiguration.DisableUnicodeEscaping.True;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 * @author Faiq
 */
public class koneksi {
    Connection con;
    
    
    
    public koneksi(){
        try {
            String url = String.format("jdbc:mysql://localhost:3306/clientserver");
            String uname = "root";
            String pswd = "";
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,uname,pswd);
        } catch (ClassNotFoundException | SQLException e) {
        }
    }
    
    public gudangModel insertUser(gudangModel gudang){
//        String insert = "insert into gudang ,nama,harga,jumlah,tgl_masuk)value(?,?,?,?)";
           String insert = "INSERT INTO `gudang`( `nama`, `harga`, `jumlah`, `tgl_masuk`) values(?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(insert);
            //ps.setInt(1, gudang.getId());
            ps.setString(1, gudang.getNama());
            ps.setString(2, gudang.getHarga());
            ps.setString(3, gudang.getJumlah());
            ps.setString(4, gudang.getTgl_masuk());
            //ps.setDate(5, new Date(gudang.getTgl_masuk().getTime()));
            ps.execute();
        } catch (SQLException e) {
            System.out.println(e + "data insert unsuccesss");
        }
        return gudang;
    }
    
    public ArrayList<gudangModel> getUser() throws SQLException{
        ArrayList<gudangModel> data = new ArrayList<gudangModel>();
        
        String select = "select * from gudang";
        PreparedStatement ps = con.prepareStatement(select);
        ResultSet rs = ps.executeQuery();
        
        while(rs.next()){
            gudangModel model = new gudangModel();
            model.setId(rs.getInt("id"));
            model.setNama(rs.getString("nama"));
            model.setHarga(rs.getNString("harga"));
            model.setJumlah(rs.getString("jumlah"));
            model.setTgl_masuk(rs.getString("tgl_masuk"));
            
            data.add(model);
        }
        return data;
    }
    
    public ArrayList<gudangModel> getUserID(int id) throws SQLException{
        ArrayList<gudangModel> data = new ArrayList<gudangModel>();
        
        String select = "select * from gudang where id=?";
        PreparedStatement ps = con.prepareStatement(select);
        ps.setInt(1,id);
        ResultSet rs = ps.executeQuery();
        
        while(rs.next()){
            gudangModel model = new gudangModel();
            
            model.setNama(rs.getString("nama"));
            model.setHarga(rs.getNString("harga"));
            model.setJumlah(rs.getString("jumlah"));
            model.setTgl_masuk(rs.getString("tgl_masuk"));
            
            data.add(model);
        }
        return data;
    }
    
    public gudangModel updatetUser(gudangModel gudang){
//        String insert = "update gudang set nama=?,"+ "harga=?,jumlah=?,tgl_masuk=? where id=?";
        String insert = "UPDATE `gudang` SET `nama`=?,`harga`=?,`jumlah`=?,`tgl_masuk`=? WHERE id =?";
        try {
            PreparedStatement ps = con.prepareStatement(insert);
            
            ps.setString(1, gudang.getNama());
            ps.setString(2, gudang.getHarga());
            ps.setString(3, gudang.getJumlah());
            ps.setString(4, gudang.getTgl_masuk());
            ps.setInt(5, gudang.getId());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e + "data update unsuccesss");
        }
        return gudang;
    }
    
    public int deletetUser(gudangModel Model){
        String insert = "delete from gudang where id=?";
        
        try {
            PreparedStatement ps = con.prepareStatement(insert);
//            ps.setInt(1, gudang.getId());
            ps.setInt(1,Model.getId());
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e + "data update unsuccesss");
        }
        return 1;
    }
}
